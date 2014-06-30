package com.common.utils;


import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.time.DateFormatUtils;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: wula
 * Date: 13-11-8
 * Time: ����11:00
 * To change this template use File | Settings | File Templates.
 */
public class CommonUtil {

    public static void main(String[] args) throws Exception {
        /*InputStream i=new FileInputStream(new File("D:\\test\\00.jpg")) ;
        byte [] b=new byte[i.available()];
        i.read(b);
        i.close();
        String s=CommonUtil.encoderBytes(b);
        System.out.println(s);
        deencoderString(s,"xxx.jpg");*/
        /*Double x=new Double(6)/new Double(65);
        Double d=Math.ceil(x);
        int mlength=d.intValue();//��Ϣ����
        if (mlength==0){mlength=1;}
        System.out.println(mlength);*/
        //DateFormatUtils.format(new Date(), "yyyy-MM-dd", Locale.CHINA) ;
       // System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd", Locale.CHINA));
        //InputStream inputStream=new FileInputStream();
    }

    /**�������ļ�����ΪList*/
    public static void phoneNumber2List(InputStream inputStream,List<String> phoneList) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String linText=null;
        while ((linText = bufferedReader.readLine()) != null) {
            if (linText != null && !"".equals(linText) && linText.length() >= 11) {
                linText = linText.trim();
                if (linText.startsWith("1") && linText.length() == 11) {
                    phoneList.add("86" + linText);
                } else if (linText.startsWith("8") && linText.length() == 13) {
                    phoneList.add(linText);
                }
            }
        }
    }

    /**��ȡ����ʱ����ַ���*/
    public static String getTodyString(){
        return DateFormatUtils.format(new Date(), "yyyyMMdd", Locale.CHINA);
    }

    /**��ͼƬ�������˳�������װ��map*/
    public static Map filterTxt(MultipartFile[] multipartFiles){
          Map map=new HashMap();
        for (MultipartFile multipartFile:multipartFiles){
            if (multipartFile.getOriginalFilename().endsWith(".jpg")||multipartFile.getOriginalFilename().endsWith(".gif")){
                map.put(multipartFile.getOriginalFilename().substring(0,multipartFile.getOriginalFilename().lastIndexOf(".")),multipartFile);
            }
        }

        return map;
    }

    /**��byte[]����base64����*/
    public static String encoderBytes(byte[] bytes){
        if (bytes==null||bytes.length==0)return "";

        return Base64.encodeBase64String(bytes) ;
        /*BASE64Encoder encoder=new BASE64Encoder();
        return encoder.encode(bytes);*/
    }

    /**��base64������ļ�ת����ȥ*/
    public static boolean deencoderString(String str,String fileName) throws Exception {
           if (str==null)return false;
        BASE64Decoder decoder = new BASE64Decoder();
        byte [] b = decoder.decodeBuffer(str);

        for(int i=0;i<b.length;++i)
        {
            if(b[i]<0)
            {//�����쳣����
                b[i]+=256;
            }
        }
        //����jpegͼƬ
        String imgFilePath = "d:\\test\\";//�����ɵ�ͼƬ
        File f = new File(imgFilePath)  ;
        if (!f.exists()){
          f.mkdirs();
        }

        OutputStream out = new FileOutputStream(imgFilePath+fileName);
        out.write(b);
        out.flush();
        out.close();
        return true;
    }
}
