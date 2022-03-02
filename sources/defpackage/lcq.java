package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: lcq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lcq {
    public final lcp a;
    public final long b;
    private final String c;

    private lcq(lcp lcp, String str, long j) {
        boolean z = true;
        if (j <= 0 && str != null) {
            z = false;
        }
        iva.b(z);
        iva.a((Object) lcp);
        this.a = lcp;
        this.c = str;
        this.b = j;
    }

    public static lcq a(lcp lcp, String str, long j) {
        return new lcq(lcp, str, j);
    }

    public final boolean b() {
        return this.b > 0;
    }

    public final boolean c() {
        return b() && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            lcq lcq = (lcq) obj;
            return ius.a(this.a, lcq.a) && ius.a(this.c, lcq.c) && this.b == lcq.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, Long.valueOf(this.b)});
    }

    public final String toString() {
        return String.format(Locale.US, "FeedState[feed=%s, nextPageToken=%s, numPagesRetrieved=%d]", new Object[]{this.a, this.c, Long.valueOf(this.b)});
    }

    public static lcq a(lcq lcq, String str) {
        return new lcq(lcq.a, str, lcq.b + 1);
    }

    public final String a() {
        boolean z = false;
        if ((!b() || c()) == (this.c == null)) {
            z = true;
        }
        iva.b(z);
        return this.c;
    }
}
