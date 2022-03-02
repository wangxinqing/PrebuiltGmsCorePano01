package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: smz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class smz extends irf {
    public smz(Context context) {
        super(context, 37, new int[0]);
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        try {
            isv.a(0, (IBinder) new smn(getServiceRequest.c), (Bundle) null);
        } catch (RemoteException e) {
            snn.c("Client died while brokering service.", new Object[0]);
        }
    }
}
