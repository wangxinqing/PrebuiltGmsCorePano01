package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.ads.afma.proto2api.b;
import com.google.ads.afma.proto2api.c;
import com.google.ads.afma.proto2api.h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: npq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class npq implements nnw {
    public final npr a;
    private final Object b;
    private final nnt c;
    private final bhg d;

    public npq(Object obj, npr npr, bhg bhg, nnt nnt) {
        this.b = obj;
        this.a = npr;
        this.d = bhg;
        this.c = nnt;
    }

    private static long a(long j) {
        return System.currentTimeMillis() - j;
    }

    public final synchronized void b() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.b.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.b, new Object[0]);
            this.c.a(3001, a(currentTimeMillis));
        } catch (Exception e) {
            throw new npw(2003, (Throwable) e);
        }
    }

    public final synchronized int c() {
        try {
        } catch (Exception e) {
            throw new npw(2006, (Throwable) e);
        }
        return ((Integer) this.b.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.b, new Object[0])).intValue();
    }

    private final synchronized byte[] a(Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.c.a(2007, a(currentTimeMillis), e);
            return null;
        }
        return (byte[]) this.b.getClass().getDeclaredMethod("xss", new Class[]{Map.class, Map.class}).invoke(this.b, new Object[]{null, map});
    }

    public final synchronized String a(Context context) {
        String str;
        bhg bhg = this.d;
        HashMap hashMap = new HashMap();
        c a2 = nou.a(bhg.b.e, not.a);
        hashMap.put("v", ((nny) bhg.a).a);
        hashMap.put("gms", Boolean.valueOf(((nny) bhg.a).c));
        hashMap.put("int", a2.o);
        hashMap.put("up", Boolean.valueOf(bhg.c.a));
        hashMap.put("t", new Throwable());
        c a3 = nou.a(bhg.b.d, nos.a);
        hashMap.put("gai", Boolean.valueOf(((nny) bhg.a).b));
        hashMap.put("did", a3.L);
        int a4 = b.a(a3.M);
        if (a4 == 0) {
            a4 = 3;
        }
        hashMap.put("dst", Integer.valueOf(a4 - 1));
        hashMap.put("doo", Boolean.valueOf(a3.N));
        hashMap.put("f", "q");
        hashMap.put("ctx", context);
        str = null;
        hashMap.put("aid", (Object) null);
        byte[] a5 = a((Map) hashMap);
        if (a5 != null) {
            aucd o = h.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            h hVar = (h) o.b;
            hVar.d = 4;
            hVar.a = 4 | hVar.a;
            o.b(auay.a(a5));
            str = Base64.encodeToString(((h) o.i()).k(), 11);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean a() {
        try {
        } catch (Exception e) {
            throw new npw(2001, (Throwable) e);
        }
        return ((Boolean) this.b.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.b, new Object[0])).booleanValue();
    }
}
