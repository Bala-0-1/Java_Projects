package mahastuff.logging;

import java.io.IOException;

interface Log{
    abstract void log() throws IOException;
}