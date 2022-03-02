package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.stats.ConnectionEvent;
import org.chromium.net.UrlRequest;

/* renamed from: jbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jbw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ConnectionEvent[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 2:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 11:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case 12:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ConnectionEvent(i, j, i2, str, str2, str3, str4, str5, str6, j2, j3);
    }
}
