package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class RoomEntity extends GamesDowngradeableSafeParcel implements Room {
    public static final Parcelable.Creator CREATOR = new nnc();
    public final String a;
    public final String b;
    public final long c;
    public final int d;
    public final String e;
    public final int f;
    public final Bundle g;
    public final int h;
    private final ArrayList i;

    public RoomEntity(String str, String str2, long j, int i2, String str3, int i3, Bundle bundle, ArrayList arrayList, int i4) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = i2;
        this.e = str3;
        this.f = i3;
        this.g = bundle;
        this.i = arrayList;
        this.h = i4;
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

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final Bundle g() {
        return this.g;
    }

    public final ArrayList h() {
        return new ArrayList(this.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(nma.a(this.g)), h(), Integer.valueOf(this.h)});
    }

    public final int i() {
        return this.h;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Room) {
            if (this == obj) {
                return true;
            }
            Room room = (Room) obj;
            if (!ius.a(room.a(), this.a) || !ius.a(room.b(), this.b) || !ius.a(Long.valueOf(room.c()), Long.valueOf(this.c)) || !ius.a(Integer.valueOf(room.d()), Integer.valueOf(this.d)) || !ius.a(room.e(), this.e) || !ius.a(Integer.valueOf(room.f()), Integer.valueOf(this.f)) || !nma.a(room.g(), this.g) || !ius.a(room.h(), h()) || !ius.a(Integer.valueOf(room.i()), Integer.valueOf(this.h))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("RoomId", this.a);
        a2.a("CreatorId", this.b);
        a2.a("CreationTimestamp", Long.valueOf(this.c));
        a2.a("RoomStatus", Integer.valueOf(this.d));
        a2.a("Description", this.e);
        a2.a("Variant", Integer.valueOf(this.f));
        a2.a("AutoMatchCriteria", this.g);
        a2.a("Participants", h());
        a2.a("AutoMatchWaitEstimateSeconds", Integer.valueOf(this.h));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g, false);
        ivx.c(parcel, 8, h(), false);
        ivx.b(parcel, 9, this.h);
        ivx.b(parcel, a2);
    }
}
