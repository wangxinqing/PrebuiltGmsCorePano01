package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.location.internal.server.ServiceThread$LogRequestReceiver;

/* renamed from: airc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class airc implements Runnable {
    private final ServiceThread$LogRequestReceiver a;
    private final Context b;
    private final Intent c;

    public airc(ServiceThread$LogRequestReceiver serviceThread$LogRequestReceiver, Context context, Intent intent) {
        this.a = serviceThread$LogRequestReceiver;
        this.b = context;
        this.c = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = new java.io.File(new java.io.File(r1.getCacheDir(), "compactlog"), "CompactLoggerTmpFullLogFile");
        r6 = r0.a;
        r9 = r2.getLongExtra("boot_time", -1);
        r11 = r2.getLongExtra("last_event_time", -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            com.google.android.location.internal.server.ServiceThread$LogRequestReceiver r0 = r15.a
            android.content.Context r1 = r15.b
            android.content.Intent r2 = r15.c
            aicj r3 = r0.a
            if (r3 == 0) goto L_0x0070
            java.io.File r3 = new java.io.File
            java.io.File r4 = r1.getCacheDir()
            java.lang.String r5 = "compactlog"
            r3.<init>(r4, r5)
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "CompactLoggerTmpFullLogFile"
            r4.<init>(r3, r5)
            aicj r6 = r0.a
            java.lang.String r0 = "boot_time"
            r7 = -1
            long r9 = r2.getLongExtra(r0, r7)
            java.lang.String r3 = "last_event_time"
            long r11 = r2.getLongExtra(r3, r7)
            r5 = -1
            java.lang.String r13 = "max_location_historian_events"
            int r5 = r2.getIntExtra(r13, r5)
            java.lang.String r13 = "current_time_key"
            long r13 = r2.getLongExtra(r13, r7)
            r7 = r4
            r8 = r9
            r10 = r11
            r12 = r5
            aicg r2 = r6.a(r7, r8, r10, r12, r13)
            if (r2 == 0) goto L_0x0070
            java.lang.String r5 = "com.google.android.gms.fileprovider"
            android.net.Uri r4 = defpackage.ki.a(r1, r5, r4)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "com.google.android.location.internal.server.SEND_LOG_DATA_ACTION"
            r5.<init>(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "content_uri_key"
            r5.putExtra(r6, r4)
            r4 = 4
            java.lang.String r6 = "data_version_key"
            r5.putExtra(r6, r4)
            long r6 = r2.a
            r5.putExtra(r0, r6)
            long r6 = r2.b
            r5.putExtra(r3, r6)
            android.content.Context r0 = r1.getApplicationContext()
            r0.sendBroadcast(r5)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airc.run():void");
    }
}
