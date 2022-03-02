package defpackage;

import android.util.Log;

/* renamed from: acxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acxo extends acxw {
    public final int a() {
        return 27500;
    }

    /* access modifiers changed from: protected */
    public final void a(acxa acxa, long j, Object[] objArr) {
        boolean c = azqq.c();
        if (objArr.length > 0) {
            try {
                acxa.b("tron_notification_load", objArr[0].intValue());
            } catch (ClassCastException e) {
                if (c) {
                    Log.e("NotificationPanelRvled", "unexpected operand type: ", e);
                }
            }
        }
        aucd b = acxa.b();
        bbl bbl = bbl.NOTIFICATION_PANEL;
        if (b.c) {
            b.c();
            b.c = false;
        }
        avqd avqd = (avqd) b.b;
        avqd avqd2 = avqd.al;
        avqd.d = bbl.CA;
        int i = avqd.a | 2;
        avqd.a = i;
        avqd.c = 1;
        int i2 = i | 1;
        avqd.a = i2;
        avqd.a = i2 | 4;
        avqd.e = j;
        acxa.a(b);
    }
}
