package defpackage;

import android.util.Log;

/* renamed from: acxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxs extends acxw {
    public final int a() {
        return 36004;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        boolean c = azqq.c();
        int length = objArr.length;
        if (length >= 6) {
            try {
                int intValue = objArr[0].intValue();
                int i = 3;
                int intValue2 = objArr[3].intValue();
                int intValue3 = objArr[4].intValue();
                bbl bbl = bbl.LOCKSCREEN;
                if (intValue != 0) {
                    if (intValue2 == 1) {
                        bbl = bbl.BOUNCER;
                    }
                    i = 2;
                }
                aucd b = acxa.b();
                if (b.c) {
                    b.c();
                    b.c = false;
                }
                avqd avqd = (avqd) b.b;
                avqd avqd2 = avqd.al;
                avqd.d = bbl.CA;
                int i2 = avqd.a | 2;
                avqd.a = i2;
                int i3 = i2 | 32;
                avqd.a = i3;
                avqd.g = intValue3;
                avqd.c = i - 1;
                int i4 = i3 | 1;
                avqd.a = i4;
                avqd.a = i4 | 4;
                avqd.e = j;
                acxa.a(b);
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("StatusBarStateParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            Log.w("StatusBarStateParser", sb.toString());
        }
    }
}
