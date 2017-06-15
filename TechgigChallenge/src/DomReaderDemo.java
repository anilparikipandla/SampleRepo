import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class DomReaderDemo {

	public static void main(String[] args) throws IOException {
		String strSource = getUrlSource("https://jsoup.org/cookbook/input/parse-document-from-string");
		Document doc = Jsoup.parse(strSource);
		System.out.println(doc);
	}

	public static String getUrlSource(String url) throws IOException {
		URL websiteUrl = new URL(url);
		URLConnection urlCon = websiteUrl.openConnection();
		BufferedReader BuffInput = new BufferedReader(new InputStreamReader(urlCon.getInputStream(), "UTF-8"));
		String inputLine;
		StringBuilder a = new StringBuilder();
		while ((inputLine = BuffInput.readLine()) != null)
			a.append(inputLine);
		// System.out.println(a);
		BuffInput.close();
		String sourceHtml = a.toString();
//		System.out.println(sourceHtml);
		return sourceHtml;
	}

}
