package com.google.android.gms.mdisync.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdiSyncGcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private static final anij b = sjk.b();
    private final amsv c;

    public MdiSyncGcmChimeraBroadcastReceiver() {
        this(sko.a);
    }

    public final void onReceive(Context context, Intent intent) {
        if (!aygr.f() || !aygr.a.a().j()) {
            b.d().a("com.google.android.gms.mdisync.service.MdiSyncGcmChimeraBroadcastReceiver", "onReceive", 32, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Disabled - skipping GCM push notification handling.");
            return;
        }
        b.d().a("com.google.android.gms.mdisync.service.MdiSyncGcmChimeraBroadcastReceiver", "onReceive", 36, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received GCM push notification!");
        skn skn = (skn) this.c.a();
        if (intent != null) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            amzt j = amzy.j();
            for (ska a : skn.b) {
                j.c(a.a(intent));
            }
            amzy a2 = j.a();
            aorl.a(aorl.b((Iterable) a2).a((Callable) new skl(a2), (Executor) aoqm.a), new skm(goAsync), aoqm.a);
            return;
        }
        skn.a.d().a("skn", "a", 34, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Skipping push message handling due to null intent...");
    }

    public MdiSyncGcmChimeraBroadcastReceiver(amsv amsv) {
        this.c = amsv;
    }
}
