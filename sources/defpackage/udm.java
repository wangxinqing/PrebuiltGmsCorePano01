package defpackage;

/* renamed from: udm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class udm implements acvs {
    final /* synthetic */ iby a;
    final /* synthetic */ igc b;
    final /* synthetic */ udo c;

    public udm(udo udo, iby iby, igc igc) {
        this.c = udo;
        this.a = iby;
        this.b = igc;
    }

    public final void a(Exception exc) {
        synchronized (this.c) {
            this.c.a(this.a, this.b);
        }
    }
}
