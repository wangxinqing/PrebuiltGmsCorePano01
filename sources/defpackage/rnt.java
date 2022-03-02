package defpackage;

import android.content.Intent;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;

@Deprecated
/* renamed from: rnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rnt {
    public final ArrayList a = new ArrayList();
    public boolean b = false;
    public LocationSettingsRequest c;
    public String d;

    public final Intent a() {
        LocationSettingsRequest locationSettingsRequest = this.c;
        if (locationSettingsRequest == null) {
            rep rep = new rep();
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                LocationRequest locationRequest = (LocationRequest) arrayList.get(i);
                if (locationRequest != null) {
                    rep.a.add(locationRequest);
                }
            }
            rep.b = this.b;
            locationSettingsRequest = rep.a();
        }
        Intent intent = new Intent("com.google.android.gms.location.settings.CHECK_SETTINGS");
        ivy.a((SafeParcelable) locationSettingsRequest, intent, "locationSettingsRequests");
        String str = this.d;
        if (str != null) {
            intent.putExtra("originalPackageName", str);
        }
        intent.setPackage("com.google.android.gms");
        return intent;
    }
}
