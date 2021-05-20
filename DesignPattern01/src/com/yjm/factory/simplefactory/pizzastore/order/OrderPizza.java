package com.yjm.factory.simplefactory.pizzastore.order;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.yjm.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.yjm.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.yjm.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.yjm.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
//������
	
//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType;//������������
//		do {
//			orderType = getType();
//			if(orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName("ϣ������");
//			}else if(orderType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName("��������");
//			}else if(orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("��������");
//			}
//			
//			else {
//				break;
//			}
//			//���pizza��������
//			pizza.bake();
//			pizza.box();
//			pizza.cut();
//			pizza.prepare();
//		}while(true);
//	}
	//����һ���򵥹�������
	SimpleFactory simplefactory;
	Pizza pizza = null;
	//������
	public OrderPizza(SimpleFactory simplefactory) {
		setFactory(simplefactory);
	}
	public void setFactory(SimpleFactory simplefactory) {
		String orderType = "";//�û�����
		this.simplefactory = simplefactory;//���ü򵥹�������
		do {
			orderType = gettype();
		pizza =	this.simplefactory.createPizza(orderType);
		
		//���pizza
		if(pizza != null) {//�����ɹ�
			pizza.prepare();
			pizza.bake();
			pizza.box();
			pizza.cut();
		}else {
			System.out.println("��������ʧ��");
			break;
		}
		}while(true);
		
	
	
	
	}
	
	//дһ�����������Ի�ȡ�ͻ�ϣ����������������

private String gettype() {
	
	try {
		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("input pizza ����:");
				String str = strin.readLine();
				return str;
	}catch (IOException e) {
		e.printStackTrace();
		return "";
	}
}
	
	
	
	
	
	
	
	
	
}
