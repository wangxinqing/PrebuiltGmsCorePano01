package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: nsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsp {
    static nsp a;
    public static final /* synthetic */ int e = 0;
    public Context b;
    public final Map c = Collections.synchronizedMap(new nz());
    public final BlockingQueue d = new LinkedBlockingQueue();
    private PendingIntent f;

    static {
        new AtomicInteger(1);
    }

    public nsp() {
        new Messenger(new nso(this, Looper.getMainLooper()));
    }

    @Deprecated
    public static synchronized nsp a(Context context) {
        nsp nsp;
        synchronized (nsp.class) {
            if (a == null) {
                nsp nsp2 = new nsp();
                a = nsp2;
                nsp2.b = context.getApplicationContext();
            }
            nsp = a;
        }
        return nsp;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(Intent intent) {
        if (this.f == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f = PendingIntent.getBroadcast(this.b, 0, intent2, 0);
        }
        intent.putExtra("app", this.f);
    }

    @Deprecated
    public final String a(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null ? "gcm" : stringExtra;
    }

    @Deprecated
    public final void a(String str, String str2, Bundle bundle) {
        String str3;
        if (str != null) {
            String a2 = qdt.a(this.b);
            if (a2 != null) {
                Intent intent = new Intent("com.google.android.gcm.intent.SEND");
                intent.putExtras(bundle);
                b(intent);
                intent.setPackage(a2);
                intent.putExtra("google.to", str);
                intent.putExtra("google.message_id", str2);
                intent.putExtra("google.ttl", Long.toString(-1));
                int indexOf = str.indexOf(64);
                if (indexOf > 0) {
                    str3 = str.substring(0, indexOf);
                } else {
                    str3 = str;
                }
                qdc.a(this.b);
                intent.putExtra("google.from", qdc.a.a("", str3, "GCM"));
                if (a2.contains(".gsf")) {
                    Bundle bundle2 = new Bundle();
                    for (String str4 : bundle.keySet()) {
                        Object obj = bundle.get(str4);
                        if (obj instanceof String) {
                            String valueOf = String.valueOf(str4);
                            bundle2.putString(valueOf.length() == 0 ? new String("gcm.") : "gcm.".concat(valueOf), (String) obj);
                        }
                    }
                    bundle2.putString("google.to", str);
                    bundle2.putString("google.message_id", str2);
                    qdc.a(this.b).a("GCM", "upstream", bundle2);
                    return;
                }
                this.b.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
                return;
            }
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IllegalArgumentException("Missing 'to'");
    }
}
