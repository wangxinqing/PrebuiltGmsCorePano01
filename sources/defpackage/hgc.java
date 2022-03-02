package defpackage;

/* renamed from: hgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgc {
    public String a;
    private long b;

    public static hgc a(bob bob) {
        hgc hgc = new hgc();
        hgc.b(bob);
        return hgc;
    }

    public final void b(bob bob) {
        this.a = bob.b;
        this.b = bob.c;
    }

    public final void b(boc boc) {
        this.a = boc.b;
        this.b = boc.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hgc) {
            hgc hgc = (hgc) obj;
            if (!this.a.equals(hgc.a) || this.b != hgc.b) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((hashCode + 527) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public static hgc a(boc boc) {
        hgc hgc = new hgc();
        hgc.b(boc);
        return hgc;
    }
}
