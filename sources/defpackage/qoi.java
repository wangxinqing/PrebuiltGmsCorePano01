package defpackage;

import android.util.Log;
import java.util.IllegalFormatException;

/* renamed from: qoi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qoi {
    public static void a(String str) {
        if (Log.isLoggable("GmscoreIpa", 4)) {
            Log.i("GmscoreIpa", str);
        }
    }

    public static void b(String str) {
        if (Log.isLoggable("GmscoreIpa", 5)) {
            Log.w("GmscoreIpa", str);
        }
    }

    public static void c(String str) {
        if (Log.isLoggable("GmscoreIpa", 6)) {
            Log.e("GmscoreIpa", str);
        }
    }

    private static String d(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e) {
            return "";
        }
    }

    public static void a(String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 4)) {
            Log.i("GmscoreIpa", d(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 5)) {
            Log.w("GmscoreIpa", d(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 6)) {
            Log.e("GmscoreIpa", d(str, objArr));
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 5)) {
            Log.w("GmscoreIpa", d(str, objArr), th);
        }
    }

    public static void b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("GmscoreIpa", 6)) {
            Log.e("GmscoreIpa", d(str, objArr), th);
        }
    }
}
