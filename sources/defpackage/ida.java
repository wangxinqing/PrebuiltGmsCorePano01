package defpackage;

import java.util.Arrays;

/* renamed from: ida  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ida {
    private final boolean a = false;
    private final int b;
    private final ibq c;
    private final ibm d;

    private ida(ibq ibq, ibm ibm) {
        this.c = ibq;
        this.d = ibm;
        this.b = Arrays.hashCode(new Object[]{ibq, ibm});
    }

    public static ida a(ibq ibq, ibm ibm) {
        return new ida(ibq, ibm);
    }

    public final String a() {
        return this.c.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ida) {
            ida ida = (ida) obj;
            boolean z = ida.a;
            return ius.a(this.c, ida.c) && ius.a(this.d, ida.d);
        }
    }

    public final int hashCode() {
        return this.b;
    }
}
