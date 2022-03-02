package com.google.android.gms.udc.intentoperation;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.AccountChangeEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UdcSystemAccountsChangedIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        List list;
        adam adam;
        Iterator it;
        int i;
        if (intent != null && "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction())) {
            adam adam2 = new adam(this);
            Iterator it2 = adam2.b.a().iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                int i2 = 0;
                try {
                    adaq adaq = adam2.b;
                    synchronized (adaq.b) {
                        adaq.c();
                        i = adaq.b.getInt(adaq.a(str), 0);
                    }
                    list = eim.b(adam2.c, i, str);
                } catch (eif | IOException e) {
                    ((anih) ((anih) adam.a.b()).a("adam", "a", 46, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Error getting account change events.");
                    list = null;
                }
                if (list == null) {
                    adam adam3 = adam2;
                    Iterator it3 = it2;
                } else if (!list.isEmpty()) {
                    AccountChangeEvent accountChangeEvent = (AccountChangeEvent) list.get(0);
                    adaq adaq2 = adam2.b;
                    int i3 = accountChangeEvent.e;
                    synchronized (adaq2.b) {
                        adaq2.c();
                        SharedPreferences.Editor edit = adaq2.b.edit();
                        edit.putInt(adaq.a(str), i3);
                        edit.apply();
                    }
                    if (accountChangeEvent.d == 4) {
                        String str2 = accountChangeEvent.f;
                        adaq adaq3 = adam2.b;
                        synchronized (adaq3.b) {
                            boolean b = adaq3.b();
                            SharedPreferences.Editor edit2 = adaq3.b.edit();
                            int[] iArr = adaq.a;
                            int length = iArr.length;
                            while (i2 < length) {
                                int i4 = iArr[i2];
                                String c = adaq.c(str, i4);
                                String d = adaq.d(str, i4);
                                boolean z = adaq3.b.getBoolean(c, b);
                                adam adam4 = adam2;
                                long j = adaq3.b.getLong(d, 0);
                                edit2.putBoolean(adaq.c(str2, i4), z);
                                edit2.remove(c);
                                edit2.putLong(adaq.d(str2, i4), j);
                                edit2.remove(d);
                                i2++;
                                adam2 = adam4;
                                it2 = it2;
                            }
                            adam = adam2;
                            it = it2;
                            edit2.apply();
                        }
                        adam2 = adam;
                        it2 = it;
                    } else {
                        adam adam5 = adam2;
                        Iterator it4 = it2;
                    }
                } else {
                    adam adam6 = adam2;
                    Iterator it5 = it2;
                }
            }
        }
    }
}
