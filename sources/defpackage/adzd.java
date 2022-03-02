package defpackage;

import android.content.Context;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;

/* renamed from: adzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adzd extends aeax {
    final /* synthetic */ adze a;
    private volatile int b = -1;

    public adzd(adze adze) {
        this.a = adze;
    }

    public final void b() {
        a((Runnable) new adzb());
    }

    public final void c() {
        a((Runnable) new adza());
    }

    public final void d() {
        a((Runnable) new adyw());
    }

    public final void e() {
        a((Runnable) new adyx());
    }

    private final boolean a(Runnable runnable) {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            if (aebv.a((Context) this.a).a("com.google.android.wearable.app.cn") && jll.a(this.a, callingUid, "com.google.android.wearable.app.cn")) {
                this.b = callingUid;
            } else if (jll.a(this.a, callingUid)) {
                this.b = callingUid;
            } else {
                StringBuilder sb = new StringBuilder(57);
                sb.append("Caller is not GooglePlayServices; caller UID: ");
                sb.append(callingUid);
                Log.e("WearableLS", sb.toString());
                return false;
            }
        }
        synchronized (this.a.c) {
            adze adze = this.a;
            if (adze.d) {
                return false;
            }
            adze.a.post(runnable);
            return true;
        }
    }

    public final void a() {
        a((Runnable) new adyy());
    }

    public final void a(DataHolder dataHolder) {
        adyu adyu = new adyu(dataHolder);
        try {
            String valueOf = String.valueOf(dataHolder);
            int i = dataHolder.h;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append(valueOf);
            sb.append(", rows=");
            sb.append(i);
            sb.toString();
            if (a((Runnable) adyu)) {
            }
        } finally {
            dataHolder.close();
        }
    }

    public final void a(CapabilityInfoParcelable capabilityInfoParcelable) {
        a((Runnable) new adyz(this, capabilityInfoParcelable));
    }

    public final void a(ChannelEventParcelable channelEventParcelable) {
        a((Runnable) new adzc(this, channelEventParcelable));
    }

    public final void a(MessageEventParcelable messageEventParcelable) {
        a((Runnable) new adyv(this, messageEventParcelable));
    }
}
