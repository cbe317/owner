/*
 * Copyright (c) 2013, Luigi R. Viggiano
 * All rights reserved.
 *
 * This software is distributable under the BSD license.
 * See the terms of the BSD license in the documentation provided with this software.
 */

package org.aeonbits.owner;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * <p>Allows a <tt>Config</tt> object to access the contents of the properties, providing utility methods to
 * perform consequent operations.</p>
 *
 * <p>Example:</p>
 *
 * <pre>
 *     public interface MyConfig extends Config, Accessible {
 *         int someProperty();
 *     }
 *
 *     public void doSomething() {
 *         MyConfig cfg = ConfigFactory.create(MyConfig.class);
 *         cfg.list(System.out);
 *     }
 * </pre>
 * <p>These methods will print the list of properties, see {@link java.util.Properties#list(java.io.PrintStream)}
 * and {@link java.util.Properties#list(java.io.PrintWriter)}.</p>
 *
 * @author Luigi R. Viggiano
 * @since 1.0.4
 */
public interface Accessible {

    /**
     * Prints this property list out to the specified output stream. This method is useful for debugging.
     *
     * @param out an output stream.
     * @throws ClassCastException if any key in this property list is not a string.
     * @see java.util.Properties#list(java.io.PrintStream)
     * @since 1.0.4
     */
    void list(PrintStream out);

    /**
     * Prints this property list out to the specified output stream. This method is useful for debugging.
     *
     * @param out an output stream.
     * @throws ClassCastException if any key in this property list is not a string.
     * @see java.util.Properties#list(java.io.PrintWriter)
     * @since 1.0.4
     */
    void list(PrintWriter out);
}