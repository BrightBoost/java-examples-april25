package project;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MailDocument extends Document {
  private String receiver;

  @Override
  public void test() {
    System.out.println("bla");
  }

}
