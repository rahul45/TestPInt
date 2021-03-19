package test;

import java.util.HashSet;

import com.test.User;

import exceptions.UserException;

public class C{
	public static void main(String[] args) {
		HashSet<User> set = new HashSet();
		for(int i=0;i<3;i++){
			User u= new User();
			u.setfName("Rahul");
			u.setlName("Singh");
			System.out.println(set.add(u));
		}
		System.out.println("size:"+set.size()+"  Data:"+set.toString());
		try {
			say();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		//System.out.println(i);
	}
	 static int  say()throws UserException{
		 int i=0;
		 if(i==0){
		 throw new Error();
		 }
		return ++i;
	}
}
