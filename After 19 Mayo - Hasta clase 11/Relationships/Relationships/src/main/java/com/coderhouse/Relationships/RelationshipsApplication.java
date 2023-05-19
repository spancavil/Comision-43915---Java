package com.coderhouse.Relationships;

import com.coderhouse.Relationships.entities.*;
import com.coderhouse.Relationships.model.BookRepository;
import com.coderhouse.Relationships.model.CourseRepository;
import com.coderhouse.Relationships.model.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class RelationshipsApplication implements CommandLineRunner {

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private CourseRepository courseRepository;

	public static void main(String[] args) {
		SpringApplication.run(RelationshipsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("H2 console available in: http://localhost:8888/h2-console");
		Member sebas = new Member("Sebas", "Anca");
		Member noelia = new Member("Noelia", "Mora");

		this.memberRepository.save(sebas);
		this.memberRepository.save(noelia);

		Book libroSebas = new Book("Un libro muy largo", "23Xd", sebas);
		Book libroNoe = new Book("Un libro cortina", "sh2XSS", noelia);

		this.bookRepository.save(libroSebas);
		this.bookRepository.save(libroNoe);

		List<BookDTO> listadoBooks = this.memberRepository.getBookByMemberId(1);

		for (BookDTO book: listadoBooks
			 ) {
			System.out.println(book);
		}

		Course curso1 = new Course();
		ArrayList<Member> miembrosCurso1 = new ArrayList<>();
		miembrosCurso1.add(sebas);
		miembrosCurso1.add(noelia);
		curso1.setMembers(miembrosCurso1);
		this.courseRepository.save(curso1);

		Optional<Course> cursoEncontrado = this.courseRepository.findById(1);

		cursoEncontrado.ifPresent(System.out::println);

		List<MemberDTO> listadoMiembrosCurso1 = this.courseRepository.getMembersofCourseByCourseId(1);

		System.out.println(listadoMiembrosCurso1);

		/*System.out.println(listadoBooks);
		for (Tuple book: listadoBooks
			 ) {
			//Imprime correctamente
			System.out.println(Arrays.toString(book.toArray()));

			List<?> lista = book.getElements();
			for (Object item: lista
				 ) {
				System.out.println(item.toString());
			}
		}*/
	}
}
