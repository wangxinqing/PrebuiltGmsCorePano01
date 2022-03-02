package defpackage;

import com.google.android.gms.common.internal.ClientIdentity;
import java.util.Arrays;

/* renamed from: ajmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmh {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final ClientIdentity e;

    public ajmh(long j, long j2, long j3, long j4, ClientIdentity clientIdentity) {
        iva.a((Object) clientIdentity, (Object) "No source package provided");
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = clientIdentity;
    }

    public final boolean a(ajmh ajmh) {
        return this.b == ajmh.b && this.a == ajmh.a && this.d == ajmh.d;
    }

    public final boolean b(ajmh ajmh) {
        return this.c == ajmh.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajmh) {
            ajmh ajmh = (ajmh) obj;
            return b(ajmh) && a(ajmh) && atiu.a(this.e, ajmh.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), this.e});
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        long j4 = this.d;
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 192);
        sb.append("UlrSampleSpec{mSamplePeriodMs=");
        sb.append(j);
        sb.append(", mSampleMinMillis=");
        sb.append(j2);
        sb.append(", mActivitySampleMillis=");
        sb.append(j3);
        sb.append(", mMaxWaitTimeMillis=");
        sb.append(j4);
        sb.append(", mSourcePackage=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
