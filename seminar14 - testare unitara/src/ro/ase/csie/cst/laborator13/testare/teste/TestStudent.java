package ro.ase.csie.cst.laborator13.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cst.laborator13.testare.exceptii.ExceptieNota;
import ro.ase.csie.cst.laborator13.testare.exceptii.ExceptieNume;
import ro.ase.csie.cst.laborator13.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cst.laborator13.testare.modele.Student;
import ro.ase.csie.cst.laborator13.testare.teste.categorii.TestImportant;
import ro.ase.csie.cst.laborator13.testare.teste.categorii.TestPerformanta;

public class TestStudent {
	
	//colectia de date de inceput necesare pentru un test case= test fixture
	static Student student;
	static ArrayList<Integer> note;
	static String numeInitial = "Gigel";
	static int varstaInitiala = 21;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//o singura data inaintea tuturor unit testelor
		note  = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(8);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		note.clear();
		note = null;
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(numeInitial, varstaInitiala, note);
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetVarstaConformanceRight() throws ExceptieVarsta {
		int varstaNoua = 23;
		student.setVarsta(varstaNoua);
		
		assertEquals("Test cu valori corecte", varstaNoua, student.getVarsta());
		
	}
	
	@Test
	public void testSetNumeRight() {
		
		String numeNou = "Ana";
		try {
			student.setNume(numeNou);
			assertEquals("Test cu valori corecte", numeNou, student.getNume());
		} catch (ExceptieNume e) {
			fail("Genereaza exceptie pentru valori corecte");
		}
		
	}
	
	@Test
	public void testSetVarstaErrorCondition() {
		int varstaNoua = Student.MIN_VARSTA - 1;
		try {
			student.setVarsta(varstaNoua);
			fail("Nu genereaza exceptie pentru varsta in afara limitelor");
		} catch (ExceptieVarsta e) {
			assertTrue(true);
		}
	}
	
	@Test(expected = ExceptieNume.class)
	public void testSetNumeErrorCondition() throws ExceptieNume {
		String numeNou = "Io";
		student.setNume(numeNou);
	}
	
	@Category(TestPerformanta.class)
	@Test
	public void testGetNotaMinimaOrderingSetSortatCrescator() throws ExceptieNota {
		int notaMinima = 4;
		ArrayList<Integer> note = new ArrayList<>();
		for(int i=0; i<5; i++) {
			note.add(i+notaMinima);
		}
		student.setNote(note);
		
		int notaMinimaCalculata = student.getNotaMinima();
		assertEquals("Test cu valori sortate crescator", notaMinima, notaMinimaCalculata);
		
	}
	@Category(TestImportant.class)
	@Test
	public void testGetNotaMinimaCardinalityZero() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		int notaMinima=0;
		int notaMinimaCalculata = student.getNotaMinima();
		assertEquals("Test fara note", notaMinima,notaMinimaCalculata);
	
	}
	
	@Test
	public void testGetNotaMinimaCardinalityUnu() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(Student.MAX_NOTA);
		student.setNote(note);
		int notaMinima=student.MAX_NOTA;
		int notaMinimaCalculata = student.getNotaMinima();
		assertEquals("Test fara note", notaMinima,notaMinimaCalculata);
	
	}
	
	@Test
	public void testGetNotaMinimaExistanceReferintaNoteNull() throws ExceptieNota {
		student.setNote(null);
		int notaMinima = 0;
		int notaMinimaCalculata = student.getNotaMinima();
		assertEquals("Test cu referinta null pentru note", notaMinima,notaMinimaCalculata);
	}

}
