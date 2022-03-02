package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GcmDiagnosticsReceiver extends nla {
    public GcmDiagnosticsReceiver() {
        super("gcm");
    }

    public final void a(Context context, Intent intent) {
        intent.setClassName(context, "com.google.android.gms.gcm.GcmDiagnostics");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
