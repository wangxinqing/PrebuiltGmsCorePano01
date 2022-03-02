package defpackage;

/* renamed from: sxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class sxs extends spm {
    final /* synthetic */ sye b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sxs(sye sye, swn swn) {
        super(swn);
        this.b = sye;
    }

    public final void a() {
        sye sye = this.b;
        sye.h();
        if (sye.o()) {
            sye.E().k.a("Inactivity, disconnecting from the service");
            sye.t();
        }
    }
}
