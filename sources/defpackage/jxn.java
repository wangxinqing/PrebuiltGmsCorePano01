package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;

/* renamed from: jxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jxn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new KeyFilterImpl.Inclusion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                strArr = ivw.A(parcel, readInt);
            } else if (a == 3) {
                strArr2 = ivw.A(parcel, readInt);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                strArr3 = ivw.A(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new KeyFilterImpl.Inclusion(strArr, strArr2, strArr3);
    }
}
