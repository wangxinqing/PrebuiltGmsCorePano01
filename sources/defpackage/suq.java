package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;

/* renamed from: suq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class suq implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ sut f;

    public suq(sut sut, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = sut;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public final void run() {
        boolean z;
        svf a2 = this.f.x.a();
        if (a2.g()) {
            sut sut = this.f;
            if (sut.a == 0) {
                spg v = sut.v();
                if (v.b == null) {
                    synchronized (v) {
                        if (v.b == null) {
                            ApplicationInfo applicationInfo = v.z().getApplicationInfo();
                            String a3 = jkt.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                if (str == null || !str.equals(a3)) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                v.b = Boolean.valueOf(z);
                            }
                            if (v.b == null) {
                                v.b = Boolean.TRUE;
                                v.E().c.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (!v.b.booleanValue()) {
                    sut sut2 = this.f;
                    sut2.a = !sut2.u().a ? 'c' : 'p';
                } else {
                    sut sut3 = this.f;
                    sut3.a = !sut3.u().a ? 'C' : 'P';
                }
            }
            sut sut4 = this.f;
            if (sut4.b < 0) {
                sut4.b = sut4.v().b();
            }
            char charAt = "01VDIWEA?".charAt(this.a);
            sut sut5 = this.f;
            char c2 = sut5.a;
            long j = sut5.b;
            String a4 = sut.a(true, this.b, this.c, this.d, this.e);
            StringBuilder sb = new StringBuilder(String.valueOf(a4).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(c2);
            sb.append(j);
            sb.append(":");
            sb.append(a4);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.b.substring(0, 1024);
            }
            svd svd = a2.c;
            svd.e.h();
            if (svd.b() == 0) {
                svd.a();
            }
            if (sb2 == null) {
                sb2 = "";
            }
            long j2 = svd.e.c().getLong(svd.b, 0);
            if (j2 <= 0) {
                SharedPreferences.Editor edit = svd.e.c().edit();
                edit.putString(svd.c, sb2);
                edit.putLong(svd.b, 1);
                edit.apply();
                return;
            }
            long nextLong = svd.e.x().e().nextLong();
            long j3 = j2 + 1;
            SharedPreferences.Editor edit2 = svd.e.c().edit();
            if ((Long.MAX_VALUE & nextLong) < Long.MAX_VALUE / j3) {
                edit2.putString(svd.c, sb2);
            }
            edit2.putLong(svd.b, j3);
            edit2.apply();
            return;
        }
        this.f.a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
