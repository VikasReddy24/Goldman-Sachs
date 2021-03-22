package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//Tested in postman using http://localhost:8080/enter-string/?n=sajfbdjvdvnndvdbdhdjfddhfdjfhhfh
//Resulting output was fhhf

@Controller
public class DecController {
	


	  @PostMapping("/enter-string")
	  @ResponseBody
	  public String coverting(@RequestParam(name="n", required=true, defaultValue="aba") String n) {
		  return longest(n);
		     
	  }
	    public String longest(String str) {
		       
	    if (str == null || str.length() < 1) return "";
	    int begin = 0, finish = 0;
	    for (int i = 0; i < str.length(); i++) {
	        int len1 = method2(str, i, i);
	        int len2 = method2(str, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > finish - begin) {
	            begin = i - (len - 1) / 2;
	            finish = i + len / 2;
	        }
	    }
	    return str.substring(begin, finish + 1);
	    }

	private static int method2(String s, int begin, int end) {
	    int L = begin, R = end;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}
	    }
	

	  
	


