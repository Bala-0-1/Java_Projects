package Evaluation;

class StringOccurence {
  String testString = "ahgggbbbbccffrrrhlmm";

  public static void main(String[] args) {
    StringOccurence obj = new StringOccurence();
    obj.printRepeatingValues();
  }

  public void printRepeatingValues() {
    String RepeatingString = "";
    for (int i = 0; i < testString.length()-1;i++) {
      String temp = "";
      if (testString.charAt(i) == testString.charAt(i + 1)) {
        temp += testString.charAt(i);
        int index = testString.indexOf(testString.charAt(i+1));
        
	if(i == index){
      		temp += testString.charAt(i);
      }
      
      }
   
    
      RepeatingString += temp;
    }
    System.out.println(RepeatingString);
  }
}
