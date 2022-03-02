package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ParticipantResult extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new nmz();
    public final String a;
    public final int b;
    public final int c;

    public ParticipantResult(String str, int i, int i2) {
        iva.a((Object) str);
        this.a = str;
        boolean z = true;
        if (!(i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5)) {
            z = false;
        }
        iva.a(z);
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParticipantResult)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ParticipantResult participantResult = (ParticipantResult) obj;
        return participantResult.c == this.c && participantResult.b == this.b && ius.a(participantResult.a, this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.b), this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
