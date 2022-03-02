package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* renamed from: nmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nmv extends nmw {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    public final InvitationEntity a(Parcel parcel) {
        if (!GamesDowngradeableSafeParcel.a(DowngradeableSafeParcel.aW())) {
            InvitationEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.aX()) {
                GameEntity gameEntity = (GameEntity) GameEntity.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                long readLong = parcel.readLong();
                int readInt = parcel.readInt();
                ParticipantEntity participantEntity = (ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel);
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i = 0; i < readInt2; i++) {
                    arrayList.add((ParticipantEntity) ParticipantEntity.CREATOR.createFromParcel(parcel));
                }
                return new InvitationEntity(gameEntity, readString, readLong, readInt, participantEntity, arrayList, -1, 0);
            }
        }
        return super.createFromParcel(parcel);
    }
}
