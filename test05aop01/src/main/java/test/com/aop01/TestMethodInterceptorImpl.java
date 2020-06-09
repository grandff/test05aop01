package test.com.aop01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMethodInterceptorImpl implements MethodInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.info("invoke on !!!! ");
		
		// 1. 메소드 실행 전에 메소드명 획득
		
		// 2. 메소드 실행 전 수행로직 구현
		
		// 3. 해당 메소드 호출
		
		// 4. 메소드 실행 후 수행 로직 구현
		
		return null;
	}

}
