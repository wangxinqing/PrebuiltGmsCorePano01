package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: adap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adap {
    private static final anax a = anax.a((Object) 9, (Object) 10);
    private final Context b;
    private final Account c;
    private final adaq d;

    public adap(Context context, Account account) {
        this.b = context;
        this.c = account;
        this.d = adaq.a(context);
    }

    static atyt a(atzo atzo, boolean z) {
        int i;
        aucd o = atyt.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atyt atyt = (atyt) o.b;
        atyt.c = 1;
        int i2 = atyt.a | 2;
        atyt.a = i2;
        int i3 = atzo.l;
        int i4 = i2 | 1;
        atyt.a = i4;
        atyt.b = i3;
        if (!z) {
            i = 4;
        } else {
            i = 3;
        }
        atyt.d = i - 1;
        atyt.a = i4 | 4;
        aucd o2 = atyq.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        atyq atyq = (atyq) o2.b;
        int i5 = atyq.a | 1;
        atyq.a = i5;
        atyq.b = true;
        int i6 = i5 | 2;
        atyq.a = i6;
        atyq.c = true;
        atyq.a = 4 | i6;
        atyq.d = true;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atyt atyt2 = (atyt) o.b;
        atyq atyq2 = (atyq) o2.i();
        atyq2.getClass();
        atyt2.e = atyq2;
        atyt2.a |= 8;
        return (atyt) o.i();
    }

    public final Set b() {
        return !c() ? Collections.EMPTY_SET : a;
    }

    public final boolean c() {
        return !jix.a(this.b);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(atzo.SUPPL_WEB_AND_APP_DEVICE_LEVEL, this.d.a(this.c.name, 10)));
        arrayList.add(a(atzo.DEVICE_INFO_DEVICE_LEVEL, this.d.a(this.c.name, 9)));
        return arrayList;
    }

    public final void a(atzg[] atzgArr) {
        int a2;
        boolean z;
        int i;
        int a3;
        ArrayList arrayList = new ArrayList();
        for (atzg atzg : atzgArr) {
            int i2 = atzg.b;
            if ((i2 == 10 || i2 == 9) && (((a2 = atzq.a(atzg.c)) != 0 && a2 == 3) || ((a3 = atzq.a(atzg.c)) != 0 && a3 == 4))) {
                adaq adaq = this.d;
                String str = this.c.name;
                int i3 = atzg.b;
                int a4 = atzq.a(atzg.c);
                if (a4 == 0) {
                    z = false;
                } else {
                    z = a4 == 3;
                }
                synchronized (adaq.b) {
                    if (adaq.b(str, i3) != z) {
                        long currentTimeMillis = System.currentTimeMillis();
                        SharedPreferences.Editor edit = adaq.b.edit();
                        edit.putBoolean(adaq.c(str, i3), z);
                        edit.putLong(adaq.d(str, i3), currentTimeMillis);
                        edit.apply();
                    }
                }
                arrayList.add(Integer.valueOf(atzg.b));
                int i4 = atzg.b;
                if (i4 == 9) {
                    i = 7;
                } else if (i4 != 10) {
                    i = null;
                } else {
                    i = 8;
                }
                if (i != null) {
                    arrayList.add(i);
                }
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        itg.a(this.b, this.c.name, iArr);
    }
}
