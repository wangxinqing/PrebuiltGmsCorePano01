package defpackage;

import android.util.Log;

/* renamed from: advo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advo {
    public static void a(String str, Object... objArr) {
        if (Log.isLoggable("Vision", 6)) {
            Log.e("Vision", String.format(str, objArr));
        }
    }
}
