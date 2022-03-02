package defpackage;

/* renamed from: nsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class nsf implements Runnable {
    private final int a;
    private final nsg b;

    public nsf(nsg nsg, int i) {
        this.b = nsg;
        this.a = i;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
