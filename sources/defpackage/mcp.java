package defpackage;

import android.content.Context;

/* renamed from: mcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mcp implements mcw {
    public final mcv a(Context context, String str, mcu mcu) {
        int i;
        mcv mcv = new mcv();
        int a = mcu.a(context, str);
        mcv.a = a;
        if (a != 0) {
            i = mcu.a(context, str, false);
            mcv.b = i;
        } else {
            i = mcu.a(context, str, true);
            mcv.b = i;
        }
        int i2 = mcv.a;
        if (i2 == 0 && i == 0) {
            mcv.c = 0;
        } else if (i2 >= i) {
            mcv.c = -1;
        } else {
            mcv.c = 1;
        }
        return mcv;
    }
}
