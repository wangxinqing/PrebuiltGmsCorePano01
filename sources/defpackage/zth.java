package defpackage;

import android.content.Context;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zth {
    private static final zsg a = zsg.a("BackupAndSyncApiHelper");
    private final wsu b;

    public zth(Context context) {
        wlr wlr = new wlr();
        wlr.a = 80;
        this.b = wst.a(context, wlr.a());
    }

    /* access modifiers changed from: package-private */
    public final amri a() {
        try {
            return amri.b((BackupAndSyncOptInState) acws.a(this.b.a(), 500, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (azfa.g()) {
                a.d("Failed to get backup and sync opt-in state.");
            } else {
                a.e("BackupAndSyncApiHelper", "Failed to get backup and sync opt-in state.");
            }
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return ampu.a;
        }
    }
}
