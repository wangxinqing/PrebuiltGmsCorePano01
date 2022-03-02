package defpackage;

/* renamed from: tyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tyz extends arwm {
    final /* synthetic */ int a;
    final /* synthetic */ tzf b;
    final /* synthetic */ tza c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tyz(tza tza, String str, int i, tzf tzf) {
        super(str);
        this.c = tza;
        this.a = i;
        this.b = tzf;
    }

    public final void run() {
        this.c.g.a(this.a);
        this.c.h.a(this.a);
        tsu tsu = this.c.j;
        asom asom = asom.FAST_PAIR_NOTIFICATION_TIMEOUT;
        tzf tzf = this.b;
        tsu.a(asom, tzf.b, tzf.i, 0);
    }
}
