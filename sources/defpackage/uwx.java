package defpackage;

import java.util.Arrays;

/* renamed from: uwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uwx {
    public final vbz a;

    public uwx(byte[] bArr) {
        boolean z;
        if (bArr.length == 16) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "Bytes must be a namespace plus instance (16 bytes).");
        this.a = new vbz(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uwx) {
            return ius.a(this.a, ((uwx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String a2 = this.a.a();
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 17);
        sb.append("EddystoneUid{id=");
        sb.append(a2);
        sb.append('}');
        return sb.toString();
    }
}
