
package com.github.trilokkolagatla.stringmetrics;

import java.util.*;
import java.lang.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import ch.qos.logback.core.boolex.Matcher;

public class Cosine1 {
	private static Logger logger = LoggerFactory.getLogger(Cosine1.class);
	private static String s1 = "Tom is more popular than Tom";
	private static String s2 = "Bill is more popular then Tom";

	static String string = s1 + " " + s2;
	static Set<String> set = new HashSet<>();
	static String[] splited = string.split("\\s+");

	int a = s1.length();
	int b = s2.length();

	public int returnvalue(Set<String> set, String s1) {

		logger.info("the counter is{}");

		return 1;
	}

	public int[] returnvalue1(Set<String> set, String s2) {
		Iterator<String> it1 = Cosine1.set.iterator();
		int k = 0, counter = 0;
		int[] vector2 = new int[set.size()];
		while (it1.hasNext()) {
			while (s2.contains(it1.next())) {
				counter++;
				vector2[k] = counter;
				k++;
				logger.info("vector2={}", vector2);

			}
		}
		return vector2;
	}//

	public int getCoefficient(String s1, String s2) {
		int i = 0;
		int splitedLength = splited.length;
		while (i < splitedLength) {
			set.add(splited[i]);
			i++;
		}
		logger.info("{}", set);
		int n = set.size();
		int[] arr1 = returnvalue(set, s1); // returns vector 1
		int[] arr2 = returnvalue1(set, s2);
		logger.info("{}", n);

		for (i = 0; i < n; i++) {
			int sum = 0;
		}

		for (i = 0; i < n; i++) {
			int min = 0;
		}
		for (i = 0; i < n; i++) {
			int hin = 0;
			hin = hin + (arr2[i] * arr2[i]);
		}
		return 1;
	}

	public static void main(String[] args) {
		Cosine1 cos = new Cosine1();
		cos.getCoefficient(s1, s2);

	}
}
