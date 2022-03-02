package defpackage;

import android.util.Log;

/* renamed from: yja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yja {
    public static void a(String str, Object... objArr) {
        if (Log.isLoggable("PhoneskyRecoveryLogs", 4)) {
            Log.i("PhoneskyRecoveryLogs", String.format(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        if (Log.isLoggable("PhoneskyRecoveryLogs", 5)) {
            Log.w("PhoneskyRecoveryLogs", String.format(str, objArr));
        }
    }
}
