package defpackage;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;
import java.util.List;

/* renamed from: ajor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajor extends AsyncTask {
    final /* synthetic */ LocationHistorySettingsChimeraActivity a;

    public ajor(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity) {
        this.a = locationHistorySettingsChimeraActivity;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = this.a;
        ajlk ajlk = locationHistorySettingsChimeraActivity.b;
        if (ajlk == null) {
            Log.w("GCoreLocationSettings", "Preference service disappeared (updateDevices)");
            return null;
        }
        try {
            return ajlk.b(locationHistorySettingsChimeraActivity.c);
        } catch (Exception e) {
            Log.wtf("GCoreLocationSettings", "getRemote devices failed", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        this.a.a((List) obj);
    }
}
