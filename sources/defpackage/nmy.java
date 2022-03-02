package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;

/* renamed from: nmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nmy implements Parcelable.Creator {
    /* renamed from: a */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        PlayerEntity playerEntity = null;
        ParticipantResult participantResult = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
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
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 5:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 6:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 8:
                    playerEntity = (PlayerEntity) ivw.a(parcel2, readInt, PlayerEntity.CREATOR);
                    break;
                case 9:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 10:
                    participantResult = (ParticipantResult) ivw.a(parcel2, readInt, ParticipantResult.CREATOR);
                    break;
                case 11:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 12:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ParticipantEntity(str, str2, uri, uri2, i, str3, z, playerEntity, i2, participantResult, str4, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
