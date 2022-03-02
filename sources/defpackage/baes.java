package defpackage;

/* renamed from: baes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class baes implements Runnable {
    private final azyd a;

    public baes(azyd azyd) {
        this.a = azyd;
    }

    public abstract void a();

    public final void run() {
        azyd b = this.a.b();
        try {
            a();
        } finally {
            this.a.a(b);
        }
    }
}
