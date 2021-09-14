package session9;
interface Three{
	void mul(int a,int b);
}
public interface Four extends Three,Two,One {
	void div(int a,int b);
}
