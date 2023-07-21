package co.yedam.collect;

public class Box<T> { // <T> 어떤 타입이 올지 모를 때 그 타입에 맞게 변한다.
	T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}
