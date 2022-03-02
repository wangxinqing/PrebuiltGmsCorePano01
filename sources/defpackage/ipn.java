package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.download.DownloadDetails;

/* renamed from: ipn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ipn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DownloadDetails[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 4:
                    j = ivw.i(parcel, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    i = ivw.g(parcel, readInt);
                    break;
                case 8:
                    i2 = ivw.g(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new DownloadDetails(str, str2, j, str3, str4, i, i2);
    }
}
