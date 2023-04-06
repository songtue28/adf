package bh8;

public interface IGenerator {

	void onEvent(Object from, EventArg e);
    void add(IListener listener);
    boolean find(IListener listener);
}
