package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: amlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amlx extends AtomicInteger {
    public final amlx a;
    public final String b;
    public final int c;
    public final amkv d;
    public int e;
    public amlx f;
    public volatile int g;

    public amlx(amlx amlx, String str, int i, amkv amkv) {
        this.g = 0;
        this.a = amlx;
        this.b = str;
        this.e = -1;
        this.c = i;
        this.d = amkv;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, amlx amlx) {
        this.e = i;
        this.f = amlx;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.g != 0;
    }

    public amlx(String str, amkv amkv, int i) {
        int i2 = 0;
        this.g = 0;
        this.a = null;
        this.b = str;
        this.e = 0;
        this.c = 0;
        this.d = amkv;
        this.g = i != 2 ? Integer.MIN_VALUE : i2;
    }
}
