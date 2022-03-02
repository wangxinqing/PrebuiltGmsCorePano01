package defpackage;

/* renamed from: ays  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ays implements ayc {
    public final axo a;
    public final axo b;
    public final axo c;
    public final boolean d;
    public final int e;

    public ays(int i, axo axo, axo axo2, axo axo3, boolean z) {
        this.e = i;
        this.a = axo;
        this.b = axo2;
        this.c = axo3;
        this.d = z;
    }

    public final avu a(avc avc, ayu ayu) {
        return new awk(ayu, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.a + ", end: " + this.b + ", offset: " + this.c + "}";
    }
}
