package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.util.List;

/* renamed from: hea  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class hea extends IntentOperation {
    private Boolean a;

    private final void a(GoogleSettingsItem googleSettingsItem, List list) {
        if (googleSettingsItem != null) {
            if (googleSettingsItem.d == null && googleSettingsItem.p >= 0) {
                googleSettingsItem.d = getResources().getString(googleSettingsItem.p);
            }
            if (googleSettingsItem.i == null && googleSettingsItem.q >= 0) {
                googleSettingsItem.i = getResources().getString(googleSettingsItem.q);
            }
            if (awzr.c() && googleSettingsItem.b != null && !c()) {
                googleSettingsItem.b.putExtra("calledFromGoogleSettings", true);
            }
            Parcel obtain = Parcel.obtain();
            heb.a(googleSettingsItem, obtain, 0);
            list.add(obtain);
        }
    }

    public List a() {
        return null;
    }

    public GoogleSettingsItem b() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        amtf.a((Object) this.a);
        return this.a.booleanValue();
    }

    public void onHandleIntent(Intent intent) {
        mby mby;
        if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            boolean z = false;
            if (intent.getBooleanExtra("isSearchIndexingIntent", false)) {
                z = true;
            } else if ("GoogleSettingsIndexGetter".equals(intent.getStringExtra("className"))) {
                z = true;
            }
            this.a = Boolean.valueOf(z);
            if (extras != null) {
                IBinder a2 = fy.a(extras, "settingsListKey");
                if (a2 != null && a2.pingBinder()) {
                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface instanceof mby) {
                        mby = (mby) queryLocalInterface;
                    } else {
                        mby = new mbw(a2);
                    }
                    List list = (List) mbz.a(mby);
                    amtf.a((Object) list);
                    a(b(), list);
                    List<GoogleSettingsItem> a3 = a();
                    if (a3 != null) {
                        for (GoogleSettingsItem a4 : a3) {
                            a(a4, list);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Bundle passed from GoogleSettingsActivity must not be null.");
        }
        throw new IllegalArgumentException("GoogleSettingsIntentOperation should only be called with the com.google.android.gms.GOOGLE_SETTINGS_OPERATION action.");
    }

    protected static final boolean a(Intent intent, String str) {
        return !str.equals(intent.getStringExtra("className"));
    }

    /* access modifiers changed from: protected */
    public final Intent a(String str) {
        return new Intent(str).setPackage(getPackageName()).addCategory("android.intent.category.DEFAULT");
    }
}
