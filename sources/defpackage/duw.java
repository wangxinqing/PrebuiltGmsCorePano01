package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;

/* renamed from: duw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class duw extends bhw implements dux {
    private final acwd a;

    public duw() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    public final void a(GetRecentContextCall$Response getRecentContextCall$Response) {
        ihd.a(getRecentContextCall$Response.a, getRecentContextCall$Response.b, this.a);
    }

    public final void a(Status status) {
        ihd.a(status, (Object) null, this.a);
    }

    public duw(acwd acwd) {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        this.a = acwd;
    }

    public final void a(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        ihd.a(status, parcelFileDescriptor, this.a);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR));
        } else if (i == 2) {
            a((Status) bhx.a(parcel, Status.CREATOR), (ParcelFileDescriptor) bhx.a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            a((GetRecentContextCall$Response) bhx.a(parcel, GetRecentContextCall$Response.CREATOR));
        }
        return true;
    }
}
