import static org.junit.Assert.*;
import org.junit.*;

public class TesteCurso {
  Course course;
  CourseDetails c;
  
  String imagem = "imagem";
  String nome = "nome";
  long id = 1;
  String info = "nome";

  @Before
  public void before(){
    course = new Course(nome,imagem);
    c = new CourseDetails(course);
  }

  @Test
  public void testaInfo(){
    assertNotEquals("Nome de curso vazio","",c.getInfo());
  }

  @Test
  public void testaComparacao(){
      CourseDetails c2 = new CourseDetails(new Course(nome,imagem));
      course.setId(1);
      c2.setId(2);
      assertTrue("Cursos iguas dando diferente",c.equals(c));
      assertFalse("Cursos difentes dando iguais",c.equals(c2));
  }

  @Test
  public void variaveisIniciais(){
      CourseDetails c2 = new CourseDetails(new Course(nome,imagem));
      assertEquals("Titulo do curso incorreto",c2.getInfo(),nome);
      assertEquals("Imagem do curso incorreta",c2.getInfo(),imagem);

  }

  
}
