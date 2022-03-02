package defpackage;

import android.content.Context;

/* renamed from: xuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xuu {
    private static xuu a;
    private final Context b;

    private xuu(Context context) {
        this.b = context.getApplicationContext();
    }

    public static synchronized xuu a(Context context) {
        xuu xuu;
        synchronized (xuu.class) {
            if (a == null) {
                a = new xuu(context);
            }
            xuu = a;
        }
        return xuu;
    }

    public final boolean b() {
        return xuw.a(this.b, "android.permission.READ_CONTACTS") && xuw.a(this.b, "android.permission.WRITE_CONTACTS");
    }

    public final boolean a() {
        return xuw.a(this.b, "android.permission.READ_CONTACTS");
    }
}
