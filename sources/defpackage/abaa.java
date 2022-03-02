package defpackage;

import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: abaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abaa {
    public static void a(String str, Object... objArr) {
        Log.e("ApkUploadChimeraService", c(str, objArr));
    }

    public static void b(String str, Object... objArr) {
        Log.i("ApkUploadChimeraService", c(str, objArr));
    }

    public static String c(String str, Object... objArr) {
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException e) {
            Log.e("ApkUploadChimeraService", "IllegalFormatException occured while formatting message", e);
            return "";
        }
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e("ApkUploadChimeraService", c(str, objArr), th);
    }
}
