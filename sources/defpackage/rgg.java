package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;

/* renamed from: rgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class rgg extends bhw implements rgh {
    public rgg() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.readInt(), parcel.createStringArray());
        } else if (i == 2) {
            b(parcel.readInt(), parcel.createStringArray());
        } else if (i != 3) {
            return false;
        } else {
            a(parcel.readInt(), (PendingIntent) bhx.a(parcel, PendingIntent.CREATOR));
        }
        return true;
    }
}
