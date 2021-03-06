/*
 * Copyright (c) 2015 Oracle and/or its affiliates. All rights reserved.
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
package javax.mvc.event;

import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.UriInfo;

/**
 * <p>Event fired after a controller method returns. This event is always fired,
 * even if the controller methods fails with an exception. Must be fired after 
 * {@link javax.mvc.event.BeforeControllerEvent}.</p>
 *
 * <p>For example:
 * <pre><code>    public class EventObserver {
 *         public void afterControllerEvent(&#64;Observes AfterControllerEvent e) {
 *            ...
 *        }
 *    }</code></pre>
 *
 * @author Santiago Pericas-Geertsen
 * @author Christian Kaltepoth
 * @see javax.enterprise.event.Observes
 * @since 1.0
 */
public interface AfterControllerEvent extends MvcEvent {

    /**
     * Access to the current request URI information.
     *
     * @return URI info.
     * @see javax.ws.rs.core.UriInfo
     */
    UriInfo getUriInfo();

    /**
     * Access to the current request controller information.
     *
     * @return resources info.
     * @see javax.ws.rs.container.ResourceInfo
     */
    ResourceInfo getResourceInfo();
}
