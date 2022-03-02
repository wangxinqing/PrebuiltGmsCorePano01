package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ParticipantEntity extends GamesDowngradeableSafeParcel implements Participant {
    public static final Parcelable.Creator CREATOR = new nmx();
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final PlayerEntity e;
    public final int f;
    public final ParticipantResult g;
    private final String h;
    private final Uri i;
    private final Uri j;
    private final String k;
    private final String l;

    public ParticipantEntity(String str, String str2, Uri uri, Uri uri2, int i2, String str3, boolean z, PlayerEntity playerEntity, int i3, ParticipantResult participantResult, String str4, String str5) {
        this.a = str;
        this.h = str2;
        this.i = uri;
        this.j = uri2;
        this.b = i2;
        this.c = str3;
        this.d = z;
        this.e = playerEntity;
        this.f = i3;
        this.g = participantResult;
        this.k = str4;
        this.l = str5;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.f;
    }

    public final boolean d() {
        return this.d;
    }

    public final String e() {
        PlayerEntity playerEntity = this.e;
        return playerEntity == null ? this.h : playerEntity.b;
    }

    public final Uri f() {
        PlayerEntity playerEntity = this.e;
        return playerEntity == null ? this.i : playerEntity.c;
    }

    public final Uri g() {
        PlayerEntity playerEntity = this.e;
        return playerEntity == null ? this.j : playerEntity.d;
    }

    public final String getHiResImageUrl() {
        PlayerEntity playerEntity = this.e;
        return playerEntity == null ? this.l : playerEntity.i;
    }

    public final String getIconImageUrl() {
        PlayerEntity playerEntity = this.e;
        return playerEntity == null ? this.k : playerEntity.h;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Integer.valueOf(this.b), this.c, Boolean.valueOf(this.d), e(), f(), g(), Integer.valueOf(this.f), this.g, this.a});
    }

    public final Player i() {
        return this.e;
    }

    public final ParticipantResult j() {
        return this.g;
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Participant) {
            if (this == obj) {
                return true;
            }
            Participant participant = (Participant) obj;
            if (!ius.a(participant.i(), this.e) || !ius.a(Integer.valueOf(participant.a()), Integer.valueOf(this.b)) || !ius.a(participant.b(), this.c) || !ius.a(Boolean.valueOf(participant.d()), Boolean.valueOf(this.d)) || !ius.a(participant.e(), e()) || !ius.a(participant.f(), f()) || !ius.a(participant.g(), g()) || !ius.a(Integer.valueOf(participant.c()), Integer.valueOf(this.f)) || !ius.a(participant.j(), this.g) || !ius.a(participant.h(), this.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("ParticipantId", this.a);
        a2.a("Player", this.e);
        a2.a("Status", Integer.valueOf(this.b));
        a2.a("ClientAddress", this.c);
        a2.a("ConnectedToRoom", Boolean.valueOf(this.d));
        a2.a("DisplayName", e());
        a2.a("IconImage", f());
        a2.a("IconImageUrl", getIconImageUrl());
        a2.a("HiResImage", g());
        a2.a("HiResImageUrl", getHiResImageUrl());
        a2.a("Capabilities", Integer.valueOf(this.f));
        a2.a("Result", this.g);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, e(), false);
        ivx.a(parcel, 3, f(), i2, false);
        ivx.a(parcel, 4, g(), i2, false);
        ivx.b(parcel, 5, this.b);
        ivx.a(parcel, 6, this.c, false);
        ivx.a(parcel, 7, this.d);
        ivx.a(parcel, 8, this.e, i2, false);
        ivx.b(parcel, 9, this.f);
        ivx.a(parcel, 10, this.g, i2, false);
        ivx.a(parcel, 11, getIconImageUrl(), false);
        ivx.a(parcel, 12, getHiResImageUrl(), false);
        ivx.b(parcel, a2);
    }
}
