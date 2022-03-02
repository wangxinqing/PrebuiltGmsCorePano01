package defpackage;

/* renamed from: igc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class igc {
    private final Object a;
    private final String b;

    public igc(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof igc) {
            igc igc = (igc) obj;
            return this.a == igc.a && this.b.equals(igc.b);
        }
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
