package com.pdmtaller2.a00027222_diegoalvarenga.data

object DummyData {
    fun getRestaurants(): List<Restaurant> {
        return listOf(
            Restaurant(
                id = 1,
                name = "Pizza Italia",
                description = "Deliciosas pizzas hechas al horno de leña",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxCDm538CfiAa5kQlVF8cFPKcY9ALWL3Iz6Q&s",
                categories = listOf("Comida Italiana"),
                menu = listOf(
                    Dish(1, "Pizza Margarita", "Tomate, mozzarella, albahaca", "https://upload.wikimedia.org/wikipedia/commons/f/f6/Eataly_Las_Vegas_-_Feb_2019_-_Sarah_Stierch_12.jpg"),
                    Dish(2, "Pizza Pepperoni", "Pepperoni y queso", "https://www.cocinadelirante.com/800x600/filters:format(webp):quality(75)/sites/default/files/images/2023/08/receta-de-pizza-sin-horno.jpg"),
                    Dish(3, "Pizza Quattro Stagioni", "Jamón, champiñones, alcachofas, aceitunas", "https://i.blogs.es/71bcb5/pizza/650_1200.jpg"),
                    Dish(4, "Pizza Capricciosa", "Mozzarella, jamón, champiñones, alcachofas, aceitunas negras", "https://assets.elgourmet.com/wp-content/uploads/2023/03/pizza_Mh3H4eanyBKEsStv1YclPWTf9OUqIi.png")
                )
            ),
            Restaurant(
                id = 2,
                name = "Trattoria Da Vinci",
                description = "Auténtica cocina italiana con recetas familiares de generaciones",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTB1mCP_70rXhLWSTwPP-3kd2_hUzGsjR7vxw&s",
                categories = listOf("Comida Italiana"),
                menu = listOf(
                    Dish(5, "Fettuccine Alfredo", "Fettuccine, crema, mantequilla, parmesano", "https://upload.wikimedia.org/wikipedia/commons/e/e5/Fettuccine_Pesto.JPG"),
                    Dish(6, "Lasagna Bolognesa", "Capas de pasta, carne, tomate, bechamel", "https://www.recetasdesbieta.com/wp-content/uploads/2018/10/lasagna-original..jpg"),
                    Dish(7, "Risotto ai Funghi", "Arroz arborio, champiñones, vino blanco, parmesano", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWGZ-1gtxy9dIbgNbYQwnmAL70GInYxjyGcQ&s"),
                    Dish(8, "Gnocchi al Pesto", "Gnocchi de papa con salsa de albahaca", "https://qbcucina.com/cdn/shop/articles/img-1713808789633_a37501db-2cb5-404a-9bff-eed4f8c45977_1200x.png?v=1713810591"),
                    Dish(9, "Bruschetta", "Pan tostado, tomate, ajo, albahaca, aceite de oliva", "https://www.lavanguardia.com/files/og_thumbnail/uploads/2019/07/31/5e997f087bf41.jpeg")
                )

            ),
            Restaurant(
                id = 3,
                name = "Il Forno di Nonna",
                description = "Sabores rústicos del sur de Italia cocinados en horno de piedra",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4rPJNf9AFG-fx07mHMn-t4eCr93UtHhFUmw&s",
                categories = listOf("Comida Italiana"),
                menu = listOf(
                    Dish(10, "Pizza Quattro Formaggi", "Mozzarella, gorgonzola, parmesano, provolone", "https://upload.wikimedia.org/wikipedia/commons/a/ad/Pizza_quattro_formaggi_at_restaurant%2C_Chalk_Farm_Road%2C_London.jpg"),
                    Dish(11, "Calzone Napolitano", "Masa rellena de jamón, ricotta, tomate", "https://www.pequerecetas.com/wp-content/uploads/2009/03/Calzone.jpg"),
                    Dish(12, "Spaghetti alla Carbonara", "Spaghetti, huevo, panceta, queso pecorino", "https://www.maggi.ph/sites/default/files/srh_recipes/ec9fce823d23bbb054d52aea1981fc0c.jpg"),
                    Dish(13, "Melanzane alla Parmigiana", "Berenjena, salsa de tomate, mozzarella, albahaca", "https://www.allrecipes.com/thmb/keA77HWs7yEkGu19_ZQ0Gr_i57o=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/5128092-melanzana-alla-parmigiana-perfect-eggplant-parmigiana-AndreaCiotti-4x3-1-a3ff5ab0764943598f61c1ff763f1dfb.jpg"),
                    Dish(14, "Tiramisú", "Bizcocho, café, mascarpone, cacao en polvo", "https://www.recetasnestle.com.ec/sites/default/files/srh_recipes/7f45d6f8807ebc775928651a3398dce9.png")
                )

            ),
            Restaurant(
                id = 4,
                name = "Sushi Express",
                description = "Comida asiática fresca y rápida",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRkS3NXhLY0un8UND_EGmQJG5PPEEY6yax5UQ&s",
                categories = listOf("Comida Asiática"),
                menu = listOf(
                    Dish(3, "Roll California", "Aguacate y cangrejo", "https://norecipes.com/wp-content/uploads/2019/12/best-california-roll-004.jpg"),
                    Dish(4, "Sashimi", "Corte fresco de pescado", "https://www.mardenoruega.es/globalassets/recipes/salmon/sashimi-salmon-new.jpg?width=685&height=513&transform=DownFill&hash=c09b67334c6b2829acb8927a44b68990"),
                    Dish(5, "Dragon Roll", "Aguacate, anguila, pepino, salsa teriyaki", "https://www.justonecookbook.com/wp-content/uploads/2020/06/Dragon-Roll-0286-I.jpg"),
                    Dish(6, "Tempura Roll", "Camarón tempura, aguacate, mayonesa picante", "https://cookingwithayeh.com/wp-content/uploads/2024/07/Shrimp-Tempura-Roll-SQ-4.jpg")
                )
            ),
            Restaurant(
                id = 5,
                name = "Sakura Sushi",
                description = "Experiencia tradicional japonesa con ingredientes frescos",
                imageUrl = "https://i.redd.it/cggi15vekqq01.jpg",
                categories = listOf("Comida Asiática"),
                menu = listOf(
                    Dish(7, "Nigiri de salmón", "Arroz, salmón crudo", "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480_1_5x/img/recipe/ras/Assets/64EF898D-2EDD-4B47-A456-E6A7D137AC91/Derivates/00f76cac-64f6-4573-be4f-e604a7d99143.jpg"),
                    Dish(8, "Tempura Udon", "Fideos udon con tempura de camarón", "https://www.chopstickchronicles.com/wp-content/uploads/2020/06/Tempura-Udon-update-18-e1738984922859.jpg"),
                    Dish(9, "Ramen Tonkotsu", "Caldo de cerdo, fideos, huevo, cebollino", "https://www.196flavors.com/wp-content/uploads/2023/12/Tonkotsu-ramen-FP.jpg"),
                    Dish(10, "Gyozas", "Empanadas japonesas de cerdo y col", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRloX2RKENj22J7P8jfZLk5EUgOt16mSkm3kQ&s"),
                    Dish(11, "Yakitori", "Brochetas de pollo a la parrilla", "https://www.justonecookbook.com/wp-content/uploads/2024/04/Yakitori-7831-I.jpg")
                )
            ),
            Restaurant(
                id = 6,
                name = "Wok Street",
                description = "Comida rápida estilo wok con sabores intensos",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHf-HlmVURFUPe_T2UKs3O9JB0NJB0l1dt3A&s",
                categories = listOf("Comida Asiática"),
                menu = listOf(
                    Dish(12, "Wok de Pollo", "Pollo, fideos de arroz, vegetales salteados", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgoELuMqldsgcXD6eIlDrxIFPGG0YGheYnSg&s"),
                    Dish(13, "Arroz Frito", "Arroz jazmín, huevo, zanahoria, camarones", "https://i.blogs.es/74e597/arroz-frito-chino-1-/1366_2000.jpg"),
                    Dish(14, "Pad Thai", "Fideos de arroz, tofu, maní, brotes de soya", "https://upload.wikimedia.org/wikipedia/commons/3/39/Phat_Thai_kung_Chang_Khien_street_stall.jpg"),
                    Dish(15, "Roll Primavera", "Rollos fritos rellenos de vegetales", "https://content-cocina.lecturas.com/medio/2022/03/03/rollitos-de-primavera-con-carne-y-salsa-de-soja_00000000_240402112349_1200x1200.jpg")
                )
            ),
            Restaurant(
                id = 7,
                name = "K-BBQ Grill",
                description = "Auténtica parrilla coreana al centro de tu mesa",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfYxKWgKNlqT46c3Q4J0Pz4r4SOpE-GWOOOA&s",
                categories = listOf("Comida Asiática"),
                menu = listOf(
                    Dish(16, "Galbi", "Costillas de res marinadas en salsa dulce", "https://www.seriouseats.com/thmb/xBpjlTGEywUgh43aMVSFcq014lg=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/__opt__aboutcom__coeus__resources__content_migration__serious_eats__seriouseats.com__2019__07__20190619-korean-bbq-kalbi-beef-short-ribs-vicky-wasik-21-6d69144cd74a478a81b0286b19cd79ba.jpg"),
                    Dish(17, "Bulgogi", "Láminas de carne marinadas con soya y ajo", "https://upload.wikimedia.org/wikipedia/commons/f/fd/Korean.cuisine-Bulgogi-01.jpg"),
                    Dish(18, "Kimchi", "Repollo fermentado picante", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSB8lDXrZ4UqycSJq2QZxGfvjxBDYBLI5LZKw&s"),
                    Dish(19, "Bibimbap", "Arroz, vegetales, huevo y carne en bowl", "https://mahatmarice.com/wp-content/uploads/2022/02/stella-bibimbap-e1643724078105.jpeg"),
                    Dish(20, "Tteokbokki", "Pasteles de arroz en salsa picante", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRz6W4vbVI8rp5erH9sQ2-Gl7HUGnAeFbQXw&s"),
                    Dish(21, "Japchae", "Fideos de camote con vegetales y carne", "https://www.alimentacionasiatica.com/cdn/shop/articles/Receta_de_Japchae_plato_tipico_de_Corea_416x.png?v=1676913689")
                )
            ),
            Restaurant(
                id = 8,
                name = "Burger Town",
                description = "Hamburguesas jugosas con ingredientes frescos",
                imageUrl = "https://static.wikia.nocookie.net/cod/images/1/13/Eeeeeeeeeeeeeeeeeee.png/revision/latest?cb=20130202000758&path-prefix=es",
                categories = listOf("Comida Americana"),
                menu = listOf(
                    Dish(22, "Classic Burger", "Carne de res, lechuga, tomate, cebolla, mayonesa", "https://www.eatingwell.com/thmb/UY5N-tQKYgA91XJBwiolc_1nbJ0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/3757723-7c4020ccc47240138323b9bc5b730e8d.jpg"),
                    Dish(23, "Bacon Cheese", "Carne, tocino, queso cheddar, pepinillos", "https://bk-latam-prod.s3.amazonaws.com/sites/burgerking.latam/files/BK_Web_DOBLECHEESEBACON_500X540px.png"),
                    Dish(24, "Veggie Delight", "Hamburguesa vegetal, lechuga, tomate, aguacate", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCuSTF7AJPlmhu8ZK_nOKeeyO79S4P6HWdjw&s"),
                    Dish(25, "Spicy BBQ", "Carne, salsa BBQ picante, jalapeños, cebolla frita", "https://www.allrecipes.com/thmb/eiN0Cf5F4XVonfvTbUeh2e8h6Ug=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/4450799-e3f2f681d40642a497a35e27b3157526.jpg")
                )
            ),
            Restaurant(
                id = 9,
                name = "Fried & Co.",
                description = "El sabor del sur en cada bocado frito",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR3eK99fM36RaA3h4Ji0MCGrmsYGA5fBbkCVQ&s",
                categories = listOf("Comida Americana"),
                menu = listOf(
                    Dish(26, "Pollo Frito", "Muslos de pollo marinados y empanizados", "https://comedera.com/wp-content/uploads/sites/9/2018/08/pollo-frito.jpg?w=500&h=468&crop=1"),
                    Dish(27, "Alitas Buffalo", "Alitas de pollo en salsa picante", "https://assets.tmecosys.com/image/upload/t_web_rdp_recipe_584x480/img/recipe/ras/Assets/C8418F2E-FCDF-4612-AB4D-790369D8B767/Derivates/AABF216C-6591-44BC-A5C2-FC8A4A5482E5.jpg"),
                    Dish(28, "Corn Dogs", "Salchichas empanizadas en maíz", "https://www.realmomkitchen.com/wp-content/uploads/2023/07/homemade-buttermilk-corn-dogs-cropped-jpg.webp"),
                    Dish(29, "Mac & Cheese", "Pasta con mezcla de quesos gratinada", "https://www.lovefromtheoven.com/wp-content/uploads/2023/04/one-pot-mac-cheese-17.jpg"),
                    Dish(30, "Papas Cajún", "Papas fritas con sazón cajún", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4fJPvhw8wujNgU2mVSAA9hYnzywdgGP8smA&s")
                )
            ),
            Restaurant(
                id = 10,
                name = "El Taco Loco",
                description = "Tacos callejeros con auténtico sabor mexicano",
                imageUrl = "https://d1yjjnpx0p53s8.cloudfront.net/styles/logo-thumbnail/s3/122022/taco_loco.png?WMzL3QS5MxMo_BQN8N_kX3UvfOq6OB_6&itok=GA7VBVg9",
                categories = listOf("Comida Mexicana"),
                menu = listOf(
                    Dish(31, "Taco al Pastor", "Carne de cerdo marinada, piña, cebolla", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTjE48BxaRV1cS9Vj2uEP7rMx3Cym1f17rmkA&s"),
                    Dish(32, "Taco de Asada", "Carne de res a la parrilla, cilantro", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/001_Tacos_de_carnitas%2C_carne_asada_y_al_pastor.jpg/1200px-001_Tacos_de_carnitas%2C_carne_asada_y_al_pastor.jpg"),
                    Dish(33, "Taco de Barbacoa", "Barbacoa de res, cebolla encurtida", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEyCMoWDQibIAbAOrdGghPN3df0ItePuj80A&s"),
                    Dish(34, "Taco Vegano", "Champiñones, nopales, guacamole", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRr2TWaPxuRfxS8R7Dwsdecp9SF8IxfXdYv6w&s"),
                    Dish(35, "Taco de Pescado", "Filete de pescado empanizado, repollo", "https://www.goya.com/wp-content/uploads/2023/10/grilled-fish-tacos.jpg")
                )
            ),
            Restaurant(
                id = 11,
                name = "Cantina Los Abuelos",
                description = "Recetas tradicionales del corazón de México",
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKkIeI9jG5ofJjUZsCxO5sCuk_U0QyZUPxkA&s",
                categories = listOf("Comida Mexicana"),
                menu = listOf(
                    Dish(36, "Pozole Rojo", "Maíz cacahuazintle, cerdo, chile guajillo", "https://www.foodandwine.com/thmb/MuV16R1GijOi-B7tl7fAcnerwbI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/posole-rojo-ft-RECIPE0818-2d7d7b0f97f94cdcb2115ef63f809341.jpg"),
                    Dish(37, "Mole Poblano", "Pavo en salsa de chocolate y especias", "https://laroussecocina.mx/wp-content/uploads/2017/12/mole-poblano-001-larousse-cocina_0-e1671586546996.jpg"),
                    Dish(38, "Chiles en Nogada", "Chile poblano relleno con nogada y granada", "https://cdn7.kiwilimon.com/recetaimagen/14881/640x640/7199.jpg.jpg"),
                    Dish(39, "Tamales de Elote", "Masa de elote dulce al vapor", "https://guanacos.com/wp-content/uploads/2024/09/GUANACOS-TAMALES-DE-ELOTE-SALVADORENOS-2.webp")
                )

            )
        )
    }
}