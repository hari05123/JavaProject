package day12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		
List<String> names= Arrays.asList(new String[]{"hari","krishna","reddy"});

List newList=names.stream().map(str->str.length()).collect(Collectors.toList());
System.out.println(newList);
	}

}
