package defpackage;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AddListenerRequest;

/* renamed from: adzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adzf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AddListenerRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        IntentFilter[] intentFilterArr = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 2) {
                iBinder = ivw.r(parcel, readInt);
            } else if (a == 3) {
                intentFilterArr = (IntentFilter[]) ivw.b(parcel, readInt, IntentFilter.CREATOR);
            } else if (a == 4) {
                str = ivw.q(parcel, readInt);
            } else if (a != 5) {
                ivw.b(parcel, readInt);
            } else {
                str2 = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new AddListenerRequest(iBinder, intentFilterArr, str, str2);
    }
}
