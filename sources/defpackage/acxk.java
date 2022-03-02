package defpackage;

import android.util.Log;

/* renamed from: acxk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxk extends acxw {
    private final acxm a = new acxm();

    public final int a() {
        return 27520;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        boolean c = azqq.c();
        if (objArr.length > 0) {
            try {
                if (this.a.a(objArr[0])) {
                    a(objArr, 1);
                    aucd b = acxa.b();
                    bbl bbl = bbl.NOTIFICATION_ITEM;
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
                    int i2 = 1 | i;
                    avqd.a = i2;
                    acxm acxm = this.a;
                    String str = acxm.a;
                    str.getClass();
                    int i3 = i2 | 16;
                    avqd.a = i3;
                    avqd.f = str;
                    int i4 = acxm.b;
                    int i5 = i3 | 512;
                    avqd.a = i5;
                    avqd.k = i4;
                    String str2 = acxm.c;
                    str2.getClass();
                    int i6 = i5 | 1024;
                    avqd.a = i6;
                    avqd.l = str2;
                    avqd.a = i6 | 4;
                    avqd.e = j;
                    a(b);
                    acxa.a(b);
                } else if (c) {
                    Log.e("NotificationClicked", "unable to parse key.");
                }
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("NotificationClicked", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: 0");
            Log.w("NotificationClicked", sb.toString());
        }
    }
}
