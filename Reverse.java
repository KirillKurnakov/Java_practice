// 10 задание( развернуть число )
public class Reverse extends Main {
    public int Rev (int n, int k, int new11) { // само число, уровень деления, новое число
        int d = n % k;
        new11 = new11*10 + d;
        if ((n/k) == 0) {
            return new11;
        }
            return Rev(n/k,k,new11);
    }
}
