package defpackage;

/* renamed from: aqad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqad implements Runnable {
    private final aqag a;
    private final Object b;

    public aqad(aqag aqag, Object obj) {
        this.a = aqag;
        this.b = obj;
    }

    public final void run() {
        aqag aqag = this.a;
        aqag.b.a(this.b);
    }
}
