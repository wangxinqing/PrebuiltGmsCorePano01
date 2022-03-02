package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: acrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acrf extends isy {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService");
        if (queryLocalInterface instanceof acre) {
            return (acre) queryLocalInterface;
        }
        return new acrc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.smartdevice.wifi.START_WIFI_HELPER_SERVICE";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.smartdevice.wifi.internal.IWifiHelperService";
    }

    public final int d() {
        return 12800000;
    }

    public acrf(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 159, ise, ica, icb);
    }
}
