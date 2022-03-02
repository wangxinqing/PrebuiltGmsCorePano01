package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.photos.autobackup.service.AutoBackupChimeraService;
import java.util.Set;

/* renamed from: ykd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ykd extends irf {
    final /* synthetic */ AutoBackupChimeraService a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ykd(AutoBackupChimeraService autoBackupChimeraService, Context context) {
        super(context, 31, new int[0]);
        this.a = autoBackupChimeraService;
    }

    /* access modifiers changed from: protected */
    public final Set a() {
        return AutoBackupChimeraService.a;
    }

    /* access modifiers changed from: protected */
    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        try {
            isv.a(0, (IBinder) new yjr(this.a), (Bundle) null);
        } catch (RemoteException e) {
            Log.w("AutoBackupService", "Client died while brokering service.");
        }
    }
}
