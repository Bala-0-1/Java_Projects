class Zoom{
	static boolean audioStatus;
	static boolean videoStatus;
	static countOfParticipants = 0;
	public static void main(String args[]){
		Zoom zobj = new Zoom();
	
	
	
	}

	public int participantCount(){
		countOfParticipants ++;
		return countOfParticipants;
	
	
	}

	public boolean isVideoOn(){
		videoStatus = true;
		return videoStatus;
	
	}

	public boolean isAudioOn(){
		audioStatus = true;
		return audioStatus;
	
	}
	public void chat(){
		// It is a method for the chat window
	
	
	}
	public void chatBox(boolean isTouching){
		if (isTouching){
			chat();
		}
	
	}


}
