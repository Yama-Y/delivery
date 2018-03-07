package yama.delivery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.UUID;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;

/**
 * @author Powered by Yama
 * @github https://github.com/Yama-Y
 * @mail my.yama.y@foxmail.com
 */
class HttpExcuse {
	private static final String DEFALUT_ENCODE = "utf-8";

	public static CloseableHttpClient httpClient = HttpClientBuilder.create()
			.build();

	public static String get(String url) {
		HttpGet httpget = new HttpGet(url);
		httpget.setHeader(new BasicHeader("Content-Type",
				"application/x-www-form-urlencoded; charset=utf-8"));
		httpget.setHeader(new BasicHeader("Accept", "text/plain;charset=utf-8"));
		httpget.setHeader(new BasicHeader(
				"User-Agent",
				"Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.186 Safari/537.36"));
		httpget.setHeader(new BasicHeader("User-Agent", String.valueOf(UUID
				.randomUUID())));
		httpget.setHeader(new BasicHeader(
				"Cookie",
				"BAIDUID=27BBCAF6BF3E93DDFB82CEF428EE3199:FG=1; BIDUPSID=27BBCAF6BF3E93DDFB82CEF428EE3199; PSTM=1520402464; PSINO=7; H_PS_PSSID="));

		CloseableHttpResponse response = null;
		try {
			response = httpClient.execute(httpget);

			return copyResponse2Str(response);
		} catch (Exception e) {
		} finally {
			try {
				if (response != null) {
					response.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private static String copyResponse2Str(CloseableHttpResponse response) {
		try {
			int code = response.getStatusLine().getStatusCode();
			if ((code == HttpStatus.SC_MOVED_TEMPORARILY)
					|| (code == HttpStatus.SC_MOVED_PERMANENTLY)
					|| (code == HttpStatus.SC_SEE_OTHER)
					|| (code == HttpStatus.SC_TEMPORARY_REDIRECT)) {
				return null;
			} else {
				return copyInputStream2Str(response.getEntity().getContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static String copyInputStream2Str(InputStream in) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					in, DEFALUT_ENCODE));
			String line = null;
			StringBuffer sb = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			return sb.toString();
		} catch (Exception e) {
		}
		return null;
	}

	public static String convert(String utfString) {
		StringBuilder sb = new StringBuilder();
		int i = -1;
		int pos = 0;

		while ((i = utfString.indexOf("\\u", pos)) != -1) {
			sb.append(utfString.substring(pos, i));
			if (i + 5 < utfString.length()) {
				pos = i + 6;
				sb.append((char) Integer.parseInt(
						utfString.substring(i + 2, i + 6), 16));
			}
		}

		return sb.toString();
	}
}