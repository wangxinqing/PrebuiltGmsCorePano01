package com.google.android.gms.romanesco.contactsupload.triggers;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeopleBackupOptOutIntentOperation extends IntentOperation {
    private static final zsg a = zsg.a("BackupOptOutIntent");
    private final long b = System.currentTimeMillis();

    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        new Object[1][0] = intent.getAction();
        String action = intent.getAction();
        if ("com.google.android.gms.backup.action.OPT_OUT".equals(action)) {
            String string = intent.getExtras().getString("com.google.android.gms.backup.extra.optOut.accountName");
            if ((azdq.b() || azdq.c()) && Build.VERSION.SDK_INT >= 23) {
                try {
                    if (!amrk.a(string)) {
                        zuk zuk = new zuk();
                        zuk.c = this.b;
                        zuk.a = string;
                        zvc.a().a(new zva(applicationContext, zuk));
                    } else if (!azfa.g()) {
                        a.c("BackupOptOutIntent", "Backup account null or empty");
                    } else {
                        a.c("Backup account null or empty");
                    }
                } catch (Exception e) {
                    zsi a2 = zsi.a();
                    aucd o = aveg.q.o();
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    ((aveg) o.b).j = true;
                    aveg aveg = (aveg) o.i();
                    aucd o2 = aveu.p.o();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aveg.getClass();
                    ((aveu) o2.b).g = aveg;
                    a2.a(o2);
                    zso.a(applicationContext).a(e, azfa.l());
                }
            }
        } else {
            a.b("Received unexcepted message: %s", action);
        }
    }
}
