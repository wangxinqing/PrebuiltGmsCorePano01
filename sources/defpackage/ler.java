package defpackage;

import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SyncResult;

/* renamed from: ler  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ler implements Runnable {
    private final ley a;
    private final ServiceConnection b;
    private final String c;

    public ler(ley ley, ServiceConnection serviceConnection, String str) {
        this.a = ley;
        this.b = serviceConnection;
        this.c = str;
    }

    public final void run() {
        ley ley = this.a;
        ServiceConnection serviceConnection = this.b;
        String str = this.c;
        try {
            jzk.a().b();
            jca.a().a(ley.b, "SyncScheduler", new Intent().setClassName(ley.b, "com.google.android.gms.drive.metadata.sync.syncadapter.MetadataSyncService"), serviceConnection, 1);
        } catch (InterruptedException e) {
            ley.a(str, 2, (SyncResult) null);
        }
    }
}
