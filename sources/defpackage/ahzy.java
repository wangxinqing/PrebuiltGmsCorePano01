package defpackage;

/* renamed from: ahzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahzy {
    public final int a;
    public final long b;

    public ahzy(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahzy) {
            ahzy ahzy = (ahzy) obj;
            return this.a == ahzy.a && this.b == ahzy.b;
        }
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        StringBuilder sb = new StringBuilder(62);
        sb.append("activity = ");
        sb.append(i);
        sb.append(", epochTimeMillis = ");
        sb.append(j);
        return sb.toString();
    }
}
