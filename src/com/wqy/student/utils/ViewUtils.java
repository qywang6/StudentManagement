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
        System.out.println("***欢进入学生管理系统***");
        System.out.println("***请输入账号和密码***");
        String name = in.next();
        String pwd = in.next();
//        String quit = in.next();
        if (name.equals("wqy") && pwd.equals("123456")){
            System.out.println(name + "已进入学生管理系统，可以开始操作");
            do{
            	action();
            }while(!Over);{
            	System.out.println("指令错误");
            }
        }else {
                System.out.println("账号或密码错误！！！请从新输入");
            }
    }
	private static void action() {
		System.out.println("增加/删除/改变/查询");
		String function = in.next();
	if (function.equals("增加")) {
		zengjia();
	} else {
		if (function.equals("删除")) {
			shanchu();
		} else {
			if (function.equals("改变")) {
				gaibian();
			} else {
				if (function.equals("查询")) {
					chaxun();
				} else {
					System.out.println("指令错误");
				}
			}
		}
	}
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(201901001, "小虎");
		map.put(201901002, "小扎");
		map.put(201901003, "家宝");
		map.put(201901004, "静姐");
//		//获取集合所有key
//		Set<Integer> keys = map.keySet();
//		System.out.println(keys);
//		//获取集合所有值
//		Collection<String> values = map.values();
//		System.out.println(values);
		//获取集合所有值
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
		
		System.out.println("查询");
		
	}
	private static void gaibian() {
		System.out.println("改变");
	}
	private static void shanchu() {
		System.out.println("删除");
	}
	private static void zengjia() {
		System.out.println("请输入增加学生的姓名跟学号");
		Integer num1 = in.nextInt();
		String name1 = in.next();
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(num1, name1);
		System.out.println("增加了"+name1+"这名学生");
		
	}
}

