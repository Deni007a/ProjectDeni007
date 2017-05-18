package OOP.Them11.Laba4;

/**
 * Created by Den on 01.03.2017.
 */
public class InvalidShapeStringException extends  Exception{

    private int errorCode;
    private String message;

    // Создаем свой конструктор
    public InvalidShapeStringException(int errorCode, String message)
    {

        this.message =message;
        this.errorCode = errorCode;
    }

    // Метод для получения кода ошибки
    public int getErrorCode()
    {
        return errorCode;
    }
    public String getMessage()
    {
        return message;
    }


}
