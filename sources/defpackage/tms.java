package defpackage;

import java.util.Arrays;

/* renamed from: tms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class tms {
    public final String b;
    public final byte[] c;
    public final String d;
    public final asoe e;
    public int f = 1;

    public tms(String str, byte[] bArr, String str2, asoe asoe) {
        this.b = str;
        this.c = bArr;
        this.d = str2;
        this.e = asoe;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tms) {
            tms tms = (tms) obj;
            return ius.a(this.b, tms.b) && Arrays.equals(this.c, tms.c) && ius.a(this.d, tms.d) && ius.a(this.e, tms.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e});
    }

    public final String toString() {
        return String.format("DiscoveredEndpoint { endpointId=%s, medium=%s }", new Object[]{this.b, this.e.name()});
    }
}
