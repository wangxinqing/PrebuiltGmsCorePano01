package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import java.util.ArrayList;

/* renamed from: nnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nnc extends nnd {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    public final RoomEntity a(Parcel parcel) {
        if (!GamesDowngradeableSafeParcel.a(DowngradeableSafeParcel.aW())) {
            RoomEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.aX()) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                long readLong = parcel.readLong();
                int readInt = parcel.readInt();
                String readString3 = parcel.readString();
                int readInt2 = parcel.readInt();
                Bundle readBundle = parcel.readBundle();
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                for (int i = 0; i < readInt3; i++) {
                    arrayList.add((ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel));
                }
                return new RoomEntity(readString, readString2, readLong, readInt, readString3, readInt2, readBundle, arrayList, -1);
            }
        }
        return super.createFromParcel(parcel);
    }
}
