package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bkw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bkw extends bmb {
    private static long b = 0;
    private static int c = -1;
    private static volatile bnm d;
    private static volatile boy j;

    public final ApplicationInfo a() {
        return this.e.getApplicationInfo();
    }

    public final String b() {
        return this.e.getApplicationInfo().sourceDir;
    }

    public final Resources c() {
        return this.e.getResources();
    }

    public final long d() {
        long j2 = b;
        if (j2 == 0) {
            synchronized (bkw.class) {
                j2 = b;
                if (j2 == 0) {
                    j2 = new File(this.e.getApplicationInfo().sourceDir).lastModified();
                    b = j2;
                    if (j2 == 0) {
                        throw new PackageManager.NameNotFoundException("container sourceDir");
                    }
                }
            }
        }
        return j2;
    }

    public final bnm e() {
        bnm bnm = d;
        return bnm == null ? super.e() : bnm;
    }

    public final bnm f() {
        bnm bnm = d;
        if (bnm == null) {
            synchronized (bkw.class) {
                bnm = d;
                if (bnm == null) {
                    bnm f = super.f();
                    aucd aucd = (aucd) f.c(5);
                    aucd.a((aucj) f);
                    long d2 = d();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    bnm bnm2 = (bnm) aucd.b;
                    bnm bnm3 = bnm.r;
                    bnm2.a |= 4;
                    bnm2.d = d2;
                    bnm = (bnm) aucd.i();
                    d = bnm;
                    c = bnm.h;
                }
            }
        }
        return bnm;
    }

    public final boy g() {
        boy boy = j;
        if (boy == null) {
            synchronized (bkw.class) {
                boy = j;
                if (boy == null) {
                    bnm f = f();
                    int i = f.U;
                    if (i == -1) {
                        i = aueh.a.a((Object) f).b(f);
                        f.U = i;
                    }
                    apxe apxe = new apxe(i + i);
                    apxe.f(bog.a(apxe, f));
                    ByteBuffer f2 = apxe.f();
                    f2.remaining();
                    boy boy2 = new boy();
                    f2.order(ByteOrder.LITTLE_ENDIAN);
                    boy2.b(f2.getInt(f2.position()) + f2.position(), f2);
                    j = boy2;
                    boy = boy2;
                }
            }
        }
        return boy;
    }

    public final String toString() {
        String packageName = this.e.getPackageName();
        StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 14);
        sb.append("ContainerApk(");
        sb.append(packageName);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bkw(android.content.Context r4) {
        /*
            r3 = this;
            com.google.android.chimera.ModuleContext r0 = com.google.android.chimera.ModuleContext.getModuleContext(r4)
            if (r0 == 0) goto L_0x000b
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x000c
        L_0x000b:
            r0 = r4
        L_0x000c:
            r1 = 2
            r2 = 0
            java.lang.String r4 = r4.getPackageName()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkw.<init>(android.content.Context):void");
    }

    public final ClassLoader a(ClassLoader classLoader) {
        return this.e.getClassLoader();
    }

    public final boolean a(boy boy) {
        if (d() == boy.d()) {
            int i = c;
            if (i == -1) {
                synchronized (bkw.class) {
                    i = c;
                    if (i == -1) {
                        i = this.e.getPackageManager().getPackageInfo(this.a, 0).versionCode;
                        c = i;
                    }
                }
            }
            if (i == boy.h()) {
                return true;
            }
        }
        return false;
    }
}
