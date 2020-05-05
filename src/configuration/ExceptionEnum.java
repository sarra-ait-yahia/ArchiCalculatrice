package configuration;

public enum ExceptionEnum {
    DIVISION_BY_ZERO(1, "division by zero not authorized"),
    UKNOWN_OPERATION(2, "operation not implemented yet"),
    INPUT_MISMATCH(3, "input mismatch"),
    INPUT_MISMATCH_REPONSE(4,"answer y or n"),
    SERVER_ERROR(5, "an erreur has occured on server side");
    
    
    private final int code;
    private final String defaultMessage;
    
    
    ExceptionEnum(int code, String defaultMessage) { 
            this.code = code;
            this.defaultMessage = defaultMessage;
    }
    public int getCode() {
            return code;
    }
    public String getDefaultMessage() {
            return defaultMessage;
    }
    
    public static String getNameFromCode(int code) {
    for(ExceptionEnum e : ExceptionEnum.values()){
        if(code == e.code) return e.name();
    }
    return null;
    }
}