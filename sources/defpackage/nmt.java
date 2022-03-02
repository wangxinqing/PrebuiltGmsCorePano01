package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;
import org.chromium.net.UrlRequest;

/* renamed from: nmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nmt implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ProfileSettingsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        Status status = null;
        String str = null;
        StockProfileImageEntity stockProfileImageEntity = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    status = (Status) ivw.a(parcel2, readInt, Status.CREATOR);
                    break;
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 4:
                    z2 = ivw.c(parcel2, readInt);
                    break;
                case 5:
                    z3 = ivw.c(parcel2, readInt);
                    break;
                case 6:
                    stockProfileImageEntity = (StockProfileImageEntity) ivw.a(parcel2, readInt, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    z4 = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    z5 = ivw.c(parcel2, readInt);
                    break;
                case 9:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 10:
                    z6 = ivw.c(parcel2, readInt);
                    break;
                case 11:
                    z7 = ivw.c(parcel2, readInt);
                    break;
                case 12:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ProfileSettingsEntity(status, str, z, z2, z3, stockProfileImageEntity, z4, z5, i, z6, z7, i2, i3);
    }
}
