package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.event.EventEntity;

/* renamed from: nlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nlz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new EventEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        PlayerEntity playerEntity = null;
        String str5 = null;
        long j = 0;
        boolean z = false;
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
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 5:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    playerEntity = (PlayerEntity) ivw.a(parcel2, readInt, PlayerEntity.CREATOR);
                    break;
                case 7:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 8:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    z = ivw.c(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new EventEntity(str, str2, str3, uri, str4, playerEntity, j, str5, z);
    }
}
