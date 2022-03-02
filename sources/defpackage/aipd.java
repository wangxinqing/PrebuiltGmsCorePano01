package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.location.internal.server.CacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver;

/* renamed from: aipd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aipd extends aipe {
    private final arnh a;
    private final Handler b;
    private final aipc c;
    private BroadcastReceiver d;

    public aipd(Context context, arnh arnh, Handler handler) {
        this.a = arnh;
        this.b = handler;
        this.c = new aipc(context);
    }

    public final void a() {
        if (this.d == null) {
            aipc aipc = this.c;
            Context context = aipc.a;
            this.a.b(aipc, this.b);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("c.g.a.l.i.s.CacheSeverContextHubBridge");
            CacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver cacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver = new CacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver(this.a);
            this.d = cacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver;
            context.registerReceiver(cacheServerContextHubBridge$RealCacheServerContextHubBridge$GlsCacheResponseReceiver, intentFilter);
        }
    }

    public final void b() {
        if (this.d != null) {
            aipc aipc = this.c;
            Context context = aipc.a;
            this.a.b(aipc);
            context.unregisterReceiver(this.d);
            this.d = null;
        }
    }
}
