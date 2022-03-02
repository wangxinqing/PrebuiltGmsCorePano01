package com.google.android.location.reporting.service;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReportingSyncChimeraService extends Service {
    private static final Object a = new Object();
    private static ajlr b = null;

    public static void a(Account account, Context context) {
        new ild(context);
        ContentResolver.setIsSyncable(account, "com.google.android.location.reporting", 1);
        ild.a(account, "com.google.android.location.reporting");
    }

    public final IBinder onBind(Intent intent) {
        return b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (a) {
            if (b == null) {
                ajnw.a((Context) this);
                b = new ajlr(getApplicationContext());
            }
        }
    }

    public static void a(Account account, String str, Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ignore_settings", true);
        bundle.putBoolean("expedited", true);
        bundle.putBoolean("force", true);
        String a2 = rmp.a(account);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 32 + String.valueOf(str).length());
        sb.append("Requesting immediate sync for ");
        sb.append(a2);
        sb.append(": ");
        sb.append(str);
        sb.toString();
        new ild(context);
        ContentResolver.requestSync(account, "com.google.android.location.reporting", bundle);
    }
}
