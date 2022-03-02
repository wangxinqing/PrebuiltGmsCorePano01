package defpackage;

import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: jnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jnj extends jfx {
    final /* synthetic */ PackageManager a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jnj(PackageManager packageManager) {
        super(10);
        this.a = packageManager;
    }

    public final void run() {
        if (jnl.d == null || !jnl.d.booleanValue()) {
            Log.i("CheckinCompat", "Enabling old GoogleServicesFramework version");
        } else {
            Log.i("CheckinCompat", "Disabling old GoogleServicesFramework version");
        }
        if (!jnl.d.booleanValue()) {
            jnl.a(this.a, "com.google.android.gsf", ".checkin.CheckinService", jnl.d.booleanValue());
        }
        jnl.a(this.a, "com.google.android.gsf", ".checkin.CheckinService$Receiver", jnl.d.booleanValue());
        jnl.a(this.a, "com.google.android.gsf", ".checkin.CheckinService$TriggerReceiver", jnl.d.booleanValue());
        jnl.a(this.a, "com.google.android.gsf", ".checkin.CheckinService$SecretCodeReceiver", jnl.d.booleanValue());
        if (jnl.d.booleanValue()) {
            jnl.b();
            jnl.a(this.a, "com.google.android.gsf", ".checkin.CheckinService", jnl.d.booleanValue());
        }
        int i = Build.VERSION.SDK_INT;
        jnl.a(this.a, "com.google.android.gsf", ".update.SystemUpdateActivity", jnl.c.booleanValue());
        if (!jnl.c.booleanValue()) {
            jnl.a(this.a, "com.google.android.gsf", ".update.SystemUpdateService", jnl.c.booleanValue());
        }
        jnl.a(this.a, "com.google.android.gsf", ".update.SystemUpdateService$SecretCodeReceiver", jnl.c.booleanValue());
        jnl.a(this.a, "com.google.android.gsf", ".update.SystemUpdateService$Receiver", jnl.c.booleanValue());
        if (jnl.c.booleanValue()) {
            jnl.b();
            jnl.a(this.a, "com.google.android.gsf", ".update.SystemUpdateService", jnl.c.booleanValue());
        }
        jnl.a(this.a, "com.google.android.gsf", ".checkin.EventLogService", jnl.d.booleanValue());
        jnl.a(this.a, "com.google.android.gsf", ".checkin.EventLogService$Receiver", jnl.d.booleanValue());
        if (jnl.d == null || !jnl.d.booleanValue()) {
            Log.i("CheckinCompat", "Done enabling old GoogleServicesFramework version");
        } else {
            Log.i("CheckinCompat", "Done disabling old GoogleServicesFramework version");
        }
    }
}
