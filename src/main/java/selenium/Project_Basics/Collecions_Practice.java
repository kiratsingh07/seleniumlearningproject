package selenium.Project_Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collecions_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Data - 1D and 2D Data
		// 1D - List and Set
		//2D - Maps
		// List allows Duplicates
		// Set will not allow duplicates
		
		//List - ArrayLst and Linked List
		//Set - HashSet, TreeSet and LinkedHashSet
		// Map - HashMap, TreeMap, LinkedHashMap
		
		ArrayList<String> alist = new ArrayList<>(); // insert sequence
		alist.add("Guru");
		alist.add("Selenium");
		alist.add("Guru");
		alist.add("Selenium");
		alist.add(null);
		alist.add(null);
		System.out.println(alist);
		
		LinkedList<String> llist = new LinkedList<>();//insert sequence .use this if there is a lot of data
		llist.add("Guru");
		llist.add("Selenium");
		llist.add("Guru");
		llist.add("Selenium");
		llist.add(null);
		llist.add(null);
		System.out.println(llist);
		
		//all sets have no duplicates
		HashSet<String> hset = new HashSet<>();// 
		hset.add("Guru");
		hset.add("Selenium");
		hset.add("Guru");
		hset.add("Selenium");
		hset.add(null);
		hset.add(null);
		System.out.println(hset);
		
		TreeSet<String> tset = new TreeSet<>();// ascending to descending sequence
		tset.add("Harish");
		tset.add("Guru");
		tset.add("Selenium");
		tset.add("Guru");
		tset.add("Selenium");
		
		System.out.println(tset);
		
		LinkedHashSet<String> lhset = new LinkedHashSet<>();//insert sequence
		lhset.add("Guru");
		lhset.add("Selenium");
		lhset.add("Guru");
		lhset.add("Selenium");
		lhset.add(null);
		lhset.add(null);
		System.out.println(lhset);
		
		
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("Guru", 1234);
		hmap.put("Selenium", 12345);
		hmap.put("Haris", 12345);
		hmap.put(null, null);
		hmap.put(null, null);
		hmap.put("Guru", 8574);
		System.out.println(hmap);
		
		TreeMap<String, Integer> tmap = new TreeMap<>();// a to d sequence
		tmap.put("Guru", 1234);
		tmap.put("Selenium", 12345);
		tmap.put("Haris", 12345);
		tmap.put("Arish", null);
		tmap.put("Hrisj", null);
		tmap.put("Guru", 8574);
		System.out.println(tmap);
		
		LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>();//insert sequence
		lhmap.put("Guru", 1234);
		lhmap.put("Selenium", 12345);
		lhmap.put("Haris", 12345);
		lhmap.put(null, null);
		lhmap.put(null, null);
		lhmap.put("Guru", 8574);
		System.out.println(lhmap);
		
	}

}
