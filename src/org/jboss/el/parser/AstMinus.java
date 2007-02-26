/* Generated By:JJTree: Do not edit this line. AstMinus.java */

package org.jboss.el.parser;

import javax.el.ELException;

import org.jboss.el.lang.ELArithmetic;
import org.jboss.el.lang.EvaluationContext;


/**
 * @author Jacob Hookom [jacob@hookom.net]
 * @version $Change: 181177 $$DateTime: 2001/06/26 08:45:09 $$Author: markt $
 */
public final class AstMinus extends ArithmeticNode {
    public AstMinus(int id) {
        super(id);
    }

    public Object getValue(EvaluationContext ctx)
            throws ELException {
        Object obj0 = this.children[0].getValue(ctx);
        Object obj1 = this.children[1].getValue(ctx);
        return ELArithmetic.subtract(obj0, obj1);
    }
}
