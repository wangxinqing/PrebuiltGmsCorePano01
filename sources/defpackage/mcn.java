package defpackage;

import android.content.Context;

/* renamed from: mcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mcn implements mcw {
    public final mcv a(Context context, String str, mcu mcu) {
        mcv mcv = new mcv();
        int a = mcu.a(context, str, true);
        mcv.b = a;
        if (a == 0) {
            int a2 = mcu.a(context, str);
            mcv.a = a2;
            if (a2 != 0) {
                mcv.c = -1;
            }
        } else {
            mcv.c = 1;
        }
        return mcv;
    }
}
