package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.config.internal.FetchConfigIpcResponse;
import java.util.Map;

/* renamed from: joo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class joo extends bhw implements jop {
    public joo() {
        super("com.google.android.gms.config.internal.IConfigCallbacks");
    }

    public void a(Status status, FetchConfigIpcResponse fetchConfigIpcResponse) {
        throw null;
    }

    public final void a(Status status, Map map) {
        throw new UnsupportedOperationException();
    }

    public final void a(Status status, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((Status) bhx.a(parcel, Status.CREATOR), parcel.createByteArray());
        } else if (i == 2) {
            a((Status) bhx.a(parcel, Status.CREATOR), (Map) bhx.c(parcel));
        } else if (i != 4) {
            return false;
        } else {
            a((Status) bhx.a(parcel, Status.CREATOR), (FetchConfigIpcResponse) bhx.a(parcel, FetchConfigIpcResponse.CREATOR));
        }
        return true;
    }
}
