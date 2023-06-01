package java_lab;

public class ShopOrderTest {

	public static void main(String[] args) {
		ShopOrder order = new ShopOrder();
		
		order.orderNum = 201803120001L;
		order.id = "abc123";
		order.orderDate = "2018년 3월 12일";
		order.name = "홍길순";
		order.productId = "PD0345-12";
		order.shippingAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : " + order.orderNum);
		System.out.println("주문 아이디 : " + order.id);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문 이름: " +  order.name);
		System.out.println("주문 상품 번호 : " + order.productId);
		System.out.println("배송 주소 : " + order.shippingAddress);
	}

}
