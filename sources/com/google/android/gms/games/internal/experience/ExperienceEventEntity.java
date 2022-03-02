package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ExperienceEventEntity extends GamesAbstractSafeParcelable implements ExperienceEvent {
    public static final Parcelable.Creator CREATOR = new nmo();
    public final String a;
    public final GameEntity b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final long g;
    public final long h;
    public final long i;
    public final int j;
    public final int k;

    public ExperienceEventEntity(String str, GameEntity gameEntity, String str2, String str3, String str4, Uri uri, long j2, long j3, long j4, int i2, int i3) {
        this.a = str;
        this.b = gameEntity;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = i2;
        this.k = i3;
    }

    public final String a() {
        return this.a;
    }

    public final Game b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Uri e() {
        return this.f;
    }

    public final long f() {
        return this.g;
    }

    public final long g() {
        return this.h;
    }

    public final String getIconImageUrl() {
        return this.e;
    }

    public final long h() {
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final int i() {
        return this.j;
    }

    public final int j() {
        return this.k;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperienceEvent) {
            if (this == obj) {
                return true;
            }
            ExperienceEvent experienceEvent = (ExperienceEvent) obj;
            if (!ius.a(experienceEvent.a(), this.a) || !ius.a(experienceEvent.b(), this.b) || !ius.a(experienceEvent.c(), this.c) || !ius.a(experienceEvent.d(), this.d) || !ius.a(experienceEvent.getIconImageUrl(), this.e) || !ius.a(experienceEvent.e(), this.f) || !ius.a(Long.valueOf(experienceEvent.f()), Long.valueOf(this.g)) || !ius.a(Long.valueOf(experienceEvent.g()), Long.valueOf(this.h)) || !ius.a(Long.valueOf(experienceEvent.h()), Long.valueOf(this.i)) || !ius.a(Integer.valueOf(experienceEvent.i()), Integer.valueOf(this.j)) || !ius.a(Integer.valueOf(experienceEvent.j()), Integer.valueOf(this.k))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("ExperienceId", this.a);
        a2.a("Game", this.b);
        a2.a("DisplayTitle", this.c);
        a2.a("DisplayDescription", this.d);
        a2.a("IconImageUrl", this.e);
        a2.a("IconImageUri", this.f);
        a2.a("CreatedTimestamp", Long.valueOf(this.g));
        a2.a("XpEarned", Long.valueOf(this.h));
        a2.a("CurrentXp", Long.valueOf(this.i));
        a2.a("Type", Integer.valueOf(this.j));
        a2.a("NewLevel", Integer.valueOf(this.k));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, i2, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h);
        ivx.a(parcel, 9, this.i);
        ivx.b(parcel, 10, this.j);
        ivx.b(parcel, 11, this.k);
        ivx.b(parcel, a2);
    }
}
