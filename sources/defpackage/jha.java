package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: jha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jha extends jgx {
    public PendingIntent e;
    final /* synthetic */ jhc f;
    private BroadcastReceiver g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jha(jhc jhc, jgw jgw, String str, int i) {
        super(jhc, jgw, str, i);
        this.f = jhc;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        super.a();
        this.e.cancel();
        this.e = null;
        this.f.b.unregisterReceiver(this.g);
        this.g = null;
    }

    /* access modifiers changed from: protected */
    public final void a(Handler handler) {
        String a = jhc.a(this.b);
        this.e = PendingIntent.getBroadcast(this.f.b, 0, new Intent(a).setPackage(this.f.b.getPackageName()), 134217728);
        this.g = new jgz(this);
        this.f.b.registerReceiver(this.g, new IntentFilter(a), (String) null, handler);
    }
}
