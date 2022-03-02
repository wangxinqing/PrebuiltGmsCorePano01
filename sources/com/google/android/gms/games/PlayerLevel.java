package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlayerLevel extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nlo();
    public final int a;
    public final long b;
    public final long c;

    public PlayerLevel(int i, long j, long j2) {
        boolean z = true;
        iva.a(j >= 0, (Object) "Min XP must be positive!");
        iva.a(j2 <= j ? false : z, (Object) "Max XP must be more than min XP!");
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return ius.a(Integer.valueOf(playerLevel.a), Integer.valueOf(this.a)) && ius.a(Long.valueOf(playerLevel.b), Long.valueOf(this.b)) && ius.a(Long.valueOf(playerLevel.c), Long.valueOf(this.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("LevelNumber", Integer.valueOf(this.a));
        a2.a("MinXp", Long.valueOf(this.b));
        a2.a("MaxXp", Long.valueOf(this.c));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
