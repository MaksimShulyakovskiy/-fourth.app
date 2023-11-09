package jc01.homework.lesson04.training;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double L1 = 90;
		double L2 = 60;
		
		if ((L1+L2) < 180) {
			System.out.println("Треугольник существует");
			if ((L1 == 90) || (L2 == 90) || ((180 - L1 - L2) == 90)) {
				System.out.println("Треугольник прямоугольный");
			}
			else {
				System.out.println("Треугольник не прямоугольный");
			}
		}
		else {
			System.out.println("Треугольник не существует");
		}
	}

}
