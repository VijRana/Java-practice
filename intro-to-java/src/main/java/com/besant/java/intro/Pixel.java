package com.besant.java.intro;

import java.awt.Color;

public class Pixel extends Point {
  Color color;
  @Override
	public void clear() {
		
		super.clear();
		color=null;
	}
   
}
