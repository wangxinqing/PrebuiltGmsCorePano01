package defpackage;

import android.content.Context;
import android.content.IntentSender;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import com.google.android.chimera.Activity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: wia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wia {
    public static acwa a(Activity activity) {
        if (a((Context) activity)) {
            return acws.a((Object) null);
        }
        return acws.a((Executor) tid.c(), (Callable) new whz(activity));
    }

    static final /* synthetic */ void b(Activity activity) {
        ibr ibr;
        rep rep = new rep();
        rep.b = true;
        rep.a(LocationRequest.a());
        LocationSettingsRequest a = rep.a();
        iby b = ren.b(activity);
        iha b2 = ihb.b();
        b2.a = new rey(a);
        acwa a2 = b.a(b2.a());
        int b3 = thr.b("setLocation", a2, 3000);
        if (b3 == 0) {
            return;
        }
        if (b3 != 6 || (ibr = (ibr) a2.e()) == null) {
            throw new Exception(String.format("Failed to enable location. Result code returned: %d", new Object[]{Integer.valueOf(b3)}));
        }
        try {
            new icj(ibr.a).a(activity.getContainerActivity(), 1005);
        } catch (IntentSender.SendIntentException e) {
            throw new Exception(e);
        }
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((LocationManager) context.getSystemService("location")).isLocationEnabled();
        }
        return Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0;
    }
}
