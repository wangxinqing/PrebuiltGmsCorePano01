package defpackage;

import java.util.Arrays;

/* renamed from: fhc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fhc {
    private final String a;
    private final String b;

    public fhc(String str, String str2) {
        this.b = str2;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fhc) {
            fhc fhc = (fhc) obj;
            if (!ius.a(this.a, fhc.a) || !ius.a(this.b, fhc.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
