package defpackage;

import java.util.Arrays;

/* renamed from: tlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tlc extends tlg {
    private final String a;
    private final String b;
    private final byte[] c;
    private final asoe d;

    public tlc(String str, String str2, byte[] bArr, asoe asoe) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = asoe;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final byte[] c() {
        return this.c;
    }

    public final asoe d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tlg) {
            tlg tlg = (tlg) obj;
            if (this.a.equals(tlg.a()) && this.b.equals(tlg.b())) {
                return Arrays.equals(this.c, tlg instanceof tlc ? ((tlc) tlg).c : tlg.c()) && this.d.equals(tlg.d());
            }
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String arrays = Arrays.toString(this.c);
        String valueOf = String.valueOf(this.d);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 65 + length2 + String.valueOf(arrays).length() + String.valueOf(valueOf).length());
        sb.append("EndpointMetadata{endpointId=");
        sb.append(str);
        sb.append(", serviceId=");
        sb.append(str2);
        sb.append(", endpointInfo=");
        sb.append(arrays);
        sb.append(", medium=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
