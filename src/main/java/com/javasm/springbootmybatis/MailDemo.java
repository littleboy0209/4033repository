package com.javasm.springbootmybatis;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

/**
 * @Author：ZhangChunYang
 * @Version：1.0
 * @Date：2021/7/1-17:44
 * @Since:jdk1.8
 * @Description:发送邮件
 */
public class MailDemo {
    public static void main(String[] args) throws MessagingException, GeneralSecurityException {
        //创建一个配置文件并保存
        Properties properties = new Properties();

        //发送邮件服务器
        properties.setProperty("mail.host","smtp.163.com");

        properties.setProperty("mail.transport.protocol","smtp");

        properties.setProperty("mail.smtp.auth","true");


        properties.put("mail.smtp.ssl.enable", "true");

        //创建一个session对象
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //发件邮箱账号和授权码
                return new PasswordAuthentication("zhangchunyang0209@163.com","ZIVNIUENZSERXRHP");
            }
        });

        //开启debug模式
        session.setDebug(true);

        //获取连接对象
        Transport transport = session.getTransport();

        //连接服务器
        transport.connect("smtp.163.com","zhangchunyang0209@163.com","ZIVNIUENZSERXRHP");

        //创建邮件对象
        MimeMessage mimeMessage = new MimeMessage(session);

        //邮件发送人
        mimeMessage.setFrom(new InternetAddress("zhangchunyang0209@163.com"));

        //邮件接收人
        mimeMessage.setRecipient(Message.RecipientType.TO,new InternetAddress("1934037117@qq.com"));

        //邮件标题
        mimeMessage.setSubject("Hello Mail");

        //邮件内容
        mimeMessage.setContent("你好","text/html;charset=UTF-8");

        //发送邮件
        transport.sendMessage(mimeMessage,mimeMessage.getAllRecipients());

        //关闭连接
        transport.close();
    }
}
