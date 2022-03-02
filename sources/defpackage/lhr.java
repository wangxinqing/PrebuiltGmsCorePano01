package defpackage;

/* renamed from: lhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lhr implements lho {
    public static final lho a = new lhq();
    private int b = 0;

    private final synchronized boolean b() {
        return this.b != 0;
    }

    public final synchronized int a() {
        return this.b;
    }

    public final synchronized void a(int i) {
        this.b = i;
        notifyAll();
    }

    public final void a(String str) {
        if (b()) {
            throw new lhp(str);
        }
    }
}
