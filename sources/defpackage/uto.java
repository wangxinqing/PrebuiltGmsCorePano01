package defpackage;

import android.net.Network;
import java.net.InetSocketAddress;

/* renamed from: uto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uto extends uuz {
    private final Network a;
    private final InetSocketAddress b;

    public uto(Network network, InetSocketAddress inetSocketAddress) {
        if (network != null) {
            this.a = network;
            this.b = inetSocketAddress;
            return;
        }
        throw new NullPointerException("Null network");
    }

    public final Network a() {
        return this.a;
    }

    public final InetSocketAddress b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r1 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r4) goto L_0x002e
            boolean r1 = r5 instanceof defpackage.uuz
            r2 = 0
            if (r1 == 0) goto L_0x002d
            uuz r5 = (defpackage.uuz) r5
            android.net.Network r1 = r4.a
            android.net.Network r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            java.net.InetSocketAddress r1 = r4.b
            if (r1 == 0) goto L_0x0025
            java.net.InetSocketAddress r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002b
            goto L_0x002c
        L_0x0025:
            java.net.InetSocketAddress r5 = r5.b()
            if (r5 == 0) goto L_0x002c
        L_0x002b:
            goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r2
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uto.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        InetSocketAddress inetSocketAddress = this.b;
        return hashCode ^ (inetSocketAddress != null ? inetSocketAddress.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("NetworkInfo{network=");
        sb.append(valueOf);
        sb.append(", inetSocketAddress=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
