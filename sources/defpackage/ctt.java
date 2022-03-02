package defpackage;

import java.util.Arrays;

/* renamed from: ctt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ctt {
    public final dih a;
    public final aqsr b;
    public final String c;
    public final boolean d;
    public final cvm e;

    public ctt(dih dih, aqsr aqsr, cvm cvm) {
        this(dih, aqsr, dja.b(), cvm);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ctt)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ctt ctt = (ctt) obj;
        return ius.a(this.a, ctt.a) && ius.a(this.b, ctt.b) && ius.a(this.c, ctt.c) && this.d == ctt.d && ius.a(this.e, ctt.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d), this.e});
    }

    public ctt(dih dih, aqsr aqsr, String str, cvm cvm) {
        this(dih, aqsr, str, qud.h(), cvm);
    }

    public ctt(dih dih, aqsr aqsr, String str, boolean z, cvm cvm) {
        this.a = dih;
        this.b = aqsr;
        this.c = str;
        this.d = z;
        this.e = cvm;
    }
}
