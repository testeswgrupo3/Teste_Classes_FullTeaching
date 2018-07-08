import static org.junit.Assert.*;
import org.junit.*;

public class TesteCourseDetails {

  @Test
  public void testaInfo(){
    CourseDetails c  = new CourseDetails();
    String info = "Informação do curso";
    c.setInfo(info);
    assertEquals("Informação do curso ","",c.getInfo());
  }

  @Test
  public void variaveisIniciais(){
    CourseDetails c  = new CourseDetails();
    assertNotEquals("Informação inicial diferente de 'vazio'","",c.getInfo());

  }


}
