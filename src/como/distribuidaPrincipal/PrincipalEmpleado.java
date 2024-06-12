package como.distribuidaPrincipal;

import java.util.List;


import com.distribuida.dao.EmpleadoDAO;
import com.distribuida.entities.Empleado;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrincipalEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Patron IoC Invercion del control 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EmpleadoDAO empleadoDAO = context.getBean("empleadoDAOImpl", EmpleadoDAO.class);
		
		
		List<Empleado> empleados = empleadoDAO.findAll();
		
		
		empleados.forEach(item -> {
			
			System.out.println(item.toString());
		});
		context.close();

	}

}
