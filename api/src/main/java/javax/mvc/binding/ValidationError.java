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
package javax.mvc.binding;

import javax.validation.ConstraintViolation;

/**
 * <p>Represents a single validation error detected for a parameter. A validation error always
 * corresponds to exactly one {@link ConstraintViolation}.</p>
 *
 * @author Christian Kaltepoth
 * @since 1.0
 */
public interface ValidationError extends ParamError {

    /**
     * The underlying {@link ConstraintViolation} detected for the parameter.
     *
     * @return The violation detected for the parameter
     */
    ConstraintViolation<?> getViolation();

}
