package OOP.Them11.Laba3;

/**
 * Created by Den on 01.03.2017.
 */
public class InvalidAgeException extends RuntimeException  {

    private int errorCode;
    private String message; // без конструктора предка

    // Создаем свой конструктор
    public InvalidAgeException(int errorCode, String message)
    {
        // Вызываем конструктор предка
        //super(message);
        // без конструктора предка
        // Добавляем инициализацию своего поля
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
