package com.arjun.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.TextMessage;

import com.arjun.model.FileDirectoryInfo;

public class SDWListener implements MessageListener {

	private String queueName;
	private String fileName;
//	private FileDirectoryInfo fdInfo;
	private String sdFileDir;
	private String sdLoggerFileDir;
	private String sdAuditLogFileDir;

	public SDWListener(FileDirectoryInfo fdInfo, String fileName, String queueName) {
		// this.fdInfo = fdInfo;
		this.fileName = fileName;
		this.queueName = queueName;
		sdFileDir = fdInfo.getSdFileDir();
		sdLoggerFileDir = fdInfo.getSdLoggerFileDir();
		sdAuditLogFileDir = fdInfo.getSdAuditLogFileDir();
	}

	@Override
	public void onMessage(Message message) {

		TextMessage textMsg = (TextMessage) message;

		String receivedMsg = null;
		
		try {
			receivedMsg = textMsg.getText();
		} catch (JMSException e) {
			e.printStackTrace();
		}
		
		

	}

}
