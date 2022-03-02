package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.PasswordSettings;
import com.google.android.gms.auth.firstparty.dataservice.PinSettings;
import com.google.android.gms.auth.firstparty.dataservice.ReauthSettingsResponse;

/* renamed from: gcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gcz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReauthSettingsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        PasswordSettings passwordSettings = null;
        PinSettings pinSettings = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 3) {
                passwordSettings = (PasswordSettings) ivw.a(parcel, readInt, PasswordSettings.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                pinSettings = (PinSettings) ivw.a(parcel, readInt, PinSettings.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ReauthSettingsResponse(i, i2, passwordSettings, pinSettings);
    }
}
