public class ExceptionApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		int[] scores = {10, 20, 30};
		try {                                              //try ��ġ�� �տ��� ���ܻ�Ȳ �߻��� �Ʒ� �ڵ� ���� �ΰ����� ���� ã��
			System.out.println(2);
//		    System.out.println(scores[3]);
		    System.out.println(3);
		    System.out.println(2/0);
		    System.out.println(3);
		}  catch(ArithmeticException e) {
			System.out.println("�߸��߾��");
		}
		    catch(Exception e) {                          //�ϱ� ������ �θ� �ڵ� ��ȯ
			System.out.println("�����̻��ؿ�");
		}
		/*
		catch(ArithmeticException e){
			System.out.println("�߸��� ����Դϴ�");//��� ���� �ʴ� ��� -> �ڹٴ� 0���� ���������� ���� ��Ȳ �߻�
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �� �Դϴ�");
		}
		*/
		System.out.println(3);
		
	}

}
