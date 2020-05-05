package main;

public class CalculatriceException extends Exception {
    private int code;
    private String defaultMessage;
    
    public CalculatriceException() {
            super();
    }
    public CalculatriceException(int code, String defaultMessage) {
            this.code = code;
            this.defaultMessage = defaultMessage;
    }
    public int getCode() {
            return code;
    }
    public void setCode(int code) {
            this.code = code;
    }
    public String getDefaultMessage() {
            return defaultMessage;
    }
    public void setDefaultMessage(String defaultMessage) {
            this.defaultMessage = defaultMessage;
    }
    
    
}