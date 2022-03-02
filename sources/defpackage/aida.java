package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: aida  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aida extends aidd implements IBinder.DeathRecipient {
    private final rec q;

    public aida(Context context, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, aicz aicz, rec rec) {
        super(context, i, str, locationRequestInternal, z, z2, aicz);
        this.q = rec;
        try {
            rec.asBinder().linkToDeath(this, 0);
        } catch (RemoteException e) {
            aicz.a();
        }
    }

    /* access modifiers changed from: protected */
    public final int a(LocationAvailability locationAvailability) {
        try {
            this.q.a(locationAvailability);
            return 1;
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("client died while calling listener ");
            sb.append(valueOf);
            Log.e("GCoreFlp", sb.toString());
            return 2;
        }
    }

    public final boolean a() {
        return false;
    }

    public final void b() {
        try {
            this.q.asBinder().unlinkToDeath(this, 0);
        } catch (NoSuchElementException e) {
            Log.e("GCoreFlp", "Tried to remove a death link to a binder that didn't exist.");
        }
    }

    public final void binderDied() {
        this.o.a();
    }

    /* access modifiers changed from: protected */
    public final int a(List list) {
        if (this.a == jhg.a) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new Location((Location) list.get(i)));
            }
            list = arrayList;
        }
        try {
            this.q.a(LocationResult.a(list));
            return 1;
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("client died while calling listener ");
            sb.append(valueOf);
            Log.e("GCoreFlp", sb.toString());
            return 2;
        }
    }
}
