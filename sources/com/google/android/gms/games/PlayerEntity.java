package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    public static final Parcelable.Creator CREATOR = new nlm();
    public String a;
    public String b;
    public final Uri c;
    public final Uri d;
    public final long e;
    public final int f;
    public final long g;
    public final String h;
    public final String i;
    public final String j;
    public final MostRecentGameInfoEntity k;
    public final PlayerLevelInfo l;
    public final boolean m;
    public final boolean n;
    public final String o;
    public final String p;
    public final Uri q;
    public final String r;
    public final Uri s;
    public final String t;
    public final int u;
    public final long v;
    public final boolean w;
    public long x;
    public final PlayerRelationshipInfoEntity y;

    public PlayerEntity(Player player) {
        MostRecentGameInfoEntity mostRecentGameInfoEntity;
        PlayerEntity playerEntity = (PlayerEntity) player;
        this.a = playerEntity.a;
        this.b = playerEntity.b;
        this.c = playerEntity.c;
        this.h = playerEntity.h;
        this.d = playerEntity.d;
        this.i = playerEntity.i;
        this.e = playerEntity.e;
        this.f = playerEntity.f;
        this.g = playerEntity.g;
        this.j = playerEntity.j;
        this.m = playerEntity.m;
        MostRecentGameInfoEntity mostRecentGameInfoEntity2 = playerEntity.k;
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity = null;
        if (mostRecentGameInfoEntity2 != null) {
            mostRecentGameInfoEntity = new MostRecentGameInfoEntity(mostRecentGameInfoEntity2);
        } else {
            mostRecentGameInfoEntity = null;
        }
        this.k = mostRecentGameInfoEntity;
        this.l = playerEntity.l;
        this.n = playerEntity.n;
        this.o = playerEntity.o;
        this.p = playerEntity.p;
        this.q = playerEntity.q;
        this.r = playerEntity.r;
        this.s = playerEntity.s;
        this.t = playerEntity.t;
        this.u = playerEntity.u;
        this.v = playerEntity.v;
        this.w = playerEntity.w;
        this.x = playerEntity.x;
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity2 = playerEntity.y;
        this.y = playerRelationshipInfoEntity2 != null ? playerRelationshipInfoEntity2 : playerRelationshipInfoEntity;
        irk.b(this.a);
        irk.b(this.b);
        irk.a(this.e > 0);
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.o;
    }

    public final String d() {
        return this.p;
    }

    public final boolean e() {
        return this.n;
    }

    public final Uri f() {
        return this.c;
    }

    public final Uri g() {
        return this.d;
    }

    public final long h() {
        return this.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.n), this.c, this.d, Long.valueOf(this.e), this.j, this.l, this.o, this.p, this.q, this.s, Integer.valueOf(this.u), Long.valueOf(this.v), Boolean.valueOf(this.w), Long.valueOf(this.x), this.y});
    }

    public final String i() {
        return this.j;
    }

    public final PlayerLevelInfo j() {
        return this.l;
    }

    public final Uri k() {
        return this.q;
    }

    public final Uri l() {
        return this.s;
    }

    public final int m() {
        return this.u;
    }

    public final long n() {
        return this.v;
    }

    public final boolean o() {
        return this.w;
    }

    public final long p() {
        return this.x;
    }

    public final PlayerRelationshipInfo q() {
        return this.y;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Player) {
            if (this == obj) {
                return true;
            }
            Player player = (Player) obj;
            if (!ius.a(player.a(), this.a) || !ius.a(player.b(), this.b) || !ius.a(Boolean.valueOf(player.e()), Boolean.valueOf(this.n)) || !ius.a(player.f(), this.c) || !ius.a(player.g(), this.d) || !ius.a(Long.valueOf(player.h()), Long.valueOf(this.e)) || !ius.a(player.i(), this.j) || !ius.a(player.j(), this.l) || !ius.a(player.c(), this.o) || !ius.a(player.d(), this.p) || !ius.a(player.k(), this.q) || !ius.a(player.l(), this.s) || !ius.a(Integer.valueOf(player.m()), Integer.valueOf(this.u)) || !ius.a(Long.valueOf(player.n()), Long.valueOf(this.v)) || !ius.a(Boolean.valueOf(player.o()), Boolean.valueOf(this.w)) || !ius.a(Long.valueOf(player.p()), Long.valueOf(this.x)) || !ius.a(player.q(), this.y)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("PlayerId", this.a);
        a2.a("DisplayName", this.b);
        a2.a("HasDebugAccess", Boolean.valueOf(this.n));
        a2.a("IconImageUri", this.c);
        a2.a("IconImageUrl", this.h);
        a2.a("HiResImageUri", this.d);
        a2.a("HiResImageUrl", this.i);
        a2.a("RetrievedTimestamp", Long.valueOf(this.e));
        a2.a("Title", this.j);
        a2.a("LevelInfo", this.l);
        a2.a("GamerTag", this.o);
        a2.a("Name", this.p);
        a2.a("BannerImageLandscapeUri", this.q);
        a2.a("BannerImageLandscapeUrl", this.r);
        a2.a("BannerImagePortraitUri", this.s);
        a2.a("BannerImagePortraitUrl", this.t);
        a2.a("GamerFriendStatus", Integer.valueOf(this.u));
        a2.a("GamerFriendUpdateTimestamp", Long.valueOf(this.v));
        a2.a("IsMuted", Boolean.valueOf(this.w));
        a2.a("totalUnlockedAchievement", Long.valueOf(this.x));
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity = this.y;
        if (playerRelationshipInfoEntity != null) {
            a2.a("RelationshipInfo", playerRelationshipInfoEntity);
        }
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i2, false);
        ivx.a(parcel, 4, this.d, i2, false);
        ivx.a(parcel, 5, this.e);
        ivx.b(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 14, this.j, false);
        ivx.a(parcel, 15, this.k, i2, false);
        ivx.a(parcel, 16, this.l, i2, false);
        ivx.a(parcel, 18, this.m);
        ivx.a(parcel, 19, this.n);
        ivx.a(parcel, 20, this.o, false);
        ivx.a(parcel, 21, this.p, false);
        ivx.a(parcel, 22, this.q, i2, false);
        ivx.a(parcel, 23, this.r, false);
        ivx.a(parcel, 24, this.s, i2, false);
        ivx.a(parcel, 25, this.t, false);
        ivx.b(parcel, 26, this.u);
        ivx.a(parcel, 27, this.v);
        ivx.a(parcel, 28, this.w);
        ivx.a(parcel, 29, this.x);
        ivx.a(parcel, 33, this.y, i2, false);
        ivx.b(parcel, a2);
    }

    public PlayerEntity(String str, String str2, Uri uri, Uri uri2, long j2, int i2, long j3, String str3, String str4, String str5, MostRecentGameInfoEntity mostRecentGameInfoEntity, PlayerLevelInfo playerLevelInfo, boolean z, boolean z2, String str6, String str7, Uri uri3, String str8, Uri uri4, String str9, int i3, long j4, boolean z3, long j5, PlayerRelationshipInfoEntity playerRelationshipInfoEntity) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.h = str3;
        this.d = uri2;
        this.i = str4;
        this.e = j2;
        this.f = i2;
        this.g = j3;
        this.j = str5;
        this.m = z;
        this.k = mostRecentGameInfoEntity;
        this.l = playerLevelInfo;
        this.n = z2;
        this.o = str6;
        this.p = str7;
        this.q = uri3;
        this.r = str8;
        this.s = uri4;
        this.t = str9;
        this.u = i3;
        this.v = j4;
        this.w = z3;
        this.x = j5;
        this.y = playerRelationshipInfoEntity;
    }
}
