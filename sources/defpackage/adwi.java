package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: adwi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adwi implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        ArrayList a = jhx.a();
        ArrayList a2 = jhx.a();
        ArrayList a3 = jhx.a();
        ArrayList arrayList = a;
        ArrayList arrayList2 = a2;
        ArrayList arrayList3 = a3;
        ArrayList a4 = jhx.a();
        ArrayList a5 = jhx.a();
        ArrayList a6 = jhx.a();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    str8 = ivw.q(parcel2, readInt);
                    break;
                case 10:
                    str9 = ivw.q(parcel2, readInt);
                    break;
                case 11:
                    str10 = ivw.q(parcel2, readInt);
                    break;
                case 12:
                    i = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    arrayList = ivw.c(parcel2, readInt, WalletObjectMessage.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    timeInterval = (TimeInterval) ivw.a(parcel2, readInt, TimeInterval.CREATOR);
                    break;
                case Service.START_CONTINUATION_MASK:
                    arrayList2 = ivw.c(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = ivw.q(parcel2, readInt);
                    break;
                case 17:
                    str12 = ivw.q(parcel2, readInt);
                    break;
                case 18:
                    arrayList3 = ivw.c(parcel2, readInt, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 20:
                    a4 = ivw.c(parcel2, readInt, UriData.CREATOR);
                    break;
                case 21:
                    a5 = ivw.c(parcel2, readInt, TextModuleData.CREATOR);
                    break;
                case 22:
                    a6 = ivw.c(parcel2, readInt, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) ivw.a(parcel2, readInt, LoyaltyPoints.CREATOR);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, arrayList, timeInterval, arrayList2, str11, str12, arrayList3, z, a4, a5, a6, loyaltyPoints);
    }
}
