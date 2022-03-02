package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;
import org.chromium.net.UrlRequest;

/* renamed from: twy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class twy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BatteryAdvertisement[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        byte[] bArr = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        Uri uri4 = null;
        String str6 = null;
        double d = 0.0d;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 2:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    d = ivw.n(parcel2, readInt);
                    break;
                case 5:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 6:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 11:
                    uri2 = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 12:
                    uri3 = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    uri4 = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new BatteryAdvertisement(str, bArr, z, d, j, str2, str3, str4, str5, uri, uri2, uri3, uri4, j2, str6);
    }
}
