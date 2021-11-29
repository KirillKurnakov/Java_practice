public class InnNotValidException extends Exception {
    InnNotValidException(String inn,String fio) {super ("ИНН " + inn +" для пользователя " + fio + " недействителен");}
}
