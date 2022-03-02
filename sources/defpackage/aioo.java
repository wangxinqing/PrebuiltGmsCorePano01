package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: aioo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aioo implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ LocationSettingsRequest b;
    final /* synthetic */ rgn c;
    final /* synthetic */ aiop d;

    public aioo(aiop aiop, String str, LocationSettingsRequest locationSettingsRequest, rgn rgn) {
        this.d = aiop;
        this.a = str;
        this.b = locationSettingsRequest;
        this.c = rgn;
    }

    public final void run() {
        PendingIntent pendingIntent;
        String str;
        aion aion = new aion(this.d.a, new aioi(this.d.a), this.a);
        aion.a(this.b.a());
        aion.a = this.b.b;
        aiom a2 = aion.a();
        int a3 = a2.a();
        if (a3 == 6) {
            rnt rnt = new rnt();
            rnt.c = this.b;
            rnt.d = this.a;
            Intent a4 = rnt.a();
            aiop aiop = this.d;
            pendingIntent = PendingIntent.getActivity(aiop.a, aiop.b.getAndIncrement(), a4, 134217728);
        } else {
            pendingIntent = null;
        }
        switch (a3) {
            case 8500:
            case 8501:
            case 8503:
            case 8505:
                str = "INTERNAL_LOCATION_SETTINGS_STATUS_CODE";
                break;
            case 8502:
                str = "SETTINGS_CHANGE_UNAVAILABLE";
                break;
            default:
                str = ibt.a(a3);
                break;
        }
        try {
            this.c.a(new LocationSettingsResult(new Status(a3, str, pendingIntent), a2.b));
        } catch (RemoteException e) {
        }
    }
}
