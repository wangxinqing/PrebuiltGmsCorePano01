package defpackage;

import com.google.android.chimera.config.InvalidConfigException;

/* renamed from: abvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abvb implements Runnable {
    private final abvc a;
    private final abpo b;

    public abvb(abvc abvc, abpo abpo) {
        this.a = abvc;
        this.b = abpo;
    }

    public final void run() {
        abvc abvc = this.a;
        abpo abpo = this.b;
        acan acan = abvc.a;
        acan.e.b();
        try {
            acag.a(acan.b, acan.i);
        } catch (InvalidConfigException e) {
            acan.a.a((Throwable) e);
        }
        acan acan2 = abvc.a;
        jix.h(abpo.a);
        aucd aucd = acan2.d.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvj anvj = (anvj) aucd.b;
        anvj anvj2 = anvj.f;
        anvj.e = 2;
        anvj.a |= 8;
    }
}
