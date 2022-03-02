package defpackage;

import android.util.Log;

/* renamed from: acxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxi extends acxw {
    private final acxm a = new acxm();

    public final int a() {
        return 27532;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        int i;
        boolean c = azqq.c();
        int length = objArr.length;
        if (length > 3) {
            int i2 = 0;
            try {
                String str = objArr[0];
                int intValue = objArr[1].intValue();
                int i3 = 2;
                int intValue2 = objArr[2].intValue();
                int intValue3 = objArr[3].intValue();
                if (this.a.a(str)) {
                    aucd b = acxa.b();
                    bbl bbl = bbl.NOTIFICATION_ALERT;
                    if (b.c) {
                        b.c();
                        b.c = false;
                    }
                    avqd avqd = (avqd) b.b;
                    avqd avqd2 = avqd.al;
                    avqd.d = bbl.CA;
                    int i4 = avqd.a | 2;
                    avqd.a = i4;
                    avqd.c = 1;
                    int i5 = i4 | 1;
                    avqd.a = i5;
                    if (intValue == 1) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (intValue2 != 1) {
                        i3 = 0;
                    }
                    int i6 = i | i3;
                    if (intValue3 == 1) {
                        i2 = 4;
                    }
                    int i7 = i6 | i2;
                    int i8 = i5 | 32;
                    avqd.a = i8;
                    avqd.g = i7;
                    acxm acxm = this.a;
                    String str2 = acxm.a;
                    str2.getClass();
                    int i9 = i8 | 16;
                    avqd.a = i9;
                    avqd.f = str2;
                    int i10 = acxm.b;
                    int i11 = i9 | 512;
                    avqd.a = i11;
                    avqd.k = i10;
                    String str3 = acxm.c;
                    str3.getClass();
                    int i12 = i11 | 1024;
                    avqd.a = i12;
                    avqd.l = str3;
                    avqd.a = i12 | 4;
                    avqd.e = j;
                    a(b);
                    acxa.a(b);
                } else if (c) {
                    String valueOf = String.valueOf(str);
                    Log.e("NotificationAlertParser", valueOf.length() == 0 ? new String("unable to parse key: ") : "unable to parse key: ".concat(valueOf));
                }
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("NotificationAlertParser", "unexpected operand type: ", e);
                }
            }
        } else if (c) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("wrong number of operands: ");
            sb.append(length);
            Log.w("NotificationAlertParser", sb.toString());
        }
    }
}
