package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;

/* renamed from: aeho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeho implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new HeadsetPiece[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        aehp f = HeadsetPiece.f();
        if (readString == null) {
            readString = "";
        }
        f.a(readString);
        f.b(parcel.readInt());
        f.a(parcel.readInt());
        f.a(parcel.readByte() != 0);
        f.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        return f.a();
    }
}
