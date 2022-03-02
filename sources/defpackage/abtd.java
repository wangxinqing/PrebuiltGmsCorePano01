package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.SourceDevice;
import com.google.android.gms.smartdevice.d2d.TargetConnectionArgs;
import java.util.HashSet;

/* renamed from: abtd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abtd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TargetConnectionArgs[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        HashSet hashSet = new HashSet();
        SourceDevice sourceDevice = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 2) {
                ivw.b(parcel, readInt);
            } else {
                sourceDevice = (SourceDevice) ivw.a(parcel, readInt, SourceDevice.CREATOR);
                hashSet.add(2);
            }
        }
        if (parcel.dataPosition() == b) {
            return new TargetConnectionArgs(hashSet, sourceDevice);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ivv(sb.toString(), parcel);
    }
}
