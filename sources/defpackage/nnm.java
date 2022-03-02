package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import org.chromium.net.UrlRequest;

/* renamed from: nnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nnm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SnapshotMetadataEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    gameEntity = (GameEntity) ivw.a(parcel2, readInt, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) ivw.a(parcel2, readInt, PlayerEntity.CREATOR);
                    break;
                case 3:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 5:
                    uri = (Uri) ivw.a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 6:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 7:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 9:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 10:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 11:
                    f = ivw.l(parcel2, readInt);
                    break;
                case 12:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    z = ivw.c(parcel2, readInt);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    j3 = ivw.i(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new SnapshotMetadataEntity(gameEntity, playerEntity, str, uri, str2, str3, str4, j, j2, f, str5, z, j3, str6);
    }
}
