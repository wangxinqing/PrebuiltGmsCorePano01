package com.google.android.ads.tasks;

import android.content.Context;
import com.google.android.gms.ads.internal.config.n;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class c extends v {
    private static final w h = new w();
    private final Context i;

    public c(bhm bhm, String str, String str2, aucd aucd, int i2, Context context) {
        super(bhm, str, str2, aucd, i2, 27);
        this.i = context;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        bfs bfs;
        int i2;
        boolean z;
        Boolean bool;
        AtomicReference a = h.a(this.i.getPackageName());
        synchronized (a) {
            bfs bfs2 = (bfs) a.get();
            if (bfs2 == null || bho.b(bfs2.a) || bfs2.a.equals("E") || bfs2.a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                String str = null;
                if (bho.b((String) null)) {
                    if (!bho.b((String) null)) {
                        bool = false;
                    } else {
                        bool = false;
                    }
                    if (!bool.booleanValue() || !this.a.n) {
                        i2 = 3;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 5;
                }
                Method method = this.d;
                Object[] objArr = new Object[3];
                objArr[0] = this.i;
                if (i2 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                objArr[1] = Boolean.valueOf(z);
                objArr[2] = n.f.a();
                bfs bfs3 = new bfs((String) method.invoke((Object) null, objArr));
                if (bho.b(bfs3.a) || bfs3.a.equals("E")) {
                    int i3 = i2 - 1;
                    if (i3 == 3) {
                        try {
                            Future future = this.a.k;
                            if (future != null) {
                                future.get();
                            }
                            com.google.ads.afma.proto2api.c cVar = this.a.j;
                            if (!(cVar == null || (cVar.a & 4194304) == 0)) {
                                str = cVar.o;
                            }
                        } catch (InterruptedException | ExecutionException e) {
                        }
                        if (!bho.b(str)) {
                            bfs3.a = str;
                        }
                        a.set(bfs3);
                    } else if (i3 == 4) {
                        throw null;
                    }
                }
                a.set(bfs3);
            }
            bfs = (bfs) a.get();
        }
        synchronized (this.g) {
            if (bfs != null) {
                aucd aucd = this.g;
                String str2 = bfs.a;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                com.google.ads.afma.proto2api.c cVar2 = (com.google.ads.afma.proto2api.c) aucd.b;
                com.google.ads.afma.proto2api.c cVar3 = com.google.ads.afma.proto2api.c.Q;
                str2.getClass();
                cVar2.a = 4194304 | cVar2.a;
                cVar2.o = str2;
                aucd aucd2 = this.g;
                long j = bfs.b;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                com.google.ads.afma.proto2api.c cVar4 = (com.google.ads.afma.proto2api.c) aucd2.b;
                cVar4.a |= 536870912;
                cVar4.u = j;
                aucd aucd3 = this.g;
                String str3 = bfs.c;
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                com.google.ads.afma.proto2api.c cVar5 = (com.google.ads.afma.proto2api.c) aucd3.b;
                str3.getClass();
                cVar5.a |= 268435456;
                cVar5.t = str3;
                aucd aucd4 = this.g;
                String str4 = bfs.d;
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                com.google.ads.afma.proto2api.c cVar6 = (com.google.ads.afma.proto2api.c) aucd4.b;
                str4.getClass();
                cVar6.b |= 128;
                cVar6.w = str4;
                aucd aucd5 = this.g;
                String str5 = bfs.e;
                if (aucd5.c) {
                    aucd5.c();
                    aucd5.c = false;
                }
                com.google.ads.afma.proto2api.c cVar7 = (com.google.ads.afma.proto2api.c) aucd5.b;
                str5.getClass();
                cVar7.b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                cVar7.x = str5;
            }
        }
    }
}
