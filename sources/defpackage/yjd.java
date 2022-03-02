package defpackage;

import android.accounts.Account;
import android.content.Context;

/* renamed from: yjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yjd {
    final hol a;

    public yjd(Context context) {
        String str;
        Account[] a2 = qub.a(context).a("com.google");
        if (a2.length > 0) {
            str = a2[0].name;
        } else {
            str = null;
        }
        this.a = new hol(context, "PHONESKY_RECOVERY", str);
    }

    public final void a(int i) {
        a(i, 2);
    }

    public final void a(int i, int i2) {
        aucd o = atfp.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atfp atfp = (atfp) o.b;
        atfp.b = i - 1;
        int i3 = atfp.a | 1;
        atfp.a = i3;
        atfp.c = i2 - 1;
        atfp.a = i3 | 2;
        this.a.a((audx) o.i()).b();
    }
}
