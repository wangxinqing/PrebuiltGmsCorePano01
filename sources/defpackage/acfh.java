package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;

/* renamed from: acfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfh extends bhv implements acfj {
    public acfh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.directtransfer.internal.ISourceDirectTransferService");
    }

    public final void a(acfg acfg) {
        throw null;
    }

    public final void a(acfg acfg, DirectTransferConfigurations directTransferConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, abwu abwu) {
        throw null;
    }

    public final void a(acfg acfg, Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) acfg);
        bhx.a(aQ, (Parcelable) bundle);
        c(3, aQ);
    }
}
