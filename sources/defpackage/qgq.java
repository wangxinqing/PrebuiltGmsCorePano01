package defpackage;

import android.content.Context;

/* renamed from: qgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgq {
    private static qgq b;
    public final Context a;
    private final boolean c = true;

    public qgq(Context context) {
        this.a = context;
    }

    public static synchronized qgq a(Context context) {
        qgq qgq;
        synchronized (qgq.class) {
            Context a2 = qfu.a(context);
            if (b == null || b.a != a2) {
                b = new qgq(a2);
            } else {
                boolean z = b.c;
            }
            qgq = b;
        }
        return qgq;
    }
}
