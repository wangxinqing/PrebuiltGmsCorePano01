package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class InvitationEntity extends GamesDowngradeableSafeParcel implements Invitation {
    public static final Parcelable.Creator CREATOR = new nmv();
    public final GameEntity a;
    public final String b;
    public final long c;
    public final int d;
    public final ParticipantEntity e;
    public final int f;
    public final int g;
    private final ArrayList h;

    public InvitationEntity(GameEntity gameEntity, String str, long j, int i, ParticipantEntity participantEntity, ArrayList arrayList, int i2, int i3) {
        this.a = gameEntity;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = participantEntity;
        this.h = arrayList;
        this.f = i2;
        this.g = i3;
    }

    public final Game a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Participant c() {
        return this.e;
    }

    public final long d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final ArrayList h() {
        return new ArrayList(this.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Integer.valueOf(this.d), this.e, h(), Integer.valueOf(this.f), Integer.valueOf(this.g)});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Invitation) {
            if (this == obj) {
                return true;
            }
            Invitation invitation = (Invitation) obj;
            if (!ius.a(invitation.a(), this.a) || !ius.a(invitation.b(), this.b) || !ius.a(Long.valueOf(invitation.d()), Long.valueOf(this.c)) || !ius.a(Integer.valueOf(invitation.e()), Integer.valueOf(this.d)) || !ius.a(invitation.c(), this.e) || !ius.a(invitation.h(), h()) || !ius.a(Integer.valueOf(invitation.f()), Integer.valueOf(this.f)) || !ius.a(Integer.valueOf(invitation.g()), Integer.valueOf(this.g))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("Game", this.a);
        a2.a("InvitationId", this.b);
        a2.a("CreationTimestamp", Long.valueOf(this.c));
        a2.a("InvitationType", Integer.valueOf(this.d));
        a2.a("Inviter", this.e);
        a2.a("Participants", h());
        a2.a("Variant", Integer.valueOf(this.f));
        a2.a("AvailableAutoMatchSlots", Integer.valueOf(this.g));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.b(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, i, false);
        ivx.c(parcel, 6, h(), false);
        ivx.b(parcel, 7, this.f);
        ivx.b(parcel, 8, this.g);
        ivx.b(parcel, a2);
    }
}
