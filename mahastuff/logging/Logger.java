package mahastuff.logging;



import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger implements Log{


    private Logger(){

    }

    public Logger(String logPath,String logMessage){
        this.logPath = logPath;
        this.logMessage = logMessage;
    }   

    private String logMessage;
    private String logPath;
    private FileWriter fw = null;
    private DateFormat dform = null;

    @Override
    public void log() throws IOException{
        dform = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date obj = new Date();
        String currentDateAndTime = dform.format(obj);
        fw = new FileWriter(logPath,true);
        fw.write(currentDateAndTime+" "+logMessage+"\n");
        fw.flush();
        fw.close();
    }

    public static void main(String[] args) throws IOException{
        Logger lg = new Logger("/Users/balakumaranb/logs.log","muhahahahahhahahahahaha");
        lg.log();
    }


}