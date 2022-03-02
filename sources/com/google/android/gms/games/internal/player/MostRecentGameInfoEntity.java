package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MostRecentGameInfoEntity extends GamesAbstractSafeParcelable implements MostRecentGameInfo {
    public static final Parcelable.Creator CREATOR = new nms();
    public final String a;
    public final String b;
    public final long c;
    public final Uri d;
    public final Uri e;
    public final Uri f;

    public MostRecentGameInfoEntity(MostRecentGameInfo mostRecentGameInfo) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity = (MostRecentGameInfoEntity) mostRecentGameInfo;
        this.a = mostRecentGameInfoEntity.a;
        this.b = mostRecentGameInfoEntity.b;
        this.c = mostRecentGameInfoEntity.c;
        this.d = mostRecentGameInfoEntity.d;
        this.e = mostRecentGameInfoEntity.e;
        this.f = mostRecentGameInfoEntity.f;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final Uri d() {
        return this.d;
    }

    public final Uri e() {
        return this.e;
    }

    public final Uri f() {
        return this.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public MostRecentGameInfoEntity(String str, String str2, long j, Uri uri, Uri uri2, Uri uri3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = uri;
        this.e = uri2;
        this.f = uri3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MostRecentGameInfo) {
            if (this == obj) {
                return true;
            }
            MostRecentGameInfo mostRecentGameInfo = (MostRecentGameInfo) obj;
            if (!ius.a(mostRecentGameInfo.a(), this.a) || !ius.a(mostRecentGameInfo.b(), this.b) || !ius.a(Long.valueOf(mostRecentGameInfo.c()), Long.valueOf(this.c)) || !ius.a(mostRecentGameInfo.d(), this.d) || !ius.a(mostRecentGameInfo.e(), this.e) || !ius.a(mostRecentGameInfo.f(), this.f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("GameId", this.a);
        a2.a("GameName", this.b);
        a2.a("ActivityTimestampMillis", Long.valueOf(this.c));
        a2.a("GameIconUri", this.d);
        a2.a("GameHiResUri", this.e);
        a2.a("GameFeaturedUri", this.f);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, i, false);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.a(parcel, 6, this.f, i, false);
        ivx.b(parcel, a2);
    }
}
