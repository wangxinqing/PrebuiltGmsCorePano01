package defpackage;

import android.app.Application;

/* renamed from: agcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agcz {
    public static volatile agcz a;
    final agdb b = new agdb();

    private agcz() {
    }

    public static agcz a(Application application) {
        if (a == null) {
            synchronized (agcz.class) {
                if (a == null) {
                    agcz agcz = new agcz();
                    agdb agdb = agcz.b;
                    application.registerActivityLifecycleCallbacks(agdb.b);
                    application.registerComponentCallbacks(agdb.b);
                    a = agcz;
                }
            }
        }
        return a;
    }

    public final void b(agcy agcy) {
        agdb agdb = this.b;
        amrl.a((Object) agcy);
        agdb.b.a.remove(agcy);
    }

    public final void a(agcy agcy) {
        agdb agdb = this.b;
        amrl.a((Object) agcy);
        agdb.b.a.add(agcy);
    }
}
