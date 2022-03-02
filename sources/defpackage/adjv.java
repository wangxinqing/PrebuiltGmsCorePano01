package defpackage;

import java.util.Arrays;

/* renamed from: adjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjv {
    public final int a;
    public final long b;

    public adjv(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adjv) {
            adjv adjv = (adjv) obj;
            if (this.a == adjv.a && this.b == adjv.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("status", Integer.valueOf(this.a));
        a2.a("delayMillis", Long.valueOf(this.b));
        return a2.toString();
    }
}
