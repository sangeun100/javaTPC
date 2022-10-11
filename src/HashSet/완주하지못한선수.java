package HashSet;

import java.util.HashMap;

class 완주하지못한선수 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hs = new HashMap<>();
		
		for (String player : participant) hs.put(player, hs.getOrDefault(player, 0)+1);
		
		for (String player : completion) hs.put(player,hs.get(player)-1);
		
		for (String key : hs.keySet()) {
			if(hs.get(key) != 0) {
				answer = key;
			}
		}
		return answer;
	}
}
