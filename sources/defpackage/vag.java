package defpackage;

import java.util.Arrays;

/* renamed from: vag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vag {
    private final auzf a;
    private final String b;

    public vag(auzf auzf) {
        iva.a((Object) auzf);
        this.a = auzf;
        this.b = null;
    }

    public final byte[] a() {
        String str = this.b;
        return str == null ? this.a.k() : str.getBytes();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vag) {
            vag vag = (vag) obj;
            return ius.a(this.a, vag.a) && ius.a(this.b, vag.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String str = this.b;
        return str == null ? uzu.a(this.a) : str;
    }

    public vag(String str) {
        this.a = null;
        iva.a((Object) str);
        this.b = str;
    }
}
