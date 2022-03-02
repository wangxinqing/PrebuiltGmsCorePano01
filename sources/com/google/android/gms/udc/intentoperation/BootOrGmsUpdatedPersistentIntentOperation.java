package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BootOrGmsUpdatedPersistentIntentOperation extends IntentOperation {
    private final amsv a;
    private final amsv b;

    public BootOrGmsUpdatedPersistentIntentOperation() {
        this.a = new adbe(this);
        this.b = new adbf(this);
    }

    public final void onHandleIntent(Intent intent) {
        if (intent != null && "com.google.android.gms.udc.intentoperation.BOOT_OR_GMS_UPDATED".equals(intent.getAction())) {
            if (azrk.r()) {
                ((afyy) this.a.a()).c().a((Enum) acyn.DEVICE_BOOT);
            }
            try {
                ((aful) this.b.a()).a().get();
                ((aful) this.b.a()).e(aczd.SYNC_ID_CUSTOM_CACHE).get();
                adaq a2 = adaq.a((Context) this);
                synchronized (a2.b) {
                    if (!a2.b()) {
                        Set<String> a3 = a2.a();
                        for (Account account : a2.c.a("com.google")) {
                            a3.add(account.name);
                        }
                        SharedPreferences.Editor edit = a2.b.edit();
                        for (String str : a3) {
                            int[] iArr = {10, 9};
                            for (int i = 0; i < 2; i++) {
                                String c = adaq.c(str, iArr[i]);
                                edit.putBoolean(c, a2.b.getBoolean(c, false));
                            }
                        }
                        edit.putBoolean("is-migrated", true);
                        edit.apply();
                    }
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    BootOrGmsUpdatedPersistentIntentOperation(afyy afyy, aful aful) {
        this.a = new adbg(afyy);
        this.b = new adbh(aful);
    }
}
