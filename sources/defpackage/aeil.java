package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.TrueWirelessHeadset;

/* renamed from: aeil  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeil implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TrueWirelessHeadset[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        aeim i = TrueWirelessHeadset.i();
        i.b(amrk.b(readString));
        i.b((HeadsetPiece) HeadsetPiece.CREATOR.createFromParcel(parcel));
        i.c((HeadsetPiece) HeadsetPiece.CREATOR.createFromParcel(parcel));
        i.a((HeadsetPiece) HeadsetPiece.CREATOR.createFromParcel(parcel));
        i.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        i.b(parcel.readLong());
        i.a(amrk.b(parcel.readString()));
        i.a(parcel.readLong());
        return i.a();
    }
}
