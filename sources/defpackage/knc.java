package defpackage;

import java.util.Locale;

/* renamed from: knc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class knc {
    public final long a;

    private knc(long j) {
        boolean z;
        this.a = j;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
    }

    public static knc a(long j) {
        return new knc(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && obj.getClass() == getClass() && this.a == ((knc) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) + 31;
    }

    public final String toString() {
        return String.format(Locale.US, "EntrySpec[%s]", new Object[]{Long.valueOf(this.a)});
    }
}
