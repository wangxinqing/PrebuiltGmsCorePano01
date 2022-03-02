package defpackage;

import android.hardware.location.ContextHubMessage;
import java.util.Locale;

/* renamed from: arob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arob extends arnv implements arnk {
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final byte[] f;

    public arob(arnz arnz, String str, int i, int i2, int i3, int i4, byte[] bArr) {
        super(arnz, str);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = bArr;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ arnu a(Object obj, Object obj2) {
        return new aroa((arnj) obj, (Integer) obj2);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        Integer num = (Integer) obj;
        return num != null && num.intValue() == 1;
    }

    public final void run() {
        int i;
        arnz arnz = this.a;
        int i2 = arnz.g;
        if (i2 >= 8) {
            arom arom = new arom(this.f, arnz.a.incrementAndGet(), this.d, this.e, i2);
            i = Integer.MAX_VALUE;
            while (arom.a() && !a(i)) {
                byte[] b2 = arom.b();
                arnz arnz2 = this.a;
                int i3 = this.b;
                int i4 = this.c;
                synchronized (arnz2.e) {
                    arnz2.e.a(0, i4);
                }
                i = arnz2.h.sendMessage(i3, i4, new ContextHubMessage(0, 1, b2));
            }
        } else {
            Locale locale = Locale.ENGLISH;
            Object[] objArr = {8, Integer.valueOf(i2)};
            i = -1;
        }
        c(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        return 1;
    }
}
