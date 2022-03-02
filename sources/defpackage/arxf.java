package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;

/* renamed from: arxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arxf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DiscoveryListItem(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DiscoveryListItem[i];
    }
}
