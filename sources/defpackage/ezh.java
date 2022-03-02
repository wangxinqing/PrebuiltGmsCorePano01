package defpackage;

import android.util.Base64;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ezh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ezh implements Callable {
    private final ezi a;
    private final gfv b;
    private final String c;

    public ezh(ezi ezi, gfv gfv, String str) {
        this.a = ezi;
        this.b = gfv;
        this.c = str;
    }

    public final Object call() {
        auie auie;
        ezg ezg;
        String str;
        ezi ezi = this.a;
        gfv gfv = this.b;
        String str2 = this.c;
        try {
            byte[] bArr = (byte[]) iva.a((Object) jhg.f(ezi.a, str2));
            aucd o = auid.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            str2.getClass();
            ((auid) o.b).b = str2;
            String encodeToString = Base64.encodeToString(bArr, 2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            encodeToString.getClass();
            ((auid) o.b).a = encodeToString;
            auid auid = (auid) o.i();
            aucd o2 = auif.b.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auid.getClass();
            ((auif) o2.b).a = auid;
            auif auif = (auif) o2.i();
            String str3 = null;
            try {
                if (gfv.b == null) {
                    gfv.b = baaj.a(baai.UNARY, "google.identity.clientauthconfig.v1.ClientAuthConfig/GetClientBrand", baoq.a(auif.b), baoq.a(auie.c));
                }
                auie = (auie) gfv.a.a(gfv.b, auif, 10000, TimeUnit.MILLISECONDS);
            } catch (babk e) {
                auie = null;
            }
            if (auie == null) {
                ezg = new ezg();
            } else {
                if (!auie.a.isEmpty()) {
                    str = ezi.a((String) auie.a.get(0));
                } else {
                    str = null;
                }
                if (!auie.b.isEmpty()) {
                    str3 = ezi.a((String) auie.b.get(0));
                }
                ezg = new ezg(str, str3);
            }
            return ezg;
        } finally {
            gfv.a();
        }
    }
}
