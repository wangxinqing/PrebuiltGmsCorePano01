package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.ResolutionData;

/* renamed from: eiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eiq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ResolutionData[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        BrowserResolutionCookie[] browserResolutionCookieArr = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 4) {
                str2 = ivw.q(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                browserResolutionCookieArr = (BrowserResolutionCookie[]) ivw.b(parcel, readInt, BrowserResolutionCookie.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ResolutionData(i, str, i2, str2, browserResolutionCookieArr);
    }
}
