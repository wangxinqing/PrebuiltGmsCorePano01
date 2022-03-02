package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class EventEntity extends GamesAbstractSafeParcelable implements Event {
    public static final Parcelable.Creator CREATOR = new nlz();
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final String e;
    public final PlayerEntity f;
    public final long g;
    public final String h;
    public final boolean i;

    public EventEntity(String str, String str2, String str3, Uri uri, String str4, Player player, long j, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = uri;
        this.e = str4;
        this.f = new PlayerEntity(player);
        this.g = j;
        this.h = str5;
        this.i = z;
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

    public final Uri d() {
        return this.d;
    }

    public final Player e() {
        return this.f;
    }

    public final long f() {
        return this.g;
    }

    public final String g() {
        return this.h;
    }

    public final String getIconImageUrl() {
        return this.e;
    }

    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Long.valueOf(this.g), this.h, Boolean.valueOf(this.i)});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Event) {
            if (this == obj) {
                return true;
            }
            Event event = (Event) obj;
            if (!ius.a(event.a(), this.a) || !ius.a(event.b(), this.b) || !ius.a(event.c(), this.c) || !ius.a(event.d(), this.d) || !ius.a(event.getIconImageUrl(), this.e) || !ius.a(event.e(), this.f) || !ius.a(Long.valueOf(event.f()), Long.valueOf(this.g)) || !ius.a(event.g(), this.h) || !ius.a(Boolean.valueOf(event.h()), Boolean.valueOf(this.i))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Id", this.a);
        a2.a("Name", this.b);
        a2.a("Description", this.c);
        a2.a("IconImageUri", this.d);
        a2.a("IconImageUrl", this.e);
        a2.a("Player", this.f);
        a2.a("Value", Long.valueOf(this.g));
        a2.a("FormattedValue", this.h);
        a2.a("isVisible", Boolean.valueOf(this.i));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i2, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, i2, false);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i);
        ivx.b(parcel, a2);
    }
}
