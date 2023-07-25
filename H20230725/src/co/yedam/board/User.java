package co.yedam.board;

import java.util.Hashtable;
import java.util.Map;

public class User {
	Map<String, String> users //
			= new Hashtable<String, String>();
	
	User(){
		users.put("user1", "1234");
		users.put("user2", "2345");
		users.put("user3", "3456");
	}
	
	boolean login(String id, String pwd) {
		if(users.containsKey(id)) {
			if(users.get(id).equals(pwd)) {
				return true;
			}
		}
		return false;
	}
	
	boolean rePwd(String id, String pwd) {
		users.put(id, pwd);
		return true;
	} 
}
