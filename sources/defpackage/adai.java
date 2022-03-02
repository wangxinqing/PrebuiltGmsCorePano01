package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
import java.util.concurrent.Executor;

/* renamed from: adai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adai extends aczj {
    private static final anij o = addh.b();
    public final atxi k;
    public final addq l;
    private final aekn p;
    private long q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adai(mfa mfa, ClientContext clientContext, adev adev, atxi atxi, addq addq, aful aful, Executor executor, FacsCacheCallOptions facsCacheCallOptions, adde adde, agos agos, aekn aekn, mep mep) {
        super("UpdateActivityControlsSettingsOperation", mfa, clientContext, adev, aful, executor, facsCacheCallOptions, adde, agos, 1007, mep);
        this.k = atxi;
        this.l = addq;
        this.p = aekn;
    }

    private final atxj d() {
        afum afum;
        o.d().a("adai", "d", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' performing upload...", (Object) this.m);
        try {
            if (!azrk.l()) {
                afum = this.d.h(aczd.SYNC_ID_CUSTOM_CACHE);
            } else {
                afum = this.d.c(aczd.SYNC_ID_CUSTOM_CACHE, this.b.c);
            }
            return (atxj) a(afum.a(new adah(this), 1, this.e));
        } catch (eif e) {
            throw new nja(35001, "Auth error when uploading settings!", (PendingIntent) null, e);
        } catch (babk | babl e2) {
            throw new nja(7, "Uploading settings failed!", (PendingIntent) null, e2);
        } catch (InterruptedException e3) {
            throw new nja(14, "Upload thread interrupted!", (PendingIntent) null, e3);
        }
    }

    private final byte[] e() {
        o.d().a("adai", "e", 151, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Forwarding operation '%s' to internal FACS API...", (Object) this.m);
        mep mep = this.i;
        atxi atxi = this.k;
        FacsInternalSyncCallOptions facsInternalSyncCallOptions = new FacsInternalSyncCallOptions(false);
        iha b = ihb.b();
        b.a = new mek(atxi, facsInternalSyncCallOptions);
        return (byte[]) a(mep.a(b.a()));
    }

    public final void a(Context context) {
        byte[] bArr;
        afum afum;
        o.d().a("adai", "a", 125, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Executing operation '%s'...", (Object) this.m);
        this.q = this.p.b();
        a();
        a(azrk.a.a().y());
        this.h.a();
        if (azrk.g()) {
            o.d().a("adai", "e", 151, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Forwarding operation '%s' to internal FACS API...", (Object) this.m);
            mep mep = this.i;
            atxi atxi = this.k;
            FacsInternalSyncCallOptions facsInternalSyncCallOptions = new FacsInternalSyncCallOptions(false);
            iha b = ihb.b();
            b.a = new mek(atxi, facsInternalSyncCallOptions);
            bArr = (byte[]) a(mep.a(b.a()));
        } else {
            o.d().a("adai", "d", 93, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' performing upload...", (Object) this.m);
            try {
                if (!azrk.l()) {
                    afum = this.d.h(aczd.SYNC_ID_CUSTOM_CACHE);
                } else {
                    afum = this.d.c(aczd.SYNC_ID_CUSTOM_CACHE, this.b.c);
                }
                bArr = ((atxj) a(afum.a(new adah(this), 1, this.e))).k();
            } catch (eif e) {
                throw new nja(35001, "Auth error when uploading settings!", (PendingIntent) null, e);
            } catch (babk | babl e2) {
                throw new nja(7, "Uploading settings failed!", (PendingIntent) null, e2);
            } catch (InterruptedException e3) {
                throw new nja(14, "Upload thread interrupted!", (PendingIntent) null, e3);
            }
        }
        a(Status.a.i, this.p.b() - this.q);
        this.a.a(Status.a, new UpdateActivityControlsSettingsResult(bArr));
    }

    public final void a(Status status) {
        a(status.i, this.p.b() - this.q);
        this.a.a(status, (UpdateActivityControlsSettingsResult) null);
    }
}
