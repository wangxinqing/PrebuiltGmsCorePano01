package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;
import com.google.android.gms.udc.service.FacsInternalSyncApiChimeraService;
import java.util.concurrent.Executor;

/* renamed from: addj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class addj extends mfi implements niz {
    private final nix a;
    private final ClientContext b;
    private final adev c;
    private final aful d;
    private final Executor e;

    public addj(nix nix, ClientContext clientContext, adev adev, aful aful, Executor executor) {
        this.a = nix;
        this.b = clientContext;
        this.c = adev;
        this.d = aful;
        this.e = executor;
    }

    public final void a(mfg mfg, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        FacsInternalSyncApiChimeraService.a.d().a("addj", "a", 112, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received 'syncActivityControlsSettingsInternal' (forced: %b) request...", (Object) Boolean.valueOf(facsInternalSyncCallOptions.a));
        this.a.a(new adae(mfg, this.c, this.b, this.d, this.e, facsInternalSyncCallOptions));
        FacsInternalSyncApiChimeraService.a.d().a("addj", "a", 125, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation 'syncActivityControlsSettingsInternal' dispatched!");
    }

    public final void a(mfg mfg, byte[] bArr, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        FacsInternalSyncApiChimeraService.a.d().a("addj", "a", 134, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Received 'updateActivityControlsSettingsInternal' request...");
        try {
            aubs b2 = aubs.b();
            mfg mfg2 = mfg;
            this.a.a(new adag(mfg2, this.c, this.b, this.d, this.e, facsInternalSyncCallOptions, (atxi) aucj.a((aucj) atxi.f, bArr, b2)));
            FacsInternalSyncApiChimeraService.a.d().a("addj", "a", 150, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation 'updateActivityControlsSettingsInternal' dispatched!");
        } catch (auda e2) {
            mfg mfg3 = mfg;
            mfg.a(new Status(35002, "The given request couldn't be parsed!"), (UpdateActivityControlsSettingsInternalResult) null);
            FacsInternalSyncApiChimeraService.a.c().a("addj", "a", 156, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Failed to dispatch operation 'updateActivityControlsSettingsInternal' due to malformed request!");
        }
    }
}
