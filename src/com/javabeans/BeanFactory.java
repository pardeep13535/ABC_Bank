package com.javabeans;

import java.util.ArrayList;

import com.sprhib.domain.User;

public class BeanFactory extends User {
	private static BeanFactory instance;
	private static ArrayList<String> listKey = new ArrayList<String>();
	private static ArrayList<String> value = new ArrayList<String>();
	private static int index;
	private static String length;
	private static String key, val;

	public void flushKeyVal() {
		listKey = new ArrayList<String>();
		value = new ArrayList<String>();
	}

	public static BeanFactory getInstance() {
		if (instance == null) {
			instance = new BeanFactory();
		}
		return instance;
	}

	public String getLength() {
		Integer len = listKey.size();
		length = len.toString();
		return length;
	}

	public void insertToKey(String key) {
		listKey.add(key);
	}

	public void insertToValue(String key) {
		value.add(key);
	}

	public String getKey() {
		key = listKey.get(index);
		return key;
	}

	public String getVal() {
		val = value.get(index);
		return val;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index1) {
		index = index1;
	}
}
