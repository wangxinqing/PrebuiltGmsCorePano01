package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdh.MdhFootprintsReadResult;

/* renamed from: ryh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ryh implements wkl {
    private final int a;

    public ryh(int i) {
        this.a = i;
    }

    public final void a(SafeParcelable safeParcelable, Parcel parcel) {
        int i = this.a;
        MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) safeParcelable;
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, mdhFootprintsReadResult.a, false);
        ivx.a(parcel, 2, mdhFootprintsReadResult.b, i, false);
        ivx.b(parcel, a2);
    }
}
