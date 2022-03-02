package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

/* renamed from: apwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apwj extends bhv implements IInterface {
    public apwj(IBinder iBinder) {
        super(iBinder, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    public final void a(Status status, DynamicLinkData dynamicLinkData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) dynamicLinkData);
        c(1, aQ);
    }

    public final void a(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) shortDynamicLinkImpl);
        c(2, aQ);
    }
}
