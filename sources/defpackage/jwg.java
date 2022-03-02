package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;

/* renamed from: jwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jwg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ContextDataFilterImpl.Inclusion[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        TimeFilterImpl timeFilterImpl = null;
        KeyFilterImpl keyFilterImpl = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                i = ivw.g(parcel, readInt);
            } else if (a == 3) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 4) {
                timeFilterImpl = (TimeFilterImpl) ivw.a(parcel, readInt, TimeFilterImpl.CREATOR);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                keyFilterImpl = (KeyFilterImpl) ivw.a(parcel, readInt, KeyFilterImpl.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new ContextDataFilterImpl.Inclusion(i, i2, timeFilterImpl, keyFilterImpl);
    }
}
