package defpackage;

/* renamed from: aqce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqce implements Runnable {
    private final aqch a;
    private final Object b;

    public aqce(aqch aqch, Object obj) {
        this.a = aqch;
        this.b = obj;
    }

    public final void run() {
        aqch aqch = this.a;
        aqch.a.a(this.b);
    }
}
