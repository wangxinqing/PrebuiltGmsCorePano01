package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AclDetailsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.LoggedCircleEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.LoggedCircleMemberEntity;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.net.UrlRequest;

/* renamed from: zem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zem implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AclDetailsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        float f2 = 0.0f;
        int i5 = 0;
        float f3 = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel2, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    arrayList = ivw.c(parcel2, readInt, LoggedCircleEntity.CREATOR);
                    hashSet.add(2);
                    break;
                case 4:
                    arrayList2 = ivw.c(parcel2, readInt, LoggedCircleMemberEntity.CREATOR);
                    hashSet.add(4);
                    break;
                case 5:
                    i2 = ivw.g(parcel2, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    i3 = ivw.g(parcel2, readInt);
                    hashSet.add(6);
                    break;
                case 7:
                    f = ivw.l(parcel2, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    i4 = ivw.g(parcel2, readInt);
                    hashSet.add(8);
                    break;
                case 9:
                    f2 = ivw.l(parcel2, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    i5 = ivw.g(parcel2, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    f3 = ivw.l(parcel2, readInt);
                    hashSet.add(11);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    i6 = ivw.g(parcel2, readInt);
                    hashSet.add(13);
                    break;
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                    i7 = ivw.g(parcel2, readInt);
                    hashSet.add(14);
                    break;
                default:
                    ivw.b(parcel2, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AclDetailsEntity(hashSet, i, arrayList, arrayList2, i2, i3, f, i4, f2, i5, f3, i6, i7);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel2);
    }
}
