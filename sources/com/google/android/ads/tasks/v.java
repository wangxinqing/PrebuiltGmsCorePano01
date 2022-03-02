package com.google.android.ads.tasks;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class v implements Callable {
    protected final bhm a;
    protected final String b;
    protected final String c;
    protected Method d;
    protected final int e;
    protected final int f;
    protected final aucd g;

    public v(bhm bhm, String str, String str2, aucd aucd, int i, int i2) {
        getClass().getSimpleName();
        this.a = bhm;
        this.b = str;
        this.c = str2;
        this.g = aucd;
        this.e = i;
        this.f = i2;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* renamed from: b */
    public Void call() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method a2 = this.a.a(this.b, this.c);
            this.d = a2;
            if (a2 == null) {
                return null;
            }
            a();
            bgm bgm = this.a.l;
            if (!(bgm == null || (i = this.e) == Integer.MIN_VALUE)) {
                bgm.a(this.f, i, (System.nanoTime() - nanoTime) / 1000, (String) null, (Exception) null);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
        }
    }
}
