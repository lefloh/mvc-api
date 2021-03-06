/*
 * Copyright (c) 2016-2018 JSR 371 expert group and contributors
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package javax.mvc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>Defines a symbolic name for a controller method to be referenced by one of the
 * {@link javax.mvc.MvcContext#uri} methods.</p>
 *
 * <p>The same value of @UriRef can only be used multiple times on different methods
 * if these methods are using the same URI-template with different HTTP verbs.</p>
 *
 * @author Florian Hirsch
 * @see javax.mvc.MvcContext#uri
 * @since 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UriRef {

    String value();

}
