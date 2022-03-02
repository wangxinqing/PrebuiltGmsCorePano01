package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;
import java.util.concurrent.Executor;

/* renamed from: adag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adag extends aczk {
    private static final anij h = addh.b();
    public final atxi g;

    public adag(mfg mfg, adev adev, ClientContext clientContext, aful aful, Executor executor, FacsInternalSyncCallOptions facsInternalSyncCallOptions, atxi atxi) {
        super("UpdateActivityControlsSettingsInternalOperation", mfg, adev, clientContext, aful, executor, facsInternalSyncCallOptions);
        this.g = atxi;
    }

    private final atxj b() {
        afum afum;
        h.d().a("adag", "b", 88, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' performing upload...", (Object) this.m);
        try {
            if (!azrk.l()) {
                afum = this.d.h(aczd.SYNC_ID_CUSTOM_CACHE);
            } else {
                afum = this.d.c(aczd.SYNC_ID_CUSTOM_CACHE, this.c.c);
            }
            return (atxj) a(afum.a(new adaf(this), 1, this.e));
        } catch (eif e) {
            throw new nja(35001, "Auth error when uploading settings!", (PendingIntent) null, e);
        } catch (babk | babl e2) {
            throw new nja(7, "Uploading settings failed!", (PendingIntent) null, e2);
        } catch (InterruptedException e3) {
            throw new nja(14, "Upload thread interrupted!", (PendingIntent) null, e3);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        afum afum;
        h.d().a("adag", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Executing operation '%s'...", (Object) this.m);
        a();
        h.d().a("adag", "b", 88, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' performing upload...", (Object) this.m);
        try {
            if (!azrk.l()) {
                afum = this.d.h(aczd.SYNC_ID_CUSTOM_CACHE);
            } else {
                afum = this.d.c(aczd.SYNC_ID_CUSTOM_CACHE, this.c.c);
            }
            this.a.a(Status.a, new UpdateActivityControlsSettingsInternalResult(((atxj) a(afum.a(new adaf(this), 1, this.e))).k()));
            h.d().a("adag", "a", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' successful!", (Object) this.m);
        } catch (eif e) {
            throw new nja(35001, "Auth error when uploading settings!", (PendingIntent) null, e);
        } catch (babk | babl e2) {
            throw new nja(7, "Uploading settings failed!", (PendingIntent) null, e2);
        } catch (InterruptedException e3) {
            throw new nja(14, "Upload thread interrupted!", (PendingIntent) null, e3);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.a.a(status, (UpdateActivityControlsSettingsInternalResult) null);
        h.c().a("adag", "a", 82, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' failed with status '%d'!", (Object) this.m, status.i);
    }
}
