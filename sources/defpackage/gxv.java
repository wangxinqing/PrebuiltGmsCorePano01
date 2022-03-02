package defpackage;

import android.content.Context;

/* renamed from: gxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gxv {
    public static ivk a(Context context, String str) {
        return new ivk(context, str.length() == 0 ? new String("com.google.android.gms.checkin.internal.") : "com.google.android.gms.checkin.internal.".concat(str), false);
    }
}
