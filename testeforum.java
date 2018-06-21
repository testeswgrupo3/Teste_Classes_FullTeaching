import static org.junit.Assert.*;
import org.junit.*;

public class testeforum {

  String id;
  String activated;
  Forum forum;

  @Before
  public void before(){
    forum = new (activated);
  }

  @Test
  public void testaAtivacao()
  {
    assertNotEquals("Ativação",null,forum.getActivated().length());
  }
  @Test
  public void testa()
  {
     Forum f1 = new Forum(activated);
     forum.setActivated("true");
     forum.setActivated("false");
     assertEquals("Mesmo forum ativado com falso e verdadeiro ", forum.equals(forum));

  }

  @Test
  public void testaForum()
  {
    Forum f1 = new Forum(activated);
    assertEquals("Forum diferentes ativados ao mesmo tempo");
    
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
