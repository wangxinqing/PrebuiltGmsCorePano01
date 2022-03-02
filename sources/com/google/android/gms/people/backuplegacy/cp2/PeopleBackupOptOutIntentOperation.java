package com.google.android.gms.people.backuplegacy.cp2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeopleBackupOptOutIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        xip.a();
        if (((Boolean) xgt.a.a()).booleanValue()) {
            Context applicationContext = getApplicationContext();
            intent.getAction();
            String action = intent.getAction();
            if ("com.google.android.gms.backup.action.OPT_OUT".equals(action)) {
                String string = intent.getExtras().getString("com.google.android.gms.backup.extra.optOut.accountName");
                if ((((Boolean) xia.a.a()).booleanValue() || ((Boolean) xid.a.a()).booleanValue()) && Build.VERSION.SDK_INT >= 23) {
                    try {
                        if (!amrk.a(string)) {
                            wrg wrg = new wrg();
                            wrg.c = System.currentTimeMillis();
                            wrg.a = string;
                            wro.a().a(new wrm(wqw.a(applicationContext), wrg, new wrl(applicationContext)));
                            return;
                        }
                        Log.w("BackupOptOutIntentOperation", "Backup account null or empty");
                    } catch (Exception e) {
                        wml a = wml.a();
                        aucd o = xlb.n.o();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        xlb xlb = (xlb) o.b;
                        xlb.a |= 512;
                        xlb.k = true;
                        xlb xlb2 = (xlb) o.i();
                        aucd o2 = xlc.m.o();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        xlc xlc = (xlc) o2.b;
                        xlb2.getClass();
                        xlc.l = xlb2;
                        xlc.a |= 131072;
                        a.a((xlc) o2.i());
                        yde.a.a(applicationContext).a(e, ((Double) xic.a.a()).doubleValue());
                    }
                }
            } else {
                xdt.a("BackupOptOutIntentOperation", "Received unexcepted message: %s", action);
            }
        }
    }
}
