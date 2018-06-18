import static org.junit.Assert.*;
import org.junit.*;

public class TesteCurso {
  Course c;
  String imagem = "imagem";
  String nome = "nome";
  @Before
  public void before(){
    c = new Course(nome,imagem);
  }

  @Test
  public void testaNome(){
    assertNotEquals("Nome de curso vazio",0,c.getTitle().length());
  }

  @Test
  public void testaComparacao(){
      Course c2 = new Course(nome,imagem);
      c.setId(1);
      c2.setId(2);
      assertTrue("Cursos iguas dando diferente",c.equals(c));
      assertFalse("Cursos difentes dando iguais",c.equals(c2));
  }

  @Test
  public void variaveisIniciais(){
      Course c2 = new Course(nome,imagem);
      assertEquals("Titulo do curso incorreto",c2.getTitle(),nome);
      assertEquals("Imagem do curso incorreta",c2.getImage(),imagem);

  }

  @Test
  public void testaSets(){
      String novoTitulo = "novo titulo";
      String novaImagen = "image2";
      c.setId(1);
      c.setTitle(novoTitulo);
      c.setImage(novaImagen);
      assertEquals("Titulo do curso incorreto",c.getTitle(),novoTitulo);
      assertEquals("Imagem do curso incorreta",c.getImage(),novaImagen);
      assertEquals("Id do curso incorreto",c.getId(),1);
      assertEquals("Id do curso incorreto",c.getId(),1);
  }

  @Test
  public void testaToString(){
    assertEquals("Função ToString Incorreta","Course[title: \"" + nome + "]",c.toString());
  }

  @Test
  public void testaInstancias(){
    Course c3 = new Course("3","3");
    Course c4 = new Course("4","4");
    c3.setId(3);
    c4.setId(4);
    assertNotEquals("Titulo diferentes de cursos diferentes dando iguais",c3.getTitle(),c4.getTitle());
    assertNotEquals("Images diferentes de cursos diferentes dando iguais",c3.getImage(),c4.getImage());
    assertNotEquals("IDs diferentes de cursos diferentes dando iguais",c3.getId(),c4.getId());

  }
}
