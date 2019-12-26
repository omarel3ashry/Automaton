package automaton;

/**
 *
 * @author Omar Elashry <3ashry>
 */
public class NfaState {

    private int num;
    private boolean isInitial;
    private boolean isFinal;
    private int[] atZero;
    private int[] atOne;

    public NfaState() {
    }

    public NfaState(int num, boolean isInitial, boolean isFinal, int[] atZero, int[] atOne) {
        this.num = num;
        this.isInitial = isInitial;
        this.isFinal = isFinal;
        this.atZero = atZero;
        this.atOne = atOne;
    }

    public int getNum() {
        return num;
    }

    public boolean isInitial() {
        return isInitial;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public int[] getAtZero() {
        return atZero;
    }

    public int[] getAtOne() {
        return atOne;
    }

}
