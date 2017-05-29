package classes;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by klinster on 29.05.2017.
 *
 */
public class TextRepeat extends TagSupport {
    private int i;
    private int repeatCount;

    public void setRepeatCount(int repeatCount) {
        this.repeatCount = repeatCount;
    }
    @Override
    public int doStartTag() throws JspException{
        i=0;
        if (repeatCount<=0){
            return SKIP_BODY;
        }
        i++;
        return EVAL_BODY_INCLUDE;
    }
    public int doAfterBody() throws JspException{
        while (i<repeatCount){
            i++;
            return EVAL_BODY_AGAIN;
        }
        return SKIP_BODY;
    }
}
