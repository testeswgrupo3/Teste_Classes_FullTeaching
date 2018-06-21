import static org.junit.Assert.*;
import org.junit.*;

public class TesteComment {
  Commnet c;
  String msg = "minha mensagem";
  long date = 1;
  @Before
  public void before(){
    c = new Comment(msg,date);
  }

  @Test
  public void testaNome(){
    assertNotEquals("Menssagem vazia",0,c.getMessage().length());
  }

  @Test
  public void testaParent(){
    Comment cPai= new Comment("cAux",1);
    Comment c2 = new Comment("c2",2,cPai);
    assertEquals("Pai do comentario incorreto",cPai,c2.getCommentParent());
  }

  @Test
  public void variaveisIniciais(){
      Course c2 = new Course(msg,date);
      assertEquals("Comentario incorreto",c2.getMessage(),msg);
      assertEquals("Data do comentario incorreto incorreta",c2.getDate(),date);

  }

  @Test
  public void testaSets(){
      List <Comment> respostas = new List<Comment>;
      for(int i=0;i<5;i++){
        respostas.add(new Comment("Msg: "+i,3000));
      }
      c.setId(1);
      c.setMessage("msg");
      c.setVideourl("A");
      c.setAudioonly(true)
      c.setDate(2000);
      c.setReplies(respostas);
      Comment aux = new Comment("msg",6);
      c.setCommentParent(aux);

      assertEquals("Id do comentario incorreto",1,c.getId());
      assertEquals("Menssagem do comentario incorreto","msg",c.getMessage());
      assertEquals("Videourl do comentario incorreto","A",c.getVideourl());
      assertEquals("Audioonly do comentario incorreto",c.getId(),1);
      assertEquals("Data do cumentario incorreta",c.getId(),1);
      assertEquals("Respostas incorretas",c.getId(),1);
      assertEquals("Pai do comentario incorreto",c.getId(),1);
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
