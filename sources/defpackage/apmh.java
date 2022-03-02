package defpackage;

import com.google.firebase.appindexing.internal.MutateRequest;
import java.util.concurrent.Executor;

/* renamed from: apmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apmh {
    public final MutateRequest a;
    public final acwd b = new acwd();
    final /* synthetic */ apmi c;

    public apmh(apmi apmi, MutateRequest mutateRequest) {
        this.c = apmi;
        this.a = mutateRequest;
    }

    public final void a() {
        boolean z;
        synchronized (this.c.b) {
            if (this.c.c == 0) {
                z = true;
            } else {
                z = false;
            }
            iva.a(z);
            this.c.c = 1;
        }
        this.c.a.b((ihb) new apmg(this)).a((Executor) this.c, (acvs) new apme(this));
    }
}
