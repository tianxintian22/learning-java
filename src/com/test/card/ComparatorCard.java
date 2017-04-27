package com.test.card;

import java.util.Comparator;

public class ComparatorCard implements Comparator<Card>{

	@Override
	public int compare(Card o1, Card o2) {
		String[] colors = {"ºìÌÒ", "ºÚÌÒ", "Ã·»¨", "·½Æ¬"};
		int key1 = 0;
		int key2 = 0;
		for (int i = 0; i < colors.length; i++) {
			if (o2.getColor().equals(colors[i])) {
				key1 = i;
			}
			if (o1.getColor().equals(colors[i])) {
				key2 = i;
			}
		}
		if (key1 > key2) {
			return 1;
		} else if (key1 < key2) {
			return -1;
		} else {
			return 0;
		}
	}

}
