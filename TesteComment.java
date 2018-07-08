import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
public class TesteComment {
  Comment c;
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
  public void testaConstrutores(){
      Comment c2 = new Comment("minha menssagem 1",2000);
      assertEquals("Comentario incorreto",c2.getMessage(),"minha menssagem 1");
      assertEquals("Data do comentario incorreto incorreta",c2.getDate(),2000);

      Comment pai = new Comment("pai",3);
      Comment c3= new Comment("minha menssagem 2",2000,pai);
      assertEquals("Comentario incorreto",c3.getMessage(),"minha menssagem 2");
      assertEquals("Data do comentario incorreto incorreta",c3.getDate(),2000);
      assertEquals("Data do comentario incorreto incorreta",c3.getCommentParent(),pai);

  }

  @Test
  public void testaSets(){
      List <Comment> respostas = new ArrayList<Comment>();
      for(int i=0;i<5;i++){
        respostas.add(new Comment("Msg: "+i,3000));
      }
      c.setId(1);
      c.setMessage("msg");
      c.setVideourl("A");
      c.setAudioonly(true);
      c.setDate(2000);
      c.setReplies(respostas);
      Comment aux = new Comment("msg",6);
      c.setCommentParent(aux);

      assertEquals("Id do comentario incorreto",1,c.getId());
      assertEquals("Menssagem do comentario incorreto","msg",c.getMessage());
      assertEquals("Videourl do comentario incorreto","A",c.getVideourl());
      assertEquals("Audioonly do comentario incorreto",true,c.getAudioonly());
      assertEquals("Data do cumentario incorreta",2000,c.getDate());
      assertEquals("Respostas incorretas",respostas,c.getReplies());
      assertEquals("Pai do comentario incorreto",aux,c.getCommentParent());
  }

  @Test
  public void testaToString(){
    Comment c= new Comment("cAux",1);
		String resultado = "Comment[message: \"cAux\", parent: \"null\", #replies: 0date: \"1\"]";

		assertEquals("funçao to string incorreta",resultado,c.toString());
  }

  @Test
  public void testaInstancias(){
    Comment c2 = new Comment("cAux2",2);


    List <Comment> respostas = new ArrayList<Comment>();
    for(int i=0;i<5;i++){
      respostas.add(new Comment("Msg: "+i,3000));
    }

    List <Comment> respostas2 = new ArrayList<Comment>();
    for(int i=0;i<5;i++){
      respostas2.add(new Comment("Msg: "+i,3000));
    }
    c.setId(1);
    c.setMessage("1");
    c.setVideourl("1");
    c.setAudioonly(true);
    c.setDate(1);
    c.setReplies(respostas);
    Comment aux = new Comment("1",6);
    c.setCommentParent(aux);

    c2.setId(2);
    c2.setMessage("2");
    c2.setVideourl("2");
    c2.setAudioonly(false);
    c2.setDate(2);
    c2.setReplies(respostas2);
    Comment aux2 = new Comment("2",6);
    c2.setCommentParent(aux2);

    assertNotEquals("Id's diferentes dando iguais",c2.getId(),c.getId());
    assertNotEquals("Messangens diferentes dando iguas",c2.getMessage(),c.getMessage());
    assertNotEquals("Videourl diferentes dando iguas",c2.getVideourl(),c.getVideourl());
    assertNotEquals("Audioonly diferentes dando iguais",c2.getAudioonly(),c.getAudioonly());
    assertNotEquals("Data diferentes dando iguas",c2.getDate(),c.getDate());
    assertNotEquals("Respostas diferentes dando iguas",c2.getReplies(),c.getReplies());
    assertNotEquals("Comment parents diferentes dando iguais",c2.getCommentParent(),c.getCommentParent());


  }
}
