package defpackage;

import android.content.Context;
import android.util.Log;

/* renamed from: bla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bla {
    private static bkm a = null;

    public static void a(Context context, int i) {
        bkm bkm = a;
        if (bkm == null) {
            Log.w("ChimeraDebugLogger", "Singleton logger instance not set.");
        } else {
            bkm.a(context, i);
        }
    }

    public static void a(Context context, int i, String str) {
        bkm bkm = a;
        if (bkm == null) {
            Log.w("ChimeraDebugLogger", "Singleton logger instance not set.");
        } else {
            bkm.a(context, i, str);
        }
    }

    public static void a(bkm bkm, boolean z) {
        bkm bkm2 = a;
        if (bkm != bkm2) {
            boolean z2 = true;
            if (!z && bkm2 != null) {
                z2 = false;
            }
            amrl.b(z2);
            a = bkm;
        }
    }
}
