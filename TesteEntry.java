import static org.junit.Assert.*;
import org.junit.*;

public class TesteEntry{

  @Test
  public void testaConstrutores(){
      Entry e = new Entry("titulo",2000);
      assertEquals("Não foi possivel cria uma instancia da classe com o titulo correto",e.getTitle(),"titulo");
      assertEquals("Não foi possivel cria uma instancia da classe com a data correta",e.getDate(),2000);

  }

  @Test
  public void testaSets(){
      Entry e = new Entry("",0);
      e.setTitle("titulo");
      e.setDate(2000);
      e.setId(10);
      assertEquals("Não foi possivel setar o id",e.getId(),10);
      assertEquals("Não foi possivel setar o titulo",e.getTitle(),"titulo");
      assertEquals("Não foi possivel setar a data",e.getDate(),2000);

  }

  @Test
  public void testaToString(){
    Entry e = new Entry("titulo",2000);
		String resultado = "Entry[title: \"titulo\", date: 2000]";
		assertEquals("funçao to toString incorreta",e.toString(),resultado);

  }

  @Test
  public void testaInstancias(){
    Entry e = new Entry("titulo",2000);
    e.setId(10);

    Entry e2 = new Entry("titulo 2",2222);
    e2.setId(20);

    assertNotEquals("Id's diferentes dando iguais",e.getId(),e2.getId());
    assertNotEquals("Titulos diferentes dando iguas",e.getTitle(),e2.getTitle());
    assertNotEquals("Datas diferentes dando iguais",e.getDate(),e2.getDate());

  }
}
