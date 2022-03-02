package defpackage;

import android.content.Context;

/* renamed from: acpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpd {
    private static volatile qub a;

    public static qub a(Context context) {
        qub a2;
        synchronized (acpd.class) {
            a2 = qub.a(context);
        }
        return a2;
    }
}
