package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.enterprise.internal.ZeroTouchFlowResult;

/* renamed from: mdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class mdk extends bhw implements IInterface {
    public mdk() {
        super("com.google.android.gms.enterprise.internal.IEnterpriseServiceCallbacks");
    }

    public void a(Status status, ZeroTouchFlowResult zeroTouchFlowResult) {
        throw null;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), (ZeroTouchFlowResult) bhx.a(parcel, ZeroTouchFlowResult.CREATOR));
        return true;
    }
}
