import static org.junit.Assert.*;
import org.junit.*;

public class testeforum {

  @Test
  public void testaConstrutores(){
      Forum f = new Forum(true);
      assertEquals("Não foi possivel cria o forum ativado",f.isActivated(),true);
  }

  @Test
  public void testaSets(){
      Forum f = new Forum(true);
      f.setId(10);
      f.setActivated(false);
      assertEquals("Id setado esta incorreto",f.getId(),10);
      assertEquals("Não foi possivel setar o forum como ativado",f.isActivated(),false);
  }

  @Test
  public void testaToString(){
    Forum f = new Forum(true);
		String resultado = "Forum[activated: \"true\", #comments: \"0\"]";
		assertEquals("funçao to toString incorreta",f.toString(),resultado);

  }

  @Test
  public void testaInstancias(){
    Forum f = new Forum(true);
    f.setId(10);
    f.setActivated(false);

    Forum f2 = new Forum(true);
    f2.setId(20);
    f2.setActivated(true);

    assertNotEquals("Id's diferentes dando iguais",f.getId(),f2.getId());
    assertNotEquals("Estado de forum diferentes dando iguais",f.isActivated(),f2.isActivated());

  }
}
