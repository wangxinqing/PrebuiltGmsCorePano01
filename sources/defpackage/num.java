package defpackage;

import android.net.Network;

/* renamed from: num  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class num {
    private Network a;
    private String b;
    private final boolean c;

    public num(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Network a() {
        if (!this.c) {
            return null;
        }
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Network network) {
        if (this.c) {
            this.a = network;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(String str) {
        if (this.c) {
            this.b = str;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.c) {
            this.a = null;
        }
    }

    public final synchronized String c() {
        if (!this.c) {
            return null;
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.c) {
            this.b = null;
        }
    }
}
