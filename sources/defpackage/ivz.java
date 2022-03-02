package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.service.CommonApiBoundService;

/* renamed from: ivz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ivz extends irg {
    final /* synthetic */ CommonApiBoundService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ivz(CommonApiBoundService commonApiBoundService, Context context) {
        super(context, 39, new int[0]);
        this.a = commonApiBoundService;
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        try {
            isv.a(0, (IBinder) new iwb(this.a, getServiceRequest.d), (Bundle) null);
        } catch (RemoteException e) {
            Log.w("CommonApiService", "Client died while binding service");
        }
    }
}
