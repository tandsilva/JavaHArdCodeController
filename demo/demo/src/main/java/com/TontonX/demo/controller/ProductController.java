package com.TontonX.demo.controller;

import com.TontonX.demo.entities.Department;
import com.TontonX.demo.entities.Product;
import com.TontonX.demo.repositoryes.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//foi criado mapeamento da classe Departament aplicado hard code nele
@RestController
@RequestMapping(value ="/products")

public class ProductController {
@Autowired
     private ProductRepository productRepository;
@GetMapping
        public List<Product> getObjects(){
//vai buscar todos no banco e salvar nesta lista
        List<Product> list = productRepository.findAll();
                return list;



        }


}
