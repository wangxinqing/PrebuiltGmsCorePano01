package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.experience.ExperienceEventEntity;

/* renamed from: nmo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nmo implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExperienceEventEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        GameEntity gameEntity = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 2:
                    gameEntity = (GameEntity) ivw.a(parcel2, readInt, GameEntity.CREATOR);
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
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 7:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 8:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 9:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case 10:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 11:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new ExperienceEventEntity(str, gameEntity, str2, str3, str4, uri, j, j2, j3, i, i2);
    }
}
