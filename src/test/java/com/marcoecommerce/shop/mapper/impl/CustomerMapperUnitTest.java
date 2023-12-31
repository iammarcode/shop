package com.marcoecommerce.shop.mapper.impl;

import com.marcoecommerce.shop.utils.TestDataUtil;
import com.marcoecommerce.shop.mapper.Mapper;
import com.marcoecommerce.shop.model.customer.CustomerDto;
import com.marcoecommerce.shop.model.customer.CustomerEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CustomerMapperUnitTest {

    @Autowired
    private Mapper<CustomerEntity, CustomerDto> underTest;

    @Test
    public void TestConvertCustomerEntityToDto() {
        CustomerEntity customerAEntity = TestDataUtil.createCustomerEntityA();
        CustomerDto customerDtoA = underTest.mapTo(customerAEntity);

        assertEquals(customerDtoA.getId(), customerAEntity.getId());
        assertEquals(customerDtoA.getName(), customerAEntity.getName());
    }

    @Test
    public void TestConvertCustomerDtoToEntity() {
        CustomerDto customerDtoA = TestDataUtil.createCustomerDtoA();
        CustomerEntity customerEntityA = underTest.mapFrom(customerDtoA);

        assertEquals(customerDtoA.getId(), customerEntityA.getId());
        assertEquals(customerDtoA.getName(), customerEntityA.getName());
    }

}
