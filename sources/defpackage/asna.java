package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.location.nearby.messages.debug.internal.DebugPokeResponse;

/* renamed from: asna  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asna implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DebugPokeResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                i2 = ivw.g(parcel, readInt);
            } else if (a == 2) {
                bArr = ivw.t(parcel, readInt);
            } else if (a != 1000) {
                ivw.b(parcel, readInt);
            } else {
                i = ivw.g(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new DebugPokeResponse(i, i2, bArr);
    }
}
