package defpackage;

import android.content.Context;

/* renamed from: gwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gwe {
    public static boolean a = true;

    public static Context a(Context context) {
        return a ? context.createPackageContext("com.google.android.gsf", 0) : context;
    }
}
