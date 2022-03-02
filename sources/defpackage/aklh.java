package defpackage;

import java.util.List;

/* renamed from: aklh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aklh {
    public final List a;
    public final long b;

    public aklh(List list, long j) {
        this.a = list;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aklh) {
            aklh aklh = (aklh) obj;
            return this.b == aklh.b && akoy.a(this.a, aklh.a);
        }
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.b;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("timeInMillis=");
        sb.append(j);
        sb.append("; detectedActivities ");
        sb.append(valueOf);
        return sb.toString();
    }
}
