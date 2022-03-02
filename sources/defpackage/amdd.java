package defpackage;

/* renamed from: amdd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amdd {
    public final long a;
    public final String b;

    public amdd(long j, String str) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        this.a = j;
        amrl.a((Object) str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amdd) {
            amdd amdd = (amdd) obj;
            if (this.a != amdd.a || !this.b.equals(amdd.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) + 527) * 31) + this.b.hashCode();
    }

    public final String toString() {
        long j = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("start: ");
        sb.append(j);
        sb.append(", md5Hash");
        sb.append(str);
        return sb.toString();
    }
}
