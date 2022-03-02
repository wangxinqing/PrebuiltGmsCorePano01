package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements GameBadge {
    public static final Parcelable.Creator CREATOR = new nmp();
    public int a;
    public String b;
    public String c;
    public Uri d;

    public GameBadgeEntity(int i, String str, String str2, Uri uri) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = uri;
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GameBadge) {
            if (this == obj) {
                return true;
            }
            GameBadge gameBadge = (GameBadge) obj;
            if (!ius.a(Integer.valueOf(gameBadge.a()), this.b) || !ius.a(gameBadge.b(), this.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Type", Integer.valueOf(this.a));
        a2.a("Title", this.b);
        a2.a("Description", this.c);
        a2.a("IconImageUri", this.d);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
