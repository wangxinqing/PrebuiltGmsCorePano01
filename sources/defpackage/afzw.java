package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: afzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class afzw extends BroadcastReceiver {
    final /* synthetic */ agab a;

    public afzw(agab agab) {
        this.a = agab;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            agab agab = this.a;
            String str = agab.a;
            agab.a();
        }
    }
}
