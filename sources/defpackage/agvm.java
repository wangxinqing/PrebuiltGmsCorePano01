package defpackage;

import android.content.Context;

/* renamed from: agvm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agvm {
    public static agvm a = null;
    public static volatile boolean b = false;
    public static volatile boolean c = false;
    private static final Object e = new Object();
    private static final amsv f = amta.a(agvl.a);
    public final Context d;
    private final amsv g;

    public agvm(Context context) {
        amsv amsv = f;
        Context applicationContext = context.getApplicationContext();
        amrl.a((Object) applicationContext);
        amrl.a((Object) amsv);
        this.d = applicationContext;
        this.g = amta.a(amsv);
    }

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            synchronized (e) {
                if (a != null) {
                    throw new IllegalStateException("Cannot call PhenotypeContext#setContext twice");
                } else if (!b) {
                    a = new agvm(applicationContext);
                } else {
                    throw new IllegalStateException("Cannot set setContext after a flag was already read");
                }
            }
            return;
        }
        throw null;
    }

    public final aorv a() {
        return (aorv) this.g.a();
    }
}
