package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.location.RemoveGeofencingRequest;

/* renamed from: rgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgb {
    public static final icf a(icc icc, PendingIntent pendingIntent) {
        return a(icc, RemoveGeofencingRequest.a(pendingIntent));
    }

    public static final icf a(icc icc, RemoveGeofencingRequest removeGeofencingRequest) {
        return icc.b((idf) new rfz(icc, removeGeofencingRequest));
    }
}
