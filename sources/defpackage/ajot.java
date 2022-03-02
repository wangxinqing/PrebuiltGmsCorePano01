package defpackage;

import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;
import java.util.List;

/* renamed from: ajot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajot extends AsyncTask {
    final /* synthetic */ RemoteDevice a;
    final /* synthetic */ boolean b;
    final /* synthetic */ LocationHistorySettingsChimeraActivity c;

    public ajot(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity, RemoteDevice remoteDevice, boolean z) {
        this.c = locationHistorySettingsChimeraActivity;
        this.a = remoteDevice;
        this.b = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            if (this.c.b != null) {
                String a2 = ajnm.a();
                LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = this.c;
                return locationHistorySettingsChimeraActivity.b.a(locationHistorySettingsChimeraActivity.c, this.a.a, this.b, a2);
            }
            Log.w("GCoreLocationSettings", "Preference service disappeared (onSwitchChanged)");
            return null;
        } catch (RemoteException e) {
            Log.e("GCoreLocationSettings", "Pref service failed for remote device", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.c.a((List) obj);
    }
}
