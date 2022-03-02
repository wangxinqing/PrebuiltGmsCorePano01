package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.PlayerRelationshipInfoEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* renamed from: nlm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nlm extends nln {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    public final PlayerEntity a(Parcel parcel) {
        if (!GamesDowngradeableSafeParcel.a(DowngradeableSafeParcel.aW())) {
            PlayerEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.aX()) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                return new PlayerEntity(readString, readString2, readString3 != null ? Uri.parse(readString3) : null, readString4 != null ? Uri.parse(readString4) : null, parcel.readLong(), -1, -1, (String) null, (String) null, (String) null, (MostRecentGameInfoEntity) null, (PlayerLevelInfo) null, true, false, parcel.readString(), parcel.readString(), (Uri) null, (String) null, (Uri) null, (String) null, -1, -1, false, -1, (PlayerRelationshipInfoEntity) null);
            }
        }
        return super.createFromParcel(parcel);
    }
}
