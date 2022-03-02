package defpackage;

/* renamed from: asjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asjf extends arwm {
    final /* synthetic */ asjh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asjf(asjh asjh, String str) {
        super(str);
        this.a = asjh;
    }

    public final void run() {
        if (this.a.d.i()) {
            try {
                asjh asjh = this.a;
                int i = asjh.g;
                asjh.a.a((asiz) new asje(this));
            } catch (Exception e) {
                anih anih = (anih) asil.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("asjf", "run", 47, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("%s ERROR stopping operation!", (Object) this.m);
                asjh asjh2 = this.a;
                int i2 = asjh.g;
                asjh2.f = true;
            }
            asjh asjh3 = this.a;
            if (asjh3.f) {
                asjh3.d.e();
            }
        }
    }
}
