package com.ltts.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
//@Qualifier("rectangle")
	 Shape shape;
	@Autowired
	@Qualifier("triangle")
	Shape Nshape;
 public void printArea(int x,int y)
 {
	 shape.calculateArea(x, y);
	 Nshape.calculateArea(x, y);
 }
}
