package defpackage;

/* renamed from: ayj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayj implements ayc {
    public final String a;
    public final axz b;
    public final axs c;
    public final axo d;
    public final boolean e;

    public ayj(String str, axz axz, axs axs, axo axo, boolean z) {
        this.a = str;
        this.b = axz;
        this.c = axs;
        this.d = axo;
        this.e = z;
    }

    public final avu a(avc avc, ayu ayu) {
        return new awg(avc, ayu, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.b + ", size=" + this.c + '}';
    }
}
