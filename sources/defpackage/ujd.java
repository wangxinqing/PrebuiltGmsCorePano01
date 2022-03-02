package defpackage;

import java.net.InetAddress;

/* renamed from: ujd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ujd extends uou {
    private final InetAddress a;
    private final int b;

    public ujd(InetAddress inetAddress, int i) {
        if (inetAddress != null) {
            this.a = inetAddress;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null ipAddress");
    }

    public final InetAddress a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uou) {
            uou uou = (uou) obj;
            return this.a.equals(uou.a()) && this.b == uou.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
        sb.append("Credentials{ipAddress=");
        sb.append(valueOf);
        sb.append(", port=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
