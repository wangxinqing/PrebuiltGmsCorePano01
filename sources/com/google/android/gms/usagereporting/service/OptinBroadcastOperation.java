package com.google.android.gms.usagereporting.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.UserHandle;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OptinBroadcastOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        int intExtra;
        long longExtra = intent.getLongExtra("SOURCE_SERIAL_ID", -1);
        if (longExtra != -1) {
            boolean booleanExtra = intent.getBooleanExtra("OPT_VALUE", false);
            adtm a = adtm.a();
            synchronized (a.a) {
                SharedPreferences b = a.b();
                irk.a((Object) b, (Object) "Unexpected null from getPrefs.");
                SharedPreferences.Editor edit = b.edit();
                edit.putBoolean(adtm.a(longExtra), booleanExtra);
                edit.apply();
            }
            a.a((Context) this);
            if (azuf.d() && (intExtra = intent.getIntExtra("SOURCE_USER", 0)) != 0) {
                Intent className = new Intent("com.google.android.gms.usagereporting.update_secret_number.ACTION").setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$PersistentInternalReceiver");
                className.putExtra("OPT_VALUE", a.c());
                Parcel obtain = Parcel.obtain();
                obtain.writeInt(intExtra);
                obtain.setDataPosition(0);
                sendBroadcastAsUser(className, UserHandle.readFromParcel(obtain));
            }
        }
    }
}
