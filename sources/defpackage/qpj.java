package defpackage;

import java.util.concurrent.Executor;

/* renamed from: qpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qpj implements aoqb {
    final /* synthetic */ qrg a;
    final /* synthetic */ qsc b;
    final /* synthetic */ qri c;
    final /* synthetic */ qru d;
    final /* synthetic */ Executor e;

    public qpj(qrg qrg, qsc qsc, qri qri, qru qru, Executor executor) {
        this.a = qrg;
        this.b = qsc;
        this.c = qri;
        this.d = qru;
        this.e = executor;
    }

    public final /* bridge */ /* synthetic */ aorr a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            this.a.a(0);
        }
        qsj a2 = ((qrz) this.b).a(0L, (Long) null);
        if (a2 == null) {
            try {
                qri qri = this.c;
                qri.b();
                qri.e(4);
                return aorl.a((Object) new qpk(false, (Long) null));
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            aorr a3 = aopr.a(this.d.a((qsg) a2, this.c), (amqy) new qpi((qsu) a2.d()), this.e);
            a2.close();
            return a3;
        }
        throw th;
    }
}
