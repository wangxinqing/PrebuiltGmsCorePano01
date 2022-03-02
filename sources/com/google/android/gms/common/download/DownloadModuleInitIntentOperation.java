package com.google.android.gms.common.download;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DownloadModuleInitIntentOperation extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, int i) {
        if ((i & 2) != 0) {
            startService(ipu.a(this).putExtra("boot", true));
        } else {
            startService(ipu.a(this));
        }
    }
}
