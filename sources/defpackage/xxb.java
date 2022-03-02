package defpackage;

import android.content.Context;

/* renamed from: xxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xxb {
    public static boolean a(Context context) {
        xip.a();
        if (!Boolean.valueOf(ayrj.a.a().f()).booleanValue()) {
            return xuv.a(context);
        }
        if (aywy.d()) {
            return xuu.a(context).b();
        }
        if (!xuv.a(context, "android.permission.READ_CONTACTS") || !xuv.a(context, "android.permission.WRITE_CONTACTS")) {
            return false;
        }
        return true;
    }
}
