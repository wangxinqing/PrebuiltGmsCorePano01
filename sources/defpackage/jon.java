package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.Map;

/* renamed from: jon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jon extends bhv implements jop {
    public jon(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.config.internal.IConfigCallbacks");
    }

    public final void a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) fetchConfigIpcResponse);
        c(4, aQ);
    }

    public final void a(Status status, Map map) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeMap(map);
        c(2, aQ);
    }

    public final void a(Status status, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeByteArray(bArr);
        c(1, aQ);
    }
}
