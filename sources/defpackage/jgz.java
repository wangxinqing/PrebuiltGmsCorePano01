package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: jgz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class jgz extends BroadcastReceiver {
    final /* synthetic */ jha a;

    public jgz(jha jha) {
        this.a = jha;
    }

    public final void onReceive(Context context, Intent intent) {
        amky b = this.a.a.b("onAlarm");
        try {
            this.a.b();
            if (b != null) {
                b.close();
                return;
            }
            return;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }
}
