package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.DogfoodsToken;

/* renamed from: ydr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ydr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DogfoodsToken[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                bArr = ivw.t(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new DogfoodsToken(bArr);
    }
}
