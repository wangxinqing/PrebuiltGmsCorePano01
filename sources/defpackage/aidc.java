package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.List;

/* renamed from: aidc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aidc extends aidd implements PendingIntent.OnFinished {
    private final PendingIntent q;
    private final acrz r;

    public aidc(Context context, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, aicz aicz, PendingIntent pendingIntent) {
        super(context, i, str, locationRequestInternal, z, z2, aicz);
        this.q = pendingIntent;
        acrz acrz = new acrz(context, 1, "GCoreFlp", "FlpClientPendingIntent", "com.google.android.gms");
        this.r = acrz;
        acrz.a(true);
        if (jlr.a(context)) {
            this.r.c(isb.a(this.c.c));
        }
    }

    private final int a(List list, LocationAvailability locationAvailability) {
        String str;
        Intent intent = new Intent();
        int i = this.f;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            if (i >= 7323000) {
                intent.putExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT", LocationResult.a(list));
            }
            intent.putExtra("com.google.android.location.LOCATION", (Location) list.get(list.size() - 1));
            z = true;
        }
        if (locationAvailability != null && i >= 7323000) {
            intent.putExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY", locationAvailability);
        } else if (!z) {
            return 1;
        }
        this.r.a(10000);
        try {
            if (!this.d) {
                str = "android.permission.ACCESS_COARSE_LOCATION";
            } else {
                str = "android.permission.ACCESS_FINE_LOCATION";
            }
            jjy.a(this.q, this.n, intent, (PendingIntent.OnFinished) this, str);
            return 1;
        } catch (PendingIntent.CanceledException e) {
            d();
            return 3;
        }
    }

    private final void d() {
        synchronized (this.r) {
            if (this.r.e()) {
                try {
                    this.r.c();
                } catch (Exception e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("exception when releasing wakelock ");
                    sb.append(valueOf);
                    Log.e("GCoreFlp", sb.toString());
                }
            }
        }
    }

    public final boolean a() {
        return true;
    }

    public final void b() {
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        d();
    }

    /* access modifiers changed from: protected */
    public final int a(LocationAvailability locationAvailability) {
        return a((List) null, locationAvailability);
    }

    /* access modifiers changed from: protected */
    public final int a(List list) {
        return a(list, (LocationAvailability) null);
    }
}
