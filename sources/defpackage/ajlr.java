package defpackage;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import java.io.IOException;

/* renamed from: ajlr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajlr extends jeu {
    public ajlr(Context context) {
        super(context, "location");
    }

    /* access modifiers changed from: protected */
    public final int a() {
        return 8705;
    }

    /* access modifiers changed from: protected */
    public final void a(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        String a = rmp.a(account);
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 28 + String.valueOf(str).length() + String.valueOf(valueOf).length());
        sb.append("onPerformSync() called: ");
        sb.append(a);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(valueOf);
        sb.toString();
        Context context = getContext();
        if (bundle == null || !bundle.getBoolean("initialize", false)) {
            try {
                ajls.a(context).a(account, (Boolean) null, (Boolean) null, false, (String) null);
            } catch (eif e) {
                ajix.b("GCoreUlr", "", (Throwable) e);
                syncResult.stats.numAuthExceptions++;
                ajjb.a("UlrSyncException");
            } catch (IOException e2) {
                ajix.b("GCoreUlr", "", (Throwable) e2);
                syncResult.stats.numIoExceptions++;
                ajjb.a("UlrSyncException");
            } catch (babk e3) {
                ajix.b("GCoreUlr", "", (Throwable) e3);
                if (e3.a.r == babg.UNAUTHENTICATED) {
                    syncResult.stats.numAuthExceptions++;
                } else {
                    syncResult.stats.numIoExceptions++;
                }
                ajjb.a("UlrSyncException");
            }
        } else {
            ReportingSyncChimeraService.a(account, context);
        }
    }
}
