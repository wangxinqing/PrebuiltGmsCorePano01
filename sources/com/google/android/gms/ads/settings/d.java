package com.google.android.gms.ads.settings;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.identifier.internal.b;
import com.google.android.gms.ads.identifier.settings.a;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class d extends AsyncTask {
    hxx a;
    final /* synthetic */ AdsSettingsChimeraActivity b;
    private boolean c;

    public d(AdsSettingsChimeraActivity adsSettingsChimeraActivity) {
        this.b = adsSettingsChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean z;
        Context applicationContext;
        hwz a2;
        com.google.android.gms.ads.identifier.internal.d dVar;
        Boolean[] boolArr = (Boolean[]) objArr;
        if (boolArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z);
        boolean booleanValue = boolArr[0].booleanValue();
        this.c = booleanValue;
        AdsSettingsChimeraActivity adsSettingsChimeraActivity = this.b;
        int i = AdsSettingsChimeraActivity.e;
        adsSettingsChimeraActivity.a(booleanValue);
        try {
            applicationContext = this.b.getApplicationContext();
            boolean z2 = this.c;
            iva.b("Calling this from your main thread can lead to deadlock");
            a2 = a.a(applicationContext);
            IBinder a3 = a2.a();
            if (a3 != null) {
                IInterface queryLocalInterface = a3.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                dVar = !(queryLocalInterface instanceof com.google.android.gms.ads.identifier.internal.d) ? new b(a3) : (com.google.android.gms.ads.identifier.internal.d) queryLocalInterface;
            } else {
                dVar = null;
            }
            dVar.a(applicationContext.getPackageName(), z2);
            jca.a().a(applicationContext, (ServiceConnection) a2);
            return 0;
        } catch (RemoteException e) {
            Log.i("AdvertisingIdSettersClient", "GMS remote exception ", e);
            throw new IOException("Remote exception");
        } catch (InterruptedException e2) {
            throw new IOException("Interrupted exception");
        } catch (IOException e3) {
            Log.e("AdsSettingsActivity", "Could not set Limit Ad Tracking.", e3);
            return 2;
        } catch (hxw e4) {
            Log.wtf("AdsSettingsActivity", "Google Play services not available?", e4);
            return 2;
        } catch (hxx e5) {
            Log.w("AdsSettingsActivity", "Google Play services repairable.", e5);
            this.a = e5;
            return 1;
        } catch (Throwable th) {
            jca.a().a(applicationContext, (ServiceConnection) a2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (!this.b.isFinishing() && num.intValue() != 0 && num.intValue() == 1) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity = this.b;
            hxx hxx = this.a;
            int i = AdsSettingsChimeraActivity.e;
            adsSettingsChimeraActivity.a(hxx);
        }
    }
}
