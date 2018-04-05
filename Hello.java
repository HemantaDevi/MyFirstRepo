package com.accenture.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(345);
		list.add(1345);
		list.add(3456);
		list.add(3456);
		list.add(3456);
		list.add(34);
		list.add(3456);
		list.add(340);
		System.out.println(list);
		list.stream();
		
		List<Integer> al=list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(al);//Duplicate values
		
		Set<Integer> Al = list.stream().filter(y->y>500).collect(Collectors.toSet());
		System.out.println(Al);//no duplicate values
		
		List<Integer> Bl = list.stream().filter(y->y>500).collect(Collectors.toList());
		System.out.println(Bl);//duplicate values
		
		Set<Integer> set=list.stream().map(z->z+5).collect(Collectors.toSet());
		System.out.println(set);
		
		//count number of element inside list
		System.out.println(set.stream().count());
		
		
	}

}
