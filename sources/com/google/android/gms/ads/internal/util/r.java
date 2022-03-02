package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.flag.g;
import com.google.android.gms.ads.internal.report.d;
import com.google.android.gms.ads.internal.report.e;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.c;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class r {
    /* JADX INFO: finally extract failed */
    public static Object a(amsv amsv) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object a = amsv.a();
            StrictMode.setThreadPolicy(threadPolicy);
            return a;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    @Deprecated
    public static Object a(Context context, Callable callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            c.b("Unexpected exception.", th);
            synchronized (d.a) {
                if (d.b == null) {
                    if (!((Boolean) g.c.a()).booleanValue()) {
                        d.b = new e();
                    } else {
                        d.b = new d(context, VersionInfoParcel.a());
                    }
                }
                d.b.a(th, "StrictModeUtil.runWithLaxStrictMode");
                return null;
            }
        }
    }
}
