package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: dlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class dlz {
    public final dmd d;

    protected dlz(dmd dmd) {
        iva.a((Object) dmd);
        this.d = dmd;
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj != Boolean.TRUE ? "false" : "true";
        }
        if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        }
        return obj.toString();
    }

    protected static String b(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = a(obj);
        String a2 = a(obj2);
        String a3 = a(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    public static final boolean o() {
        String str = (String) doz.b.a();
        return false;
    }

    /* access modifiers changed from: protected */
    public final jiq c() {
        return this.d.c;
    }

    /* access modifiers changed from: protected */
    public final Context d() {
        return this.d.a;
    }

    public final dpk e() {
        return this.d.a();
    }

    /* access modifiers changed from: protected */
    public final dmy f() {
        return this.d.d;
    }

    public final dkw g() {
        return this.d.b();
    }

    public final dkh h() {
        return this.d.d();
    }

    public final dly i() {
        return this.d.c();
    }

    /* access modifiers changed from: protected */
    public final dnd j() {
        dmd dmd = this.d;
        dmd.a((dma) dmd.f);
        return dmd.f;
    }

    /* access modifiers changed from: protected */
    public final dpy k() {
        return this.d.e();
    }

    /* access modifiers changed from: protected */
    public final dpp l() {
        dmd dmd = this.d;
        dmd.a((dma) dmd.g);
        return dmd.g;
    }

    public final dmv m() {
        return this.d.g();
    }

    public final dnc n() {
        return this.d.h;
    }

    public final void c(String str) {
        a(3, str, (Object) null, (Object) null, (Object) null);
    }

    public final void d(String str) {
        a(5, str, (Object) null, (Object) null, (Object) null);
    }

    public final void e(String str) {
        a(6, str, (Object) null, (Object) null, (Object) null);
    }

    public final void c(String str, Object obj) {
        a(4, str, obj, (Object) null, (Object) null);
    }

    public final void d(String str, Object obj) {
        a(5, str, obj, (Object) null, (Object) null);
    }

    public final void e(String str, Object obj) {
        a(6, str, obj, (Object) null, (Object) null);
    }

    public final void c(String str, Object obj, Object obj2) {
        a(5, str, obj, obj2, (Object) null);
    }

    public final void d(String str, Object obj, Object obj2) {
        a(6, str, obj, obj2, (Object) null);
    }

    public final void a(int i, String str, Object obj, Object obj2, Object obj3) {
        dpk dpk;
        dmd dmd = this.d;
        if (dmd != null) {
            dpk = dmd.e;
        } else {
            dpk = null;
        }
        if (dpk == null) {
            String str2 = (String) doz.b.a();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, b(str, obj, obj2, obj3));
                return;
            }
            return;
        }
        dpk.b(i, str, obj, obj2, obj3);
    }

    public final void a(String str, Object obj) {
        a(2, str, obj, (Object) null, (Object) null);
    }

    public final void b(String str) {
        a(2, str, (Object) null, (Object) null, (Object) null);
    }

    public final void a(String str, Object obj, Object obj2) {
        a(2, str, obj, obj2, (Object) null);
    }

    public final void b(String str, Object obj) {
        a(3, str, obj, (Object) null, (Object) null);
    }

    public final void a(String str, Object obj, Object obj2, Object obj3) {
        a(5, str, obj, obj2, obj3);
    }

    public final void b(String str, Object obj, Object obj2) {
        a(3, str, obj, obj2, (Object) null);
    }
}
