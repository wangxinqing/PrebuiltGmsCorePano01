package com.google.android.gms.accountsettings.operations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GmscoreSettingsIntentCompleteOperation extends hea {
    public final void onHandleIntent(Intent intent) {
        IBinder a;
        mby mby;
        int i;
        if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("Bundle must not be null.");
            } else if (!hea.a(intent, "GmscoreSettingsProvider") && (a = fy.a(extras, "settingsListKey")) != null && a.pingBinder()) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                if (queryLocalInterface instanceof mby) {
                    mby = (mby) queryLocalInterface;
                } else {
                    mby = new mbw(a);
                }
                List list = (List) mbz.a(mby);
                cvs a2 = cvs.a();
                cvq cvq = new cvq();
                cvq.b.clear();
                cvq.a.clear();
                cvq.a(R.string.common_google_settings_account, 1);
                cvq.a(R.string.common_google_settings_services, 0);
                cvq.a(R.string.common_google_settings_developer, 3);
                cvq.a(R.string.common_google_settings_account_services, 4, 0);
                cvq.a(R.string.common_google_settings_device_connections, 6, 0);
                cvq.a(R.string.common_google_settings_data_and_messaging, 5, 0);
                cvq.a(R.string.common_google_settings_set_up_and_restore, 7, 0);
                if (jgu.b((Context) ihs.b()) || awzr.b()) {
                    cvq.a(R.string.common_google_settings_internal, 2, 3);
                    i = 0;
                } else {
                    i = 0;
                }
                while (i < list.size()) {
                    Parcel parcel = (Parcel) list.get(i);
                    parcel.setDataPosition(0);
                    GoogleSettingsItem googleSettingsItem = (GoogleSettingsItem) GoogleSettingsItem.CREATOR.createFromParcel(parcel);
                    int i2 = googleSettingsItem.o;
                    if (!(i2 == 0 || i2 == 1 || !quj.a(googleSettingsItem, ihs.b(), false))) {
                        cvq.b.put(Integer.valueOf(googleSettingsItem.o), googleSettingsItem);
                        if (cvq.a.containsKey(Integer.valueOf(googleSettingsItem.c))) {
                            ((cvn) cvq.a.get(Integer.valueOf(googleSettingsItem.c))).b.add(new cvo(googleSettingsItem));
                        }
                    }
                    i++;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (cvn cvn : cvq.a.values()) {
                    int i3 = cvn.a;
                    if (i3 != -1 && cvq.a.containsKey(Integer.valueOf(i3))) {
                        ((cvn) cvq.a.get(Integer.valueOf(cvn.a))).b.add(new cvo(cvn.a()));
                    }
                }
                for (Map.Entry entry : cvq.a.entrySet()) {
                    linkedHashMap.put((Integer) entry.getKey(), ((cvn) entry.getValue()).a());
                }
                a2.a = new cvr(anaf.a(cvq.b), anaf.a((Map) linkedHashMap));
                a2.b.countDown();
            }
        }
    }
}
