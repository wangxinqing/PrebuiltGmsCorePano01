package defpackage;

import java.util.Arrays;

/* renamed from: alro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alro implements Comparable {
    public final amiw a;
    public final long b;
    public final int c;
    public final String d;
    public final int e;
    public final Long f;

    public alro(amiw amiw, long j, int i, String str, int i2, Long l) {
        boolean z;
        alys.a((Object) amiw, "operation");
        this.a = amiw;
        this.b = j;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        alys.a(z, "revision must be nonnegative");
        this.c = i;
        this.d = str;
        this.e = i2;
        this.f = l;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c - ((alro) obj).c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alro)) {
            return false;
        }
        alro alro = (alro) obj;
        return alyr.a(this.a, alro.a, Long.valueOf(this.b), Long.valueOf(alro.b), Integer.valueOf(this.c), Integer.valueOf(alro.c), this.d, alro.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }
}
