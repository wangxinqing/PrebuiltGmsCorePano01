package defpackage;

import java.util.Arrays;

/* renamed from: lnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lnk {
    public static final lnk a = new lnk();
    public final Integer b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    private final Integer f;

    private lnk() {
        this.f = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public final String a() {
        Integer num = this.f;
        if (num != null) {
            return Integer.toString(num.intValue());
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            lnk lnk = (lnk) obj;
            return ius.a(this.f, lnk.f) && ius.a(this.b, lnk.b) && ius.a(this.c, lnk.c) && ius.a(this.d, lnk.d) && ius.a(this.e, lnk.e);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.b, this.c, this.d, this.e});
    }

    public lnk(int i, int i2, boolean z, boolean z2) {
        this.f = Integer.valueOf(i);
        this.b = Integer.valueOf(i2);
        this.c = Boolean.valueOf(z);
        this.e = Boolean.valueOf(z2);
        this.d = false;
    }
}
