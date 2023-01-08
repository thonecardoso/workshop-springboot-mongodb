package com.thonecardoso.springmongo.config;

//@Configuration
//@EnableSwagger2
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "com.thonecardoso.springmongo";
    private static final String API_TITLE = "Workshop Mongo API";
    private static final String API_DESCRIPTION = "API developed to learn mongodb main features";
    private static final String CONTACT_NAME = "Thone Cardoso de Araujo";
    private static final String CONTACT_GITHUB = "https://github.com/thonecardoso";
    private static final String CONTACT_EMAIL = "thonecardoso@gmail.com";
    private static final String API_VERSION = "1.0.0";



//    @Bean
//    public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(buildApiInfo());
//    }
//
//    private ApiInfo buildApiInfo() {
//        return new ApiInfoBuilder()
//                .title(API_TITLE)
//                .description(API_DESCRIPTION)
//                .version(API_VERSION)
//                .contact(new Contact(CONTACT_NAME, CONTACT_GITHUB, CONTACT_EMAIL))
//                .build();
//    }
}
