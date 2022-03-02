package defpackage;

import java.util.Arrays;

/* renamed from: cmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cmq extends cmv {
    public final Iterable a;
    public final byte[] b;

    public cmq(Iterable iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    public final Iterable a() {
        return this.a;
    }

    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmv) {
            cmv cmv = (cmv) obj;
            if (this.a.equals(cmv.a())) {
                if (Arrays.equals(this.b, cmv instanceof cmq ? ((cmq) cmv).b : cmv.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(arrays).length());
        sb.append("BackendRequest{events=");
        sb.append(valueOf);
        sb.append(", extras=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
