package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;

/* renamed from: sjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class sjg implements wkl {
    private final int a;

    public sjg(int i) {
        this.a = i;
    }

    public final void a(SafeParcelable safeParcelable, Parcel parcel) {
        int i = this.a;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, ((TeleportingSyncRequest) safeParcelable).a, i, false);
        ivx.b(parcel, a2);
    }
}
