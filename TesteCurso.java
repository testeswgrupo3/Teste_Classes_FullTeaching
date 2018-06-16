import static org.junit.Assert.*;
import org.junit.*;

public class TesteCurso {
  Course c;
  String imagem = "imagem";
  String nome = "nome";
  User teacher;
  @Before
  public void before(){
    c = new Course(nome,imagem);
  }

  @Test
  public void testaNome(){
    assertNotEquals("Nome de curso vazio",0,c.getTitle().length());
  }

  @Test
  public void testaId(){

    assertNotEquals("Id nulo",null,c.getId());
    long id = 12321;
    c.setId(id);
    assertEquals("IDS DIFERENTES",id,c.getId());
  }

  @Test
  public void testaComparacao(){
      assertEquals("Cursos iguas dando diferente",true,c.equals(c));
      assertEquals("Cursos difentes dando iguais",false,c.equals(this));
  }

  @Test
  public void variaveisIniciais(){
      assertEquals("Titulo do curso incorreto",c.getTitle(),nome);
      assertEquals("Imagem do curso incorreta",c.getImage(),teacher);

  }

  @Test
  public void testaSets(){
      String novoTitulo = "novo titulo";
      String novaImagen = "image2";
      c.setTitle(novoTitulo);
      c.setImage(novaImagen);
      assertEquals("Titulo do curso incorreto",c.getTitle(),novoTitulo);
      assertEquals("Imagem do curso incorreta",c.getImage(),novaImagen);
  }


}
