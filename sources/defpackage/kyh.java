package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.Service;
import com.google.android.gms.drive.internal.model.Permission;
import java.util.ArrayList;
import java.util.HashSet;
import org.chromium.net.UrlRequest;

/* renamed from: kyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kyh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Permission[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 2:
                    arrayList = ivw.C(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 4:
                    str = ivw.q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str2 = ivw.q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 7:
                    str3 = ivw.q(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 9:
                    str4 = ivw.q(parcel, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    str5 = ivw.q(parcel, readInt);
                    hashSet.add(10);
                    break;
                case 11:
                    str6 = ivw.q(parcel, readInt);
                    hashSet.add(11);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    str7 = ivw.q(parcel, readInt);
                    hashSet.add(13);
                    break;
                case Service.START_CONTINUATION_MASK:
                    str8 = ivw.q(parcel, readInt);
                    hashSet.add(15);
                    break;
                case 16:
                    z = ivw.c(parcel, readInt);
                    hashSet.add(16);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Permission(hashSet, arrayList, str, str2, str3, str4, str5, str6, str7, str8, z);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
