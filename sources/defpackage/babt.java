package defpackage;

/* renamed from: babt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class babt implements Runnable {
    final /* synthetic */ babv a;
    final /* synthetic */ babw b;

    public babt(babw babw, babv babv) {
        this.b = babw;
        this.a = babv;
    }

    public final void run() {
        this.b.b.unregisterReceiver(this.a);
    }
}
