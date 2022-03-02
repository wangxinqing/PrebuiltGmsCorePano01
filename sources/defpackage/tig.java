package defpackage;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;
import org.chromium.net.UrlRequest;

/* renamed from: tig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tig implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AdvertisingOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Strategy strategy = null;
        byte[] bArr = null;
        ParcelUuid parcelUuid = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    strategy = (Strategy) ivw.a(parcel2, readInt, Strategy.CREATOR);
                    break;
                case 2:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 3:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case 7:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    parcelUuid = (ParcelUuid) ivw.a(parcel2, readInt, ParcelUuid.CREATOR);
                    break;
                case 9:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case 10:
                    z7 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z8 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    z9 = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z10 = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new AdvertisingOptions(strategy, z, z2, z3, z4, bArr, z5, parcelUuid, z6, z7, z8, z9, z10);
    }
}
