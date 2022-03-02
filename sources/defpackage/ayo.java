package defpackage;

/* renamed from: ayo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayo implements ayc {
    public final axu a;
    public final boolean b;
    private final String c;
    private final int d;

    public ayo(String str, int i, axu axu, boolean z) {
        this.c = str;
        this.d = i;
        this.a = axu;
        this.b = z;
    }

    public final avu a(avc avc, ayu ayu) {
        return new awi(avc, ayu, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.c + ", index=" + this.d + '}';
    }
}
