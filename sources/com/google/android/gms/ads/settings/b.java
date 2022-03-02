package com.google.android.gms.ads.settings;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.ads.identifier.c;
import com.google.android.gms.ads.identifier.d;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class b extends AsyncTask {
    hxx a;
    c b;
    final /* synthetic */ AdsSettingsChimeraActivity c;

    public b(AdsSettingsChimeraActivity adsSettingsChimeraActivity) {
        this.c = adsSettingsChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            this.b = d.a(this.c.getApplicationContext());
            return 0;
        } catch (IOException e) {
            Log.e("AdsSettingsActivity", "Could not get advertising ID info.", e);
            return 2;
        } catch (hxw e2) {
            Log.wtf("AdsSettingsActivity", "Google Play services not available?", e2);
            return 2;
        } catch (hxx e3) {
            Log.w("AdsSettingsActivity", "Google Play services repairable.", e3);
            this.a = e3;
            return 1;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        c cVar;
        Integer num = (Integer) obj;
        if (this.c.isFinishing()) {
            return;
        }
        if (num.intValue() == 0 && (cVar = this.b) != null) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity = this.c;
            String str = cVar.a;
            int i = AdsSettingsChimeraActivity.e;
            adsSettingsChimeraActivity.a(str);
            this.c.b.setChecked(this.b.b);
            this.c.a(this.b.b);
        } else if (num.intValue() == 1) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity2 = this.c;
            hxx hxx = this.a;
            int i2 = AdsSettingsChimeraActivity.e;
            adsSettingsChimeraActivity2.a(hxx);
        }
    }
}
