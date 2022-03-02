package com.google.android.gms.ads.identifier.settings;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class b implements d {
    private final e a;
    private final String b;
    private final int c;
    private final byte[] d;

    public b(e eVar, String str, int i, byte[] bArr) {
        this.a = eVar;
        this.b = str;
        this.c = i;
        this.d = bArr;
    }

    public final void a(aucd aucd) {
        Pair pair;
        aucd aucd2;
        e eVar = this.a;
        String str = this.b;
        int i = this.c;
        byte[] bArr = this.d;
        String a2 = eVar.a(str, i);
        long currentTimeMillis = System.currentTimeMillis();
        LruCache lruCache = eVar.b;
        if (lruCache != null) {
            pair = (Pair) lruCache.get(a2);
        } else {
            pair = null;
        }
        if (pair != null && currentTimeMillis - ((Long) pair.first).longValue() <= awhh.a.a().c()) {
            aucd2 = aotp.f.a((aucj) (aotp) pair.second);
        } else if (!TextUtils.isEmpty(a2)) {
            aucd a3 = eVar.a(a2);
            LruCache lruCache2 = eVar.b;
            if (lruCache2 != null) {
                lruCache2.put(a2, new Pair(Long.valueOf(currentTimeMillis), (aotp) a3.i()));
            }
            aucd2 = a3;
        } else {
            aucd2 = aotp.f.o();
        }
        if (eVar.i()) {
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aotp aotp = (aotp) aucd2.b;
            aotp aotp2 = aotp.f;
            aotp.a |= 1;
            aotp.b = true;
        }
        aucd o = aotn.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aotn aotn = (aotn) o.b;
        aotp aotp3 = (aotp) aucd2.i();
        aotp3.getClass();
        aotn.c = aotp3;
        aotn.a |= 2;
        if (!e.a(bArr)) {
            auay a4 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aotn aotn2 = (aotn) o.b;
            a4.getClass();
            aotn2.a = 1 | aotn2.a;
            aotn2.b = a4;
        }
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aott aott = (aott) aucd.b;
        aotn aotn3 = (aotn) o.i();
        aott aott2 = aott.i;
        aotn3.getClass();
        aott.c = aotn3;
        aott.b = 3;
    }
}
