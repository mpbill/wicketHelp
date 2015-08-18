
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mb659v
 */
public final class index extends WebPage {

    public index() {
        super();
        NavBarTop navBar = new NavBarTop("myBorder");
        add(navBar);
    }
    
    public index(PageParameters params) {
        //TODO:  process page parameters
        
    }
}
