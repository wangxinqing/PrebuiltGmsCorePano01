package defpackage;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;

/* renamed from: kho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class kho implements Runnable {
    private final khp a;
    private final ClientContext b;
    private final AppIdentity c;
    private final anax d;
    private final kkz e;
    private final khq f;

    public kho(khp khp, ClientContext clientContext, AppIdentity appIdentity, anax anax, kkz kkz, khq khq) {
        this.a = khp;
        this.b = clientContext;
        this.c = appIdentity;
        this.d = anax;
        this.e = kkz;
        this.f = khq;
    }

    public final void run() {
        khp khp = this.a;
        ClientContext clientContext = this.b;
        AppIdentity appIdentity = this.c;
        anax anax = this.d;
        kkz kkz = this.e;
        khq khq = this.f;
        try {
            khp.a.b("Refreshing app auth in background.");
            khp.a(clientContext, appIdentity, anax, kkz, khq, true);
        } finally {
            khp.b = null;
        }
    }
}
