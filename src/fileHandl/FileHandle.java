package fileHandl;

import java.io.File;
import java.util.HashMap;

public class FileHandle {
	public static void main(String[] args) {
		File f = new File("D://sample");
		File[] listf = f.listFiles();
		String[] list = f.list();
		HashMap<String,Integer> map = getFileCount(f);
		System.out.println(map.toString());
	}

	private static HashMap<String, Integer> getFileCount(File f) {
		HashMap<String,Integer> map = new HashMap<>();
		getCount(f,map);
		return map;
	}

	private static void getCount(File f, HashMap<String, Integer> map) {
		String name=f.getName();
		File[] files = f.listFiles();
		for(File str:files){
				if(str.isFile()&& str.getName().contains(".txt")){
					if(map.containsKey(f.getName())){
						map.put(f.getName(), map.get(f.getName())+1);
					}else{
						map.put(f.getName(),1);
					}
				}else{
					if(str.isDirectory()){
						getCount(str, map);
					}
				}
		}
	}
}
