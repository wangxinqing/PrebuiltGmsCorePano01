package defpackage;

/* renamed from: lod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lod {
    public final int a;
    private final int b;
    private final int c;

    public lod(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.a = i3;
    }

    public final int a(boolean z) {
        return !z ? this.b : this.c;
    }
}
