package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlayerStatsEntity extends GamesAbstractSafeParcelable implements PlayerStats {
    public static final Parcelable.Creator CREATOR = new nnn();
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final Bundle h;
    public final float i;
    public final float j;
    public final float k;

    public PlayerStatsEntity(float f2, float f3, int i2, int i3, int i4, float f4, float f5, Bundle bundle, float f6, float f7, float f8) {
        this.a = f2;
        this.b = f3;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f4;
        this.g = f5;
        this.h = bundle;
        this.i = f6;
        this.j = f7;
        this.k = f8;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final float f() {
        return this.f;
    }

    public final float g() {
        return this.g;
    }

    public final float h() {
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(a()), Float.valueOf(b()), Integer.valueOf(c()), Integer.valueOf(d()), Integer.valueOf(e()), Float.valueOf(f()), Float.valueOf(g()), Float.valueOf(h()), Float.valueOf(i()), Float.valueOf(j())});
    }

    public final float i() {
        return this.j;
    }

    public final float j() {
        return this.k;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlayerStats) {
            if (this == obj) {
                return true;
            }
            PlayerStats playerStats = (PlayerStats) obj;
            if (!ius.a(Float.valueOf(playerStats.a()), Float.valueOf(a())) || !ius.a(Float.valueOf(playerStats.b()), Float.valueOf(b())) || !ius.a(Integer.valueOf(playerStats.c()), Integer.valueOf(c())) || !ius.a(Integer.valueOf(playerStats.d()), Integer.valueOf(d())) || !ius.a(Integer.valueOf(playerStats.e()), Integer.valueOf(e())) || !ius.a(Float.valueOf(playerStats.f()), Float.valueOf(f())) || !ius.a(Float.valueOf(playerStats.g()), Float.valueOf(g())) || !ius.a(Float.valueOf(playerStats.h()), Float.valueOf(h())) || !ius.a(Float.valueOf(playerStats.i()), Float.valueOf(i())) || !ius.a(Float.valueOf(playerStats.j()), Float.valueOf(j()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("AverageSessionLength", Float.valueOf(a()));
        a2.a("ChurnProbability", Float.valueOf(b()));
        a2.a("DaysSinceLastPlayed", Integer.valueOf(c()));
        a2.a("NumberOfPurchases", Integer.valueOf(d()));
        a2.a("NumberOfSessions", Integer.valueOf(e()));
        a2.a("SessionPercentile", Float.valueOf(f()));
        a2.a("SpendPercentile", Float.valueOf(g()));
        a2.a("SpendProbability", Float.valueOf(h()));
        a2.a("HighSpenderProbability", Float.valueOf(i()));
        a2.a("TotalSpendNext28Days", Float.valueOf(j()));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.b(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i);
        ivx.a(parcel, 10, this.j);
        ivx.a(parcel, 11, this.k);
        ivx.b(parcel, a2);
    }
}
