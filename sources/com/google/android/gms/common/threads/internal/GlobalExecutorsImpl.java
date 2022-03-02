package com.google.android.gms.common.threads.internal;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GlobalExecutorsImpl {
    private static final ThreadPoolExecutor a = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new jlu("lowpool", 10));
    private static final ThreadPoolExecutor b = new ThreadPoolExecutor(4, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new jlu("highpool", 9));

    private GlobalExecutorsImpl() {
    }

    public static ThreadPoolExecutor getPool(int i) {
        if (i == 9) {
            return b;
        }
        if (i == 10) {
            return a;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unexpected priority ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
