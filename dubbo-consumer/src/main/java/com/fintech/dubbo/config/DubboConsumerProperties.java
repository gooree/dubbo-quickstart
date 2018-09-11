package com.fintech.dubbo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "dubbo.consumer")
public class DubboConsumerProperties {

	private Application application;
	
	private Registry registry;
	
	private Consumer consumer;
	
	public static class Application {
		
		private String name;
		
		private String version;

	    private String owner;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}
		
	}
	
	public static class Registry {
		
		private String id;
		
		private String address;
		
		private String protocol = "dubbo";
		
		private int port = 9090;
		
		private String username;
		
		private String password;
		
		private String transport;
		
		private int timeout;
		
		private int session;
		
		private String client;
		
		private boolean check = false;
		
		private boolean subscribe = false;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProtocol() {
			return protocol;
		}

		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getTransport() {
			return transport;
		}

		public void setTransport(String transport) {
			this.transport = transport;
		}

		public int getTimeout() {
			return timeout;
		}

		public void setTimeout(int timeout) {
			this.timeout = timeout;
		}

		public int getSession() {
			return session;
		}

		public void setSession(int session) {
			this.session = session;
		}

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
		
		private int retries;
		
		private String loadbalance;
		
		private boolean check = false;

		public int getTimeout() {
			return timeout;
		}

		public void setTimeout(int timeout) {
			this.timeout = timeout;
		}

		public int getRetries() {
			return retries;
		}

		public void setRetries(int retries) {
			this.retries = retries;
		}

		public String getLoadbalance() {
			return loadbalance;
		}

		public void setLoadbalance(String loadbalance) {
			this.loadbalance = loadbalance;
		}

		public boolean isCheck() {
			return check;
		}

		public void setCheck(boolean check) {
			this.check = check;
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
