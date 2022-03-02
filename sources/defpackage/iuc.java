package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountResponse;

/* renamed from: iuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iuc extends bhv implements iue {
    public iuc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
    }

    public final void a(ResolveAccountResponse resolveAccountResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) resolveAccountResponse);
        b(2, aQ);
    }
}
