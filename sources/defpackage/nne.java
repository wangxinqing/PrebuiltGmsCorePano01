package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchEntity;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* renamed from: nne  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nne implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TurnBasedMatchEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        long j = 0;
        long j2 = 0;
        GameEntity gameEntity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        String str5 = null;
        byte[] bArr2 = null;
        Bundle bundle = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    gameEntity = (GameEntity) ivw.a(parcel2, readInt, GameEntity.CREATOR);
                    break;
                case 2:
                    str = ivw.q(parcel2, readInt);
                    break;
                case 3:
                    str2 = ivw.q(parcel2, readInt);
                    break;
                case 4:
                    j = ivw.i(parcel2, readInt);
                    break;
                case 5:
                    str3 = ivw.q(parcel2, readInt);
                    break;
                case 6:
                    j2 = ivw.i(parcel2, readInt);
                    break;
                case 7:
                    str4 = ivw.q(parcel2, readInt);
                    break;
                case 8:
                    i = ivw.g(parcel2, readInt);
                    break;
                case 10:
                    i2 = ivw.g(parcel2, readInt);
                    break;
                case 11:
                    i3 = ivw.g(parcel2, readInt);
                    break;
                case 12:
                    bArr = ivw.t(parcel2, readInt);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    arrayList = ivw.c(parcel2, readInt, ParticipantEntity.CREATOR);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    str5 = ivw.q(parcel2, readInt);
                    break;
                case Service.START_CONTINUATION_MASK:
                    bArr2 = ivw.t(parcel2, readInt);
                    break;
                case 16:
                    i4 = ivw.g(parcel2, readInt);
                    break;
                case 17:
                    bundle = ivw.s(parcel2, readInt);
                    break;
                case 18:
                    i5 = ivw.g(parcel2, readInt);
                    break;
                case 19:
                    z = ivw.c(parcel2, readInt);
                    break;
                case 20:
                    str6 = ivw.q(parcel2, readInt);
                    break;
                case 21:
                    str7 = ivw.q(parcel2, readInt);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        ivw.E(parcel2, b);
        return new TurnBasedMatchEntity(gameEntity, str, str2, j, str3, j2, str4, i, i2, i3, bArr, arrayList, str5, bArr2, i4, bundle, i5, z, str6, str7);
    }
}
