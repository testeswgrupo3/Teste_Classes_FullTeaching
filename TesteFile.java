import static org.junit.Assert.*;
import org.junit.*;

public class TesteFile{

  @Test
  public void testaConstrutores(){
    File f = new  File(3, "nome");
    assertEquals("Não foi possivel criar o File com o tipo",f.getType(),3);
    assertEquals("Não foi possivel criar o File com o nome",f.getName(),"nome");
    assertEquals("Não foi possivel criar o File com o nameIdent",f.getNameIdent(),"nome");
    assertEquals("Não foi possivel criar o File com o link",f.getLink(),"");


    File f1 = new  File(1, "nome2","link");
    assertEquals("Não foi possivel criar o File com o tipo",f1.getType(),1);
    assertEquals("Não foi possivel criar o File com o nome",f1.getName(),"nome2");
    assertEquals("Não foi possivel criar o File com o nameIdent",f1.getNameIdent(),"nome2");
    assertEquals("Não foi possivel criar o File com o link",f1.getLink(),"link");

    File f2 = new File(3,"nome3","link3", 1) ;
    assertEquals("Não foi possivel criar o File com o tipo",f2.getType(),3);
    assertEquals("Não foi possivel criar o File com o nome",f2.getName(),"nome3");
    assertEquals("Não foi possivel criar o File com o nameIdent",f2.getNameIdent(),"nome3");
    assertEquals("Não foi possivel criar o File com o link",f2.getLink(),"link3");
    assertEquals("Não foi possivel setar a indexOrder",f2.getIndexOrder(),1);

  }

  @Test
  public void testaSets(){
      File f = new  File(0, "nomeaux");
      f.setId(1);
      f.setType(2);
      f.setName("nome");
      f.setNameIdent("nomeIdent");
      f.setLink("www.link.com.br");
      f.setIndexOrder(1);
      assertEquals("Não foi possivel setar o id",f.getId(),1);
      assertEquals("Não foi possivel setar o tipo",f.getType(),2);
      assertEquals("Não foi possivel setar o nome",f.getName(),"nome");
      assertEquals("Não foi possivel setar o nameIdent",f.getNameIdent(),"nomeIdent");
      assertEquals("Não foi possivel setar o link",f.getLink(),"www.link.com.br");
      assertEquals("Não foi possivel setar a indexOrder",f.getIndexOrder(),1);

  }

  @Test
  public void testaToString(){
    File f = new File(1, "nome", "link", 1) ;
		String resultado = "File[name: \"nome\", id: \"" + f.getNameIdent() + "\", link: \"link, indexOrder: 1]";
		assertEquals("funçao to toString incorreta",f.toString(),resultado);

  }
  @Test
  public void testaComparacao(){
      File f = new  File(0, "nome");
      File f2 = new  File(0, "nome");
      File fAux = new  File(0, "nome");
      f.setId(2);
      fAux.setId(2);
      f2.setId(3);

      assertTrue("Files iguas dando diferente",f.equals(fAux));
      assertFalse("Files difentes dando iguais",f.equals(f2));
  }

  @Test
  public void testaInstancias(){
    File f = new  File(0,"nomeaux");
    f.setId(1);
    f.setType(1);
    f.setName("nome");
    f.setNameIdent("nomeIdent");
    f.setLink("link");
    f.setIndexOrder(1);

    File f2 = new  File(0, "nomeAux");
    f2.setId(2);
    f2.setType(2);
    f2.setName("nome2");
    f2.setNameIdent("nomeIdent2");
    f2.setLink("link2");
    f2.setIndexOrder(2);

    assertNotEquals("Id's diferentes dando iguais",f.getId(),f2.getId());
    assertNotEquals("Tipos diferentes dando iguias",f.getType(),f2.getType());
    assertNotEquals("Nomes diferentes dando iguais",f.getName(),f2.getName());
    assertNotEquals("NomesIdent diferentes dando iguais",f.getNameIdent(),f2.getNameIdent());
    assertNotEquals("Links diferentes dando iguias",f.getLink(),f2.getLink());
    assertNotEquals("IndexOrder diferentes dando iguais",f.getIndexOrder(),f2.getIndexOrder());

  }
}
