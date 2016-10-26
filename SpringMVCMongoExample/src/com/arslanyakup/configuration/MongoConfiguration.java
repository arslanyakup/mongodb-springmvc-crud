package com.arslanyakup.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		// daha kullanisli bir isim vermeni tavsiye ederim kucuk harfle baslayan sonunda DB olmayan ve genel bir isim db icin
		return "EmployeeDB";
	}

	@Override
	public Mongo mongo() throws Exception {
		return new MongoClient("localhost", 27017);
	}

}
