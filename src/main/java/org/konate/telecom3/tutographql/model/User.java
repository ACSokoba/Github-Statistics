package org.konate.telecom3.tutographql.model;

public class User {
	private String login;
	private String name;
	private Repository repositories;

	public User() {
		super();
	}

	public User(String login) {
		this.login = login;
	}
	
	public User(String login, String name) {
		this.login = login;
		this.name = name;
	}
	
	public User(String login, String name, Repository repositories) {
		super();
		this.login = login;
		this.name = name;
		this.repositories = repositories;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Repository getRepositories() {
		return repositories;
	}

	public void setRepositories(Repository repositories) {
		this.repositories = repositories;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", repositories=" + repositories + "]";
	}
}
