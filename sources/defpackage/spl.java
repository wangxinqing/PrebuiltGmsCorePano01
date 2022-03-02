package defpackage;

/* renamed from: spl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class spl implements Runnable {
    final /* synthetic */ swn a;
    final /* synthetic */ spm b;

    public spl(spm spm, swn swn) {
        this.b = spm;
        this.a = swn;
    }

    public final void run() {
        if (spc.a()) {
            this.a.F().a((Runnable) this);
            return;
        }
        boolean b2 = this.b.b();
        this.b.a = 0;
        if (b2) {
            this.b.a();
        }
    }
}
