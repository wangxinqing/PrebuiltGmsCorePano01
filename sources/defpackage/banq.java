package defpackage;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: banq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class banq extends banu {
    private final banm d;
    private final banm e;
    private final banm f;
    private final banm g;
    private final int h;

    public banq(banm banm, banm banm2, banm banm3, banm banm4, Provider provider, int i) {
        super(provider);
        this.d = banm;
        this.e = banm2;
        this.f = banm3;
        this.g = banm4;
        this.h = i;
    }

    public final int a() {
        return this.h;
    }

    public final String a(SSLSocket sSLSocket) {
        byte[] bArr;
        if (!this.f.a((Object) sSLSocket) || (bArr = (byte[]) this.f.a(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, banx.b);
    }

    public final void a(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.d.b(sSLSocket, true);
            this.e.b(sSLSocket, str);
        }
        if (this.g.a((Object) sSLSocket)) {
            this.g.a(sSLSocket, banu.a(list));
        }
    }
}
