package yama.delivery;

/**
 * @author Powered by Yama
 * @github https://github.com/Yama-Y
 * @mail my.yama.y@foxmail.com
 */
class Api {
	protected String get(String dnum) {
		String re_comCode = HttpExcuse
				.get("http://www.kuaidi100.com/autonumber/autoComNum?resultv2=1&text="
						+ dnum);
		int begin = re_comCode.indexOf("\",\"auto\":[{\"comCode\":\"") + 22;
		int end = re_comCode.indexOf("\",\"id\":\"\",\"noCount\"");
		re_comCode = re_comCode.substring(begin, end);

		String re = HttpExcuse.get("http://www.kuaidi100.com/query?type="
				+ re_comCode + "&postid=" + dnum + "&temp=0.41130405036866446");

		if (re.indexOf("\"message\":\"ok\"") > 0) {
			return re;
		} else {
			return null;
		}
	}
}
