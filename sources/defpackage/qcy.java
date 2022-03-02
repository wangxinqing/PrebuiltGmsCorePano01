package defpackage;

import com.google.android.gms.common.api.Scope;

/* renamed from: qcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qcy {
    public static anty a(String str, Scope[] scopeArr, abai abai) {
        return a(str, scopeArr, abai.g, abai.c, abai.e, abai.b);
    }

    public static anty a(String str, Scope[] scopeArr, String str2, boolean z, boolean z2, boolean z3) {
        aucd o = antv.h.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        antv antv = (antv) o.b;
        int i = antv.a | 8;
        antv.a = i;
        antv.e = z;
        int i2 = i | 32;
        antv.a = i2;
        antv.g = z2;
        antv.a = i2 | 16;
        antv.f = z3;
        if (scopeArr != null) {
            anax c = amym.a((Object[]) scopeArr).a(qcx.a).c();
            boolean contains = c.contains("email");
            if (o.c) {
                o.c();
                o.c = false;
            }
            antv antv2 = (antv) o.b;
            antv2.a |= 2;
            antv2.c = contains;
            boolean contains2 = c.contains("profile");
            if (o.c) {
                o.c();
                o.c = false;
            }
            antv antv3 = (antv) o.b;
            antv3.a |= 4;
            antv3.d = contains2;
            boolean contains3 = c.contains("openid");
            if (o.c) {
                o.c();
                o.c = false;
            }
            antv antv4 = (antv) o.b;
            antv4.a |= 1;
            antv4.b = contains3;
        }
        aucd o2 = antw.d.o();
        antv antv5 = (antv) o.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        antw antw = (antw) o2.b;
        antv5.getClass();
        antw.b = antv5;
        int i3 = antw.a | 1;
        antw.a = i3;
        if (str != null) {
            str.getClass();
            antw.a = i3 | 2;
            antw.c = str;
        }
        aucd o3 = anty.n.o();
        if (str2 != null) {
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            anty anty = (anty) o3.b;
            str2.getClass();
            anty.a |= 2;
            anty.c = str2;
        }
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anty anty2 = (anty) o3.b;
        anty2.b = 4;
        anty2.a |= 1;
        antw antw2 = (antw) o2.i();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        anty anty3 = (anty) o3.b;
        antw2.getClass();
        anty3.f = antw2;
        anty3.a |= 16;
        return (anty) o3.i();
    }
}
