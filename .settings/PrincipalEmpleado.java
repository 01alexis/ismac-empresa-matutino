package como.distribuidaPrincipal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dao.EmpleadoDAO;
import com.distribuida.entities.Empleado;




public class PrincipalEmpleado {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EmpleadoDAO empleadoDAO = context.getBean("empleadoDAOImpl", EmpleadoDAO.class);
		
		
		List<Empleado> empleados = empleadoDAO.findAll();
		
		
		empleados.forEach(item -> {
			
			System.out.println(item.toString());
		});
		context.close();

	}

}
