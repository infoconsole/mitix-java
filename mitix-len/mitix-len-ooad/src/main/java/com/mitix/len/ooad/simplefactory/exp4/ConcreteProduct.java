package com.mitix.len.ooad.simplefactory.exp4;

/**
 * 创建于:2016年9月25日<br>
 * GPL 2016 a code farmer<br>
 * TODO
 * 
 * @author infoconsole
 * @version TODO
 */
public class ConcreteProduct {
  public ConcreteProduct() {}
  
  public static ConcreteProduct create() {
    return new ConcreteProduct();
  }
}
