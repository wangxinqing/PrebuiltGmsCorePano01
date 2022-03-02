package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.userlocation.SemanticLocation;

/* renamed from: advg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advg extends bhv implements IInterface {
    public advg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.userlocation.internal.ISemanticLocationProviderCallbacks");
    }

    public final void a(Status status, SemanticLocation semanticLocation) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) semanticLocation);
        c(1, aQ);
    }
}
