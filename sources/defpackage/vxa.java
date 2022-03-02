package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: vxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class vxa extends vwz {
    private final PowerManager c;
    private final KeyguardManager d;

    public vxa(Context context) {
        super(context);
        this.c = (PowerManager) context.getSystemService("power");
        this.d = (KeyguardManager) context.getSystemService("keyguard");
    }

    public final boolean a() {
        return this.c != null && this.d != null && Build.VERSION.SDK_INT >= 23 && this.c.isInteractive() && !this.d.isKeyguardLocked();
    }

    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        return intentFilter;
    }
}
