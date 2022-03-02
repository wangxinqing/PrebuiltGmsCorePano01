package com.google.android.gms.lockbox;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class LockboxAccountsChangedChimeraReceiver extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        List list;
        int i;
        if (intent != null && "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            row row = new row(this);
            rqc rqc = row.a;
            HashSet hashSet = new HashSet();
            synchronized (rqc.a) {
                for (String next : rqc.a.getAll().keySet()) {
                    if (next.startsWith("opt-in-status-")) {
                        hashSet.add(next.substring(14, next.lastIndexOf(45)));
                    }
                }
                String a = rqc.a();
                if (!TextUtils.isEmpty(a)) {
                    hashSet.add(a);
                }
            }
            ArrayList arrayList = new ArrayList(hashSet);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = (String) arrayList.get(i2);
                rov rov = row.b;
                try {
                    rqc rqc2 = rov.a;
                    synchronized (rqc2.a) {
                        rqc2.b();
                        i = rqc2.a.getInt(rqc.b(str), 0);
                    }
                    list = eig.a(rov.b, i, str);
                } catch (eif | IOException e) {
                    Log.e("LockboxAcctChgService", "Error getting account change events.");
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    AccountChangeEvent accountChangeEvent = (AccountChangeEvent) list.get(0);
                    rqc rqc3 = row.a;
                    int i3 = accountChangeEvent.e;
                    synchronized (rqc3.a) {
                        rqc3.b();
                        SharedPreferences.Editor edit = rqc3.a.edit();
                        edit.putInt(rqc.b(str), i3);
                        edit.apply();
                    }
                    if (accountChangeEvent.d == 4) {
                        String str2 = accountChangeEvent.f;
                        rqc rqc4 = row.a;
                        synchronized (rqc4.a) {
                            SharedPreferences.Editor edit2 = rqc4.a.edit();
                            if (str.equals(rqc4.a())) {
                                edit2.putString("signed-in-account", str2);
                            }
                            edit2.apply();
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
