package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: znk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class znk extends zni {
    private final ilh a;
    private final Integer b;
    private final Integer c;

    public znk(ilh ilh) {
        this(ilh, (Integer) null, (Integer) null);
    }

    public final View a(int i, View view, ViewGroup viewGroup, boolean z) {
        return a(b(i), view, viewGroup, z);
    }

    /* access modifiers changed from: protected */
    public abstract View a(Object obj, View view, ViewGroup viewGroup, boolean z);

    public final Object b(int i) {
        return this.a.a(this.b.intValue() + i);
    }

    public final int d() {
        return this.c.intValue();
    }

    public znk(ilh ilh, Integer num, Integer num2) {
        boolean z;
        boolean z2 = false;
        num = num == null ? 0 : num;
        num2 = num2 == null ? Integer.valueOf(ilh.a()) : num2;
        if (num.intValue() >= 0) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z, "rangeStart");
        iva.b(num2.intValue() <= ilh.a() ? true : z2, "rangeEnd");
        this.a = ilh;
        this.b = num;
        this.c = Integer.valueOf(num2.intValue() - num.intValue());
    }
}
