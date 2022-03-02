package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;

/* renamed from: ryu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class ryu implements wkl {
    public final void a(SafeParcelable safeParcelable, Parcel parcel) {
        int a = ivx.a(parcel);
        ivx.a(parcel, 1, ((ByteArraySafeParcelable) safeParcelable).a, false);
        ivx.b(parcel, a);
    }
}
