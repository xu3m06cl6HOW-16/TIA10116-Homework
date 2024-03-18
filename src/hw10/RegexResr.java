package hw10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RegexResr {

	public static void main(String[] args) {

		String regex2 = "^[1-3]$";
		String regex = "^[0-9.]*$";
		for (int i = 0; i < 1; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入任意數字:");
			String num = sc.next();
			if (num.matches(regex)) {
				String input = null;

				for (int j = 0; j < 1; j++) {
					System.out.println("請選擇你要轉換的格式:(1)千分位 (2)百分比 (3)科學記號");
					input = sc.next();
					if (input.matches(regex2)) {
						j = 2;
					}
					--j;
				}

				int a = Integer.parseInt(input);// 格式轉換

				switch (a) {
				case 1: {
					RegexResr rs = new RegexResr();
					rs.thousandth(num);
					break;
				}
				case 2: {
					RegexResr rs = new RegexResr();
					rs.percentage(num);
					break;

				}
				case 3: {
					RegexResr rs = new RegexResr();
					rs.scientific(num);
				}

				}
				i = 2;
				sc.close();
			} else {
				System.err.println("文字格式不正確,請重新輸入!");

			}
			--i;
		}

	}

	public void thousandth(String num) {

		Double doubleVal = Double.valueOf(num);
		num = DecimalFormat.getNumberInstance().format(doubleVal);
		System.out.println(num);

	}

	public void percentage(String num) {
		double hun = Double.parseDouble(num);
		System.out.println(((int) (hun * 100)) + "%");
	}

	public void scientific(String num) {

		double scit = Double.parseDouble(num);
		String scie = String.format("%.2e", scit);// 科學記號的類型是 String 類型;
		System.out.println(scie);
	}

}
