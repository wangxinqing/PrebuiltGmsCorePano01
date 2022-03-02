package defpackage;

import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

/* renamed from: fvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fvo extends fuv {
    final /* synthetic */ acwd a;

    public fvo(acwd acwd) {
        this.a = acwd;
    }

    public final void a(ProxyResponse proxyResponse) {
        ihd.a(new Status(proxyResponse.b), proxyResponse, this.a);
    }
}
