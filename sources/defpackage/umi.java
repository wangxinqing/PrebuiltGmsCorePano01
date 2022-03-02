package defpackage;

/* renamed from: umi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class umi implements Runnable {
    private final umj a;
    private final usx b;

    public umi(umj umj, usx usx) {
        this.a = umj;
        this.b = usx;
    }

    public final void run() {
        umj umj = this.a;
        umj.b.a(this.b);
    }
}
