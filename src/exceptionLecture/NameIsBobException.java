package exceptionLecture;
//this is custom making an exception
public class NameIsBobException extends Exception{
        public NameIsBobException(String message) {
            super(message);
        }
}
