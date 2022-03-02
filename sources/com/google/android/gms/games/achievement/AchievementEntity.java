package com.google.android.gms.games.achievement;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AchievementEntity extends GamesAbstractSafeParcelable implements Achievement {
    public static final Parcelable.Creator CREATOR = new nls();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final Uri g;
    public final String h;
    public final int i;
    public final String j;
    public final PlayerEntity k;
    public final int l;
    public final int m;
    public final String n;
    public final long o;
    public final long p;
    public final float q;
    public final String r;

    public AchievementEntity(String str, int i2, String str2, String str3, Uri uri, String str4, Uri uri2, String str5, int i3, String str6, PlayerEntity playerEntity, int i4, int i5, String str7, long j2, long j3, float f2, String str8) {
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = uri2;
        this.h = str5;
        this.i = i3;
        this.j = str6;
        this.k = playerEntity;
        this.l = i4;
        this.m = i5;
        this.n = str7;
        this.o = j2;
        this.p = j3;
        this.q = f2;
        this.r = str8;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.r;
    }

    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final int f() {
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        irk.a(z);
        return this.i;
    }

    public final Player g() {
        return this.k;
    }

    public final int h() {
        return this.l;
    }

    public final int hashCode() {
        int i2;
        int i3;
        if (this.b == 1) {
            i3 = i();
            i2 = f();
        } else {
            i3 = 0;
            i2 = 0;
        }
        return Arrays.hashCode(new Object[]{this.a, this.r, this.c, Integer.valueOf(this.b), this.d, Long.valueOf(this.p), Integer.valueOf(this.l), Long.valueOf(this.o), this.k, Integer.valueOf(i3), Integer.valueOf(i2)});
    }

    public final int i() {
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        irk.a(z);
        return this.m;
    }

    public final long j() {
        return this.o;
    }

    public final long k() {
        return this.p;
    }

    public final float l() {
        return this.q;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Achievement) {
            if (this == obj) {
                return true;
            }
            Achievement achievement = (Achievement) obj;
            int c2 = achievement.c();
            int i2 = this.b;
            if (c2 != i2) {
                return false;
            }
            if ((i2 == 1 && (achievement.i() != i() || achievement.f() != f())) || achievement.k() != this.p || achievement.h() != this.l || achievement.j() != this.o || !ius.a(achievement.a(), this.a) || !ius.a(achievement.b(), this.r) || !ius.a(achievement.d(), this.c) || !ius.a(achievement.e(), this.d) || !ius.a(achievement.g(), this.k) || achievement.l() != this.q) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Id", this.a);
        a2.a("Game Id", this.r);
        a2.a("Type", Integer.valueOf(this.b));
        a2.a("Name", this.c);
        a2.a("Description", this.d);
        a2.a("Player", this.k);
        a2.a("State", Integer.valueOf(this.l));
        a2.a("Rarity Percent", Float.valueOf(this.q));
        if (this.b == 1) {
            a2.a("CurrentSteps", Integer.valueOf(i()));
            a2.a("TotalSteps", Integer.valueOf(f()));
        }
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, i2, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 7, this.g, i2, false);
        ivx.a(parcel, 8, this.h, false);
        ivx.b(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j, false);
        ivx.a(parcel, 11, this.k, i2, false);
        ivx.b(parcel, 12, this.l);
        ivx.b(parcel, 13, this.m);
        ivx.a(parcel, 14, this.n, false);
        ivx.a(parcel, 15, this.o);
        ivx.a(parcel, 16, this.p);
        ivx.a(parcel, 17, this.q);
        ivx.a(parcel, 18, this.r, false);
        ivx.b(parcel, a2);
    }
}
