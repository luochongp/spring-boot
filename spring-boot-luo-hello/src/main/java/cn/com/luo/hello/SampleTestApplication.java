/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.com.luo.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * Sample application to demonstrate testing.
 *
 * @author Phillip Webb
 */
@SpringBootApplication
@ConfigurationPropertiesScan
public class SampleTestApplication {

	// NOTE: this application will intentionally not start without MySQL, the test will
	// still run.

	public static void main(String[] args) {
		SpringApplication.run(SampleTestApplication.class, args);
		/**
		 * 借鉴SpringApplication内部run方法的实现，也可这样写，这样写一个好处是
		 * 可以通过SpringApplication提供的一些方法(setXXX或addXXX方法)来进行
		 * 指定功能的定制化设置
		 */
		//new SpringApplication(SampleTestApplication.class).run(args);

	}

}
