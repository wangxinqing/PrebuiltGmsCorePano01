package com.google.android.gms.common.account;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AccountNameUpdateIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        ivk a = jgu.a((Context) this);
        SharedPreferences.Editor edit = a.edit();
        Map all = a.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : all.entrySet()) {
            if (!((String) entry.getKey()).startsWith("x-client-auth:") && !((String) entry.getKey()).startsWith("selected_account_type:")) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String str = (String) value;
                    if (!TextUtils.isEmpty(str)) {
                        Set set = (Set) hashMap.get(str);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(str, set);
                        }
                        set.add((String) entry.getKey());
                    }
                } else {
                    String valueOf = String.valueOf(String.valueOf(value));
                    Log.e("AccountUtils", valueOf.length() == 0 ? new String("Invalid account name: ") : "Invalid account name: ".concat(valueOf));
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            try {
                Iterator it = eim.b(this, 0, (String) entry2.getKey()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AccountChangeEvent accountChangeEvent = (AccountChangeEvent) it.next();
                    if (accountChangeEvent.d == 4) {
                        String str2 = accountChangeEvent.f;
                        for (String putString : (Set) entry2.getValue()) {
                            edit.putString(putString, str2);
                        }
                    }
                }
            } catch (eif e) {
                String valueOf2 = String.valueOf((String) entry2.getKey());
                if (valueOf2.length() != 0) {
                    "Unable to get account change events for ".concat(valueOf2);
                } else {
                    new String("Unable to get account change events for ");
                }
            } catch (IOException e2) {
                String valueOf3 = String.valueOf((String) entry2.getKey());
                if (valueOf3.length() != 0) {
                    "Unable to get account change events for ".concat(valueOf3);
                } else {
                    new String("Unable to get account change events for ");
                }
            }
        }
        edit.commit();
    }
}
