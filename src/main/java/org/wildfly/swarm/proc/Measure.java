/*
 * *
 *  * Copyright 2015-2016 Red Hat, Inc, and individual contributors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.wildfly.swarm.proc;

/**
 * @author Heiko Braun
 * @since 01/05/16
 */
public enum Measure {

    STARTUP_TIME("start"),
    RSS_AFTER_INVOCATION("mem"),
    JAVA_HEAP_AFTER_INVOCATION("javaheap"),
    JAR_SIZE("jarsize"),
    TMP_DIR_SIZE("tmpdir"),
    SHUTDOWN_TIME("stop"),
    ;

    Measure(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }

    public String columnSamples() {
        return shortName + " Samples";
    }

    public String columnMin() {
        return shortName + " Min";
    }

    public String columnMax() {
        return shortName + " Max";
    }

    public String columnMean() {
        return shortName + " Mean";
    }

    public String columnStandardDeviation() {
        return shortName + " Std Dev";
    }

    public String columnMedian() {
        return shortName + " Median";
    }

    public String column75Percentile() {
        return shortName + " .75";
    }

    private final String shortName;
}
