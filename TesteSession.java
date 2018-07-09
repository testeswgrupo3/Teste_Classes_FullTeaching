import static org.junit.Assert.*;
import org.junit.*;

public class TesteSession{

  @Test
  public void testaConstrutores(){
    Session s = new  Session("titulo","descricao",2000);
    assertEquals("Não foi possivel criar a Session com o titulo",s.getTitle(),"titulo");
    assertEquals("Não foi possivel criar a Session com a descricao",s.getDescription(),"descricao");
    assertEquals("Não foi possivel criar a Session com a data",s.getDate(),2000);

  }

  @Test
  public void testaSets(){
      Session s = new  Session("t","d",2);
      s.setId(1);
      s.setTitle("titulo");
      s.setDescription("descricao");
      s.setDate(2000);

      assertEquals("Não foi possivel setar o id",s.getId(),1);
      assertEquals("Não foi possivel setar o titulo",s.getTitle(),"titulo");
      assertEquals("Não foi possivel setar a descricao",s.getDescription(),"descricao");
      assertEquals("Não foi possivel setar a data",s.getDate(),2000);


  }

  @Test
  public void testaToString(){
    Session s = new  Session("titulo","descricao",2000);
		String resultado ="Session[title: \"titulo\", description: \"descricao\", date: \"2000\"]";
		assertEquals("funçao to toString incorreta",s.toString(),resultado);

  }
  @Test
  public void testaComparacao(){
      Session s = new  Session("titulo","descricao",2000);
      Session sAux = new  Session("titulo","descricao",2000);
      Session s2 = new  Session("titulo2","descricao2",2002);
      s.setId(1);
      sAux.setId(1);
      s2.setId(2);

      assertTrue("Sessions iguas dando diferente",s.equals(sAux));
      assertFalse("Sessions difentes dando iguais",s.equals(s2));
  }

  @Test
  public void testaInstancias(){
    Session s = new  Session("t","d",2);
    s.setId(1);
    s.setTitle("titulo");
    s.setDescription("descricao");
    s.setDate(2000);

    Session s2 = new  Session("t","d",2);
    s2.setId(2);
    s2.setTitle("titulo2");
    s2.setDescription("descricao2");
    s2.setDate(2002);



    assertNotEquals("Id's diferentes dando iguais",s.getId(),s2.getId());
    assertNotEquals("Titulos diferentes dando iguias",s.getTitle(),s2.getTitle());
    assertNotEquals("Descricoes diferentes dando iguais",s.getDescription(),s2.getDescription());
    assertNotEquals("Datas diferentes dando iguais",s.getDate(),s2.getDate());

  }
}
