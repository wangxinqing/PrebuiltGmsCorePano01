package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;

/* renamed from: afpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afpf {
    public final Context a;
    public final afsb b;
    public final afmh c;
    public final afpi d;
    public final afqr e;
    public final aekn f;
    public final amri g;
    public final Executor h;
    public final amri i;

    public afpf(Context context, afsb afsb, afmh afmh, afpi afpi, afqr afqr, aekn aekn, amri amri, Executor executor, amri amri2) {
        this.a = context;
        this.b = afsb;
        this.c = afmh;
        this.d = afpi;
        this.e = afqr;
        this.f = aekn;
        this.g = amri;
        this.h = executor;
        this.i = amri2;
    }

    public static boolean a(afkr afkr, afkr afkr2) {
        if (!b(afkr, afkr2) || afkr2.e != afkr.e || afkr2.g != afkr.g || afkr2.h != afkr.h) {
            return false;
        }
        aflb aflb = afkr2.i;
        if (aflb == null) {
            aflb = aflb.f;
        }
        aflb aflb2 = afkr.i;
        if (aflb2 == null) {
            aflb2 = aflb.f;
        }
        if (!aflb.equals(aflb2)) {
            return false;
        }
        int a2 = afkq.a(afkr2.f);
        if (a2 == 0) {
            a2 = 1;
        }
        int a3 = afkq.a(afkr.f);
        if (a3 == 0) {
            a3 = 1;
        }
        if (a2 != a3) {
            return false;
        }
        return true;
    }

    public static boolean b(afkr afkr, afkr afkr2) {
        return afkr.j.equals(afkr2.j);
    }

    public final aorr a() {
        afst.a(this.a, "gms_icing_mdd_file_group_manager_metadata", this.i).edit().clear().commit();
        return aorl.a((Object) null);
    }

    public final aorr a(afkr afkr) {
        return a(afkr, false, false, 0, afkr.j.size());
    }

    public final aorr a(afkr afkr, int i2, int i3) {
        aorr aorr;
        if (i2 >= i3) {
            return aorl.a((Object) true);
        }
        afkn afkn = (afkn) afkr.j.get(i2);
        int a2 = afkq.a(afkr.f);
        if (a2 == 0) {
            a2 = 1;
        }
        aflh a3 = afqu.a(afkn, a2);
        afqr afqr = this.e;
        if (afqr.c.a(a3) != null) {
            aorr = aorl.a((Object) true);
        } else {
            SharedPreferences a4 = afst.a(afqr.a, "gms_icing_mdd_shared_file_manager_metadata", afqr.j);
            long j = a4.getLong("next_file_name_v2", System.currentTimeMillis());
            if (!a4.edit().putLong("next_file_name_v2", 1 + j).commit()) {
                afsh.a("%s: Unable to update file name %s", (Object) "SharedFileManager", (Object) a3);
                aorr = aorl.a((Object) false);
            } else {
                StringBuilder sb = new StringBuilder(37);
                sb.append("datadownloadfile_");
                sb.append(j);
                String sb2 = sb.toString();
                aucd o = afli.d.o();
                afle afle = afle.SUBSCRIBED;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                afli afli = (afli) o.b;
                afli.c = afle.g;
                int i4 = afli.a | 2;
                afli.a = i4;
                sb2.getClass();
                afli.a = 1 | i4;
                afli.b = sb2;
                if (!afqr.c.a(a3, (afli) o.i())) {
                    afsh.a("%s: Unable to write back subscription for file entry with %s", (Object) "SharedFileManager", (Object) a3);
                    aorr = aorl.a((Object) false);
                } else {
                    aorr = aorl.a((Object) true);
                }
            }
        }
        return aopr.a(aorr, (aoqb) new afob(this, afkr, i2, i3), this.h);
    }

    public final aorr a(afkr afkr, boolean z, boolean z2, int i2, int i3) {
        if (i2 < i3) {
            afkn afkn = (afkn) afkr.j.get(i2);
            int a2 = afkq.a(afkr.f);
            if (a2 == 0) {
                a2 = 1;
            }
            try {
                return aopr.a(this.e.a(afqu.a(afkn, a2)), (aoqb) new afpd(this, afkn, afkr, z, z2, i2, i3), this.h);
            } catch (afqs e2) {
                afsh.a("%s: Encountered SharedFileMissingException for group: %s", (Object) "FileGroupManager", (Object) afkr.c);
                this.c.a("Shared file not found in getFileGroupDownloadStatus", e2);
                return aorl.a((Object) afpe.FAILED);
            }
        } else if (z) {
            return aorl.a((Object) afpe.FAILED);
        } else {
            if (!z2) {
                return aorl.a((Object) afpe.DOWNLOADED);
            }
            return aorl.a((Object) afpe.PENDING);
        }
    }

    public final aorr a(aflf aflf, afkf afkf) {
        aucd o = aojg.g.o();
        String str = aflf.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aojg aojg = (aojg) o.b;
        str.getClass();
        int i2 = aojg.a | 1;
        aojg.a = i2;
        aojg.b = str;
        String str2 = aflf.c;
        str2.getClass();
        aojg.a = i2 | 4;
        aojg.d = str2;
        afpi afpi = this.d;
        aucd aucd = (aucd) aflf.c(5);
        aucd.a((aucj) aflf);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aflf aflf2 = (aflf) aucd.b;
        aflf aflf3 = aflf.f;
        aflf2.a |= 8;
        aflf2.e = false;
        afkr a2 = afpi.a((aflf) aucd.i());
        if (a2 != null) {
            int i3 = a2.e;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aojg aojg2 = (aojg) o.b;
            aojg2.a |= 2;
            aojg2.c = i3;
        }
        this.b.a(aomi.a(afkf.a.I), (aojg) o.i());
        return aorl.a((Object) null);
    }

    public final aorr a(aflf aflf, afkr afkr) {
        return aopr.a(a(afkr), (aoqb) new afpc(this, afkr, aflf), this.h);
    }

    public final aorr a(aflf aflf, aflb aflb) {
        return aooz.a(aopr.a(a(aflf, false), (aoqb) new afoz(this, aflf, aflb), this.h), Exception.class, (aoqb) new afpa(this, aflf), this.h);
    }

    public final aorr a(aflf aflf, boolean z) {
        aucd aucd = (aucd) aflf.c(5);
        aucd.a((aucj) aflf);
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aflf aflf2 = (aflf) aucd.b;
        aflf aflf3 = aflf.f;
        aflf2.a |= 8;
        aflf2.e = z;
        return aorl.a((Object) this.d.a((aflf) aucd.i()));
    }

    public final boolean a(String str) {
        try {
            this.a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            return false;
        }
    }
}
