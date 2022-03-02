package defpackage;

/* renamed from: amok  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amok {
    private int a = 0;

    public final int a() {
        int i = this.a;
        a(i);
        return i;
    }

    public final void a(int i) {
        this.a = i != 7 ? this.a + 1 : 0;
    }

    public final void b() {
        this.a = 0;
    }
}
