public class ExceptionApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		int[] scores = {10, 20, 30};
		try {                                              //try 합치면 앞에서 예외상황 발생시 아래 코드 생략 두개쓰면 각각 찾음
			System.out.println(2);
//		    System.out.println(scores[3]);
		    System.out.println(3);
		    System.out.println(2/0);
		    System.out.println(3);
		}  catch(ArithmeticException e) {
			System.out.println("잘못했어요");
		}
		    catch(Exception e) {                          //하기 에러의 부모 코드 소환
			System.out.println("뭔가이상해요");
		}
		/*
		catch(ArithmeticException e){
			System.out.println("잘못된 계산입니다");//허용 하지 않는 경우 -> 자바는 0으로 나눌수없음 예외 상황 발생
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("없는 값 입니다");
		}
		*/
		System.out.println(3);
		
	}

}
