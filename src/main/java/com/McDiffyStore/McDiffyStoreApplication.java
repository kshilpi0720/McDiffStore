package com.McDiffyStore;



import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.McDiffyStore.ripository.CartProductRepository;
import com.McDiffyStore.ripository.CartRipository;
import com.McDiffyStore.ripository.CategoryRepository;
import com.McDiffyStore.ripository.ProductRepository;
import com.McDiffyStore.ripository.RoleRipository;
import com.McDiffyStore.ripository.UserRipository;
import com.McDiffyStore.entity.User;
import com.McDiffyStore.entity.Category;
import com.McDiffyStore.entity.Role;
import com.McDiffyStore.entity.Cart;
import com.McDiffyStore.entity.Product;
import com.McDiffyStore.entity.CartProduct;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableConfigurationProperties
//@EnableJpaAuditing
@EntityScan(basePackages="com.McDiffyStore.entity")

public class McDiffyStoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(McDiffyStoreApplication.class, args);
		UserRipository userRepositpory=context.getBean(UserRipository.class);
		RoleRipository roleRepositpory=context.getBean(RoleRipository.class);
		CategoryRepository categoryRepositpory=context.getBean(CategoryRepository.class);
		CartRipository cartRepository=context.getBean(CartRipository.class);
		ProductRepository productRepository=context.getBean(ProductRepository.class);
		CartProductRepository cartproductRepository=context.getBean(CartProductRepository.class);
		
		User user1=new User();
		user1.setUsername("jack");
		user1.setPassword("pass_word");
		
		
		User user2=new User();
		user2.setUsername("bob");
		user2.setPassword("pass_word");
		
		
		User user3=new User();
		user3.setUsername("apple");
		user3.setPassword("pass_word");
		
		
		User user4=new User();
		user4.setUsername("glaxo");
		user4.setPassword("pass_word");
		
		List<User> users=List.of(user1,user2,user3,user4);
		userRepositpory.saveAll(users);
		
		//Inserting Role
		
		Role role1=new Role();
		role1.setRole("CONSUMER");
		 	
		
		
		Role role2=new Role();
		role2.setRole("SELLER");
		
		List<User> roleUser=role1.getUser();
		roleUser.add(user1);
		roleUser.add(user2);
	
		
		List<User> roleUser1=role2.getUser();
		roleUser1.add(user4);
		roleUser1.add(user3);
		
		List<Role> roles=List.of(role1,role2);
		roleRepositpory.saveAll(roles);
		
		//Inserting Catagery
		Category category1=new Category();
		category1.setCategoryName("Fashion");
		
		Category category2=new Category();
		category2.setCategoryName("Electronics");
		Category category3=new Category();
		category3.setCategoryName("Books");
		Category category4=new Category();
		category4.setCategoryName("Groceries");
		Category category5=new Category();
		category5.setCategoryName("Medicines");
		
		List<Category> category=List.of(category1,category2,category3,category4,category5);
		categoryRepositpory.saveAll(category);
		
		//Inserting in cart
		Cart cart1=new Cart();
		cart1.setTotalAmaount(20);
		cart1.setUser(user1);
		
		Cart cart2=new Cart();
		cart2.setTotalAmaount(0);
		cart2.setUser(user2);
		
		List<Cart> cart=List.of(cart1,cart2);
		cartRepository.saveAll(cart);
		
		//Inserting product
		
		Product product1=new Product();
		product1.setPrice(29190);
		product1.setProductName("Apple iPad 10.2 8th Gen Wifi iOS Tablet");
		product1.setCategory(category2);
		product1.setSeller(user3);
		
		Product product2=new Product();
		product2.setPrice(10);
		product2.setProductName("Crocin pain relief tablet");
		product2.setCategory(category5);
		product2.setSeller(user4);
		
		List<Product> products=List.of(product1,product2);
		productRepository.saveAll(products);
		
		//Inserting cart product
		CartProduct cartProduct1=new CartProduct();
		cartProduct1.setCart(cart1);
		cartProduct1.setProduct(product2);
		cartProduct1.setQuantity(2);
		
		List<CartProduct> cartProduct=List.of(cartProduct1);
		cartproductRepository.saveAll(cartProduct);
		
		
		
		
		
	}

}
