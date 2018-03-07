package yama.delivery;

/**
 * @author Powered by Yama
 * @github https://github.com/Yama-Y
 * @mail my.yama.y@foxmail.com
 */
public class Delivery {

	public static String getData(String dnum) {
		Api api = new Api();
		return api.get(dnum);
	}
}
