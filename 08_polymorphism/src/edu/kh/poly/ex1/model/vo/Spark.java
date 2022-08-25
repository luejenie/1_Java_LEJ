package edu.kh.poly.ex1.model.vo;

public class Spark extends Car {
	
	private double discountOffer;  // 할인 혜택
	
	public Spark() { }

	// 매개변수 생성자 alt + shift + s -> o  // 셀렉트박스에 아래 내용으로.
	public Spark(int wheel, int seat, String fuel, double discountOffer) {
		super(wheel, seat, fuel);
		this.discountOffer = discountOffer;
	}

	
	//getter/setter
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / 할인혜택 : " + discountOffer;
	}
	
	
	
	public void dc() {
		System.out.println( discountOffer * 100 + "% 할인됩니다.");
	}

}
