package com.arjun.reader;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

import com.arjun.listener.SDWListenerConfig;
import com.arjun.model.ArtemisMQInfo;
import com.arjun.model.FileDirectoryInfo;

public class SDWReader implements SDWReaderInterf {

	private FileDirectoryInfo fdInfo;
	private ActiveMQConnectionFactory connFact;
	private ArtemisMQInfo mqInfo;

	public SDWReader(FileDirectoryInfo fdInfo, ArtemisMQInfo mqInfo) {
		this.fdInfo = fdInfo;
		this.mqInfo = mqInfo;
	}

	public void start() {

		connFact = getConnectionFactory();

		SDWListenerConfig.start(connFact, mqInfo.getSAPE_Queue(), fdInfo, fdInfo.getSAPE_FileName());
		SDWListenerConfig.start(connFact, mqInfo.getSAPH_Queue(), fdInfo, fdInfo.getSAPH_FileName());
		SDWListenerConfig.start(connFact, mqInfo.getSAPU_Queue(), fdInfo, fdInfo.getSAPU_FileName());
		SDWListenerConfig.start(connFact, mqInfo.getSAPR_Queue(), fdInfo, fdInfo.getSAPR_FileName());
		SDWListenerConfig.start(connFact, mqInfo.getCMUP_Queue(), fdInfo, fdInfo.getCMUP_FileName());
		
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
