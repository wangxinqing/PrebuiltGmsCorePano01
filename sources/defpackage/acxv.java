package defpackage;

import android.util.Log;

/* renamed from: acxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxv extends acxw {
    public final int a() {
        return 524287;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        boolean c = azqq.c();
        int length = objArr.length;
        int i = 2;
        if (length >= 2) {
            try {
                bbl a = bbl.a(objArr[0].intValue());
                int intValue = objArr[1].intValue();
                aucd b = acxa.b();
                if (a != null) {
                    if (b.c) {
                        b.c();
                        b.c = false;
                    }
                    avqd avqd = (avqd) b.b;
                    avqd avqd2 = avqd.al;
                    avqd.d = a.CA;
                    avqd.a |= 2;
                }
                if (intValue == 0) {
                    i = 3;
                }
                if (b.c) {
                    b.c();
                    b.c = false;
                }
                avqd avqd3 = (avqd) b.b;
                avqd avqd4 = avqd.al;
                avqd3.c = i - 1;
                int i2 = avqd3.a | 1;
                avqd3.a = i2;
                avqd3.a = i2 | 4;
                avqd3.e = j;
                acxa.a(b);
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("SysuiViewVisParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            Log.w("SysuiViewVisParser", sb.toString());
        }
    }
}
