package com.wqy.student.utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ViewUtils {
	private static boolean Over = false;
    private static Scanner in = new Scanner(System.in);
    public static void start() {
        System.out.println("***������ѧ������ϵͳ***");
        System.out.println("***�������˺ź�����***");
        String name = in.next();
        String pwd = in.next();
//        String quit = in.next();
        if (name.equals("wqy") && pwd.equals("123456")){
            System.out.println(name + "�ѽ���ѧ������ϵͳ�����Կ�ʼ����");
            do{
            	action();
            }while(!Over);{
            	System.out.println("ָ�����");
            }
        }else {
                System.out.println("�˺Ż�������󣡣������������");
            }
    }
	private static void action() {
		System.out.println("����/ɾ��/�ı�/��ѯ");
		String function = in.next();
	if (function.equals("����")) {
		zengjia();
	} else {
		if (function.equals("ɾ��")) {
			shanchu();
		} else {
			if (function.equals("�ı�")) {
				gaibian();
			} else {
				if (function.equals("��ѯ")) {
					chaxun();
				} else {
					System.out.println("ָ�����");
				}
			}
		}
	}
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(201901001, "С��");
		map.put(201901002, "С��");
		map.put(201901003, "�ұ�");
		map.put(201901004, "����");
//		//��ȡ��������key
//		Set<Integer> keys = map.keySet();
//		System.out.println(keys);
//		//��ȡ��������ֵ
//		Collection<String> values = map.values();
//		System.out.println(values);
		//��ȡ��������ֵ
		Set<Map.Entry<Integer, String>> enteys = map.entrySet();
//		Iterator<Map.Entry<Integer, String>> it = enteys.iterator();
//		
//		while(it.hasNext()){
//			Map.Entry<Integer, String> entry = it.next();
//			Integer key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println(key+"******"+value);
//		}
		for(Iterator<Map.Entry<Integer, String>> it = enteys.iterator();it.hasNext();){
			Map.Entry<Integer, String> entry = it.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"******"+value);
		}
	}
	private static void chaxun() {
		
		System.out.println("��ѯ");
		
	}
	private static void gaibian() {
		System.out.println("�ı�");
	}
	private static void shanchu() {
		System.out.println("ɾ��");
	}
	private static void zengjia() {
		System.out.println("����������ѧ����������ѧ��");
		Integer num1 = in.nextInt();
		String name1 = in.next();
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(num1, name1);
		System.out.println("������"+name1+"����ѧ��");
		
	}
}

