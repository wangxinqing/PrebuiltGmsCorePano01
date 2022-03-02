package com.google.android.gms.udc.intentoperation;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.service.UdcContextInitChimeraService;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcAccountChangedIntentOperation extends IntentOperation {
    private final amsv a;
    private final amsv b;

    public UdcAccountChangedIntentOperation() {
        this.a = new adbp(this);
        this.b = new adbq(this);
    }

    private final void a(Account account) {
        ((afyy) this.a.a()).a(account).a((Enum) acyn.ACCOUNT_CHANGE);
    }

    public final void onHandleIntent(Intent intent) {
        if (azrk.r()) {
            for (Account a2 : erc.a(intent)) {
                a(a2);
            }
            for (Account a3 : erc.a(intent.getParcelableArrayExtra("accountsMutated"))) {
                a(a3);
            }
        }
        try {
            ((aful) this.b.a()).e(aczd.SYNC_ID_CUSTOM_CACHE).get();
            if (!azrk.p()) {
                UdcContextInitChimeraService.a((Context) this);
            }
            HashSet<String> hashSet = new HashSet<>();
            for (String split : getSharedPreferences("UdcConsistencyTokenPrefs", 0).getAll().keySet()) {
                String[] split2 = split.split(":");
                if (split2.length == 2 && !TextUtils.isEmpty(split2[0])) {
                    hashSet.add(split2[0]);
                }
            }
            for (Account account : jgu.d(this, "com.google.android.gms")) {
                try {
                    String c = adhi.c(this, eim.f(this, account.name));
                    if (!TextUtils.isEmpty(c)) {
                        hashSet.remove(c);
                    }
                } catch (eif | IOException e) {
                    anih anih = (anih) adhi.a.c();
                    anih.a(e);
                    anih.a("Could not retrieve accountId");
                }
            }
            for (String b2 : hashSet) {
                adhi.b(this, b2);
            }
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    UdcAccountChangedIntentOperation(afyy afyy, aful aful) {
        this.a = new adbr(afyy);
        this.b = new adbs(aful);
    }
}
