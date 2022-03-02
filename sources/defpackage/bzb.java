package defpackage;

/* renamed from: bzb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bzb {
    public static final bzb a = new bzb(-1);
    public static final bzb b = new bzb(-2);
    public final long c;

    private bzb(long j) {
        this.c = j;
    }

    public static bzb a(long j) {
        iva.b(j > 0);
        return new bzb(j);
    }

    public final boolean a() {
        return this.c == -1;
    }

    public final String toString() {
        long j = this.c;
        StringBuilder sb = new StringBuilder(26);
        sb.append("Epoch=");
        sb.append(j);
        return sb.toString();
    }
}
