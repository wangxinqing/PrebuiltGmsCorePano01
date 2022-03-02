package com.google.android.gms.ads.settings;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.identifier.internal.b;
import com.google.android.gms.ads.identifier.internal.d;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class a extends AsyncTask {
    hxx a;
    String b;
    final /* synthetic */ AdsSettingsChimeraActivity c;

    public a(AdsSettingsChimeraActivity adsSettingsChimeraActivity) {
        this.c = adsSettingsChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Context applicationContext;
        hwz a2;
        d dVar;
        Void[] voidArr = (Void[]) objArr;
        try {
            applicationContext = this.c.getApplicationContext();
            iva.b("Calling this from your main thread can lead to deadlock");
            a2 = com.google.android.gms.ads.identifier.settings.a.a(applicationContext);
            IBinder a3 = a2.a();
            if (a3 != null) {
                IInterface queryLocalInterface = a3.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                dVar = !(queryLocalInterface instanceof d) ? new b(a3) : (d) queryLocalInterface;
            } else {
                dVar = null;
            }
            String a4 = dVar.a(applicationContext.getPackageName());
            jca.a().a(applicationContext, (ServiceConnection) a2);
            this.b = a4;
            return 0;
        } catch (RemoteException e) {
            Log.i("AdvertisingIdSettersClient", "GMS remote exception ", e);
            throw new IOException("Remote exception");
        } catch (InterruptedException e2) {
            throw new IOException("Interrupted exception");
        } catch (IOException e3) {
            Log.e("AdsSettingsActivity", "Could not clear advertising ID.", e3);
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
        if (this.c.isFinishing()) {
            return;
        }
        if (num.intValue() == 0) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity = this.c;
            String str = this.b;
            int i = AdsSettingsChimeraActivity.e;
            adsSettingsChimeraActivity.a(str);
        } else if (num.intValue() == 1) {
            AdsSettingsChimeraActivity adsSettingsChimeraActivity2 = this.c;
            hxx hxx = this.a;
            int i2 = AdsSettingsChimeraActivity.e;
            adsSettingsChimeraActivity2.a(hxx);
        }
    }
}
