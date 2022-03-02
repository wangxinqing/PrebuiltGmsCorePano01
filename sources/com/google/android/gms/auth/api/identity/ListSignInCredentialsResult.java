package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ListSignInCredentialsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsl();
    public final List a;

    public ListSignInCredentialsResult(List list) {
        iva.b(!list.isEmpty(), "An error status should be returned if no qualified credentials were found.");
        this.a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
