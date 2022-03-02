package defpackage;

import java.util.concurrent.Executor;

/* renamed from: kkh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kkh {
    public final kkl a;
    public boolean b = false;
    private final kkb c;

    public kkh(kkb kkb, Executor executor) {
        this.c = kkb;
        this.a = new kkl(kkb, this, executor);
        this.b = true;
    }

    public final void a() {
        iva.a(this.b, (Object) "Cannot set successful an already ended Transaction");
        this.a.d();
        kkb kkb = this.c;
        iva.a(((Long) kkb.d.get()).longValue() == 1);
        kkb.a(this);
        kkb.a().setTransactionSuccessful();
    }

    public final void b() {
        boolean z;
        iva.a(this.b, (Object) "Cannot end an already ended Transaction");
        kkb kkb = this.c;
        if (((Long) kkb.d.get()).longValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        kkb.a(this);
        kkb.f.remove();
        kkb.e();
        this.b = false;
    }
}
