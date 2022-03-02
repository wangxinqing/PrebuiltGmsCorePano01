package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* renamed from: tbu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tbu extends bhv implements tbw {
    public tbu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(2, aQ);
    }

    public final void b(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(3, aQ);
    }

    public final void a(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) openFileDescriptorResponse);
        c(1, aQ);
    }
}
