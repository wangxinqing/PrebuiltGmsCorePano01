package com.google.android.gms.chromesync.operation;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SaveTrustedVaultIntentOperation extends IntentOperation {
    private static final iwd a = new iwd("SaveTrustedVault", new String[0]);

    public static Intent a(Context context, pyv pyv) {
        Intent startIntent = IntentOperation.getStartIntent(context, SaveTrustedVaultIntentOperation.class, "com.google.android.gms.chromesync.SAVE_TRUSTED_VAULT");
        if (startIntent != null) {
            startIntent.putExtra("ACCOUNT", pyv.a());
            return startIntent;
        }
        throw new hjm(1025);
    }

    public final void onHandleIntent(Intent intent) {
        a.c("Handling the intent: %s.", intent);
        try {
            Account account = (Account) intent.getParcelableExtra("ACCOUNT");
            if (account != null) {
                pyv a2 = pyv.a(getApplicationContext(), account);
                hnj hnj = (hnj) hnj.b.b();
                iva.a((Object) a2);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (hnj.i) {
                    hnj.a(a2);
                    amri c = hnj.f.c(a2);
                    if (c.a()) {
                        aqpc aqpc = (aqpc) c.b();
                        hjg a3 = hjh.a(2);
                        amri a4 = hnj.a(a3, a2);
                        List<hln> a5 = hnj.e.a(a2, 2);
                        ArrayList arrayList = new ArrayList(a5.size());
                        for (hln hln : a5) {
                            try {
                                hlm a6 = a3.a(hln, a3.a(hln, a4), a4);
                                a6.d = true;
                                arrayList.add(a6.a());
                            } catch (hji | hjm e) {
                            }
                        }
                        hnj.e.a(a2, (List) arrayList);
                        hnu hnu = hnj.h;
                        hnv hnv = new hnv();
                        hnv.a = a2;
                        hnv.b = 401;
                        hnu.a(hnv.a());
                    }
                }
                hnj.a.b("resaveAll() [Latency: %dms]", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                return;
            }
            throw new hjm(1025);
        } catch (eif | hjm e2) {
            a.e("Error handling the intent: %s.", intent, e2);
        }
    }
}
