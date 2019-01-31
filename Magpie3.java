package Magpie3; 

import java.util.ArrayList;

public class Magpie3
{
	ArrayList<response> res = new ArrayList();
	public Magpie3(){	
		String illness = "cold";
		String[] symptoms = {"a congested wind pipe", "a runny nose", "fever", "purple mucus"};
		
		res.add(new response(
				new String[]{},
				new String[]{"I don't understand", "Umm.. what? What do you mean by that?",  
						"Getting to the toilet is a hastle. Did you know approximately 40,000 Americans are injured by toilets each year",
						"I might go chug some ketchup, did you know in the 1830's ketchup was sold as medicine.",
						"I have learned first hand, beans, corn, cauliflowers, and milk makes you fart the most, what were you saying again?",
						"buddu fingus penat budder", "exotic penat buddaz"}));
		
		res.add(new response(
				new String[]{"Hi how are you","Hi, how are you"},
				new String[]{"No, it's \"how high are you\", and I just took my medications, oooo a butterfinger"}));
		
		res.add(new response(
				new String[]{"hi", "hey", "hello"},
				new String[]{"hi", "hey", "hello"}));
		
		res.add(new response(
				new String[]{"why"},
				new String[]{"I don't know, I'm an 16 year old with mental issues", "I'm not sure but I don't want to get into that", "For many reasons but that's not important now"}));
		
		res.add(new response(
				new String[]{"taps"},
				new String[]{"I can't get taps, I'm sick and out of school", "I don't think I have any taps", "Please, no taps, it'll stain my perfect record"}));
		
		res.add(new response(
				new String[]{"Ok", "I understand", "That's alright", "That is alright", "no problem"},
				new String[]{"Ok", "Thanks for understanding", "thank you"}));
		
		res.add(new response(
				new String[]{"how are", "doing", "you", "?"},
				new String[]{"Not good", "I don't know", "Not well"}));
		
		res.add(new response(
				new String[]{"what", "purple mucus", "?"},
				new String[]{"It is a rare desiese, docotrs are still studying it", "It may be the next plague", "I don't know, it's new for me too"}));
		
		res.add(new response(
				new String[]{"sample", "can i have", "purple"},
				new String[]{"purple mucus?", "ok...", "why not"}));
		
		res.add(new response(
				new String[]{"do you", "doctors", "note", "prescription", "excuse", "proof"},
				new String[]{"I have a doctor's note, I'll bring it to class", "I have my medications and prescription if you want me to bring them to class to show you", "I have a doctor's note and my parents should have sent an email as well, have you check your email recently?"}));
		
		res.add(new response(
				new String[]{"skipping", "skip", "ditch", "AWOL", "class", "I know"},
				new String[]{"No, I'm not, I have a doctor's note, I'll bring it to class", "I have my medications and prescription if you want me to bring them to class to show you", "I have a doctor's note and my parents should have sent an email as well, have you check your email recently?", 
						"Im not making this up, I am really sick"}));
		
		
		res.add(new response(
				new String[]{"Is","it", "bad", "?"},
				new String[]{"Yea it is", "Some what", "It's not good I'll tell you that"}));
		
		res.add(new response(
				new String[]{"Where", "have you been", "are you"},
				new String[]{"I have been at home, I have a serious " + illness + " and it is contagious"}));
		
		
		res.add(new response(
				new String[]{"Where", "have you been", "for", "missing", "weeks", "days", "months","week", "day", "month", "bad", "?"},
				new String[]{"I know I have been absent a lot, I have a serious " + illness + " and it is contagious"}));
		
		res.add(new response(
				new String[]{"have been", "for", "missing", "weeks", "days", "months","week", "day", "month", "bad", "?"},
				new String[]{"I checked in with the Doctor, he said this was serious and to take some time off", "I've been resting at home, I have a fever"}));
		
		res.add(new response(
				new String[]{"turn in","complete", "quiz" ,"keeping up", "keep up", "homework", "late", "work", "to do", "grades", "bad", "make up", "done", "have", "missing", "assignment", "assignments", "need"},
				new String[]{"I know I have a lot of work to do, I will plan to work out something later", "I will make up my work later but I don't have a pre-determined date", "I will work on remaking assignments, I've been keeping up with some of the work"}));
		
		res.add(new response(
				new String[]{"When", "will", "be back", "return", "time", "how", "long", "?"},
				new String[]{"I don't know, when I will be back, I want to be sure I don't spread this", "This " + illness + " is really bad, I have " + symptoms[(int)(Math.random()*symptoms.length)], "I don't know when, they doctor said two more weeks", "I don't know"}));
		
		res.add(new response(
				new String[]{"Did", "you do", "homework", "assignment", "?"},
				new String[]{"I did an assingment yesterday", "I think so", "Maybe, all these assingments are just blending together, I think I have some memory loss issue"}));
		
		res.add(new response(
				new String[]{"notes", "class", "lessons", "have"},
				new String[]{"I have some notes from Jace and Nihar, I'll ask if there's anything else the forgot to give me", "heyI may need some notes, I'll email back later today and see if I'm missing anything", "I think I have them all"}));
		
		res.add(new response(
				new String[]{"What is", "What's", "wrong", "going on", "?"},
				new String[]{"I have a " + illness + "that is really contagious"}));
		
		res.add(new response(
				new String[]{"you don't", "know", "what"},
				new String[]{"hi", "hey", "hello"}));
		
		res.add(new response(
				new String[]{"great", "good", "positive", "awesome"},
				new String[]{"love the positivity...", "optimistic I see...", "wow, that's really supportive"}));
		
		res.add(new response(
				new String[]{"contact", "parents", "gaurdians", "talk to"},
				new String[]{"They are not here yet", "They are not home", "They should have emailed you about my absence"}));		
		
	}
	public String getResponse(String statement){
		String respon = res.get(0).getResponse();
		String respon2 = "";
		int related = 0;
		response resp = null;
		statement = statement.replace(".","").replace(",","").replace("!","");
		for(response r : res){
			if(r.getRelatedness(statement)> related){
				respon = r.getResponse();
				related = r.getRelatedness(statement);
				resp = r;
				if((resp.equals(res.get(1))||(resp.equals(res.get(1))))){
					break;
				}else if(resp.equals(res.get(2))){
					respon = respon + ",";
					break;
				}
			}
		
		}
		if(related > 0){
		String statement1 = refine(resp, statement);
		related = 1;
		for(response r : res){
			if(r.getRelatedness(statement1)> related){
				
				respon2 = r.getResponse().toLowerCase();
				related = r.getRelatedness(statement1);
				
			}
		
		}
		}
		return respon + " " + respon2;
		
	}
	public String refine(response r, String statement){
		String s = statement;
		s = " " + s.toLowerCase().trim() + " ";
		for(String k : r.getKeys()){
			s = s.replace(k, "");
		}
		return s;
	}
}


/*------------------------------------------------------------------------------------*/
class response{
	String temp;
	 ArrayList<String> keys = new ArrayList();
	 ArrayList<String> responses = new ArrayList();
	 ArrayList<String> backupResponses = new ArrayList();
	 
	public response(String[] k, String[] r){
		for(String s : k)
			keys.add(s.toLowerCase());
		for(String s : r)
			responses.add(s);
		backupResponses.addAll(responses);
	}
	int getRelatedness(String s){
		s = s.trim();
		s = " "+s+" ";
		s = s.replace("?", " ?");
		int related = 0;
		for(String k : keys){
			if(s.toLowerCase().contains(" "+k.trim().toLowerCase()+" ")){
				temp = s.replace(k.trim().toLowerCase(),"");
				related++;
		}
		}
		return related;
	}
	String getResponse(){
		int r = (int)(Math.random()*responses.size());
		if(responses.size() == 0){
			responses.addAll(backupResponses);
		}
		return responses.remove(r);
	}
	public String toString(){
		int r = (int)(Math.random()*responses.size());
		return responses.get(r);
	}
	public ArrayList<String> getKeys(){
		return keys;
	}
}

