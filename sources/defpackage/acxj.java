package defpackage;

import android.util.Log;

/* renamed from: acxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxj extends acxw {
    private final acxm a = new acxm();

    public final int a() {
        return 27530;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        boolean c = azqq.c();
        if (objArr.length > 1) {
            try {
                String str = objArr[0];
                int intValue = objArr[1].intValue();
                a(objArr, 2);
                if (this.a.a(str)) {
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
                    avqd.c = 5;
                    int i2 = 1 | i;
                    avqd.a = i2;
                    int i3 = i2 | 32;
                    avqd.a = i3;
                    avqd.g = intValue;
                    acxm acxm = this.a;
                    String str2 = acxm.a;
                    str2.getClass();
                    int i4 = i3 | 16;
                    avqd.a = i4;
                    avqd.f = str2;
                    int i5 = acxm.b;
                    int i6 = i4 | 512;
                    avqd.a = i6;
                    avqd.k = i5;
                    String str3 = acxm.c;
                    str3.getClass();
                    int i7 = i6 | 1024;
                    avqd.a = i7;
                    avqd.l = str3;
                    avqd.a = i7 | 4;
                    avqd.e = j;
                    a(b);
                    acxa.a(b);
                } else if (c) {
                    String valueOf = String.valueOf(str);
                    Log.e("NotificationCanceledPsr", valueOf.length() == 0 ? new String("unable to parse key: ") : "unable to parse key: ".concat(valueOf));
                }
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("NotificationCanceledPsr", "unexpected operand type: ", e);
                }
            }
        }
    }
}
