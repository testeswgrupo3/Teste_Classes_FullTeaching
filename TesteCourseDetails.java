import static org.junit.Assert.*;
import org.junit.*;

public class TesteCourseDetails {

  @Test
  public void testaConstrutores(){
      CourseDetails cd = new CourseDetails();
      assertEquals("Informação não está sendo inicializada com \"\"",cd.getInfo(),"");
  }

  @Test
  public void testaSets(){
      CourseDetails cd = new CourseDetails();
      cd.setId(10);
      cd.setInfo("informação");
      assertEquals("Id setado esta incorreto",cd.getId(),10);
      assertEquals("Não foi possivel setar a informação",cd.getInfo(),"informação");
  }

  @Test
  public void testaInstancias(){
    CourseDetails cd = new CourseDetails();
    cd.setId(10);
    cd.setInfo("informação");

    CourseDetails cd2 = new CourseDetails();
    cd2.setId(20);
    cd2.setInfo("outra informação");

    assertNotEquals("Id's diferentes dando iguais",cd.getId(),cd2.getId());
    assertNotEquals("Informaçẽos diferentes dando iguais",cd.getInfo(),cd2.getInfo());

  }


}
