package com.arjun.reader;

import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;

public interface SDWReaderInterf {

	default public ActiveMQConnectionFactory getConnectionFactory() {
		InitialContext initialContext = null;
		Queue queue = null;
		ActiveMQConnectionFactory connFactory = null;

		try {
			initialContext = new InitialContext();
			queue = (Queue) initialContext.lookup("queue/myQueue");
		} catch (NamingException e) {
			e.printStackTrace();
		}

		try (ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();) {
			connFactory = cf;
		}

		return connFactory;
	}

}
