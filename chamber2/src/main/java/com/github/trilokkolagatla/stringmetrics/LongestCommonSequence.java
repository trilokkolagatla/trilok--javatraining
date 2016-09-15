package com.github.trilokkolagatla.stringmetrics;

import java.util.ArrayList;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LongestCommonSequence {
	private static Logger logger = LoggerFactory.getLogger(LongestCommonSequence.class);

	public List<String> returncommon(String s1, String s2) {

		List<String> first = new ArrayList<>();
		List<String> second = new ArrayList<>();
		for (int i = 0; i < s1.length() - 1; i++) {
			String list = s1.charAt(i) + "";
			first.add(list);
		}
		for (int i = 0; i < s2.length() - 1; i++) {
			String list1 = s2.charAt(i) + "";
			second.add(list1);
		}
		List<String> common = new ArrayList<>(first);
		common.retainAll(second);
		return common;

	}

	public static void main(String[] args) {
		String s1 = "harry";
		String s2 = "TomShe";
		LongestCommonSequence go = new LongestCommonSequence();
		List<String> commonSequence = go.returncommon(s1, s2);
		logger.info("LongestCommonSequence={}", commonSequence);
	}
}