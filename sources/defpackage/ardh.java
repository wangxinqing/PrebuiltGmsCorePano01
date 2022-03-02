package defpackage;

/* renamed from: ardh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ardh {
    public final long a;
    public final int b;
    public final float c;

    public ardh(long j, int i) {
        this(j, i, -1.0f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ardh) {
            ardh ardh = (ardh) obj;
            if (this.a == ardh.a && this.b == ardh.b && Float.compare(this.c, ardh.c) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) + 527) * 31) + this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        String str = (String) ardv.a.get(Integer.valueOf(this.b));
        long j = this.a;
        float f = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
        sb.append(str);
        sb.append(" time: ");
        sb.append(j);
        sb.append(" confidence: ");
        sb.append(f);
        return sb.toString();
    }

    public ardh(long j, int i, float f) {
        this.a = j;
        this.b = i;
        this.c = f;
    }
}
