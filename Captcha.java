import java.util.Random;
public class Captcha{
    public static void main(String args[]){
        CaptchaGenerator c = new CaptchaGenerator();
        int last = c.generateLength();
        String generatedCaptcha = c.generateCaptcha(last);
        System.out.println("length: " + last);
        System.out.println("the captcha code: " + generatedCaptcha);
    }
}
class CaptchaGenerator{
    String alphaNumeric = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    public int generateLength(){ 
    	int min=4;
        int max=7;
        int r = new Random().nextInt((max-min) + 1) + min;
        return r;
    }

    public int generateIndex(int last){
        return new Random().nextInt(last);

    }

    public String generateCaptcha(int last){
        String captcha = "";
        for (int i=0;i<last;i++){
            int index = generateIndex(alphaNumeric.length());
            captcha += alphaNumeric.charAt(index);
        }
        return captcha;


    }
}
