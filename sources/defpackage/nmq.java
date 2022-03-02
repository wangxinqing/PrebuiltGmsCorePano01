package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* renamed from: nmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class nmq implements Parcelable.Creator {
    /* renamed from: a */
    public GameBadgeEntity createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i = ivw.g(parcel, readInt);
            } else if (a == 2) {
                str = ivw.q(parcel, readInt);
            } else if (a == 3) {
                str2 = ivw.q(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                uri = (Uri) ivw.a(parcel, readInt, Uri.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new GameBadgeEntity(i, str, str2, uri);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GameBadgeEntity[i];
    }
}
