package com.distribuida.principal;

//CORECCION 

	import java.util.List;

	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.distribuida.dao.DepartamentoDAO;
	import com.distribuida.entities.Departamento;



	public class PrincipalDepartamento {

		public static void main(String[] args) {
			
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			
			DepartamentoDAO departamentoDAO = context.getBean("departamentoDAOlmpl", DepartamentoDAO.class);
			
			
			List<Departamento> departamentos = departamentoDAO.findAll();
			
			
			departamentos.forEach(item -> {
				
				System.out.println(item.toString());
			});
			context.close();

		}

	}
