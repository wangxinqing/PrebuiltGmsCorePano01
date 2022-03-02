package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;

/* renamed from: rkz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkz extends bhw implements rla {
    private final rkw a;

    public rkz() {
        super("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
    }

    public final void a(AliasedPlacesResult aliasedPlacesResult) {
        this.a.a((icl) aliasedPlacesResult);
    }

    public final void b(AliasedPlacesResult aliasedPlacesResult) {
        this.a.a((icl) aliasedPlacesResult);
    }

    public final void c(AliasedPlacesResult aliasedPlacesResult) {
        this.a.a((icl) aliasedPlacesResult);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((AliasedPlacesResult) bhx.a(parcel, AliasedPlacesResult.CREATOR));
            return true;
        } else if (i == 3) {
            b((AliasedPlacesResult) bhx.a(parcel, AliasedPlacesResult.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            c((AliasedPlacesResult) bhx.a(parcel, AliasedPlacesResult.CREATOR));
            return true;
        }
    }

    public rkz(rkw rkw) {
        super("com.google.android.gms.location.places.personalized.IAliasedPlacesCallbacks");
        this.a = rkw;
    }
}
