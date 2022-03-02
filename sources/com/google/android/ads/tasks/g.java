package com.google.android.ads.tasks;

import com.google.android.gms.ads.identifier.c;
import com.google.android.gms.ads.identifier.d;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class g extends v {
    public g(bhm bhm, String str, String str2, aucd aucd, int i) {
        super(bhm, str, str2, aucd, i, 24);
    }

    private final void c() {
        d a = this.a.a();
        if (a != null) {
            try {
                c b = a.b();
                String a2 = bho.a(b.a);
                if (a2 != null) {
                    synchronized (this.g) {
                        aucd aucd = this.g;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        com.google.ads.afma.proto2api.c cVar = (com.google.ads.afma.proto2api.c) aucd.b;
                        com.google.ads.afma.proto2api.c cVar2 = com.google.ads.afma.proto2api.c.Q;
                        a2.getClass();
                        cVar.c |= 128;
                        cVar.L = a2;
                        aucd aucd2 = this.g;
                        boolean z = b.b;
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        com.google.ads.afma.proto2api.c cVar3 = (com.google.ads.afma.proto2api.c) aucd2.b;
                        cVar3.c |= 512;
                        cVar3.N = z;
                        aucd aucd3 = this.g;
                        if (aucd3.c) {
                            aucd3.c();
                            aucd3.c = false;
                        }
                        com.google.ads.afma.proto2api.c cVar4 = (com.google.ads.afma.proto2api.c) aucd3.b;
                        cVar4.M = 5;
                        cVar4.c |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    }
                }
            } catch (IOException e) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!this.a.m) {
            synchronized (this.g) {
                aucd aucd = this.g;
                String str = (String) this.d.invoke((Object) null, new Object[]{this.a.a});
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                com.google.ads.afma.proto2api.c cVar = (com.google.ads.afma.proto2api.c) aucd.b;
                com.google.ads.afma.proto2api.c cVar2 = com.google.ads.afma.proto2api.c.Q;
                str.getClass();
                cVar.c |= 128;
                cVar.L = str;
            }
            return;
        }
        c();
    }

    public final Void b() {
        bhm bhm = this.a;
        if (bhm.o) {
            return super.call();
        }
        if (!bhm.m) {
            return null;
        }
        c();
        return null;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return call();
    }
}
