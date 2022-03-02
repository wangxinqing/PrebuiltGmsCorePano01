package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* renamed from: nmp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nmp extends nmq {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    public final GameBadgeEntity a(Parcel parcel) {
        if (!GamesDowngradeableSafeParcel.a(DowngradeableSafeParcel.aW())) {
            GameBadgeEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.aX()) {
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                return new GameBadgeEntity(readInt, readString, readString2, readString3 != null ? Uri.parse(readString3) : null);
            }
        }
        return super.createFromParcel(parcel);
    }
}
