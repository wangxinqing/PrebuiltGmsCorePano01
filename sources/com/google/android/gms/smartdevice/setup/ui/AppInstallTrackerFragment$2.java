package com.google.android.gms.smartdevice.setup.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppInstallTrackerFragment$2 extends nla {
    final /* synthetic */ ackp a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppInstallTrackerFragment$2(ackp ackp, String str) {
        super(str);
        this.a = ackp;
    }

    public final void a(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) && data != null && this.a.b.equals(data.getEncodedSchemeSpecificPart())) {
            this.a.a();
            this.a.b();
            this.a.a.a();
        }
    }
}
