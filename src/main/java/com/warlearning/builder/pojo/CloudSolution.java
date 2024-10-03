package com.warlearning.builder.pojo;

public abstract class CloudSolution {

	protected final String server;
	protected final String storage;
	
	protected CloudSolution(Builder<?> builder) {
		this.server = builder.server;
		this.storage = builder.storage;
	}
	
	public static abstract class Builder<T extends Builder<T>> {
		private String server = "";
		private String storage = "";
		
		public T setServer(String server) {
			this.server = server;
			return self();
		}
		
		public T setStorage(String storage) {
			this.storage = storage;
			return self();
		}
		
		protected abstract T self();
	}
}
