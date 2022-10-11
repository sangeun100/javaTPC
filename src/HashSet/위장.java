package HashSet;

import java.util.HashMap;
import java.util.Iterator;

class 위장 {
	public int solution(String[][] clothes) {
		int answer = 1;
		HashMap<String, Integer> hs = new HashMap<>();
		for(int i =0; i<clothes.length; i++) {
			String key = clothes[i][1];
			if (! hs.containsKey(key)) {
				hs.put(key, 1);
				
			} else {
				hs.put(key, hs.get(key)+1);
			}
		}
		Iterator<Integer> t = hs.values().iterator();
		while (t.hasNext()) {
			answer *= t.next().intValue()+1;
		}
		return answer-1;
	}
}
