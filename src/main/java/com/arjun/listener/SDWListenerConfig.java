package com.arjun.listener;

import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

import com.arjun.model.FileDirectoryInfo;

public class SDWListenerConfig {

	public static void start(ActiveMQConnectionFactory connFact, String queueName, FileDirectoryInfo fdInfo,
			String fileName) {

		InitialContext context;
		Queue queue = null;
		try {
			context = new InitialContext();
			queue = (Queue) context.lookup(queueName);
		} catch (NamingException e) {
			e.printStackTrace();
		}

		try (ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
				JMSContext jmsContext = cf.createContext()) {

			JMSConsumer consumer = jmsContext.createConsumer(queue);

			// String msgReceived = consumer.receiveBody(String.class);

			// System.out.println("Message received : " + messageReceived);

			consumer.setMessageListener(new SDWListener(fdInfo, fileName, queueName));

		}

	}

}
