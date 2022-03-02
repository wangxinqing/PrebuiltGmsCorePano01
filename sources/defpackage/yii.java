package defpackage;

import android.content.Context;

/* renamed from: yii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yii {
    public static avrb a(Context context) {
        int d = jhg.d(context);
        avrb a = jhg.a(context, true, (String) null, 0, d != -1 ? Integer.valueOf(d) : null, (jik) null, (anoc) null);
        aucd aucd = (aucd) a.c(5);
        aucd.a((aucj) a);
        aucf aucf = (aucf) aucd;
        String a2 = jli.a("ro.oem.key1", "");
        if (!a2.isEmpty()) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            avrb avrb = (avrb) aucf.b;
            avrb avrb2 = avrb.C;
            a2.getClass();
            avrb.a |= 67108864;
            avrb.A = a2;
        }
        return (avrb) aucf.i();
    }
}
