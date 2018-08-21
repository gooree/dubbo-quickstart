package com.fintech.dubbo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dubbo.provider")
public class DubboProviderProperties {
	
	private Application application;
	
	private Registry registry;
	
	private Protocol protocol;

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

	public static class Protocol {
	
		private String name;
		
		private int port;
		
		private int threads;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public int getThreads() {
			return threads;
		}

		public void setThreads(int threads) {
			this.threads = threads;
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

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}
	
}
