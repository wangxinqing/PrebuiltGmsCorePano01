package defpackage;

import java.util.Arrays;

/* renamed from: tis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tis implements ibj, ibl {
    public final String a;

    public tis(tir tir) {
        this.a = tir.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tis) {
            return ius.a(this.a, ((tis) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
