package defpackage;

import android.util.Base64;
import java.io.OutputStream;
import java.security.DigestOutputStream;

/* renamed from: ahcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahcu extends DigestOutputStream implements ahbl {
    final ahbc a;
    boolean b = false;
    ahao c;

    public final void a(ahao ahao) {
        this.c = ahao;
    }

    public final void close() {
        super.close();
        if (!this.b) {
            this.b = true;
            ahao ahao = this.c;
            if (ahao != null) {
                ahbb a2 = this.a.a();
                a2.a("sha256", Base64.encodeToString(this.digest.digest(), 2));
                ahao.a(a2.a());
            }
        }
    }

    public ahcu(OutputStream outputStream, ahbc ahbc) {
        super(outputStream, ahcw.d());
        this.a = ahbc;
    }
}
