package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: rgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgm extends bhw implements rgn {
    private idg a;

    public rgm() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    public final void a(LocationSettingsResult locationSettingsResult) {
        this.a.a((Object) locationSettingsResult);
        this.a = null;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((LocationSettingsResult) bhx.a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }

    public rgm(idg idg) {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
        boolean z;
        if (idg != null) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "listener can't be null.");
        this.a = idg;
    }
}
