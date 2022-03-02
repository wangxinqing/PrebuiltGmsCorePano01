package com.google.android.gms.googlehelp;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleInitializer extends hec {
    /* access modifiers changed from: protected */
    public final void a(Intent intent, boolean z) {
        a("com.google.android.gms.googlehelp.contact.chat.ChatSupportRequestFormActivity");
        a("com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskService");
        a("com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewActivity");
        a("com.google.android.gms.googlehelp.GcmBroadcastReceiver");
        a("com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        jhg.a((Context) this, str, true);
    }
}
