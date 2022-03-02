package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.lockbox.service.LockboxBrokerChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: rqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rqd extends irf {
    final /* synthetic */ LockboxBrokerChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rqd(LockboxBrokerChimeraService lockboxBrokerChimeraService, Context context) {
        super(context, 26, new int[0]);
        this.a = lockboxBrokerChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        isv.a(0, (IBinder) new rps(this.a, getServiceRequest.d), (Bundle) null);
    }
}
