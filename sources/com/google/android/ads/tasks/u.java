package com.google.android.ads.tasks;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class u {
    public final bhm a;
    public final String b;
    public final String c;
    public volatile Method d = null;
    public final Class[] e;
    public final CountDownLatch f = new CountDownLatch(1);

    static {
        u.class.getSimpleName();
    }

    public u(bhm bhm, String str, String str2, Class... clsArr) {
        this.a = bhm;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        bhm.b.submit(new t(this));
    }

    public final String a(byte[] bArr, String str) {
        bgt bgt = this.a.d;
        return new String(bgt.a(bArr, str), "UTF-8");
    }
}
