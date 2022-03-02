package defpackage;

/* renamed from: artv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class artv {
    public final long a;

    protected artv(long j) {
        this.a = j;
    }

    public static int a(long j, int i, int i2, int i3, int i4) {
        int i5 = ((int) (j >> i)) & i2;
        b(i5, i3, i4);
        return i5;
    }

    protected static void b(int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Check for ");
            sb.append(i);
            sb.append(" failed for range [");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append("].");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    protected static long c(int i, int i2, int i3) {
        b(i, 0, i2);
        return ((long) i) << i3;
    }

    protected static void e(long j) {
        if (j < 0 || j > 68719476735L) {
            StringBuilder sb = new StringBuilder(93);
            sb.append("Check for ");
            sb.append(j);
            sb.append(" failed for range [0, 68719476735].");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof artv) && this.a == ((artv) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }
}
