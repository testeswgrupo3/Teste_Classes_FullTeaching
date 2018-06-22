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
  public void testaForum()
  {
     Forum f1 = new Forum(activated);
     forum.setActivated("true");
     forum.setActivated("false");
     assertEquals("Mesmo forum ativado com falso e verdadeiro ", forum.equals(forum));

  }

  @Test
  public void testaInstancias(){
    Forum f2 = new Forum("true","true");
    Forum f3 = new Forum("falso","falso");
    f2.setActivated("true");
    f3.setActivated("falso");
    assertEquals("Forum diferente ativados ao mesmo tempo",f2.getActivated(),f3.getActivated());

  }

  @Test
  public void variaveisIniciais(){
      Course f1 = new Forum(activated);
      assertEquals("Ativação do forum incorreta", f1.getActivated(),activated);




}
