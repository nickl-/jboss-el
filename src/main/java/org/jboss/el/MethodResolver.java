package org.jboss.el;

import javax.el.ELContext;

public abstract class MethodResolver {
	public abstract Object invoke(ELContext context, Object base, String name, Object[] params) throws Exception;
}
