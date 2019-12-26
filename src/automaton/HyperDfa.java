package automaton;

/**
 *
 * @author Omar Elashry <3ashry>
 */
public class HyperDfa {

    private String num;
    private boolean isInitial;
    private boolean isFinal;
    private String atZero;
    private String atOne;

    public HyperDfa() {
    }

    public HyperDfa(String num, boolean isInitial, boolean isFinal, String atZero, String atOne) {
        this.num = num;
        this.isInitial = isInitial;
        this.isFinal = isFinal;
        this.atZero = atZero;
        this.atOne = atOne;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
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

    public String getAtZero() {
        return atZero;
    }

    public void setAtZero(String atZero) {
        this.atZero = atZero;
    }

    public String getAtOne() {
        return atOne;
    }

    public void setAtOne(String atOne) {
        this.atOne = atOne;
    }

}
