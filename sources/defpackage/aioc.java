package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.location.internal.GoogleLocationManagerChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: aioc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aioc extends irg {
    final /* synthetic */ GoogleLocationManagerChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aioc(GoogleLocationManagerChimeraService googleLocationManagerChimeraService, Context context) {
        super(context, 23, new int[0]);
        this.a = googleLocationManagerChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.d;
        Bundle bundle = getServiceRequest.g;
        if (!bundle.containsKey("client_name") || !"activity_recognition".equals(bundle.getString("client_name"))) {
            this.a.a(isv, str);
            return;
        }
        Binder.getCallingPid();
        Binder.getCallingUid();
        this.a.a.post(new aiob(this, isv, str));
    }
}
