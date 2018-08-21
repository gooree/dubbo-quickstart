package com.fintech.dubbo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dubbo.consumer")
public class DubboConsumerProperties {

	private Application application;
	
	private Registry registry;
	
	private Consumer consumer;
	
	public static class Application {
		
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
	
	public static class Registry {
		
		private String address;
		
		private String client;
		
		private boolean check = false;
		
		private boolean subscribe = false;

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getClient() {
			return client;
		}

		public void setClient(String client) {
			this.client = client;
		}

		public boolean isCheck() {
			return check;
		}

		public void setCheck(boolean check) {
			this.check = check;
		}

		public boolean isSubscribe() {
			return subscribe;
		}

		public void setSubscribe(boolean subscribe) {
			this.subscribe = subscribe;
		}
		
	}
	
	public static class Consumer {
		
		private int timeout;

		public int getTimeout() {
			return timeout;
		}

		public void setTimeout(int timeout) {
			this.timeout = timeout;
		}
		
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public Registry getRegistry() {
		return registry;
	}

	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	public Consumer getConsumer() {
		return consumer;
	}

	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}
	
}
