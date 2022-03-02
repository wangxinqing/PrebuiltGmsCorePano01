package defpackage;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;

/* renamed from: nmx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nmx extends nmy {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    public final ParticipantEntity a(Parcel parcel) {
        boolean z;
        PlayerEntity playerEntity;
        if (!GamesDowngradeableSafeParcel.a(DowngradeableSafeParcel.aW())) {
            ParticipantEntity.class.getCanonicalName();
            if (!DowngradeableSafeParcel.aX()) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                String readString5 = parcel.readString();
                if (parcel.readInt() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                Uri uri = null;
                if (parcel.readInt() > 0) {
                    playerEntity = (PlayerEntity) PlayerEntity.CREATOR.createFromParcel(parcel);
                } else {
                    playerEntity = null;
                }
                Uri parse = readString3 != null ? Uri.parse(readString3) : null;
                if (readString4 != null) {
                    uri = Uri.parse(readString4);
                }
                return new ParticipantEntity(readString, readString2, parse, uri, readInt, readString5, z, playerEntity, 7, (ParticipantResult) null, (String) null, (String) null);
            }
        }
        return super.createFromParcel(parcel);
    }
}
