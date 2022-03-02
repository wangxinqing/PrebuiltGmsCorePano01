package defpackage;

/* renamed from: aiql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aiql implements Runnable {
    private final aiqn a;
    private final int b;

    public aiql(aiqn aiqn, int i) {
        this.a = aiqn;
        this.b = i;
    }

    public final void run() {
        aiqn aiqn = this.a;
        aiqn.b.a(this.b);
    }
}
