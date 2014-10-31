/*
 * Copyright (c) IntellectualCrafters - 2014. You are not allowed to distribute
 * and/or monetize any of our intellectual property. IntellectualCrafters is not
 * affiliated with Mojang AB. Minecraft is a trademark of Mojang AB.
 * 
 * >> File = PlotHomePosition.java >> Generated by: Citymonstret at 2014-08-09
 * 01:44
 */

package com.intellectualcrafters.plot;

/**
 * Created by Citymonstret on 2014-08-05.
 */
public enum PlotHomePosition {
	CENTER("Center", 'c'),
	DEFAULT("Default", 'd');

	private String string;
	private char ch;

	PlotHomePosition(String string, char ch) {
		this.string = string;
		this.ch = ch;
	}

	public boolean isMatching(String string) {
		if ((string.length() < 2) && (string.charAt(0) == this.ch)) {
			return true;
		}
		if (string.equalsIgnoreCase(this.string)) {
			return true;
		}
		return false;
	}

}