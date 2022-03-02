package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: svm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class svm {
    private final svl a;

    public svm(svl svl) {
        iva.a((Object) svl);
        this.a = svl;
    }

    public static boolean a(Context context) {
        ActivityInfo receiverInfo;
        iva.a((Object) context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    public final void a(Context context, Intent intent) {
        String str;
        svv a2 = svv.a(context);
        sut E = a2.E();
        if (intent == null) {
            E.f.a("Receiver called with null intent");
            return;
        }
        boolean z = a2.f.a;
        String action = intent.getAction();
        if (z) {
            E.k.a("Device receiver got", action);
        } else {
            E.k.a("Local receiver got", action);
        }
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent intent2 = new Intent();
            if (z) {
                str = "com.google.android.gms.measurement.PackageMeasurementService";
            } else {
                str = "com.google.android.gms.measurement.AppMeasurementService";
            }
            Intent className = intent2.setClassName(context, str);
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            E.k.a("Starting wakeful intent.");
            this.a.a(context, className);
        } else if (!z && "com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a2.F().a((Runnable) new svj(a2, E));
            } catch (Exception e) {
                E.f.a("Install Referrer Reporter encountered a problem", e);
            }
            BroadcastReceiver.PendingResult a3 = this.a.a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                E.k.a("Install referrer extras are null");
                if (a3 != null) {
                    a3.finish();
                    return;
                }
                return;
            }
            E.i.a("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                stringExtra = stringExtra.length() == 0 ? new String("?") : "?".concat(stringExtra);
            }
            Bundle a4 = a2.f().a(Uri.parse(stringExtra));
            if (a4 == null) {
                E.k.a("No campaign defined in install referrer broadcast");
                if (a3 != null) {
                    a3.finish();
                    return;
                }
                return;
            }
            long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
            if (longExtra == 0) {
                E.f.a("Install referrer is missing timestamp");
            }
            a2.F().a((Runnable) new svk(a2, longExtra, a4, context, E, a3));
        }
    }
}
