package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class TeleportingSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wkm(new sjh());
    public final SyncRequest a;

    public TeleportingSyncRequest(SyncRequest syncRequest) {
        this.a = syncRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        wkm.a(this, parcel, new sjg(i));
    }
}
