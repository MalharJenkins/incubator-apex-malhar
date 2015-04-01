/*
 *  Copyright (c) 2012-2015 Malhar, Inc.
 *  All Rights Reserved.
 */

package com.datatorrent.lib.appdata.qr.processor;

import com.datatorrent.api.Operator;

/**
 *
 * @author Timothy Farkas: tim@datatorrent.com
 */
public interface QueryQueueManager<QUERY_TYPE, META_QUERY, QUEUE_CONTEXT> extends Operator
{
  public boolean enqueue(QUERY_TYPE query, META_QUERY metaQuery, QUEUE_CONTEXT queueContext);
  public QueryBundle<QUERY_TYPE, META_QUERY, QUEUE_CONTEXT> dequeue();
}