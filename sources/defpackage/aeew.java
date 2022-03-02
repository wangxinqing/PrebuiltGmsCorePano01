package defpackage;

import java.util.Arrays;

/* renamed from: aeew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeew extends aegz {
    public final byte[] a;
    public final String b;

    public aeew(byte[] bArr, String str) {
        if (bArr != null) {
            this.a = bArr;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null address");
        }
        throw new NullPointerException("Null key");
    }

    public final byte[] a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aegz)) {
            return false;
        }
        aegz aegz = (aegz) obj;
        return Arrays.equals(this.a, aegz instanceof aeew ? ((aeew) aegz).a : aegz.a()) && this.b.equals(aegz.b());
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 28 + str.length());
        sb.append("SharedSecret{key=");
        sb.append(arrays);
        sb.append(", address=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
