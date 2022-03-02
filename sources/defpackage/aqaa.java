package defpackage;

/* renamed from: aqaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aqaa implements Runnable {
    private final aqag a;
    private final int b;

    public aqaa(aqag aqag, int i) {
        this.a = aqag;
        this.b = i;
    }

    public final void run() {
        aqag aqag = this.a;
        aqag.b.a(this.b);
    }
}
