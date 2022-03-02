package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: rnc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class rnc extends rmw {
    private final BroadcastReceiver d = new rnb(this);

    public rnc(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.a.registerReceiver(this.d, new IntentFilter("android.location.MODE_CHANGED"));
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a.unregisterReceiver(this.d);
    }
}
