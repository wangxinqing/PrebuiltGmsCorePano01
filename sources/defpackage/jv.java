package defpackage;

/* renamed from: jv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jv implements mn {
    final /* synthetic */ mo a;
    final /* synthetic */ jy b;
    final /* synthetic */ jx c;

    public jv(jy jyVar, jx jxVar, mo moVar) {
        this.b = jyVar;
        this.c = jxVar;
        this.a = moVar;
    }

    public final void a() {
        synchronized (this.b.a) {
            this.b.a.remove(this.c);
            this.b.b.remove(this.c.a);
            this.a.b();
        }
    }
}
