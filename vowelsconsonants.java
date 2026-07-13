class vowelsconsonants {
    public static void main(String[] args) {
        String str = "Muthu";
		int vcount=0,ccount=0;
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
			   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vcount++;
			}else {
				ccount++;
			}
		}
		System.out.println("Vowels ="+vcount);
		System.out.println("Consonants ="+ccount);
    }
}
