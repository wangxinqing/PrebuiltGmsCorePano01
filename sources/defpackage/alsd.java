package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: alsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alsd implements alzf {
    public static final alsd a = new alsd();
    private static final amic b;

    static {
        amia f = amic.f();
        f.a(amhv.NULL_VALUE);
        b = f.a();
    }

    private alsd() {
    }

    public static final amic b(double d) {
        amia f = amic.f();
        f.a(d);
        return f.a();
    }

    public final /* bridge */ /* synthetic */ Object a() {
        return b;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return amhx.b();
    }

    public final /* bridge */ /* synthetic */ Object a(double d) {
        return b(d);
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        amht amht = (amht) obj;
        amia f = amic.f();
        amhu amhu = new amhu(amht);
        amht.a = new ArrayList();
        f.a = amib.LIST_VALUE;
        f.b = amhu;
        return f.a();
    }

    public final /* bridge */ /* synthetic */ Object c() {
        return amhu.b();
    }

    public final /* bridge */ /* synthetic */ Object a(int i) {
        return b((double) i);
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        amhw amhw = (amhw) obj;
        amia f = amic.f();
        amhx amhx = new amhx(amhw);
        amhw.a = new HashMap();
        f.a = amib.STRUCT_VALUE;
        f.b = amhx;
        return f.a();
    }

    public final /* bridge */ /* synthetic */ Object a(String str) {
        if (str == null) {
            return b;
        }
        amia f = amic.f();
        f.a(str);
        return f.a();
    }

    public final /* bridge */ /* synthetic */ Object a(boolean z) {
        amia f = amic.f();
        f.a = amib.BOOL_VALUE;
        f.b = Boolean.valueOf(z);
        return f.a();
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((amht) obj2).a.add((amic) obj);
    }

    public final /* bridge */ /* synthetic */ void a(String str, Object obj, Object obj2) {
        ((amhw) obj2).a.put(str, (amic) obj);
    }
}
