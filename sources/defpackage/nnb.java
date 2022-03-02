package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

/* renamed from: nnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nnb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RealTimeMessage(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RealTimeMessage[i];
    }
}
