package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: tg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tg extends ti {
    final /* synthetic */ tn a;
    private final PowerManager c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tg(tn tnVar, Context context) {
        super(tnVar);
        this.a = tnVar;
        this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public final int a() {
        int i = Build.VERSION.SDK_INT;
        return this.c.isPowerSaveMode() ? 2 : 1;
    }

    public final void b() {
        this.a.j();
    }

    public final IntentFilter c() {
        int i = Build.VERSION.SDK_INT;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
