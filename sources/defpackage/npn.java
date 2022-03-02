package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;

/* renamed from: npn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npn extends bhv implements npp {
    public npn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final GassResponseParcel a(GassRequestParcel gassRequestParcel) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) gassRequestParcel);
        Parcel a = a(1, aQ);
        GassResponseParcel gassResponseParcel = (GassResponseParcel) bhx.a(a, GassResponseParcel.CREATOR);
        a.recycle();
        return gassResponseParcel;
    }

    public final ProgramResponse a(ProgramRequest programRequest) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) programRequest);
        Parcel a = a(3, aQ);
        ProgramResponse programResponse = (ProgramResponse) bhx.a(a, ProgramResponse.CREATOR);
        a.recycle();
        return programResponse;
    }
}
