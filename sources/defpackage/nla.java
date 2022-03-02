package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: nla  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nla extends BroadcastReceiver {
    private final njy a;

    public nla(String str) {
        this.a = jim.a() ? new njy((Class) getClass(), 4, str) : null;
    }

    public abstract void a(Context context, Intent intent);

    public final void onReceive(Context context, Intent intent) {
        if (!axda.a.a().n()) {
            amky a2 = njy.a(this.a, "onReceive");
            try {
                a(context, intent);
                if (a2 != null) {
                    a2.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                apev.a(th, th);
            }
        } else {
            njy njy = this.a;
            if (njy != null) {
                amky a3 = njy.a("onReceive", intent);
                try {
                    a(context, intent);
                    if (a3 != null) {
                        a3.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    apev.a(th, th2);
                }
            } else {
                a(context, intent);
                return;
            }
        }
        throw th;
        throw th;
    }
}
