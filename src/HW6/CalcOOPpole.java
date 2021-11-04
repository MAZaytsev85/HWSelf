package HW6;

public class CalcOOPpole {

    private int first;
    private int second;

    public CalcOOPpole(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getCalcSumm() {
        int result = first + second;
        return result;

    }

    public int getCalcMin() {
        int result = first - second;
        return result;

    }

    public int getCalcMnozh() {
        int result = first * second;
        return result;
    }

    public int getCalcDel() {
        int result = first / second;
        return result;
    }
}
