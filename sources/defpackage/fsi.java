package defpackage;

import java.util.Arrays;

/* renamed from: fsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fsi implements ibj, ibl {
    public final String a;

    public fsi(String str) {
        iva.a((Object) str);
        this.a = str;
    }

    public static fsh a() {
        return new fsh();
    }

    public final boolean equals(Object obj) {
        return obj instanceof fsi;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{fsi.class});
    }
}
