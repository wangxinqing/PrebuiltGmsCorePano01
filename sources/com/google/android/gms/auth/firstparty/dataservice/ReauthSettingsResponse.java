package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ReauthSettingsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcz();
    final int a;
    public final int b;
    public final PasswordSettings c;
    public final PinSettings d;

    public ReauthSettingsResponse(int i) {
        this(1, i, (PasswordSettings) null, (PinSettings) null);
    }

    public ReauthSettingsResponse(int i, int i2, PasswordSettings passwordSettings, PinSettings pinSettings) {
        this.a = i;
        this.b = i2;
        this.c = passwordSettings;
        this.d = pinSettings;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
