package defpackage;

import java.util.concurrent.Executor;

/* renamed from: abpy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class abpy implements Runnable {
    private final abqd a;
    private final boolean b;
    private final acwa c;

    public abpy(abqd abqd, boolean z, acwa acwa) {
        this.a = abqd;
        this.b = z;
        this.c = acwa;
    }

    public final void run() {
        abqd abqd = this.a;
        boolean z = this.b;
        acwa acwa = this.c;
        if (!z) {
            abqd.i.a();
        } else {
            abqd.j.a();
        }
        if (acwa != null) {
            abqd.d.b("Fetching managed account state", new Object[0]);
            jls jls = new jls(abqd.b);
            acwa.a((Executor) jls, (acvs) new abpz(abqd));
            acwa.a((Executor) jls, (acvv) new abqa(abqd));
        }
    }
}
