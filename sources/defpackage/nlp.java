package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;

/* renamed from: nlp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nlp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlayerLevelInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        PlayerLevel playerLevel = null;
        PlayerLevel playerLevel2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                j = ivw.i(parcel, readInt);
            } else if (a == 2) {
                j2 = ivw.i(parcel, readInt);
            } else if (a == 3) {
                playerLevel = (PlayerLevel) ivw.a(parcel, readInt, PlayerLevel.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                playerLevel2 = (PlayerLevel) ivw.a(parcel, readInt, PlayerLevel.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new PlayerLevelInfo(j, j2, playerLevel, playerLevel2);
    }
}
