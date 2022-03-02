package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;
import java.util.concurrent.Executor;

/* renamed from: adae  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adae extends aczk {
    private static final anij g = addh.b();

    public adae(mfg mfg, adev adev, ClientContext clientContext, aful aful, Executor executor, FacsInternalSyncCallOptions facsInternalSyncCallOptions) {
        super("SyncActivityControlsSettingsInternalOperation", mfg, adev, clientContext, aful, executor, facsInternalSyncCallOptions);
    }

    private final atwh a(adeu adeu) {
        afum afum;
        g.d().a("adae", "a", 84, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' performing sync (type: '%s')...", (Object) this.m, (Object) adeu);
        try {
            if (!azrk.l()) {
                afum = this.d.h(aczd.SYNC_ID_CUSTOM_CACHE);
            } else {
                afum = this.d.c(aczd.SYNC_ID_CUSTOM_CACHE, this.c.c);
            }
            return (atwh) a(afum.a(new adad(this, adeu), 1, this.e));
        } catch (eif e) {
            throw new nja(35001, "Auth error when downloading settings!", (PendingIntent) null, e);
        } catch (babk | babl e2) {
            throw new nja(7, "Downloading settings failed!", (PendingIntent) null, e2);
        } catch (InterruptedException e3) {
            throw new nja(14, "Download thread interrupted!", (PendingIntent) null, e3);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        afum afum;
        g.d().a("adae", "a", 60, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Executing operation '%s'...", (Object) this.m);
        a();
        adeu adeu = !this.f.a ? adeu.EMPTY_CACHE : adeu.FORCED;
        g.d().a("adae", "a", 84, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' performing sync (type: '%s')...", (Object) this.m, (Object) adeu);
        try {
            if (!azrk.l()) {
                afum = this.d.h(aczd.SYNC_ID_CUSTOM_CACHE);
            } else {
                afum = this.d.c(aczd.SYNC_ID_CUSTOM_CACHE, this.c.c);
            }
            this.a.a(Status.a, new SyncActivityControlsSettingsInternalResult(((atwh) a(afum.a(new adad(this, adeu), 1, this.e))).k()));
            g.d().a("adae", "a", 71, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' successful!", (Object) this.m);
        } catch (eif e) {
            throw new nja(35001, "Auth error when downloading settings!", (PendingIntent) null, e);
        } catch (babk | babl e2) {
            throw new nja(7, "Downloading settings failed!", (PendingIntent) null, e2);
        } catch (InterruptedException e3) {
            throw new nja(14, "Download thread interrupted!", (PendingIntent) null, e3);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.a.a(status, (SyncActivityControlsSettingsInternalResult) null);
        g.c().a("adae", "a", 78, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' failed with status '%d'!", (Object) this.m, status.i);
    }
}
