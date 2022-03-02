package defpackage;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.appstate.service.AppStateAndroidChimeraService;
import com.google.android.gms.appstate.service.AppStateIntentChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: ebh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ebh extends irg {
    final /* synthetic */ AppStateAndroidChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ebh(AppStateAndroidChimeraService appStateAndroidChimeraService, Context context) {
        super(context, 7, new int[0]);
        this.a = appStateAndroidChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        AppStateIntentChimeraService.a(this.a, AppStateIntentChimeraService.a, new ebs(isv, Binder.getCallingUid(), getServiceRequest.d, getServiceRequest.h, getServiceRequest.a(), jkx.a(getServiceRequest.f), irg.a(getServiceRequest)));
    }
}
