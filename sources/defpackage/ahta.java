package defpackage;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: ahta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahta extends ahuo {
    protected final ahsz a = new ahsz(this);
    protected final Context b;

    public ahta(Context context, ahsr ahsr, ahss ahss, ajrh ajrh) {
        super(ahsr, ahss, ajrh);
        this.b = context;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        ahsz ahsz = this.a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        ahta ahta = ahsz.a;
        ahta.b.registerReceiver(ahsz, intentFilter, (String) null, ahta.h);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        ahsz ahsz = this.a;
        ahsz.a.b.unregisterReceiver(ahsz);
    }

    public final void a(int i, long j) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("adding newDeviceState: ");
        sb.append(i);
        sb.toString();
        this.h.a.a(i, j);
    }
}
