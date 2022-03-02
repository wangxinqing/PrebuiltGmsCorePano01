package defpackage;

/* renamed from: jhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class jhj implements Runnable {
    private final jhl a;
    private final int b;
    private final boolean c;

    public jhj(jhl jhl, int i, boolean z) {
        this.a = jhl;
        this.b = i;
        this.c = z;
    }

    public final void run() {
        jhk jhk;
        jhl jhl = this.a;
        int i = this.b;
        boolean z = this.c;
        synchronized (jhl.a) {
            jhk = jhl.b;
        }
        if (jhk != null) {
            jhk.a(i, z);
        }
    }
}
