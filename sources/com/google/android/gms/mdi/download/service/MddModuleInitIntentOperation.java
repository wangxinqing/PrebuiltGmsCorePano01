package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MddModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        Context baseContext = getBaseContext();
        if ((i & 12) > 0 || (i & 2) > 0) {
            MddGcmTaskChimeraService.b();
            sby.a(baseContext, (afsb) new scd(baseContext, new afsu(baseContext), sce.a(baseContext)));
        }
    }
}
