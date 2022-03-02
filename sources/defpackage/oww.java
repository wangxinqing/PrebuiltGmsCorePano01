package defpackage;

/* renamed from: oww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class oww {
    public final owt a;
    public final owy b;
    public final int c;
    public owx d;
    private final aonk e;

    public oww(aonk aonk, owt owt, boolean z, int i, owx owx) {
        this.e = aonk;
        this.a = owt;
        this.b = z ? new owy() : null;
        this.c = i;
        this.d = owx;
    }

    public final ppr a(int i) {
        return new owu(this, this.e, i, this.d.a);
    }

    public final boolean a() {
        return this.b != null;
    }

    public final ppr b() {
        return a(3);
    }
}
