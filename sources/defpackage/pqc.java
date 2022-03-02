package defpackage;

import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* renamed from: pqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqc {
    private final ClientContext a;
    private final pqd b;

    public pqc(ClientContext clientContext, pqd pqd) {
        this.a = clientContext;
        this.b = pqd;
    }

    public final pqw a(pqs pqs) {
        iva.a((Object) pqs);
        pqd pqd = this.b;
        if (TextUtils.isEmpty(pqd.j) || (!pqd.j.startsWith("https") && (!pqd.j.startsWith("http://127.0.0.1:1738") || !((Boolean) ozx.ap.c()).booleanValue()))) {
            oso.a("Invalid base URL for context engine.");
            return null;
        }
        aucd o = pqg.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        pqg pqg = (pqg) o.b;
        pqs.getClass();
        pqg.b = pqs;
        pqg.a |= 2;
        try {
            pqh pqh = (pqh) this.b.a(this.a, "context", ((pqg) o.i()).k(), (Object) pqh.b, ((Long) ozx.u.c()).longValue(), 12802);
            if (pqh != null) {
                try {
                    auay auay = pqh.a;
                    aubs c = aubs.c();
                    pqw pqw = pqw.b;
                    try {
                        aubc h = auay.h();
                        aucj aucj = (aucj) pqw.c(4);
                        aueq a2 = aueh.a.a((Object) aucj);
                        a2.a(aucj, aubd.a(h), c);
                        a2.d(aucj);
                        h.a(0);
                        aucj.b(aucj);
                        return (pqw) aucj;
                    } catch (IOException e) {
                        if (!(e.getCause() instanceof auda)) {
                            throw new auda(e.getMessage());
                        }
                        throw ((auda) e.getCause());
                    } catch (RuntimeException e2) {
                        if (e2.getCause() instanceof auda) {
                            throw ((auda) e2.getCause());
                        }
                        throw e2;
                    } catch (auda e3) {
                        throw e3;
                    } catch (auda e4) {
                        throw e4;
                    }
                } catch (auda e5) {
                    oso.b("Server response bad parse: %s", (Object) e5.getMessage());
                    return null;
                }
            } else {
                oso.b("Received a null IcingResponse");
                return null;
            }
        } catch (eif e6) {
            oso.b("Auth error while executing icing server request: %s", (Object) e6.getMessage());
            return null;
        } catch (VolleyError e7) {
            oso.b("Failed to execute icing server request: %s", (Object) e7.getMessage());
            return null;
        } catch (TimeoutException e8) {
            oso.b("Request to the icing server timed out");
            return null;
        }
    }
}
