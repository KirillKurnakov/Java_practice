import java.util.HashMap;

public class InnChecker {
    public void Checking_inn(String fio, String inn, HashMap<String,String> Clients) throws InnNotValidException{
        if (!fio.equals(Clients.get(inn))) throw new InnNotValidException(inn,fio);
    }
}
