package com.service.impl;

import com.domainVO.ThirdPartRequestVO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chace.cai on 2014/6/30.
 */
@Service("thirdPartServiceImpl")
public class ThirdPartServiceImpl implements com.service.ThirdPartService {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public String setThirdPartMessage(ThirdPartRequestVO thirdPartMessage){
        if(thirdPartMessage==null || thirdPartMessage.getBstrMoMessageID()==null || thirdPartMessage.getBstrMessageContent()==null
                || thirdPartMessage.getBstrMessageContent().length()>200){
            return "";
        }
        String sql="update sms_send_tb set msg = ?,flag='0' where message_id=? and flag = '9'";
        Object[] parm=new Object[]{thirdPartMessage.getBstrMessageContent(),thirdPartMessage.getBstrMoMessageID()};
        //int[] types = new int[]{Types.INTEGER,Types.VARCHAR,Types.CHAR,Types.VARCHAR};
        //jdbcTemplate.update(sql,parm);
        return getResponseXml(thirdPartMessage.getBstrMoMessageID());
    }

    private String getResponseXml(String id){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<?xml version=\"1.0\" encoding=\"GB2312\" ?>");
        stringBuffer.append("<Data><Result>0</Result>");
        stringBuffer.append("<MessageID>").append(id).append("</MessageID>");
        stringBuffer.append("</Data>");
        return stringBuffer.toString();
    }
}
