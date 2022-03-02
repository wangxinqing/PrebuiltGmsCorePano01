package com.google.android.contextmanager.service;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        startService(new Intent().setClassName(this, "com.google.android.contextmanager.service.ContextManagerService"));
    }
}
