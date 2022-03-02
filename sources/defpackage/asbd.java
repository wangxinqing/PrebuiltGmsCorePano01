package defpackage;

import java.io.IOException;

/* renamed from: asbd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbd implements ampj {
    final /* synthetic */ asbe a;

    public asbd(asbe asbe) {
        this.a = asbe;
    }

    public final void a(ampi ampi) {
        jjg jjg = asil.a;
        asbg asbg = this.a.a;
        try {
            asbg.g.put(new asbf(new asbn(asbg.a, ampi)));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public final void a(IOException iOException) {
        anih anih = (anih) asil.a.c();
        anih.a((Throwable) iOException);
        ((anih) anih.a("asbd", "a", 117, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleGattAccept: error accepting connection");
        this.a.a.a(iOException);
    }
}
