package com.google.android.gms.mdisync.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdiSyncFlagChangeIntentOperation extends IntentOperation {
    private static final anij a = sjk.b();
    private final amsv b;

    public MdiSyncFlagChangeIntentOperation() {
        this(skj.a);
    }

    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        skk skk;
        if (aygr.f()) {
            if (!(intent == null || (action = intent.getAction()) == null)) {
                int hashCode = action.hashCode();
                if (hashCode != -590801919) {
                    if (hashCode == -544318258 && action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                        c = 1;
                        if (c == 0 || (c == 1 && "com.google.android.gms.mdisync".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
                            a.d().a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("handling relevant flag change...");
                            skk = (skk) this.b.a();
                            skk.a.a().get();
                            skk.b.a(2);
                            a.d().a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 54, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("flag handling completed");
                            return;
                        }
                    }
                } else if (action.equals("com.google.android.gms.phenotype.com.google.android.gms.mdisync.COMMITTED")) {
                    c = 0;
                    a.d().a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("handling relevant flag change...");
                    skk = (skk) this.b.a();
                    skk.a.a().get();
                    skk.b.a(2);
                    a.d().a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 54, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("flag handling completed");
                    return;
                }
                c = 65535;
                a.d().a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 52, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("handling relevant flag change...");
                skk = (skk) this.b.a();
                try {
                    skk.a.a().get();
                    skk.b.a(2);
                } catch (ExecutionException e) {
                    skk.b.a(4);
                    anie c2 = sjk.a().c();
                    c2.a((int) aygr.c());
                    c2.a(e.getCause());
                    c2.a("skk", "a", 36, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to schedule periodic tasks.");
                } catch (InterruptedException e2) {
                    skk.b.a(6);
                    sjk.b().c().a("skk", "a", 39, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Scheduling was interrupted.");
                    Thread.currentThread().interrupt();
                }
                a.d().a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 54, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("flag handling completed");
                return;
            }
            a.d().a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 56, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("flag handling is skipping irrelevant intent.");
            return;
        }
        a.d().a("com.google.android.gms.mdisync.service.MdiSyncFlagChangeIntentOperation", "onHandleIntent", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Disabled - skipping flag handling.");
    }

    public MdiSyncFlagChangeIntentOperation(amsv amsv) {
        this.b = amta.a(amsv);
    }
}
