package defpackage;

/* renamed from: qre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qre implements aora {
    private final aorr a;
    private final qrd b;

    public qre(aorr aorr, qrd qrd) {
        this.a = aorr;
        this.b = qrd;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            qrd qrd = this.b;
            qrd.b();
            qrd.b(3);
        } else {
            qrd qrd2 = this.b;
            qrd2.b();
            qrd2.b(4);
            qrd2.a(16);
        }
        qoh.a().a(this.b.a());
    }

    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            qrd qrd = this.b;
            qrd.b();
            qrd.b(5);
        } else {
            qrd qrd2 = this.b;
            qrd2.b();
            qrd2.b(4);
            qrd2.a(17);
        }
        qoh.a().a(this.b.a());
    }
}
