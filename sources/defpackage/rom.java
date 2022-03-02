package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@Deprecated
/* renamed from: rom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rom implements ica, icb {
    public static final Object a = new Object();
    public final icc b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final rfw d = ren.c;
    private boolean e = false;

    public rom(Context context) {
        ibz ibz = new ibz(context);
        ibz.a(ren.a);
        ibz.a((icb) this);
        ibz.a((ica) this);
        this.b = ibz.b();
    }

    private final void b(Object obj, rol rol) {
        long clearCallingIdentity;
        try {
            clearCallingIdentity = Binder.clearCallingIdentity();
            rol.a().a((icm) new roj(this, rol, obj));
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (IllegalStateException e2) {
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public final void a() {
        synchronized (this.b) {
            this.e = true;
            this.b.e();
        }
    }

    public final Location c() {
        return rfw.a(this.b);
    }

    public final LocationAvailability d() {
        try {
            rgr rgr = ren.a(this.b).u;
            rgr.e.a();
            return rgr.e.b().c(rgr.a.getPackageName());
        } catch (Exception e2) {
            return null;
        }
    }

    public final void g(Bundle bundle) {
        ArrayList arrayList;
        synchronized (this.c) {
            arrayList = new ArrayList(this.c.entrySet());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) arrayList.get(i);
            b(entry.getKey(), (rol) entry.getValue());
        }
    }

    public final void a(int i) {
        Log.e("FlpInternalHelper", "Connection suspended within location process for FLP connection");
    }

    public final void a(PendingIntent pendingIntent) {
        a((Object) pendingIntent, (rol) new rog(this, pendingIntent));
    }

    public final void b() {
        synchronized (this.b) {
            this.e = false;
            this.b.g();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        Log.wtf("FlpInternalHelper", "Failed to connect to FLP from within location process", new Exception());
    }

    public final void a(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
        a((Object) pendingIntent, (rol) new roe(this, locationRequestInternal, pendingIntent));
    }

    public final void a(LocationRequestInternal locationRequestInternal, reh reh, Looper looper) {
        a((Object) reh, (rol) new rod(this, locationRequestInternal, reh, looper));
    }

    public final void a(Object obj, rol rol) {
        synchronized (this.c) {
            this.c.put(obj, rol);
        }
        if (this.b.i()) {
            b(obj, rol);
            return;
        }
        synchronized (this.b) {
            if (this.e && !this.b.j()) {
                this.b.e();
            }
        }
    }

    public final void a(reh reh) {
        a((Object) reh, (rol) new rof(this, reh));
    }
}
