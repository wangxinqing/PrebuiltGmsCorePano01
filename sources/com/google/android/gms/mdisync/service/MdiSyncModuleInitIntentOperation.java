package com.google.android.gms.mdisync.service;

import android.content.Intent;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MdiSyncModuleInitIntentOperation extends hec {
    private static final anij a = sjk.b();
    private final amsv b;

    public MdiSyncModuleInitIntentOperation() {
        this(skp.a);
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        if (!aygr.f()) {
            a.d().a("com.google.android.gms.mdisync.service.MdiSyncModuleInitIntentOperation", "a", 38, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Disabled - skipping module initialization.");
            return;
        }
        a.d().a("com.google.android.gms.mdisync.service.MdiSyncModuleInitIntentOperation", "a", 42, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("initializing module...");
        skq skq = (skq) this.b.a();
        try {
            skq.a.a().get();
            skq.b.b(2);
        } catch (ExecutionException e) {
            skq.b.b(4);
            anie c = sjk.a().c();
            c.a((int) aygr.c());
            c.a(e.getCause());
            c.a("skq", "a", 37, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to schedule periodic tasks.");
        } catch (InterruptedException e2) {
            skq.b.b(6);
            sjk.b().c().a("skq", "a", 40, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Scheduling was interrupted.");
            Thread.currentThread().interrupt();
        }
        a.d().a("com.google.android.gms.mdisync.service.MdiSyncModuleInitIntentOperation", "a", 44, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("module initialization completed");
    }

    public MdiSyncModuleInitIntentOperation(amsv amsv) {
        this.b = amta.a(amsv);
    }
}
