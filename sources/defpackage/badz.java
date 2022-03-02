package defpackage;

import java.io.InputStream;

/* renamed from: badz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class badz extends baes {
    final /* synthetic */ baec a;
    final /* synthetic */ bajq b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public badz(baec baec, bajq bajq) {
        super(baec.c.e);
        this.a = baec;
        this.b = bajq;
    }

    public final void a() {
        InputStream a2;
        int i = bapg.a;
        if (!this.a.b) {
            while (true) {
                try {
                    a2 = this.b.a();
                    if (a2 != null) {
                        baec baec = this.a;
                        baec.a.a(baec.c.b.e.a(a2));
                        a2.close();
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    bagt.a(this.b);
                    babj a3 = babj.c.b(th).a("Failed to read message.");
                    this.a.c.f.b(a3);
                    this.a.a(a3, new baaf());
                    return;
                }
            }
        } else {
            bagt.a(this.b);
        }
    }
}
