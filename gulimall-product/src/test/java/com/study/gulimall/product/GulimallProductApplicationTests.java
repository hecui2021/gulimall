package com.study.gulimall.product;

import com.study.gulimall.product.entity.BrandEntity;
import com.study.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {

	@Autowired
	private BrandService brandService;

	@Test
	public void contextLoads() {

		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("hudddaweiddd");
		brandService.save(brandEntity);

		System.out.println("保存成功");
	}

}
