package com.google.android.gms.drive.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.drive.api.ApiChimeraService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ModuleInitializer extends hec {
    private static final amzy a = amzy.a((Object) "com.google.android.gms.drive.deprecation.UpgradeDialogActivity");

    public final void a(Intent intent) {
        ApiChimeraService.c(getApplicationContext());
    }

    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        anhk i = a.listIterator();
        while (i.hasNext()) {
            jhg.a((Context) this, (String) i.next(), true);
        }
    }
}
