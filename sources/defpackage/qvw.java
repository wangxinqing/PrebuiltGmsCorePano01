package defpackage;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: qvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class qvw implements LocationListener {
    private final qvs a;

    public qvw(String str, String str2) {
        qvs qvs = null;
        if (qvu.c != null && ((Boolean) axdc.w.c()).booleanValue()) {
            qvs = qvu.d.a(getClass(), 23, str, str2);
        }
        this.a = qvs;
    }

    /* access modifiers changed from: protected */
    public abstract void a(Location location);

    public final void onLocationChanged(Location location) {
        amky amky;
        qvs qvs = this.a;
        if (qvs != null) {
            amky = qvs.b("onLocationChanged");
        } else {
            amky = null;
        }
        try {
            a(location);
            if (amky != null) {
                amky.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final void onProviderDisabled(String str) {
        amky amky;
        qvs qvs = this.a;
        if (qvs != null) {
            amky = qvs.b("onProviderDisabled");
        } else {
            amky = null;
        }
        if (amky != null) {
            amky.close();
        }
    }

    public final void onProviderEnabled(String str) {
        amky amky;
        qvs qvs = this.a;
        if (qvs != null) {
            amky = qvs.b("onProviderEnabled");
        } else {
            amky = null;
        }
        if (amky != null) {
            amky.close();
        }
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
        amky amky;
        qvs qvs = this.a;
        if (qvs != null) {
            amky = qvs.b("onStatusChanged");
        } else {
            amky = null;
        }
        if (amky != null) {
            amky.close();
        }
    }
}
