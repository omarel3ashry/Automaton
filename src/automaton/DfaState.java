package automaton;

/**
 *
 * @author Omar Elashry <3ashry>
 */
public class DfaState {

    private int num;
    private boolean isInitial;
    private boolean isFinal;
    private int atZero;
    private int atOne;

    public DfaState() {
    }

    public DfaState(int num, boolean isInitial, boolean isFinal, int atZero, int atOne) {
        this.num = num;
        this.isInitial = isInitial;
        this.isFinal = isFinal;
        this.atZero = atZero;
        this.atOne = atOne;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isInitial() {
        return isInitial;
    }

    public void setIsInitial(boolean isInitial) {
        this.isInitial = isInitial;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public int getAtZero() {
        return atZero;
    }

    public void setAtZero(int atZero) {
        this.atZero = atZero;
    }

    public int getAtOne() {
        return atOne;
    }

    public void setAtOne(int atOne) {
        this.atOne = atOne;
    }

}
