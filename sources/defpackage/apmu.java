package defpackage;

import android.util.Log;

/* renamed from: apmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apmu {
    public static void a(String str) {
        if (a(3)) {
            Log.d("FirebaseAppIndex", str);
        }
    }

    public static void b(String str) {
        if (a(6)) {
            Log.e("FirebaseAppIndex", str);
        }
    }

    public static boolean a(int i) {
        if (!Log.isLoggable("FirebaseAppIndex", i)) {
            return Log.isLoggable("FirebaseAppIndex", i);
        }
        return true;
    }
}
