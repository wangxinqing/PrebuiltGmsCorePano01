package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: nvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nvy {
    public final qwq a;
    private final Context b;

    public nvy(Context context, qwq qwq) {
        this.b = context;
        this.a = qwq;
    }

    public final void a(Bundle bundle) {
        String string = bundle.getString("google.c.cm.cat");
        String string2 = bundle.getString("google.c.cm.from");
        if (string == null) {
            Log.e("GCM", "device-time message is missing a required field: msg discarded");
            return;
        }
        Intent intent = new Intent("com.google.android.c2dm.intent.RECEIVE");
        intent.setPackage(string);
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.cm.")) {
                bundle2.remove(str);
            }
        }
        intent.putExtras(bundle2);
        if (string2 != null) {
            intent.putExtra("from", string2);
        }
        Log.i("GCM", string.length() == 0 ? new String("device-time message is being broadcast to ") : "device-time message is being broadcast to ".concat(string));
        this.b.sendOrderedBroadcast(intent, (String) null);
    }
}
