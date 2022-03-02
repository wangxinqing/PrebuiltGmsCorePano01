package defpackage;

import android.util.Log;

/* renamed from: acxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class acxt extends acxw {
    public int a() {
        return 524288;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        boolean z;
        boolean c = azqq.c();
        try {
            int i = -1;
            String str = null;
            if (objArr.length > 1) {
                String str2 = objArr[1];
                if (str2.equals("true")) {
                    z = true;
                    i = 1;
                } else if (str2.equals("false")) {
                    z = true;
                    i = 0;
                } else if (!str2.matches("^-?\\d+$")) {
                    str = str2;
                    z = false;
                } else {
                    try {
                        i = Integer.parseInt(str2);
                        z = true;
                    } catch (NumberFormatException e) {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
            if (objArr.length > 0) {
                bbl a = bbl.a(objArr[0].intValue());
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
                if (b.c) {
                    b.c();
                    b.c = false;
                }
                avqd avqd3 = (avqd) b.b;
                avqd avqd4 = avqd.al;
                avqd3.c = 4;
                int i2 = 1 | avqd3.a;
                avqd3.a = i2;
                int i3 = 4 | i2;
                avqd3.a = i3;
                avqd3.e = j;
                if (str != null) {
                    str.getClass();
                    i3 |= 16;
                    avqd3.a = i3;
                    avqd3.f = str;
                }
                if (z) {
                    avqd3.a = i3 | 32;
                    avqd3.g = i;
                }
                acxa.a(b);
            }
        } catch (ClassCastException e2) {
            if (c) {
                Log.e("SysuiActionParser", "unexpected operand type: ", e2);
            }
        }
    }
}
