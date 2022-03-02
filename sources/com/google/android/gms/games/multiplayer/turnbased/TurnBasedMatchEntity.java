package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class TurnBasedMatchEntity extends GamesAbstractSafeParcelable implements TurnBasedMatch {
    public static final Parcelable.Creator CREATOR = new nne();
    public final GameEntity a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final long f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final byte[] k;
    public final String l;
    public final byte[] m;
    public final int n;
    public final Bundle o;
    public final int p;
    public final boolean q;
    public final String r;
    public final String s;
    private final ArrayList t;

    public TurnBasedMatchEntity(GameEntity gameEntity, String str, String str2, long j2, String str3, long j3, String str4, int i2, int i3, int i4, byte[] bArr, ArrayList arrayList, String str5, byte[] bArr2, int i5, Bundle bundle, int i6, boolean z, String str6, String str7) {
        this.a = gameEntity;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = str3;
        this.f = j3;
        this.g = str4;
        this.h = i2;
        this.p = i6;
        this.i = i3;
        this.j = i4;
        this.k = bArr;
        this.t = arrayList;
        this.l = str5;
        this.m = bArr2;
        this.n = i5;
        this.o = bundle;
        this.q = z;
        this.r = str6;
        this.s = str7;
    }

    public final Game a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final int e() {
        return this.h;
    }

    public final int f() {
        return this.p;
    }

    public final String g() {
        return this.r;
    }

    public final ArrayList h() {
        return new ArrayList(this.t);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), this.e, Long.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.p), this.r, Integer.valueOf(this.i), Integer.valueOf(this.j), h(), this.l, Integer.valueOf(this.n), Integer.valueOf(nma.a(this.o)), Integer.valueOf(q()), Boolean.valueOf(this.q)});
    }

    public final int i() {
        return this.i;
    }

    public final String j() {
        return this.e;
    }

    public final long k() {
        return this.f;
    }

    public final String l() {
        return this.g;
    }

    public final int m() {
        return this.j;
    }

    public final String n() {
        return this.l;
    }

    public final int o() {
        return this.n;
    }

    public final Bundle p() {
        return this.o;
    }

    public final int q() {
        Bundle bundle = this.o;
        if (bundle != null) {
            return bundle.getInt("max_automatch_players");
        }
        return 0;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean s() {
        return this.q;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TurnBasedMatch) {
            if (this == obj) {
                return true;
            }
            TurnBasedMatch turnBasedMatch = (TurnBasedMatch) obj;
            if (!ius.a(turnBasedMatch.a(), this.a) || !ius.a(turnBasedMatch.b(), this.b) || !ius.a(turnBasedMatch.c(), this.c) || !ius.a(Long.valueOf(turnBasedMatch.d()), Long.valueOf(this.d)) || !ius.a(turnBasedMatch.j(), this.e) || !ius.a(Long.valueOf(turnBasedMatch.k()), Long.valueOf(this.f)) || !ius.a(turnBasedMatch.l(), this.g) || !ius.a(Integer.valueOf(turnBasedMatch.e()), Integer.valueOf(this.h)) || !ius.a(Integer.valueOf(turnBasedMatch.f()), Integer.valueOf(this.p)) || !ius.a(turnBasedMatch.g(), this.r) || !ius.a(Integer.valueOf(turnBasedMatch.i()), Integer.valueOf(this.i)) || !ius.a(Integer.valueOf(turnBasedMatch.m()), Integer.valueOf(this.j)) || !ius.a(turnBasedMatch.h(), h()) || !ius.a(turnBasedMatch.n(), this.l) || !ius.a(Integer.valueOf(turnBasedMatch.o()), Integer.valueOf(this.n)) || !nma.a(turnBasedMatch.p(), this.o) || !ius.a(Integer.valueOf(turnBasedMatch.q()), Integer.valueOf(q())) || !ius.a(Boolean.valueOf(turnBasedMatch.s()), Boolean.valueOf(this.q))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Game", this.a);
        a2.a("MatchId", this.b);
        a2.a("CreatorId", this.c);
        a2.a("CreationTimestamp", Long.valueOf(this.d));
        a2.a("LastUpdaterId", this.e);
        a2.a("LastUpdatedTimestamp", Long.valueOf(this.f));
        a2.a("PendingParticipantId", this.g);
        a2.a("MatchStatus", Integer.valueOf(this.h));
        a2.a("TurnStatus", Integer.valueOf(this.p));
        a2.a("Description", this.r);
        a2.a("Variant", Integer.valueOf(this.i));
        a2.a("Data", this.k);
        a2.a("Version", Integer.valueOf(this.j));
        a2.a("Participants", h());
        a2.a("RematchId", this.l);
        a2.a("PreviousData", this.m);
        a2.a("MatchNumber", Integer.valueOf(this.n));
        a2.a("AutoMatchCriteria", this.o);
        a2.a("AvailableAutoMatchSlots", Integer.valueOf(q()));
        a2.a("LocallyModified", Boolean.valueOf(this.q));
        a2.a("DescriptionParticipantId", this.s);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i2, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g, false);
        ivx.b(parcel, 8, this.h);
        ivx.b(parcel, 10, this.i);
        ivx.b(parcel, 11, this.j);
        ivx.a(parcel, 12, this.k, false);
        ivx.c(parcel, 13, h(), false);
        ivx.a(parcel, 14, this.l, false);
        ivx.a(parcel, 15, this.m, false);
        ivx.b(parcel, 16, this.n);
        ivx.a(parcel, 17, this.o, false);
        ivx.b(parcel, 18, this.p);
        ivx.a(parcel, 19, this.q);
        ivx.a(parcel, 20, this.r, false);
        ivx.a(parcel, 21, this.s, false);
        ivx.b(parcel, a2);
    }
}
