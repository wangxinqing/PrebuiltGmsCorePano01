package defpackage;

import java.util.Arrays;

/* renamed from: udn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class udn {
    private final Class a;
    private final ibm b;

    public udn(iby iby, ibm ibm) {
        this.a = iby.getClass();
        this.b = ibm;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof udn) {
            udn udn = (udn) obj;
            return ius.a(this.a, udn.a) && ius.a(this.b, udn.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
