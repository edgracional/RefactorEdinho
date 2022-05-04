package org.agoncal.application.petstore.web;



import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;


/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@Named
//@RequestScoped TODO should be request scoped
@SessionScoped
@Loggable

@Getter
@Setter
@CatchException

//======================================
// =       Diminuir as funções utilizando @getter @Setter           =
// ======================================




public class CatalogController extends Controller implements Serializable {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Inject
    private CatalogService catalogService;

    private String categoryName;
    private Long productId;
    private Long itemId;

    private String keyword;
    
    private Product product;
    private Item item;
    private List<Product> products;
    private List<Item> items;

    // ======================================
    // =              Public Methods        =
    // ======================================
    
    
    return "searchresult.faces?keyword=" + keyword + "&faces-redirect=true";
