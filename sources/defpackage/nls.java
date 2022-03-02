package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;
import org.chromium.net.UrlRequest;

/* renamed from: nls  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nls implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AchievementEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        Uri uri2 = null;
        String str5 = null;
        String str6 = null;
        PlayerEntity playerEntity = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = -1.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 2:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 6:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    uri2 = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 8:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 10:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) ivw.a(parcel2, readInt, PlayerEntity.CREATOR);
                    break;
                case 12:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 16:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 17:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 18:
                    str8 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new AchievementEntity(str, i, str2, str3, uri, str4, uri2, str5, i2, str6, playerEntity, i3, i4, str7, j, j2, f, str8);
    }
}
