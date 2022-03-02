package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.WorkSource;
import android.util.Log;
import com.android.location.provider.LocationProviderBase;
import com.android.location.provider.LocationRequestUnbundled;
import com.android.location.provider.ProviderPropertiesUnbundled;
import com.android.location.provider.ProviderRequestUnbundled;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aidm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aidm extends LocationProviderBase {
    public static final /* synthetic */ int f = 0;
    private static final ProviderPropertiesUnbundled g = ProviderPropertiesUnbundled.create(false, false, false, false, true, true, true, 1, 1);
    public final rom a;
    public final roo b;
    public final Handler c;
    public final ajqf d;
    public long e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aidm(Context context) {
        super("FusedLocationProvider", g);
        iby c2 = ren.c(context);
        this.d = new ajqf();
        this.e = Long.MAX_VALUE;
        this.a = null;
        this.c = new aidl(this, Looper.getMainLooper());
        this.b = new roo(c2, (reh) new aidj(this), Looper.getMainLooper());
    }

    private static final int a(int i) {
        if (i != 100) {
            if (i != 104) {
                if (i != 203) {
                    if (i == 200) {
                        return 105;
                    }
                    if (i != 201) {
                        return 102;
                    }
                }
            }
            return 104;
        }
        return 100;
    }

    public final void onDisable() {
    }

    public final void onEnable() {
    }

    public final int onGetStatus(Bundle bundle) {
        return 2;
    }

    public final long onGetStatusUpdateTime() {
        return 0;
    }

    public final void onSetRequest(ProviderRequestUnbundled providerRequestUnbundled, WorkSource workSource) {
        List a2 = a(providerRequestUnbundled, workSource);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(1, 0, 0, a2));
    }

    private static final List a(ProviderRequestUnbundled providerRequestUnbundled, WorkSource workSource) {
        WorkSource workSource2;
        ArrayList arrayList;
        int i;
        if (!providerRequestUnbundled.getReportLocation()) {
            return amzy.h();
        }
        ArrayList arrayList2 = new ArrayList(providerRequestUnbundled.getLocationRequests().size());
        List<LocationRequestUnbundled> locationRequests = providerRequestUnbundled.getLocationRequests();
        int i2 = 105;
        long j = Long.MAX_VALUE;
        LocationRequestUnbundled locationRequestUnbundled = null;
        for (LocationRequestUnbundled locationRequestUnbundled2 : locationRequests) {
            int a2 = a(locationRequestUnbundled2.getQuality());
            long interval = locationRequestUnbundled2.getInterval();
            if (interval < j || a2 < i2) {
                locationRequestUnbundled = locationRequestUnbundled2;
                i2 = a2;
                j = interval;
            }
        }
        for (LocationRequestUnbundled locationRequestUnbundled3 : locationRequests) {
            int a3 = a(locationRequestUnbundled3.getQuality());
            if (locationRequestUnbundled3 == locationRequestUnbundled) {
                int i3 = Build.VERSION.SDK_INT;
                workSource2 = workSource;
            } else {
                workSource2 = null;
            }
            LocationRequest a4 = LocationRequest.a();
            a4.c(locationRequestUnbundled3.getInterval());
            a4.c(a3);
            LocationRequestInternal a5 = LocationRequestInternal.a("overlay", a4);
            a5.h = "com.google.android.gms.location";
            a5.a();
            if (workSource2 != null) {
                int a6 = jlr.a(workSource2);
                ArrayList arrayList3 = new ArrayList(a6);
                for (int i4 = 0; i4 < a6; i4++) {
                    if (jlr.a != null) {
                        try {
                            i = ((Integer) jlr.a.invoke(workSource2, new Object[]{Integer.valueOf(i4)})).intValue();
                        } catch (Exception e2) {
                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                            i = 0;
                        }
                    } else {
                        i = 0;
                    }
                    arrayList3.add(new ClientIdentity(i, jlr.a(workSource2, i4)));
                }
                arrayList = arrayList3;
            } else {
                arrayList = Collections.emptyList();
            }
            a5.a(arrayList);
            if (jkr.h()) {
                try {
                    a5.i = locationRequestUnbundled3.isLocationSettingsIgnored();
                } catch (NoSuchMethodError e3) {
                }
            }
            arrayList2.add(a5);
        }
        return arrayList2;
    }

    @Deprecated
    public aidm(rom rom) {
        super("FusedLocationProvider", g);
        this.d = new ajqf();
        this.e = Long.MAX_VALUE;
        this.a = rom;
        this.c = new aidl(this, Looper.getMainLooper());
        this.b = new roo(rom, (reh) new aidk(this), Looper.getMainLooper());
    }
}
