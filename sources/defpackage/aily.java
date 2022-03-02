package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

/* renamed from: aily  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aily extends aimi {
    public final GeofencingRequest a;
    public final PendingIntent b;
    public final ainq c;

    public aily(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, ainq ainq) {
        super(4);
        this.a = geofencingRequest;
        this.b = pendingIntent;
        this.c = ainq;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        ainq ainq = this.c;
        int intValue = ((Integer) b()).intValue();
        List list = this.a.a;
        String[] strArr = new String[list.size()];
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i] = ((ParcelableGeofence) list.get(i2)).a;
            i++;
        }
        rgh rgh = ainq.a;
        if (rgh != null) {
            try {
                rgh.a(intValue, strArr);
            } catch (RemoteException e) {
            }
        }
    }

    public final String toString() {
        return "AddGeofenceRequest[GeofencingRequest=" + this.a + ", pendingIntent=PendingIntent[creatorPackage=" + ajqj.a(this.b) + "]";
    }
}
