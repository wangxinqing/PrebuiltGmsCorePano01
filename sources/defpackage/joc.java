package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.config.ConfigChimeraService;
import java.util.Collections;
import java.util.Set;

/* renamed from: joc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class joc extends irg {
    final /* synthetic */ ConfigChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public joc(ConfigChimeraService configChimeraService, Context context) {
        super(context, 64, new int[0]);
        this.a = configChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        ConfigChimeraService configChimeraService = this.a;
        int i = ConfigChimeraService.l;
        joq joq = configChimeraService.k;
        joq.asBinder();
        isv.a(0, (IBinder) joq, (Bundle) null);
    }
}
