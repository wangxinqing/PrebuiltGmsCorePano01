package defpackage;

/* renamed from: msf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class msf implements Runnable {
    private final msl a;
    private final boolean b;

    public msf(msl msl, boolean z) {
        this.a = msl;
        this.b = z;
    }

    public final void run() {
        msl msl = this.a;
        boolean z = this.b;
        msl.d.setEnabled(true);
        msl.d.setChecked(z);
    }
}
