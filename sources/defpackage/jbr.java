package defpackage;

import android.app.AlarmManager;

/* renamed from: jbr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class jbr implements AlarmManager.OnAlarmListener {
    private final njy a;

    public jbr(String str, String str2) {
        this.a = new njy((Class) getClass(), 15, str2, str);
    }

    public static jbr a(String str, String str2, Runnable runnable) {
        return new jbq(str, str2, runnable);
    }

    public abstract void a();

    public final void onAlarm() {
        amky b = this.a.b("onAlarm");
        try {
            a();
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

    protected jbr(njy njy) {
        iva.a((Object) njy);
        this.a = njy;
    }
}
