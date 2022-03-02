package defpackage;

import java.util.Arrays;

/* renamed from: cme  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cme extends cmm {
    public final String a;
    public final byte[] b;
    public final clp c;

    public cme(String str, byte[] bArr, clp clp) {
        this.a = str;
        this.b = bArr;
        this.c = clp;
    }

    public final String a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final clp c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmm) {
            cmm cmm = (cmm) obj;
            if (this.a.equals(cmm.a())) {
                return Arrays.equals(this.b, cmm instanceof cme ? ((cme) cmm).b : cmm.b()) && this.c.equals(cmm.c());
            }
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
