package com.gmail.bruno.jumpandshoot.Http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;

public class HttpMain {
	private String URL;
	private HttpClient client;
	private HttpResponse response;
	public Object HTTPGet(String[] args, String URL){
		client = new DefaultHttpClient();
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 3000); //Timeout Limit
		this.setURL(URL);
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<args.length; i++){
			sb.append(args[i]);
		}
		this.setURL(sb.toString());
		URI uri = null;
		try {
			uri = new URI(this.getURL());
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpGet get = new HttpGet(uri);
		try {
			response = client.execute(get);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
	public Object HTTPPut(String[] args, String URL){
		client = new DefaultHttpClient();
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 3000); //Timeout Limit
		this.setURL(URL);
		HttpPut put = new HttpPut(this.getURL());
		StringBuilder sb = new StringBuilder();
		StringEntity entity = null;
		for(int i =0; i<args.length; i++){
			sb.append(args[i]);
		}
		try {
			entity = new StringEntity(sb.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		put.setEntity(entity);
		try {
			return client.execute(put);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Object HTTPPost(String[] args, String URL){
		client = new DefaultHttpClient();
		HttpConnectionParams.setConnectionTimeout(client.getParams(), 3000); //Timeout Limit
		this.setURL(URL);
		HttpPost post = new HttpPost(this.getURL());
		StringBuilder sb = new StringBuilder();
		StringEntity entity = null;
		for(int i =0; i<args.length; i++){
			sb.append(args[i]);
		}
		try {
			entity = new StringEntity(sb.toString());
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		post.setEntity(entity);
		try {
			return client.execute(post);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}

}
