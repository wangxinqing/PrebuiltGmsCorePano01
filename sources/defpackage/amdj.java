package defpackage;

/* renamed from: amdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amdj {
    public final amde a;
    public final int b;
    public final int c;
    public final Integer d;
    public final amdd e;

    public amdj(amde amde, int i, int i2, Integer num, amdd amdd) {
        this.a = new amde(amde);
        this.b = i;
        this.c = i2;
        this.d = num;
        this.e = amdd;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (!(obj instanceof amdj)) {
            return false;
        }
        amdj amdj = (amdj) obj;
        if (this.a.equals(amdj.a) && this.b == amdj.b && this.c == amdj.c && ((num = this.d) == null ? amdj.d == null : num.equals(amdj.d))) {
            amdd amdd = this.e;
            amdd amdd2 = amdj.e;
            if (amdd != null) {
                if (amdd.equals(amdd2)) {
                    return true;
                }
            } else if (amdd2 != null) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31;
        Integer num = this.d;
        int i = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        amdd amdd = this.e;
        if (amdd != null) {
            i = amdd.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 106 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("chunkInfoMap: ");
        sb.append(valueOf);
        sb.append(", chunkSize: ");
        sb.append(i);
        sb.append(", remainderLength: ");
        sb.append(i2);
        sb.append(", remainderWeakHash: ");
        sb.append(valueOf2);
        sb.append(", remainderInfo: ");
        sb.append(valueOf3);
        return sb.toString();
    }
}
