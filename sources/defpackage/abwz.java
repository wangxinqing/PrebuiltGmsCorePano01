package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: abwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abwz extends bhv implements abxb {
    public abwz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
    }

    public final void a(int i) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        b(4, aQ);
    }

    public final void b() {
        b(2, aQ());
    }

    public final void a(BootstrapOptions bootstrapOptions) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bootstrapOptions);
        b(1, aQ);
    }

    public final void a(VerificationInfo verificationInfo) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) verificationInfo);
        b(5, aQ);
    }

    public final void a(String str) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        b(3, aQ);
    }
}
