package defpackage;

/* renamed from: arqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arqq {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public arqq(String str, long j, long j2, long j3, long j4) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    public static String a(long j, long j2) {
        if (j == 0 || j2 == 0) {
            return null;
        }
        return String.format("0x%016x:0x%016x", new Object[]{Long.valueOf(j), Long.valueOf(j2)});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof arqq) {
            arqq arqq = (arqq) obj;
            return this.a.equals(arqq.a) && this.b == arqq.b && this.c == arqq.c && this.d == arqq.d && this.e == arqq.e;
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        return (((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        String str = this.a;
        String a2 = a();
        String a3 = a(this.d, this.e);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 41 + String.valueOf(a2).length() + String.valueOf(a3).length());
        sb.append("[label: ");
        sb.append(str);
        sb.append(", levelFeatureId: ");
        sb.append(a2);
        sb.append(", buildingId: ");
        sb.append(a3);
        sb.append("]");
        return sb.toString();
    }

    public final String a() {
        return a(this.b, this.c);
    }
}
