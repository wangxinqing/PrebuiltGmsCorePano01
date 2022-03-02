package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.personalized.UserPlacesResult;

/* renamed from: rlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlb extends bhv implements rld {
    public rlb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.personalized.IUserPlacesCallbacks");
    }

    public final void a(UserPlacesResult userPlacesResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) userPlacesResult);
        c(2, aQ);
    }
}
