package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: aipc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aipc implements arne {
    public final Context a;

    public aipc(Context context) {
        this.a = context;
    }

    public final void a(arnd arnd, arnh arnh, arnt arnt) {
        long id = Thread.currentThread().getId();
        int hashCode = hashCode();
        StringBuilder sb = new StringBuilder(83);
        sb.append("ContextHub receiver thread ID is ");
        sb.append(id);
        sb.append(", callback hash is ");
        sb.append(hashCode);
        sb.toString();
        if (aydu.i()) {
            byte[] bArr = arnt.c;
            int length = bArr.length;
            StringBuilder sb2 = new StringBuilder(44);
            sb2.append("Received nanohub message, length ");
            sb2.append(length);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder(36);
            sb3.append("Message to NLP is length ");
            sb3.append(length);
            sb3.toString();
            atir atir = new atir("com.google.android.gms");
            atir.a(jlr.a(this.a, "com.google.android.gms"));
            Intent intent = atir.a;
            intent.putExtra("com.google.android.location.internal.CACHE_REQUEST_PROTO", bArr);
            intent.putExtra("com.google.android.location.internal.EXTRA_PENDING_INTENT", PendingIntent.getBroadcast(this.a, 0, new Intent("c.g.a.l.i.s.CacheSeverContextHubBridge"), 0));
            this.a.startService(intent);
        }
    }
}
