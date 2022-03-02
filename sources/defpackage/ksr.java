package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: ksr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ksr extends Service implements ksg, ksq, ksl, kss {
    static {
        new ith("DriveEventService", "");
    }

    public static Intent a(String str) {
        Intent intent = new Intent("com.google.android.gms.drive.events.HANDLE_EVENT");
        intent.setPackage(str);
        return intent;
    }

    public final void a() {
        throw null;
    }

    public final void b() {
        throw null;
    }

    public final void c() {
        throw null;
    }

    public final synchronized IBinder onBind(Intent intent) {
        throw null;
    }

    public final synchronized void onDestroy() {
        throw null;
    }

    public final boolean onUnbind(Intent intent) {
        throw null;
    }
}
