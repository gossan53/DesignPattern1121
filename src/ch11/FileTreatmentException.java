package ch11;
//http://www.hyuki.com/dp/dpsrc_2009-10-10.zip
public class FileTreatmentException extends RuntimeException {      // RuntimeExceptionで正しいか？
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) {
        super(msg);
    }
}
