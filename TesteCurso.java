import static org.junit.Assert.*;
import org.junit.*;
public class TesteCurso {
  Course c;
  String imagem = "imagem";
  String nome = "nome";

  @Before
  public void before(){
	User teacher = 	new User("nome", "senha", "apelido", "imagem", new String[]{"role1","role2"});
    c = new Course(nome,imagem,teacher);
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
  public void testaObjeto(){
      assertEquals("Cursos iguas dando diferente",true,c.equals(c));
      assertEquals("Cursos difentes dando iguais",false,c.equals(this));
  }
}
