package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MeasurementPackageBroadcastIntentOperation extends IntentOperation {
    private final void a(Intent intent) {
        if (!intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
            String b = b(intent);
            sze a = sze.a((Context) this);
            if (b != null) {
                a.E().j.a("Got package removed intent", b);
                if (!"com.google.android.gms".equals(b) && a.a().a) {
                    a.F().a((Runnable) new szb(a, b, a.o().a()));
                    return;
                }
                return;
            }
            a.E().f.a("Got package removed intent with a null package name");
        }
    }

    private static String b(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return data.getSchemeSpecificPart();
        }
        return null;
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (!ayid.b() || !sze.a((Context) this).d().a(sud.aB)) {
            if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                a(intent);
            } else if (!"android.intent.action.PACKAGE_ADDED".equals(action)) {
                if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
                    String b = b(intent);
                    sze a = sze.a((Context) this);
                    if (b != null) {
                        a.E().j.a("Got package replaced intent", b);
                        "com.google.android.gms".equals(b);
                        return;
                    }
                    a.E().f.a("Got package replaced intent with a null package name");
                }
            } else if (!intent.getBooleanExtra("android.intent.extra.REPLACING", false)) {
                String b2 = b(intent);
                sze a2 = sze.a((Context) this);
                if (b2 != null) {
                    a2.E().j.a("Got package added intent", b2);
                    "com.google.android.gms".equals(b2);
                    return;
                }
                a2.E().f.a("Got package added intent with a null package name");
            }
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            a(intent);
        }
    }
}
