package com.db.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.w3c.dom.ls.LSInput;

import com.db.collection.reader.CollectionHelper;


public class main {

	public static void main(String[] args) {

//		System.out.println("Enter Folder Path");
//		Scanner scanner = new Scanner(System.in);
//		String folderPath = scanner.nextLine();
		
		
		CollectionHelper jsonHelper = new CollectionHelper("C:\\Users\\itsme\\Desktop\\Truchet Programming\\Inverted Indexing\\JsonFiles\\");//
		File[] listOfFiles = jsonHelper.getFilesList();
		
		Map<String, ArrayList<Map<String, String>>> JsonMapList = jsonHelper.getJsonMapList(listOfFiles);
		
//		System.out.println(JsonMapList);
		//Perform Inner Join Operation
//		InnerJoiner innerJoiner = new InnerJoiner();
//		ArrayList<Map> resultSet = innerJoiner.performJoin(JsonMapList, "Tweet Id"); 
		
		//Perform InnerJoin with N Mapping Field
//		InnerJoinN innerJoinN = new InnerJoinN();
//		ArrayList<Map> resultSet = innerJoinN.performJoinN(JsonMapList, "Tweet Id", "User Id");
//		
		
		Map<String, Map<String, String>> IndexedMap =jsonHelper.seperateMapEntries(JsonMapList, listOfFiles);
		List<String> fileName = jsonHelper.searchIndex(IndexedMap, "furnished");
		System.out.println("Search Field is present in file = " + fileName);
		//jsonHelper.writeResultSet(listOfJson);
		
		
		
	}

}
