package defpackage;

import android.util.Log;

/* renamed from: akoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akoz implements akoe {
    public final void d(String str, String str2) {
        Log.wtf(str, str2);
    }

    public final void a(String str, String str2) {
        if (Log.isLoggable(str, 4)) {
            Log.i(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public final void c(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    public final void a(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }
}
