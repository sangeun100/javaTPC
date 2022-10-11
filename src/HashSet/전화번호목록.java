package HashSet;

public class 전화번호목록 {
	public boolean solution(String[] phoneBook) {
		for (int i=0; i<phoneBook.length-1; i++) {
			for (int j=0; j<phoneBook.length; j++) {
				if(phoneBook[i].startsWith(phoneBook[i])) {return false;}
				if(phoneBook[j].startsWith(phoneBook[j])) {return false;}
			}
		}
		return true;
	}
}
