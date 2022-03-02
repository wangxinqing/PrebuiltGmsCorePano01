package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import java.util.ArrayList;

/* renamed from: nnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nnd implements Parcelable.Creator {
    /* renamed from: a */
    public RoomEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
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
                    j = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 7:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 8:
                    arrayList = ivw.c(parcel2, readInt, ParticipantEntity.CREATOR);
                    break;
                case 9:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new RoomEntity(str, str2, j, i, str3, i2, bundle, arrayList, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RoomEntity[i];
    }
}
