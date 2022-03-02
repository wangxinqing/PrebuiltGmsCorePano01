package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: lej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lej {
    public final int a;
    public final Exception b;
    public final String c;
    public final lno d;

    public lej(int i, lno lno, Exception exc, String str) {
        boolean z;
        boolean z2 = true;
        if (exc != null) {
            if (lno != null) {
                z = false;
            } else {
                z = str == null;
            }
            iva.b(z);
        }
        if (lno != null) {
            if (exc != null) {
                z2 = false;
            } else if (str != null) {
                z2 = false;
            }
            iva.b(z2);
        }
        this.a = i;
        this.d = lno;
        this.b = exc;
        this.c = str;
    }

    public final boolean a() {
        return this.d == null && this.b == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            lej lej = (lej) obj;
            return this.a == lej.a && ius.a(this.d, lej.d) && ius.a(this.b, lej.b) && ius.a(this.c, lej.c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.d, this.b, this.c});
    }

    public final String toString() {
        return String.format(Locale.US, "ResultsQueueItem[id=%d, resultsPage=%s, e=%s, nextPageToken=%s", new Object[]{Integer.valueOf(this.a), this.d, this.b, this.c});
    }
}
