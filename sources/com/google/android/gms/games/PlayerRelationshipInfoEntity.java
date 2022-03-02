package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class PlayerRelationshipInfoEntity extends GamesAbstractSafeParcelable implements PlayerRelationshipInfo {
    public static final Parcelable.Creator CREATOR = new nlq();
    public int a;
    public String b;
    public String c;
    public String d;

    public PlayerRelationshipInfoEntity(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final int a() {
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

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlayerRelationshipInfo) {
            if (obj == this) {
                return true;
            }
            PlayerRelationshipInfo playerRelationshipInfo = (PlayerRelationshipInfo) obj;
            if (playerRelationshipInfo.a() != this.a || !ius.a(playerRelationshipInfo.b(), this.b) || !ius.a(playerRelationshipInfo.c(), this.c) || !ius.a(playerRelationshipInfo.d(), this.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        iur a2 = ius.a(this);
        a2.a("FriendStatus", Integer.valueOf(this.a));
        String str = this.b;
        if (str != null) {
            a2.a("Nickname", str);
        }
        String str2 = this.c;
        if (str2 != null) {
            a2.a("InvitationNickname", str2);
        }
        if (this.d != null) {
            a2.a("NicknameAbuseReportToken", this.c);
        }
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
