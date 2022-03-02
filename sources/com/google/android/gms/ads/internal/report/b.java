package com.google.android.gms.ads.internal.report;

import java.lang.Thread;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler a;
    final /* synthetic */ d b;

    public b(d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = dVar;
        this.a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            this.b.a(th);
            uncaughtExceptionHandler = this.a;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
