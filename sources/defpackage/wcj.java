package defpackage;

import android.accounts.Account;

/* renamed from: wcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wcj implements Runnable {
    private final wcp a;
    private final boolean b;

    public wcj(wcp wcp, boolean z) {
        this.a = wcp;
        this.b = z;
    }

    public final void run() {
        wcp wcp = this.a;
        boolean z = this.b;
        if (ayni.a.a().z() && !z && wcp.d.a() - wcp.f().getLong("last_sync", 0) < ayni.a.a().A()) {
            ((anih) ((anih) vvj.a.d()).a("wcp", "b", 235, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Ignoring sync request for contact book because we've recently synced.");
            return;
        }
        Account b2 = wcp.b.b();
        if (b2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wcp", "b", 243, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to sync contact book: account not set.");
            wcp.h = false;
            return;
        }
        wgw a2 = wcp.c.a(b2);
        ((anih) ((anih) vvj.a.d()).a("wcp", "b", 249, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Contact book update: %s.", (Object) a2);
        wgw wgw = wgw.NO_CONTACTS_CHANGED;
        int ordinal = a2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                wcp.h = wcp.d();
            } else if (ordinal == 2 || ordinal == 3) {
                wcp.b();
                wcp.h = wcp.d();
            }
        } else if (!wcp.h) {
            wcp.h = wcp.d();
        }
        if (wcp.h) {
            wcp.f().edit().putLong("last_sync", wcp.d.a()).apply();
        }
    }
}
