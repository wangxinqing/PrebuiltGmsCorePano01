package defpackage;

/* renamed from: msg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msg implements Runnable {
    private final msl a;

    public msg(msl msl) {
        this.a = msl;
    }

    public final void run() {
        this.a.d.setEnabled(true);
    }
}
