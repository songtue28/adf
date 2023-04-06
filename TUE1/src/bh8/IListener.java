package bh8;

public interface IListener {

	void subscribe(IGenerator sender);
    void response(IGenerator from, EventArg e);
    boolean equal(IListener listener);
    Object getId();
}
