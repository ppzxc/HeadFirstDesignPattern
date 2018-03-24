package head.first.design.pattern.rule.decorator.v1.iodecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by cho_jeong_ha on 2018-03-25 오전 12:01
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class InputTest {
  public static void main(String[] args) throws IOException {
    int c;
    try {
      InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\0000_WorkSpace\\GitHub\\HeadFirstDesignPattern\\HeadFirstDesignPattern\\src\\main\\resources\\test.txt")));

      while ((c = in.read()) >= 0) {
        System.out.print((char)c);
      }
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
