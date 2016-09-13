package com.github.trilokkolagatla.stringmetrics;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jaccard {
	private static Logger logger = LoggerFactory.getLogger(DiceCoefficient.class);

	public double getCoefficient(String s1, String s2) {

		List<String> first = new ArrayList<>();
		List<String> second = new ArrayList<>();

		for (int i = 0; i < s1.length() - 1; i++) {
			String bigrams = s1.charAt(i) + "" + s1.charAt(i + 1);
			first.add(bigrams);
		}

		for (int i = 0; i < s2.length() - 1; i++) {
			String bigrams1 = s2.charAt(i) + "" + s2.charAt(i + 1);
			second.add(bigrams1);
		}
		List<String> common = new ArrayList<>(first);
		common.retainAll(second);
		double d = common.size();
		double a = first.size() + second.size() - d;
		double f = d / a;
		return f;

	}

	public static void main(String[] args) {
		Jaccard jac = new Jaccard();
		String s1 = "fasdd";
		String s2 = "udd";
		double f = jac.getCoefficient(s1, s2);
		logger.info("coefficient={}", f);
	}
}
