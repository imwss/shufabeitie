import java.io.IOException;

import org.junit.Test;

public class SinaExtractImagesTest {

	@Test
	public void sina() throws IOException {
		String url = "http://blog.sina.com.cn/s/blog_62976b1f0100j8ms.html";
		SinaExtractImages extractor = new SinaExtractImages();
		extractor.download(url);
	}

}
