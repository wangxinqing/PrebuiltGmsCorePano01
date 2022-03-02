package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.WifiScan;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: airk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airk {
    private final HashMap a = new HashMap(1);

    public final synchronized void a(ajbg ajbg, PendingIntent pendingIntent) {
        this.a.put(pendingIntent, new aipr(pendingIntent, 0, ajbg, (ajrb) null, true, false, "tag"));
    }

    public final synchronized void a(PendingIntent pendingIntent) {
        this.a.remove(pendingIntent);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Context context, aibr aibr) {
        int length = aibr.a.length;
        StringBuilder sb = new StringBuilder(42);
        sb.append("reportWifiScan, byte length is ");
        sb.append(length);
        sb.toString();
        WifiScan a2 = atis.a(aibr);
        Intent intent = new Intent();
        intent.putExtra("location.WIFI_SCAN", ivy.a(a2));
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            aipr aipr = (aipr) it.next();
            String valueOf = String.valueOf(aipr);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb2.append("sending wifiScan to ");
            sb2.append(valueOf);
            sb2.toString();
            if (!aipr.a(context, intent)) {
                it.remove();
            }
        }
    }
}
