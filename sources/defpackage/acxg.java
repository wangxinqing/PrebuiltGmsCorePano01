package defpackage;

import android.util.Log;

/* renamed from: acxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxg extends acxw {
    public static final bbl[] a = {bbl.VIEW_UNKNOWN, bbl.ACTION_LS_UNLOCK, bbl.ACTION_LS_SHADE, bbl.ACTION_LS_HINT, bbl.ACTION_LS_CAMERA, bbl.ACTION_LS_DIALER, bbl.ACTION_LS_LOCK, bbl.ACTION_LS_NOTE, bbl.ACTION_LS_QS, bbl.ACTION_SHADE_QS_PULL, bbl.ACTION_SHADE_QS_TAP};

    public final int a() {
        return 36021;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        boolean c = azqq.c();
        if (objArr.length > 0) {
            try {
                int intValue = objArr[0].intValue();
                bbl bbl = bbl.VIEW_UNKNOWN;
                if (intValue < a.length) {
                    bbl = a[intValue];
                }
                if (bbl != bbl.VIEW_UNKNOWN) {
                    aucd b = acxa.b();
                    if (b.c) {
                        b.c();
                        b.c = false;
                    }
                    avqd avqd = (avqd) b.b;
                    avqd avqd2 = avqd.al;
                    avqd.d = bbl.CA;
                    int i = avqd.a | 2;
                    avqd.a = i;
                    avqd.c = 4;
                    int i2 = i | 1;
                    avqd.a = i2;
                    avqd.a = i2 | 4;
                    avqd.e = j;
                    acxa.a(b);
                }
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("LockscreenGestureParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: 0");
            Log.w("LockscreenGestureParser", sb.toString());
        }
    }
}
