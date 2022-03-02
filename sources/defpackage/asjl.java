package defpackage;

import java.io.IOException;

/* renamed from: asjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class asjl implements asiu {
    private final ascb a;

    public asjl(ascb ascb) {
        this.a = ascb;
    }

    public final void a() {
        ascb ascb = this.a;
        ashv ashv = ascb.h;
        if (ashv != null && (ashv instanceof asix)) {
            asix asix = (asix) ashv;
            if (asix.k()) {
                asix.j();
                try {
                    asix.h();
                } catch (IOException e) {
                    anih anih = (anih) asil.a.c();
                    anih.a((Throwable) e);
                    ((anih) anih.a("ascb", "a", 233, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Fail to send confirm message");
                }
                ascb.a.countDown();
                return;
            }
            return;
        }
        ((anih) ((anih) asil.a.c()).a("ascb", "a", 238, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("No connection ready to confirm");
    }
}
