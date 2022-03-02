package defpackage;

import java.util.Arrays;

/* renamed from: cmg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cmg {
    public final clo a;
    public final byte[] b;

    public cmg(clo clo, byte[] bArr) {
        if (bArr != null) {
            this.a = clo;
            this.b = bArr;
            return;
        }
        throw new NullPointerException("bytes is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cmg) {
            cmg cmg = (cmg) obj;
            if (this.a.equals(cmg.a)) {
                return Arrays.equals(this.b, cmg.b);
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("EncodedPayload{encoding=");
        sb.append(valueOf);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
