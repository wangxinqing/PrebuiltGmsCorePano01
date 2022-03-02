package defpackage;

/* renamed from: adkc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adkc {
    public final String a;
    public final long b;
    public final long c;

    public adkc(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append(str);
        sb.append(":");
        sb.append(j);
        sb.append(":");
        sb.append(j2);
        return sb.toString();
    }
}
