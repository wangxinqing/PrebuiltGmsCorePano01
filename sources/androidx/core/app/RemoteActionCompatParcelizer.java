package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import android.support.v4.app.RemoteActionCompat;
import android.support.v4.graphics.drawable.IconCompat;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(atl atl) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) atl.b((atq) remoteActionCompat.a, 1);
        remoteActionCompat.b = atl.b(remoteActionCompat.b, 2);
        remoteActionCompat.c = atl.b(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) atl.b((Parcelable) remoteActionCompat.d, 4);
        remoteActionCompat.e = atl.b(remoteActionCompat.e, 5);
        remoteActionCompat.f = atl.b(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, atl atl) {
        atl.a(false, false);
        atl.a((atq) remoteActionCompat.a, 1);
        atl.a(remoteActionCompat.b, 2);
        atl.a(remoteActionCompat.c, 3);
        atl.a((Parcelable) remoteActionCompat.d, 4);
        atl.a(remoteActionCompat.e, 5);
        atl.a(remoteActionCompat.f, 6);
    }
}
