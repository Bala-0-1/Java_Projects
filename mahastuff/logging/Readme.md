The Logger class implements a log method from the Log interface.

Usage : 

-> Create an instance of that particular class which is Logger.

-> Note that there is no default constructor here so you have to use a constructor with string argument.

-> The arguments are the absolute path to your log file and the log message.

-> We also throw an IOException. Make sure you catch it.

Logger lg = new Logger("The absolute path to your log file","your message");

lg.log();

The log output format will be like this,

19/12/23 23:39:48 muhahahahahhahahahahaha

