/*******************************************************************************
 * Copyright (c) 2019, 2021 Pegasystems Inc. All rights reserved.
 *
 * Contributors:
 *     Manu Varghese
 *******************************************************************************/

package com.pega.gcs.tracerviewer.model;

import org.dom4j.Element;

public class TraceEventRuleCoverage extends TraceEventNonActivity {

    public TraceEventRuleCoverage(TraceEventKey traceEventKey, byte[] bytes, Element traceEventElement) {

        super(traceEventKey, bytes, traceEventElement);

        traceEventType = TraceEventType.RULE_COVERAGE;
    }
}
