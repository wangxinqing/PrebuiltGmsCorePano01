package defpackage;

import java.util.Arrays;

/* renamed from: rkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkp implements ric {
    public final String a;
    public final int b;
    public final int c;
    public final CharSequence d;
    public final int e;

    public rkp(String str, int i, int i2, CharSequence charSequence, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = charSequence;
        this.e = i3;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rkp) {
            rkp rkp = (rkp) obj;
            return rkp.b == this.b && rkp.c == this.c && ius.a(rkp.a, this.a) && ius.a(rkp.d, this.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.a, this.d});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final icf a(icc icc, int i, int i2) {
        boolean z;
        ibq ibq = rij.a;
        iva.a((Object) this, (Object) "photo == null");
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "width <= 0");
        if (i2 <= 0) {
            z2 = false;
        }
        iva.b(z2, "height <= 0");
        String str = this.a;
        int i3 = this.e;
        iva.a((Object) str, (Object) "fifeUrl == null");
        return icc.a((idf) new rho(rij.a, icc, str, i, i2, i3));
    }
}
