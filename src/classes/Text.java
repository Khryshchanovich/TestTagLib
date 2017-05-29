package classes;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

/**
 * Created by klinster on 29.05.2017.
 *
 */
public class Text extends BodyTagSupport {
    private String registr;

    public void setRegistr(String registr) {
        this.registr = registr;
    }
    @Override
    public int doAfterBody() throws JspTagException {
        BodyContent bc = getBodyContent();
        String body = bc.getString();
        String bodyInRegistr = null;
        if (registr.equals("Upper")){
            bodyInRegistr = body.toUpperCase();
        } else {
            if (registr.equals("Lower")){
                bodyInRegistr = body.toLowerCase();
            }
        }
        try {
            getPreviousOut().print(bodyInRegistr);
        } catch(IOException ioException) {
            throw new JspTagException("Error: " + ioException.getMessage());
        }
        bc.clearBody();
        return SKIP_BODY;
    }
}
