package com.google.android.gms.update.control;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReceiverIntentOperation extends IntentOperation {
    static final String a = jkq.a("com.google.android.gms.update");
    private static final iwd b = adnt.f("ReceiverIntentOperation");
    private static final anaf c;

    static {
        anab h = anaf.h();
        h.a("com.google.gservices.intent.action.GSERVICES_CHANGED", 2);
        h.a("com.google.android.gms.update.BASE_MODULE_INIT", 1);
        h.a("android.app.action.SYSTEM_UPDATE_POLICY_CHANGED", 6);
        h.a("android.intent.action.TIME_SET", 6);
        h.a("android.intent.action.ACTION_POWER_CONNECTED", 9);
        h.a("android.intent.action.USER_PRESENT", 11);
        h.a("com.google.android.gms.phenotype.COMMITTED", 2);
        h.a(a, 2);
        h.a("com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED", 12);
        c = h.a();
    }

    public static Intent a(Context context) {
        return IntentOperation.getStartIntent(context, ReceiverIntentOperation.class, "com.google.android.gms.update.BASE_MODULE_INIT");
    }

    public static PendingIntent b(Context context) {
        return PendingIntent.getService(context, 1, IntentOperation.getStartIntent(context, ReceiverIntentOperation.class, "com.google.android.gms.update.RESUME_ON_REBOOOT_LSKF_CAPTURED"), 134217728);
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && !TextUtils.equals("com.google.android.gms.update", intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            b.b("Ignore non-related phenotype commit", new Object[0]);
            return;
        }
        b.c("Received intent: %s.", intent);
        adkv adkv = (adkv) adkv.b.b();
        Integer num = (Integer) c.get(intent.getAction());
        if (num != null) {
            adkv.a(num.intValue());
        }
        if (adjw.b() && "com.google.vr.powerpolicy.action.ACTION_POLICY_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("com.google.vr.powerpolicy.extra.POLICY", 0);
            if (intExtra == 0) {
                adkv.a(7);
            } else if (intExtra == 2) {
                adkv.a(5);
            }
        }
        if ("com.google.android.gms.update.NOTIFICATION_ACTION".equals(action)) {
            adlg adlg = (adlg) adlg.b.b();
            int intExtra2 = intent.getIntExtra("notification_action", -1);
            if (intExtra2 == 0) {
                adlg.c.a(new DownloadOptions(true, true));
            } else if (intExtra2 == 1) {
                adlg.c.a(new InstallationOptions(true, true, true, false));
            } else if (intExtra2 == 2) {
                try {
                    adlg.c.b(true);
                } catch (IOException e) {
                    adlg.a.e("Unable to schedule install tonight", new Object[0]);
                }
            } else if (intExtra2 == 3) {
                adlg.c.b(new InstallationOptions(true, true, true, false));
            } else if (intExtra2 != 4) {
                adlg.a.e("Unknown notification action: %d.", Integer.valueOf(intExtra2));
                return;
            }
            aucd o = anqf.c.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anqf anqf = (anqf) o.b;
            anqf.a = 1 | anqf.a;
            anqf.b = intExtra2;
            anqf anqf2 = (anqf) o.i();
            adns adns = adlg.d;
            aucd a2 = adns.a(8);
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            anqb anqb = (anqb) a2.b;
            anqb anqb2 = anqb.l;
            anqf2.getClass();
            anqb.j = anqf2;
            anqb.a |= 512;
            adns.a((anqb) a2.i());
        }
    }
}
