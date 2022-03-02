package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlayerLevelInfo extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nlp();
    public final long a;
    public final long b;
    public final PlayerLevel c;
    public final PlayerLevel d;

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        iva.a(j != -1);
        iva.a((Object) playerLevel);
        iva.a((Object) playerLevel2);
        this.a = j;
        this.b = j2;
        this.c = playerLevel;
        this.d = playerLevel2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return ius.a(Long.valueOf(this.a), Long.valueOf(playerLevelInfo.a)) && ius.a(Long.valueOf(this.b), Long.valueOf(playerLevelInfo.b)) && ius.a(this.c, playerLevelInfo.c) && ius.a(this.d, playerLevelInfo.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
