package defpackage;

/* renamed from: aazw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazw {
    public final String a;
    public final long b;

    protected aazw(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aazw aazw = (aazw) obj;
            if (this.b == aazw.b) {
                String str = this.a;
                return str == null ? aazw.a == null : str.equals(aazw.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
