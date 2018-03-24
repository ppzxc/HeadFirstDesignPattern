package head.first.design.pattern.rule.decorator.v1.iodecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by cho_jeong_ha on 2018-03-24 오후 11:55
 * Blog : https://jungha-cho.github.io/
 * Github : https://github.com/JungHa-Cho
 * Email : ppzxc8487@gmail.com
 */
public class LowerCaseInputStream extends FilterInputStream {
  /**
   * InputStream, 부모를 초기화한다.
   *
   * @param in the in
   */
  public LowerCaseInputStream(InputStream in) {
    super(in);
  }

  @Override
  public int read() throws IOException {
    // read는 문자열의 끝이면 -1을 반환하고 아니면, 캐릭터 반환
    // 캐릭터가 있으면 소문자로 바꾸겠다는 뜻
    int c = super.read();
    return (c == -1 ? c : Character.toLowerCase((char)c));
  }

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    // 바이트 배열을 오프셋부터 len까지
    // 각바이트 검사
    int result = super.read(b, off, len);
    for (int i = off; i < off + result; i++) {
      b[i] = (byte) Character.toLowerCase((char)b[i]);
    }
    return result;
  }
}
