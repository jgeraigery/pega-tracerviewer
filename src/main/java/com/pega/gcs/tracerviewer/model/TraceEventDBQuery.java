/*******************************************************************************
 * Copyright (c) 2017, 2018 Pegasystems Inc. All rights reserved.
 *
 * Contributors:
 *     Manu Varghese
 *******************************************************************************/

package com.pega.gcs.tracerviewer.model;

import org.dom4j.Element;

public class TraceEventDBQuery extends TraceEventDBTrace {

    public TraceEventDBQuery(TraceEventKey traceEventKey, byte[] bytes, Element traceEventElement) {

        super(traceEventKey, bytes, traceEventElement);

        traceEventType = TraceEventType.DB_QUERY;
    }

}
