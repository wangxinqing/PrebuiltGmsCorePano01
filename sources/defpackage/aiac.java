package defpackage;

import java.util.Locale;

/* renamed from: aiac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiac {
    public final long a;
    public final long b;

    public aiac(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aiac)) {
            return false;
        }
        aiac aiac = (aiac) obj;
        if (this == aiac) {
            return true;
        }
        return this.a == aiac.a && this.b == aiac.b;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((int) (j ^ (j >>> 32))) + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return String.format(Locale.US, "AlarmWindow[begin=%d, length=%d, end=%d]", new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.a + this.b)});
    }
}
