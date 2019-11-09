package developertest;

import java.awt.List;
import java.util.ArrayList;

import org.apache.commons.lang3.*;

public class Developer1 {
	public String test1(String str){
		String string="";
		if(StringUtils.isNotBlank(str)) {
			string=StringUtils.capitalize(str);
		}
		return string;
	}
	
	public int test2(int i) {
		boolean arr[]=new boolean[1];
		while(arr.length<i) {
			arr=ArrayUtils.add(arr, true);
		}//小于号改为小于等于号
		return arr.length;
	}
	
	public String test3(int choice) {
		String result;
		switch (choice) {
		case 0:
			result=BooleanUtils.toStringYesNo(false);
			break;
		case 1:
			result=BooleanUtils.toStringYesNo(true);
			break;
		default:
			result="";
			break;
		}
		return result;
	}
}
