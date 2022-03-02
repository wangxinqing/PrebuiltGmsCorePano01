package com.google.android.gms.instantapps.ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.instantapps.internal.OptInInfo;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnPackageChangeOperation extends IntentOperation {
    private static final qfn a = new qfn("OnPackageChangeOperation");

    public final void onHandleIntent(Intent intent) {
        if (qfe.a() == 1) {
            return;
        }
        if (intent.getData() == null || intent.getAction() == null) {
            a.b("Bad intent %s", intent);
            return;
        }
        String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
        String action = intent.getAction();
        if ("com.google.android.instantapps.supervisor".equals(encodedSchemeSpecificPart)) {
            iwq a2 = iwq.a((Context) this);
            if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                a2.a("InstantApps", 100);
            } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                acwa e = qdy.b(this).e();
                try {
                    acws.a(e);
                    if (((OptInInfo) e.d()).a == 1 && !qfm.a(getApplicationContext())) {
                        PendingIntent activity = PendingIntent.getActivity(this, 0, qlq.a(true).putExtra("downloadSupervisorShowConfirmation", true), 134217728);
                        String string = getString(R.string.restore_instant_apps_notif_text, new Object[]{getString(R.string.supervisor_title)});
                        je jeVar = new je(this);
                        jeVar.e(getString(R.string.restore_instant_apps_notif_title));
                        jeVar.b((CharSequence) string);
                        jd jdVar = new jd();
                        jdVar.a((CharSequence) string);
                        jeVar.a((jh) jdVar);
                        jeVar.a(1);
                        jeVar.b(17301642);
                        jeVar.a(true);
                        jeVar.f = activity;
                        jeVar.a(new jb(0, getString(R.string.common_restore), activity).a());
                        a2.a("InstantApps", 100, jeVar.b());
                    }
                } catch (InterruptedException | ExecutionException e2) {
                    a.a(e2, "Could not fetch opt in info.", new Object[0]);
                }
            }
        }
    }
}
