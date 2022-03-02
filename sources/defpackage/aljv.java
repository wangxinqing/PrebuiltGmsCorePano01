package defpackage;

import android.content.Context;

/* renamed from: aljv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aljv {
    private static aljv b;
    public final Context a;

    protected aljv(Context context) {
        this.a = context;
    }

    public static synchronized aljv a(Context context) {
        aljv aljv;
        synchronized (aljv.class) {
            if (b == null) {
                b = new aljv(context.getApplicationContext());
            }
            aljv = b;
        }
        return aljv;
    }
}
