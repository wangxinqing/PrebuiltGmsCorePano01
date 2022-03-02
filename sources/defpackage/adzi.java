package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import org.chromium.net.UrlRequest;

/* renamed from: adzi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adzi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AncsNotificationParcelable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    b2 = ivw.e(parcel2, readInt);
                    break;
                case 10:
                    b3 = ivw.e(parcel2, readInt);
                    break;
                case 11:
                    b4 = ivw.e(parcel2, readInt);
                    break;
                case 12:
                    b5 = ivw.e(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new AncsNotificationParcelable(i, str, str2, str3, str4, str5, str6, b2, b3, b4, b5, str7);
    }
}
