package classes;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by klinster on 28.05.2017.
 *
 */
public class DateFormat extends TagSupport {
    private static final long serialVersionUID = 1L;
    private String formatdate;

    public void setFormatdate(String formatdate) {
        this.formatdate = formatdate;
    }

    @Override
    public int doStartTag() throws JspException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatdate);
        Date now = new Date();
        String formattedDate = dateFormat.format(now);
        try {
            pageContext.getOut().print(formattedDate);
        } catch(IOException ioException) {
            throw new JspException("Error: " + ioException.getMessage());
        }
        return SKIP_BODY;
    }
}
