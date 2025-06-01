package com.codewithmosh.store.mappers;


import com.codewithmosh.store.dtos.CreateProductRequest;
import com.codewithmosh.store.dtos.ProductDto;
import com.codewithmosh.store.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(target = "categoryId", source = "category.id")
    ProductDto toDto(Product product);

    Product toEntity(ProductDto productDto);

    @Mapping(target = "category", ignore = true)
    Product toEntity(CreateProductRequest createProductRequest);
}
