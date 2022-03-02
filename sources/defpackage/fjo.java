package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fjo implements aoqb {
    private final fjw a;
    private final pyv b;
    private final hhy c;

    public fjo(fjw fjw, pyv pyv, hhy hhy) {
        this.a = fjw;
        this.b = pyv;
        this.c = hhy;
    }

    public final aorr a(Object obj) {
        fjw fjw = this.a;
        pyv pyv = this.b;
        hhy hhy = this.c;
        if (!((Boolean) obj).booleanValue()) {
            return aorl.a((Object) null);
        }
        return aorl.c(fjw.a(pyv, fko.a("credentials_enable_sync", true)), qbc.a(hhy.a(fjw.b))).a(aoqf.a(), (Executor) aoqm.a);
    }
}
