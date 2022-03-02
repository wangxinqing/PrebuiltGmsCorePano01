package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: aidb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aidb extends aidd implements IBinder.DeathRecipient {
    private final ref q;

    public aidb(Context context, int i, String str, LocationRequestInternal locationRequestInternal, boolean z, boolean z2, aicz aicz, ref ref) {
        super(context, i, str, locationRequestInternal, z, z2, aicz);
        this.q = ref;
        try {
            ref.asBinder().linkToDeath(this, 0);
        } catch (RemoteException e) {
            aicz.a();
        }
    }

    /* access modifiers changed from: protected */
    public final int a(LocationAvailability locationAvailability) {
        return 1;
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
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Location location = (Location) it.next();
                if (this.a == jhg.a) {
                    location = new Location(location);
                }
                this.q.a(location);
            }
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
