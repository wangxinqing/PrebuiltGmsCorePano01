package defpackage;

/* renamed from: ahms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahms implements Comparable {
    public final Comparable a;
    public final float b;

    public ahms(Comparable comparable, float f) {
        if (Float.floatToIntBits(f) < 0 || ((double) f) > 1.0d || Float.isNaN(f)) {
            StringBuilder sb = new StringBuilder(45);
            sb.append("confidence ");
            sb.append(f);
            sb.append(" outside range 0..1");
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = comparable;
        this.b = f;
    }

    public final int a() {
        return Math.round(this.b * 100.0f);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ahms ahms = (ahms) obj;
        int compare = Float.compare(this.b, ahms.b);
        return compare == 0 ? this.a.compareTo(ahms.a) : -compare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahms) {
            ahms ahms = (ahms) obj;
            return Float.compare(ahms.b, this.b) == 0 && this.a.equals(ahms.a);
        }
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a2 = a();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
        sb.append("ClassAndConfidence{class=");
        sb.append(valueOf);
        sb.append(", confidence=");
        sb.append(a2);
        sb.append('}');
        return sb.toString();
    }
}
