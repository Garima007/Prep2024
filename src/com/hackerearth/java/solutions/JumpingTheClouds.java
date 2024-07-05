package com.hackerearth.java.solutions;

import java.util.ArrayList;

public class JumpingTheClouds {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	nums.add(0);
	nums.add(0);
	nums.add(1);
	nums.add(0);
	nums.add(0);
	nums.add(1);
	nums.add(0);
	System.out.println(jumpingTheClouds(nums));
}

private static int jumpingTheClouds(ArrayList<Integer> nums) {

	int jumps = 0;
	for(int i=0;i<nums.size();i++) {
		if(nums.get(i+2)==0) {
			jumps++;
			i++;
		}else {
			jumps++;
		}
	}
	return jumps;
}
}
