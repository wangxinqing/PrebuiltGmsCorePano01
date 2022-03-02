package defpackage;

import android.os.SystemClock;

/* renamed from: jge  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jge implements qvq {
    static volatile long a = 0;
    public final amri b;

    public jge(amri amri) {
        this.b = amri;
    }

    public static Object a(long j) {
        long j2 = j - jfa.a.b;
        if (j2 > a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            a = uptimeMillis;
            if (j2 > uptimeMillis) {
                return jez.a("handler");
            }
        }
        return jez.a();
    }

    public final void a(Object obj) {
        if (obj == Boolean.TRUE) {
            amlv.a((amko) null, amlw.a);
        }
    }
}
