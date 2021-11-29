public class StudentNotFoundException extends Exception{

        public StudentNotFoundException(String client) { super("Такого пользователя нет: "+ client);}
}
