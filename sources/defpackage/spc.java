package defpackage;

import android.content.Context;
import android.os.Looper;

/* renamed from: spc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class spc {
    public final boolean a;

    public spc(Context context) {
        this.a = a(context);
    }

    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean a(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }
}
