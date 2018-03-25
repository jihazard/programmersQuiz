package midWord;

class midWord{
    String getMiddle(String word){
    	System.out.println("워드" + word.length());
		String reval="";
    	if(word.length() % 2 ==0){
    		reval = word.substring(word.length()/2-1,word.length()/2+1);
    		System.out.println(reval);
    	}else{
    		reval = word.substring(word.length()/2,word.length()/2+1);
    		System.out.println(reval);
    	}
		
			

    	 return word.substring((word.length()-1)/2, word.length()/2 + 1);       
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
    	midWord se = new midWord();
        System.out.println(se.getMiddle("poweer"));
    }
}