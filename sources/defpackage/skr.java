package defpackage;

import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;
import java.util.concurrent.Executor;

/* renamed from: skr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class skr extends sjc implements niz {
    private static final anij a = sjk.b();
    private final nix b;
    private final sla c;
    private final String d;

    public skr(nix nix, sla sla, String str) {
        this.b = nix;
        this.c = sla;
        this.d = str;
    }

    public final void a(sjb sjb, SyncRequest syncRequest, CallerInfo callerInfo) {
        SyncRequest syncRequest2 = syncRequest;
        CallerInfo callerInfo2 = callerInfo;
        a.d().a("skr", "a", 40, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received request for operation '%d' from package '%s', instance id '%s', version '%d'...", Integer.valueOf(syncRequest2.a.e), this.d, callerInfo2.a, Long.valueOf(callerInfo2.b));
        nix nix = this.b;
        sla sla = this.c;
        sli sli = (sli) sla.a.a();
        sla.a(sli, 1);
        raw raw = (raw) sla.b.a();
        sla.a(raw, 2);
        bapu bapu = sla.c;
        Executor b2 = sib.b();
        sla.a(b2, 3);
        sjn sjn = (sjn) sla.d.a();
        sla.a(sjn, 4);
        sjl sjl = (sjl) sla.e.a();
        sla.a(sjl, 5);
        String str = (String) ((awdu) sla.f).a;
        sla.a(str, 6);
        sjb sjb2 = sjb;
        sla.a(sjb2, 7);
        sla.a(syncRequest2, 8);
        sla.a(callerInfo2, 9);
        skz skz = r1;
        skz skz2 = new skz(sli, raw, b2, sjn, sjl, str, sjb2, syncRequest, callerInfo2);
        nix.a(skz);
        a.d().a("skr", "a", 49, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' dispatched!", syncRequest2.a.e);
    }

    public final void a(sjb sjb, TeleportingSyncRequest teleportingSyncRequest, CallerInfo callerInfo) {
        a(sjb, teleportingSyncRequest.a, callerInfo);
    }
}
