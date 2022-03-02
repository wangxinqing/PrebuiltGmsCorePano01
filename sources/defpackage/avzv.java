package defpackage;

/* renamed from: avzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avzv {
    public final avzw a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ avzy d;

    public avzv(avzy avzy, avzw avzw) {
        this.d = avzy;
        this.a = avzw;
        this.b = !avzw.e ? new boolean[avzy.d] : null;
    }

    public final void a() {
        synchronized (this.d) {
            this.d.a(this, false);
        }
    }
}
