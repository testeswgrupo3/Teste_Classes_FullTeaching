import static org.junit.Assert.*;
import org.junit.*;

public class testeforum {

  @Test
  public void testaAtivacaoForum()
  {
     Forum f1 = new Forum(false);
     f1.setActivated(true);
     assertTrue("Não foi possível ativar o forum", f1.isActivated());

  }

  @Test
  public void testaMultiplosForums(){
    Forum f2 = new Forum(true);
    Forum f3 = new Forum(true);
    assertTrue("Forum não foi ativado",f2.isActivated());
    assertTrue("Forum não foi ativado",f3.isActivated());

  }

  @Test
  public void variaveisIniciais(){
      Forum f1 = new Forum(true);
      assertEquals("Falha ao criar forum ativado",true, f1.isActivated());
      Forum f2 = new Forum(false);
      assertEquals("Falha ao criar forum desativado",false, f1.isActivated());
  }
}
