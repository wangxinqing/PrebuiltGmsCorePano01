package defpackage;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* renamed from: lwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class lwg implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final lxb a;

    public lwg(lxb lxb) {
        this.a = lxb;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        lxb lxb = this.a;
        if ("activated".equals(str)) {
            boolean z = sharedPreferences.getBoolean("activated", false);
            ArrayList arrayList = new ArrayList();
            for (lwz lwz : lxb.a) {
                try {
                    Parcel aQ = lwz.aQ();
                    bhx.a(aQ, z);
                    lwz.b(1, aQ);
                } catch (RemoteException e) {
                    arrayList.add(lwz);
                }
            }
            lxb.a.removeAll(arrayList);
        }
    }
}
