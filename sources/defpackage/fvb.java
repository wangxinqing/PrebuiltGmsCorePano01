package defpackage;

import android.util.Pair;
import com.google.android.gms.auth.api.proxy.AuthChimeraService;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: fvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvb extends fuy implements jbh {
    public final AuthChimeraService a;
    private final jbf b;
    private final ClientContext c;
    private final Object d = new Object();
    private volatile oi e;

    public fvb(AuthChimeraService authChimeraService, jbf jbf, ClientContext clientContext) {
        iva.a((Object) clientContext);
        this.c = clientContext;
        iva.a((Object) jbf);
        this.b = jbf;
        this.a = authChimeraService;
    }

    public final void a(fuw fuw) {
        this.b.a(this.a, new fvi(this.c, fuw));
    }

    public final void a(fuw fuw, ProxyGrpcRequest proxyGrpcRequest) {
        if (this.e == null) {
            synchronized (this.d) {
                if (this.e == null) {
                    this.e = new fva(this);
                }
            }
        }
        this.b.a(this.a, new fvk(this.c, fuw, proxyGrpcRequest, (izd) this.e.a((Object) new Pair(proxyGrpcRequest.b, Integer.valueOf(proxyGrpcRequest.c)))));
    }

    public final void a(fuw fuw, ProxyRequest proxyRequest) {
        this.b.a(this.a, new fvl(this.c, fuw, proxyRequest));
    }
}
