package defpackage;

import android.accounts.Account;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.Process;

/* renamed from: xvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvc extends Thread {
    final /* synthetic */ xvd a;
    private final Account b;
    private final Bundle c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xvc(xvd xvd, Account account, Bundle bundle) {
        super("ContactsSyncAdapter_WorkerThread");
        this.a = xvd;
        this.b = account;
        this.c = bundle;
    }

    public final void run() {
        xvd xvd;
        Process.setThreadPriority(10);
        try {
            if (!Thread.currentThread().isInterrupted()) {
                this.a.a(this.b, this.c, "com.android.contacts", new SyncResult());
                xvd = this.a;
            } else {
                xvd = this.a;
            }
            xvd.a = null;
        } catch (Throwable th) {
            this.a.a = null;
            throw th;
        }
    }
}
