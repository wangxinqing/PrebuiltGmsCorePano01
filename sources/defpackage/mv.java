package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* renamed from: mv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mv {
    static {
        int i = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    public static void a() {
        int i = Build.VERSION.SDK_INT;
        Trace.endSection();
    }

    public static void a(String str) {
        int i = Build.VERSION.SDK_INT;
        Trace.beginSection(str);
    }
}
