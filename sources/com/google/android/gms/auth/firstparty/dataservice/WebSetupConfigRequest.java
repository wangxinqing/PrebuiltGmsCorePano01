package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class WebSetupConfigRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gdh();
    final int a;
    public final AppDescription b;

    public WebSetupConfigRequest(int i, AppDescription appDescription) {
        this.a = i;
        iva.a((Object) appDescription);
        this.b = appDescription;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
