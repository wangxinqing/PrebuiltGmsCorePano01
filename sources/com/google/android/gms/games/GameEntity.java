package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    public static final Parcelable.Creator CREATOR = new nlc();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Uri g;
    public final Uri h;
    public final Uri i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final int m;
    public final int n;
    public final int o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final String s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final boolean y;

    public GameEntity(Game game) {
        GameEntity gameEntity = (GameEntity) game;
        this.a = gameEntity.a;
        this.c = gameEntity.c;
        this.d = gameEntity.d;
        this.e = gameEntity.e;
        this.f = gameEntity.f;
        this.b = gameEntity.b;
        this.g = gameEntity.g;
        this.r = gameEntity.r;
        this.h = gameEntity.h;
        this.s = gameEntity.s;
        this.i = gameEntity.i;
        this.t = gameEntity.t;
        this.j = gameEntity.j;
        this.k = gameEntity.k;
        this.l = gameEntity.l;
        this.m = 1;
        this.n = gameEntity.n;
        this.o = gameEntity.o;
        this.p = gameEntity.p;
        this.q = gameEntity.q;
        this.u = gameEntity.u;
        this.v = gameEntity.v;
        this.w = gameEntity.w;
        this.x = gameEntity.x;
        this.y = gameEntity.y;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final Uri g() {
        return this.g;
    }

    public final Uri h() {
        return this.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), this.l, Integer.valueOf(this.n), Integer.valueOf(this.o), Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.u), Boolean.valueOf(this.v), Boolean.valueOf(this.w), this.x, Boolean.valueOf(this.y)});
    }

    public final Uri i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final boolean k() {
        return this.u;
    }

    public final boolean l() {
        return this.v;
    }

    public final boolean m() {
        return this.k;
    }

    public final String n() {
        return this.l;
    }

    public final int o() {
        return this.n;
    }

    public final int p() {
        return this.o;
    }

    public final boolean q() {
        return this.p;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean s() {
        return this.q;
    }

    public final boolean t() {
        return this.w;
    }

    public final String u() {
        return this.x;
    }

    public final boolean v() {
        return this.y;
    }

    public GameEntity(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Uri uri2, Uri uri3, boolean z, boolean z2, String str7, int i2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, String str10, boolean z5, boolean z6, boolean z7, String str11, boolean z8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = uri;
        this.r = str8;
        this.h = uri2;
        this.s = str9;
        this.i = uri3;
        this.t = str10;
        this.j = z;
        this.k = z2;
        this.l = str7;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = z3;
        this.q = z4;
        this.u = z5;
        this.v = z6;
        this.w = z7;
        this.x = str11;
        this.y = z8;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Game) {
            if (this == obj) {
                return true;
            }
            Game game = (Game) obj;
            if (!ius.a(game.a(), this.a) || !ius.a(game.b(), this.b) || !ius.a(game.c(), this.c) || !ius.a(game.d(), this.d) || !ius.a(game.e(), this.e) || !ius.a(game.f(), this.f) || !ius.a(game.g(), this.g) || !ius.a(game.h(), this.h) || !ius.a(game.i(), this.i) || !ius.a(Boolean.valueOf(game.j()), Boolean.valueOf(this.j)) || !ius.a(Boolean.valueOf(game.m()), Boolean.valueOf(this.k)) || !ius.a(game.n(), this.l) || !ius.a(Integer.valueOf(game.o()), Integer.valueOf(this.n)) || !ius.a(Integer.valueOf(game.p()), Integer.valueOf(this.o)) || !ius.a(Boolean.valueOf(game.q()), Boolean.valueOf(this.p)) || !ius.a(Boolean.valueOf(game.s()), Boolean.valueOf(this.q)) || !ius.a(Boolean.valueOf(game.k()), Boolean.valueOf(this.u)) || !ius.a(Boolean.valueOf(game.l()), Boolean.valueOf(this.v)) || !ius.a(Boolean.valueOf(game.t()), Boolean.valueOf(this.w)) || !ius.a(game.u(), this.x) || !ius.a(Boolean.valueOf(game.v()), Boolean.valueOf(this.y))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("ApplicationId", this.a);
        a2.a("DisplayName", this.b);
        a2.a("PrimaryCategory", this.c);
        a2.a("SecondaryCategory", this.d);
        a2.a("Description", this.e);
        a2.a("DeveloperName", this.f);
        a2.a("IconImageUri", this.g);
        a2.a("IconImageUrl", this.r);
        a2.a("HiResImageUri", this.h);
        a2.a("HiResImageUrl", this.s);
        a2.a("FeaturedImageUri", this.i);
        a2.a("FeaturedImageUrl", this.t);
        a2.a("PlayEnabledGame", Boolean.valueOf(this.j));
        a2.a("InstanceInstalled", Boolean.valueOf(this.k));
        a2.a("InstancePackageName", this.l);
        a2.a("AchievementTotalCount", Integer.valueOf(this.n));
        a2.a("LeaderboardCount", Integer.valueOf(this.o));
        a2.a("RealTimeMultiplayerEnabled", Boolean.valueOf(this.p));
        a2.a("TurnBasedMultiplayerEnabled", Boolean.valueOf(this.q));
        a2.a("AreSnapshotsEnabled", Boolean.valueOf(this.w));
        a2.a("ThemeColor", this.x);
        a2.a("HasGamepadSupport", Boolean.valueOf(this.y));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, i2, false);
        ivx.a(parcel, 8, this.h, i2, false);
        ivx.a(parcel, 9, this.i, i2, false);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.a(parcel, 12, this.l, false);
        ivx.b(parcel, 13, this.m);
        ivx.b(parcel, 14, this.n);
        ivx.b(parcel, 15, this.o);
        ivx.a(parcel, 16, this.p);
        ivx.a(parcel, 17, this.q);
        ivx.a(parcel, 18, this.r, false);
        ivx.a(parcel, 19, this.s, false);
        ivx.a(parcel, 20, this.t, false);
        ivx.a(parcel, 21, this.u);
        ivx.a(parcel, 22, this.v);
        ivx.a(parcel, 23, this.w);
        ivx.a(parcel, 24, this.x, false);
        ivx.a(parcel, 25, this.y);
        ivx.b(parcel, a2);
    }
}
