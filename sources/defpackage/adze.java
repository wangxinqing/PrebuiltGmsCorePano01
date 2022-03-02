package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* renamed from: adze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class adze extends Service implements adyo, adyh {
    public adyt a;
    public Intent b;
    public final Object c = new Object();
    public boolean d;
    public final adzp e = new adzp(new adyi());
    private ComponentName f;
    private IBinder g;
    private Looper h;

    public final void a(Channel channel) {
    }

    public void a(CapabilityInfoParcelable capabilityInfoParcelable) {
    }

    public void a(MessageEventParcelable messageEventParcelable) {
        throw null;
    }

    public final void b(Channel channel) {
    }

    public final void c(Channel channel) {
    }

    public final void d(Channel channel) {
    }

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction())) {
            return this.g;
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f = new ComponentName(this, getContainerService().getClass().getName());
        if (this.h == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.h = handlerThread.getLooper();
        }
        this.a = new adyt(this, this.h);
        Intent intent = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.b = intent;
        intent.setComponent(this.f);
        this.g = new adzd(this);
    }

    public void onDestroy() {
        synchronized (this.c) {
            this.d = true;
            adyt adyt = this.a;
            if (adyt != null) {
                adyt.getLooper().quit();
                adyt.a();
            } else {
                String valueOf = String.valueOf(this.f);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 111);
                sb.append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        super.onDestroy();
    }
}
