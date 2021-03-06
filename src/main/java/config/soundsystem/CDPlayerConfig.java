package config.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cafe24.springcontainer.soundsystem.CompactDisc;
import com.cafe24.springcontainer.soundsystem.HighSchoolRapper3Final;

@Configuration
@ComponentScan(basePackages="com.cafe24.springcontainer.soundsystem")
// @ComponentScan(basePackages= {"com.cafe24.springcontainer.soundsystem", "com.cafe24.springcontainer.videosystem"})
// basePackageClasses에 지정한 클래스가 속한 패키지를 Base Package 사용한다.(Marker Inteface)
// @ComponentScan(basePackageClasses=Index.class)
public class CDPlayerConfig {
	
	@Bean
	public CompactDisc highSchoolRapper3Final() {
		return new HighSchoolRapper3Final();
		
	}
}