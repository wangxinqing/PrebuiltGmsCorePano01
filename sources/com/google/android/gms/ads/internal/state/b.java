package com.google.android.gms.ads.internal.state;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.c;
import com.google.android.gms.ads.internal.flag.g;
import com.google.android.gms.ads.internal.report.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.e;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class b {
    public b() {
        new e();
        c.c();
        new d();
        new AtomicInteger(0);
        new a();
    }

    public static final void a(Throwable th, String str) {
        synchronized (d.a) {
            if (d.c == null) {
                if (((Boolean) g.c.a()).booleanValue()) {
                    d dVar = new d((Context) null, (VersionInfoParcel) null);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (dVar.d) {
                            dVar.e.put(thread, true);
                        }
                        thread.setUncaughtExceptionHandler(new com.google.android.gms.ads.internal.report.c(dVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new com.google.android.gms.ads.internal.report.b(dVar, Thread.getDefaultUncaughtExceptionHandler()));
                    d.c = dVar;
                } else {
                    d.c = new com.google.android.gms.ads.internal.report.e();
                }
            }
        }
        d.c.a(th, str);
    }
}
