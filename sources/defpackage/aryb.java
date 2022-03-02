package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import com.google.location.nearby.common.fastpair.DiscoveryListItem;
import java.util.List;

/* renamed from: aryb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryb extends bhw implements aryc {
    public Context a;
    public arxd b;
    private final Handler c;

    public aryb() {
        super("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
    }

    public final void a(int i, List list) {
        this.c.post(new arxh(this, list));
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readInt(), parcel.createTypedArrayList(DiscoveryListItem.CREATOR));
        return true;
    }

    public aryb(Context context, arxd arxd) {
        super("com.google.location.nearby.common.fastpair.IDiscoveryServiceCallback");
        this.a = context;
        this.c = new Handler(Looper.getMainLooper());
        this.b = arxd;
    }
}
