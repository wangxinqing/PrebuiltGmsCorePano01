package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import java.util.HashSet;

/* renamed from: ziw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ziw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Mergedpeoplemetadata.EdgeKeyInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        while (parcel.dataPosition() < b) {
            ivw.b(parcel, parcel.readInt());
        }
        if (parcel.dataPosition() == b) {
            return new Mergedpeoplemetadata.EdgeKeyInfo(hashSet);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
