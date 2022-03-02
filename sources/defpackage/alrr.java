package defpackage;

/* renamed from: alrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alrr {
    public final long a;
    public final amiw b;
    public final long c;

    public alrr(long j, amiw amiw, long j2) {
        this.a = j;
        alys.a((Object) amiw, "command");
        this.b = amiw;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alrr) {
            alrr alrr = (alrr) obj;
            return this.a == alrr.a && this.b.equals(alrr.b);
        }
    }

    public final int hashCode() {
        amiw amiw = this.b;
        int hashCode = amiw != null ? amiw.hashCode() : 0;
        long j = this.a;
        return ((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
