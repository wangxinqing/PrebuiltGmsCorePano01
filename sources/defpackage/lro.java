package defpackage;

import java.util.Arrays;
import javax.crypto.SecretKey;

/* renamed from: lro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lro {
    public final SecretKey a;
    public final String b;
    public final byte[] c;

    public lro(SecretKey secretKey, String str, byte[] bArr) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (str != null) {
            z = false;
        } else {
            z = true;
        }
        if (bArr != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        iva.b(z == z2 ? true : z3, "Both parameters and initVector must be set or neither can be");
        iva.a((Object) secretKey);
        this.a = secretKey;
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lro lro = (lro) obj;
            if (this.a.equals(lro.a)) {
                String str = this.b;
                if (str == null ? lro.b == null : str.equals(lro.b)) {
                    return Arrays.equals(this.c, lro.c);
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        byte[] bArr = this.c;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String algorithm = this.a.getAlgorithm();
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 36 + String.valueOf(str).length());
        sb.append("EncryptionSpec[encryptionAlgorithm=");
        sb.append(algorithm);
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
