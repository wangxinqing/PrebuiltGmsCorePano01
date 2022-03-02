package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: azxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azxh {
    public static final azxh a = new azxh();
    public azyf b;
    public Executor c;
    public azxf d;
    public String e;
    public List f = Collections.emptyList();
    public Boolean g;
    public Integer h;
    public Integer i;
    private Object[][] j = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));

    private azxh() {
    }

    public final azxh a(int i2) {
        amrl.a(i2 >= 0, "invalid maxsize %s", i2);
        azxh azxh = new azxh(this);
        azxh.h = Integer.valueOf(i2);
        return azxh;
    }

    public final azxh b(int i2) {
        amrl.a(i2 >= 0, "invalid maxsize %s", i2);
        azxh azxh = new azxh(this);
        azxh.i = Integer.valueOf(i2);
        return azxh;
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("deadline", (Object) this.b);
        Class<?> cls = null;
        a2.a("authority", (Object) null);
        a2.a("callCredentials", (Object) this.d);
        Executor executor = this.c;
        if (executor != null) {
            cls = executor.getClass();
        }
        a2.a("executor", (Object) cls);
        a2.a("compressorName", (Object) this.e);
        a2.a("customOptions", (Object) Arrays.deepToString(this.j));
        a2.a("waitForReady", a());
        a2.a("maxInboundMessageSize", (Object) this.h);
        a2.a("maxOutboundMessageSize", (Object) this.i);
        a2.a("streamTracerFactories", (Object) this.f);
        return a2.toString();
    }

    public final azxh a(long j2, TimeUnit timeUnit) {
        return a(azyf.a(j2, timeUnit));
    }

    public azxh(azxh azxh) {
        this.b = azxh.b;
        this.d = azxh.d;
        this.c = azxh.c;
        this.e = azxh.e;
        this.j = azxh.j;
        this.g = azxh.g;
        this.h = azxh.h;
        this.i = azxh.i;
        this.f = azxh.f;
    }

    public final azxh a(azxg azxg, Object obj) {
        int i2;
        amrl.a((Object) azxg, (Object) "key");
        amrl.a(obj, (Object) "value");
        azxh azxh = new azxh(this);
        int i3 = 0;
        while (true) {
            Object[][] objArr = this.j;
            if (i3 >= objArr.length) {
                i3 = -1;
                break;
            } else if (azxg.equals(objArr[i3][0])) {
                break;
            } else {
                i3++;
            }
        }
        int length = this.j.length;
        if (i3 == -1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = length + i2;
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
        azxh.j = objArr2;
        Object[][] objArr3 = this.j;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i3 == -1) {
            azxh.j[this.j.length] = new Object[]{azxg, obj};
        } else {
            azxh.j[i3] = new Object[]{azxg, obj};
        }
        return azxh;
    }

    public final azxh a(azyf azyf) {
        azxh azxh = new azxh(this);
        azxh.b = azyf;
        return azxh;
    }

    public final azxh a(String str) {
        azxh azxh = new azxh(this);
        azxh.e = str;
        return azxh;
    }

    public final Object a(azxg azxg) {
        amrl.a((Object) azxg, (Object) "key");
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.j;
            if (i2 >= objArr.length) {
                return azxg.a;
            }
            if (azxg.equals(objArr[i2][0])) {
                return this.j[i2][1];
            }
            i2++;
        }
    }

    public final boolean a() {
        return Boolean.TRUE.equals(this.g);
    }
}
