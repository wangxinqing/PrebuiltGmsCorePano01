package defpackage;

import android.content.Context;

/* renamed from: adee  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adee {
    private static final Object a = new Object();
    private static volatile aded b;

    public static aded a(Context context) {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    Context applicationContext = context.getApplicationContext();
                    b = new aded(applicationContext, addx.b(applicationContext));
                }
            }
        }
        return b;
    }
}
