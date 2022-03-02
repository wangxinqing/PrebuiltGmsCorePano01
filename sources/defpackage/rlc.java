package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.places.personalized.UserPlacesResult;

/* renamed from: rlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rlc extends bhw implements rld {
    private final rli a;

    public rlc() {
        super("com.google.android.gms.location.places.personalized.IUserPlacesCallbacks");
    }

    public final void a(UserPlacesResult userPlacesResult) {
        this.a.a((icl) userPlacesResult);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a((UserPlacesResult) bhx.a(parcel, UserPlacesResult.CREATOR));
        return true;
    }

    public rlc(rli rli) {
        super("com.google.android.gms.location.places.personalized.IUserPlacesCallbacks");
        this.a = rli;
    }
}
