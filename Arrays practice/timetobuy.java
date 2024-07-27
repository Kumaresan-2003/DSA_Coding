import java.util.*;

public class timetobuy {
	static int ans(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int profit = 0;
		int buying_pri = prices[0];
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] <= buying_pri) {
				buying_pri = prices[i];
				continue;
			}
			profit = Math.max(profit, prices[i] - buying_pri);
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = { 7, 1, 5, 3, 6, 4 };
		int res = ans(prices);
		System.out.print("The ans " + res);
	}

}
