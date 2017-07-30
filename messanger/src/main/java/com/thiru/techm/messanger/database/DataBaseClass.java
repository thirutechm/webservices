package com.thiru.techm.messanger.database;

import java.util.HashMap;
import java.util.Map;

import com.thiru.techm.messanger.model.Message;
import com.thiru.techm.messanger.model.Profile;

public class DataBaseClass {
	private static Map<Long,Message> messages=new HashMap<>();
	private static Map<String,Profile> profiles=new HashMap<>();
	
	public static Map<Long,Message> getMessages()
	{
		return messages;
	}
	public static Map<String,Profile> getProfiles()
	{
		return profiles;
	}
}
