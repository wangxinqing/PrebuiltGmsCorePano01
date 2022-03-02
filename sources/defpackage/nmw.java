package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* renamed from: nmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nmw implements Parcelable.Creator {
    /* renamed from: a */
    public InvitationEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        GameEntity gameEntity = null;
        String str = null;
        ParticipantEntity participantEntity = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    gameEntity = (GameEntity) ivw.a(parcel2, readInt, GameEntity.CREATOR);
                    break;
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 4:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 5:
                    participantEntity = (ParticipantEntity) ivw.a(parcel2, readInt, ParticipantEntity.CREATOR);
                    break;
                case 6:
                    arrayList = ivw.c(parcel2, readInt, ParticipantEntity.CREATOR);
                    break;
                case 7:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 8:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new InvitationEntity(gameEntity, str, j, i, participantEntity, arrayList, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InvitationEntity[i];
    }
}
