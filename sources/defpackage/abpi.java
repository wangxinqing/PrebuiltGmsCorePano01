package defpackage;

/* renamed from: abpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abpi {
    public long a;
    public long b;

    public abpi() {
        this(0, 0);
    }

    static long b(int i) {
        return 1 << ((int) ((long) (i - 1)));
    }

    public final void a(int i, boolean z) {
        long b2 = b(i);
        this.a = !z ? this.a & (-1 ^ b2) : this.a | b2;
        this.b |= b2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            abpi abpi = (abpi) obj;
            return this.a == abpi.a && this.b == abpi.b;
        }
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        long j = this.a;
        String binaryString = Long.toBinaryString(j);
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(binaryString).length() + 82);
        sb.append("OptionFlags[flagValues=");
        sb.append(j);
        sb.append(" (");
        sb.append(binaryString);
        sb.append("), setIndicator=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public abpi(long j, long j2) {
        this.a = j;
        if (j2 > 0) {
            this.b = j2;
        } else {
            this.b = j;
        }
    }

    public final boolean a(int i) {
        return (this.a & b(i)) > 0;
    }
}
