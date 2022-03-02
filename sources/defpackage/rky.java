package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;

/* renamed from: rky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rky extends bhv implements rla {
    public rky(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
    }

    public final void a(AliasedPlacesResult aliasedPlacesResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) aliasedPlacesResult);
        c(2, aQ);
    }

    public final void b(AliasedPlacesResult aliasedPlacesResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) aliasedPlacesResult);
        c(3, aQ);
    }

    public final void c(AliasedPlacesResult aliasedPlacesResult) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) aliasedPlacesResult);
        c(4, aQ);
    }
}
