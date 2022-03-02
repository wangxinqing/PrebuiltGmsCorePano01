package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.BrowserResolutionCookie;

/* renamed from: ehy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ehy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BrowserResolutionCookie[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = "/";
        long j = -1;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 2:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 6:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 7:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new BrowserResolutionCookie(str, str2, str3, str4, j, z, z2);
    }
}
