package defpackage;

/* renamed from: hvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hvl {
    public final avtn a;
    public final long b;

    public hvl(avtn avtn, long j) {
        this.a = avtn;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hvl) {
            hvl hvl = (hvl) obj;
            if (this.b != hvl.b || !this.a.equals(hvl.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        long j = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("Key: ");
        sb.append(j);
        sb.append(" \n with PLC:\n");
        sb.append(valueOf);
        return sb.toString();
    }
}
