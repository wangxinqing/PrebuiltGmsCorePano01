package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;

/* renamed from: acgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acgz extends bhv implements IInterface {
    public acgz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
    }

    public final void a(Status status, ConnectionHint connectionHint) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) connectionHint);
        c(1, aQ);
    }

    public final void b(Status status, HandshakeData handshakeData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) handshakeData);
        c(3, aQ);
    }

    public final void c(Status status, HandshakeData handshakeData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) handshakeData);
        c(4, aQ);
    }

    public final void a(Status status, HandshakeData handshakeData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) handshakeData);
        c(2, aQ);
    }

    public final void a(Status status, PostSetupAuthData postSetupAuthData) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) postSetupAuthData);
        c(5, aQ);
    }
}
