package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeoutException;

/* renamed from: fzt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fzt extends nis {
    private final fzu a;
    private final ifu b;
    private final String c;

    public fzt(fzu fzu, ifu ifu, String str) {
        super(221, "AuthConfigSync");
        this.a = fzu;
        this.b = ifu;
        this.c = str;
    }

    /* access modifiers changed from: protected */
    public final void a(Context context) {
        try {
            this.a.a(this.c);
            this.b.a(Status.a);
        } catch (fzs e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw new nja(8, "Unknown config sync error");
            } else if (cause instanceof TimeoutException) {
                throw new nja(15, "The request to sync configs timed out", (PendingIntent) null, cause);
            } else if (cause instanceof InterruptedException) {
                Thread.currentThread().interrupt();
                throw new nja(14, "The request to sync configs was interrupted", (PendingIntent) null, cause);
            } else {
                throw new nja(13, "An error occurred while trying to sync configs", (PendingIntent) null, cause);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Status status) {
        this.b.a(status);
    }
}
