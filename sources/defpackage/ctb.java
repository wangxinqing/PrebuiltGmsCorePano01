package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.chimera.GoogleSettingsItem;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: ctb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ctb implements csx {
    private static final iwd d = dit.a("LocalResourceProducer");
    public final dih a;
    public final Context b;
    public final cvs c;
    private final Resources e = ihs.b().getResources();
    private final amsv f;
    private final cvl g;

    public ctb(Context context, dih dih, cvs cvs) {
        csy csy = new csy(context);
        this.a = dih;
        this.f = csy;
        this.b = context;
        this.g = new cvl(context);
        this.c = cvs;
    }

    private static amri a(Resources resources, int i) {
        try {
            String string = resources.getString(i);
            return !amrk.a(string) ? amri.b(string) : ampu.a;
        } catch (Resources.NotFoundException e2) {
            return ampu.a;
        }
    }

    static aqsr b(int i, int i2) {
        aqsp aqsp = (aqsp) aqsr.d.o();
        int i3 = i - 1;
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr = (aqsr) aqsp.b;
        aqsr.a |= 1;
        aqsr.b = i3;
        aqsp.a("screenFlavor", Integer.toString(i2));
        return (aqsr) aqsp.i();
    }

    public static final boolean b(int i) {
        return i == 2;
    }

    static aqsr c(int i) {
        aqsp aqsp = (aqsp) aqsr.d.o();
        int i2 = i - 1;
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr = (aqsr) aqsp.b;
        aqsr.a |= 1;
        aqsr.b = i2;
        return (aqsr) aqsp.i();
    }

    static aqsr d(int i, int i2) {
        aqsp aqsp = (aqsp) aqsr.d.o();
        int i3 = i - 1;
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr = (aqsr) aqsp.b;
        aqsr.a |= 1;
        aqsr.b = i3;
        aqsp.a("gmscoreSettingsItemId", Integer.toString(i2));
        return (aqsr) aqsp.i();
    }

    static aqpq a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            aqpq aqpq = (aqpq) aqps.j.o();
            if (parseUri.getComponent() != null) {
                String packageName = parseUri.getComponent().getPackageName();
                if (aqpq.c) {
                    aqpq.c();
                    aqpq.c = false;
                }
                aqps aqps = (aqps) aqpq.b;
                packageName.getClass();
                aqps.a = 1 | aqps.a;
                aqps.b = packageName;
                String className = parseUri.getComponent().getClassName();
                if (aqpq.c) {
                    aqpq.c();
                    aqpq.c = false;
                }
                aqps aqps2 = (aqps) aqpq.b;
                className.getClass();
                aqps2.a |= 2;
                aqps2.c = className;
            } else if (!amrk.a(parseUri.getPackage())) {
                String str2 = parseUri.getPackage();
                if (aqpq.c) {
                    aqpq.c();
                    aqpq.c = false;
                }
                aqps aqps3 = (aqps) aqpq.b;
                str2.getClass();
                aqps3.a = 1 | aqps3.a;
                aqps3.b = str2;
            }
            if (!amrk.a(parseUri.getAction())) {
                String action = parseUri.getAction();
                if (aqpq.c) {
                    aqpq.c();
                    aqpq.c = false;
                }
                aqps aqps4 = (aqps) aqpq.b;
                action.getClass();
                aqps4.a |= 4;
                aqps4.d = action;
            }
            return aqpq;
        } catch (URISyntaxException e2) {
            d.e("Invalid intent", e2, new Object[0]);
            return null;
        }
    }

    static aqsr c(int i, int i2) {
        aqsp aqsp = (aqsp) aqsr.d.o();
        int i3 = i - 1;
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr = (aqsr) aqsp.b;
        aqsr.a |= 1;
        aqsr.b = i3;
        aqsp.a("gmscoreSettingsCategoryId", Integer.toString(i2));
        return (aqsr) aqsp.i();
    }

    public final cta d(aqsr aqsr) {
        csz csz = new csz(ampu.a, ampu.a);
        if (!amrk.a(awgs.c())) {
            try {
                Intent parseUri = Intent.parseUri(awgs.c(), 1);
                amri amri = ampu.a;
                amri amri2 = ampu.a;
                PackageManager packageManager = this.b.getPackageManager();
                ResolveInfo resolveActivity = packageManager.resolveActivity(parseUri, 128);
                if (!(resolveActivity == null || resolveActivity.activityInfo == null)) {
                    try {
                        Resources resourcesForApplication = packageManager.getResourcesForApplication(resolveActivity.activityInfo.packageName);
                        Bundle bundle = resolveActivity.activityInfo.metaData;
                        if (resourcesForApplication != null) {
                            if (bundle != null) {
                                amri = a(resourcesForApplication, bundle.getInt("com.google.android.gms.settings.title"));
                                amri2 = a(resourcesForApplication, bundle.getInt("com.google.android.gms.settings.summary"));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                    }
                }
                csz = new csz(amri, amri2);
            } catch (URISyntaxException e3) {
            }
        }
        aucd o = aqso.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqso aqso = (aqso) o.b;
        int i = aqso.a | 2;
        aqso.a = i;
        aqso.e = true;
        aqsr.getClass();
        aqso.d = aqsr;
        aqso.a = i | 1;
        aqqh a2 = a((String) csz.a.a((Object) a((int) R.string.as_clp_emergency_info_title)), (String) csz.b.a((Object) a((int) R.string.as_clp_emergency_info_subtitle)), aqrk.LOCAL_HOSPITAL_ICON, 1005);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqso aqso2 = (aqso) o.b;
        a2.getClass();
        aqso2.c = a2;
        aqso2.b = 8;
        return cta.b((aqso) o.i());
    }

    public final cta b(aqsr aqsr) {
        int a2 = csp.a(aqsr);
        if (a2 != 1 && !b(a2)) {
            return null;
        }
        aqqj aqqj = (aqqj) aqqk.b.o();
        if (a2 == 1) {
            aqqj.a(c(10368));
            aqqj.a(c(10369));
            aqqj.a(c(10370));
            if (dio.a(this.a)) {
                aqqj.a(c(10372));
            }
        }
        if (a2 == 2) {
            cvs cvs = this.c;
            cvs.b.await();
            boolean z = true;
            for (cvp cvp : cvs.a.b.values()) {
                if (cvp.a(this.b) && !cvp.c) {
                    if (awgy.a.a().p() || !z) {
                        aqqj.a(c(10210));
                    }
                    aqqj.a(c(2003, cvp.b));
                    anhj a3 = cvp.d.iterator();
                    while (a3.hasNext()) {
                        a(aqqj, (cvo) a3.next());
                    }
                    z = false;
                }
            }
        }
        aucd o = aqso.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqso aqso = (aqso) o.b;
        int i = 2 | aqso.a;
        aqso.a = i;
        aqso.e = true;
        aqsr.getClass();
        aqso.d = aqsr;
        aqso.a = i | 1;
        aqqk aqqk = (aqqk) aqqj.i();
        aqqk.getClass();
        aqso.c = aqqk;
        aqso.b = 6;
        aqso aqso2 = (aqso) o.i();
        if (awgy.j() && a2 == 1 && dio.a(this.a)) {
            return cta.a(aqso2);
        }
        return cta.b(aqso2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cta c(defpackage.aqsr r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.b
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            r3 = 0
            if (r2 == 0) goto L_0x002c
            ihs r4 = defpackage.ihs.b()
            java.lang.String r5 = "android.permission.READ_PHONE_STATE"
            int r4 = defpackage.kf.a((android.content.Context) r4, (java.lang.String) r5)
            ihs r5 = defpackage.ihs.b()
            java.lang.String r6 = "android.permission.READ_SMS"
            int r5 = defpackage.kf.a((android.content.Context) r5, (java.lang.String) r6)
            if (r4 != 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            if (r5 == 0) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            java.lang.String r2 = r2.getLine1Number()
            goto L_0x002d
        L_0x002c:
            r2 = r3
        L_0x002d:
            boolean r4 = defpackage.jlh.d(r2)
            r5 = 2
            r6 = 0
            if (r4 != 0) goto L_0x00de
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r0.getSimCountryIso()
            goto L_0x0043
        L_0x0042:
            r0 = r3
        L_0x0043:
            boolean r1 = defpackage.jlh.d(r0)
            if (r1 == 0) goto L_0x0051
            java.util.Locale r0 = defpackage.dja.a()
            java.lang.String r0 = r0.getCountry()
        L_0x0051:
            boolean r1 = defpackage.jlh.d(r0)
            if (r1 != 0) goto L_0x005e
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            goto L_0x005f
        L_0x005e:
            r0 = r3
        L_0x005f:
            boolean r1 = defpackage.jlh.d(r0)
            if (r1 != 0) goto L_0x00df
            agxn r1 = defpackage.agxn.a()     // Catch:{ agxm -> 0x00d3 }
            boolean r4 = r1.a((java.lang.String) r0)     // Catch:{ agxm -> 0x00d3 }
            if (r4 != 0) goto L_0x0094
            java.util.logging.Logger r4 = defpackage.agxn.a     // Catch:{ agxm -> 0x00d3 }
            java.util.logging.Level r7 = java.util.logging.Level.WARNING     // Catch:{ agxm -> 0x00d3 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ agxm -> 0x00d3 }
            r8.<init>()     // Catch:{ agxm -> 0x00d3 }
            java.lang.String r9 = "Invalid or missing region code ("
            r8.append(r9)     // Catch:{ agxm -> 0x00d3 }
            if (r0 != 0) goto L_0x0082
            java.lang.String r9 = "null"
            goto L_0x0083
        L_0x0082:
            r9 = r0
        L_0x0083:
            r8.append(r9)     // Catch:{ agxm -> 0x00d3 }
            java.lang.String r9 = ") provided."
            r8.append(r9)     // Catch:{ agxm -> 0x00d3 }
            java.lang.String r8 = r8.toString()     // Catch:{ agxm -> 0x00d3 }
            r4.log(r7, r8)     // Catch:{ agxm -> 0x00d3 }
            r4 = 0
            goto L_0x009c
        L_0x0094:
            agxp r4 = r1.b((java.lang.String) r0)     // Catch:{ agxm -> 0x00d3 }
            if (r4 == 0) goto L_0x00bc
            int r4 = r4.l     // Catch:{ agxm -> 0x00d3 }
        L_0x009c:
            agxs r0 = r1.a((java.lang.CharSequence) r2, (java.lang.String) r0)     // Catch:{ agxm -> 0x00d3 }
            if (r4 <= 0) goto L_0x00a8
            int r1 = r0.a     // Catch:{ agxm -> 0x00d3 }
            if (r1 != r4) goto L_0x00a8
            r1 = 3
            goto L_0x00a9
        L_0x00a8:
            r1 = 2
        L_0x00a9:
            agxn r4 = defpackage.agxn.a()     // Catch:{ agxm -> 0x00d3 }
            java.lang.String r0 = r4.a((defpackage.agxs) r0, (int) r1)     // Catch:{ agxm -> 0x00d3 }
            nn r1 = defpackage.nn.a()     // Catch:{ agxm -> 0x00d3 }
            np r4 = defpackage.nw.a     // Catch:{ agxm -> 0x00d3 }
            java.lang.String r0 = r1.a((java.lang.String) r0, (defpackage.np) r4)     // Catch:{ agxm -> 0x00d3 }
            goto L_0x00d5
        L_0x00bc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ agxm -> 0x00d3 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ agxm -> 0x00d3 }
            r4.<init>()     // Catch:{ agxm -> 0x00d3 }
            java.lang.String r7 = "Invalid region code: "
            r4.append(r7)     // Catch:{ agxm -> 0x00d3 }
            r4.append(r0)     // Catch:{ agxm -> 0x00d3 }
            java.lang.String r0 = r4.toString()     // Catch:{ agxm -> 0x00d3 }
            r1.<init>(r0)     // Catch:{ agxm -> 0x00d3 }
            throw r1     // Catch:{ agxm -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            r0 = r3
        L_0x00d5:
            boolean r1 = defpackage.jlh.d(r0)
            if (r1 == 0) goto L_0x00dc
            goto L_0x00df
        L_0x00dc:
            r2 = r0
            goto L_0x00df
        L_0x00de:
            r2 = r3
        L_0x00df:
            boolean r0 = defpackage.jkr.d()
            if (r0 == 0) goto L_0x00f2
            android.content.Context r0 = r10.b
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "device_name"
            java.lang.String r3 = android.provider.Settings.Global.getString(r0, r1)
            goto L_0x00f3
        L_0x00f2:
        L_0x00f3:
            boolean r0 = defpackage.amrk.a((java.lang.String) r3)
            if (r0 == 0) goto L_0x00fb
            java.lang.String r3 = android.os.Build.MODEL
        L_0x00fb:
            aqso r0 = defpackage.aqso.f
            aucd r0 = r0.o()
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0106
            goto L_0x010b
        L_0x0106:
            r0.c()
            r0.c = r6
        L_0x010b:
            aucj r1 = r0.b
            aqso r1 = (defpackage.aqso) r1
            int r4 = r1.a
            r4 = r4 | r5
            r1.a = r4
            r1.e = r6
            r11.getClass()
            r1.d = r11
            r11 = 1
            r4 = r4 | r11
            r1.a = r4
            r1 = 2131951774(0x7f13009e, float:1.9539972E38)
            java.lang.String r1 = r10.a((int) r1)
            boolean r4 = defpackage.amrk.a((java.lang.String) r2)
            if (r4 != 0) goto L_0x013c
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r6] = r3
            r4[r11] = r2
            android.content.res.Resources r11 = r10.e
            r2 = 2131951773(0x7f13009d, float:1.953997E38)
            java.lang.String r3 = r11.getString(r2, r4)
            goto L_0x013d
        L_0x013c:
        L_0x013d:
            aqrk r11 = defpackage.aqrk.PERM_DEVICE_INFO_ICON
            r2 = 1004(0x3ec, float:1.407E-42)
            aqqh r11 = a((java.lang.String) r1, (java.lang.String) r3, (defpackage.aqrk) r11, (int) r2)
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x014a
            goto L_0x014f
        L_0x014a:
            r0.c()
            r0.c = r6
        L_0x014f:
            aucj r1 = r0.b
            aqso r1 = (defpackage.aqso) r1
            r11.getClass()
            r1.c = r11
            r11 = 8
            r1.b = r11
            aucj r11 = r0.i()
            aqso r11 = (defpackage.aqso) r11
            cta r11 = defpackage.cta.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctb.c(aqsr):cta");
    }

    public static final aqpx a(String str, String str2, aqrk aqrk, aqsr aqsr) {
        aucd o = aqqx.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqqx aqqx = (aqqx) o.b;
        str.getClass();
        int i = aqqx.a | 2;
        aqqx.a = i;
        aqqx.c = str;
        if (str2 != null) {
            str2.getClass();
            aqqx.a = i | 4;
            aqqx.d = str2;
        }
        if (aqrk != null) {
            aucd o2 = aqrl.g.o();
            int i2 = aqrk.H;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aqrl aqrl = (aqrl) o2.b;
            aqrl.a |= 1;
            aqrl.b = i2;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqqx aqqx2 = (aqqx) o.b;
            aqrl aqrl2 = (aqrl) o2.i();
            aqrl2.getClass();
            aqqx2.b = aqrl2;
            aqqx2.a |= 1;
        }
        aucd o3 = aqpx.e.o();
        aqqx aqqx3 = (aqqx) o.i();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqpx aqpx = (aqpx) o3.b;
        aqqx3.getClass();
        aqpx.c = aqqx3;
        aqpx.b = 14;
        aqsr.getClass();
        aqpx.d = aqsr;
        aqpx.a |= 131072;
        return (aqpx) o3.i();
    }

    public static final aqqh a(String str, String str2, aqrk aqrk, int i) {
        return a(a(str, str2, aqrk, c(i)));
    }

    public static final aqqh a(aqpx... aqpxArr) {
        aucd o = aqqh.c.o();
        aucd o2 = aqqs.b.o();
        amzy a2 = amzy.a((Object[]) aqpxArr);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqqs aqqs = (aqqs) o2.b;
        if (!aqqs.a.a()) {
            aqqs.a = aucj.a(aqqs.a);
        }
        auab.a((Iterable) a2, (List) aqqs.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqqh aqqh = (aqqh) o.b;
        aqqs aqqs2 = (aqqs) o2.i();
        aqqs2.getClass();
        aqqh.b = aqqs2;
        aqqh.a = 3;
        return (aqqh) o.i();
    }

    public static cta a(aqsr aqsr, int i) {
        aucd o = aqso.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqso aqso = (aqso) o.b;
        int i2 = aqso.a | 2;
        aqso.a = i2;
        aqso.e = true;
        aqsr.getClass();
        aqso.d = aqsr;
        aqso.a = i2 | 1;
        aqsu aqsu = (aqsu) aqsv.b.o();
        aucd o2 = aqpp.j.o();
        aucd o3 = aqrv.e.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aqrv aqrv = (aqrv) o3.b;
        aqrv.a = 1 | aqrv.a;
        aqrv.b = i;
        aqrv aqrv2 = (aqrv) o3.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqpp aqpp = (aqpp) o2.b;
        aqrv2.getClass();
        aqpp.b = aqrv2;
        aqpp.a |= 2;
        aqsu.a(o2);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqso aqso2 = (aqso) o.b;
        aqsv aqsv = (aqsv) aqsu.i();
        aqsv.getClass();
        aqso2.c = aqsv;
        aqso2.b = 3;
        return cta.b((aqso) o.i());
    }

    public final aqsa a(int i, int i2) {
        aucd o = aqsa.d.o();
        String a2 = a(i);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqsa aqsa = (aqsa) o.b;
        a2.getClass();
        aqsa.a |= 1;
        aqsa.b = a2;
        aqsp aqsp = (aqsp) aqsr.d.o();
        if (aqsp.c) {
            aqsp.c();
            aqsp.c = false;
        }
        aqsr aqsr = (aqsr) aqsp.b;
        aqsr.a |= 1;
        aqsr.b = i2;
        aqsr aqsr2 = (aqsr) aqsp.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqsa aqsa2 = (aqsa) o.b;
        aqsr2.getClass();
        aqsa2.c = aqsr2;
        aqsa2.a |= 2;
        return (aqsa) o.i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.cta a(defpackage.aqsr r13) {
        /*
            r12 = this;
            int r0 = defpackage.csp.a((defpackage.aqsr) r13)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0010
            boolean r3 = b((int) r0)
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            return r1
        L_0x0010:
            aqtw r3 = defpackage.aqtw.h
            aucd r3 = r3.o()
            boolean r4 = r3.c
            r5 = 0
            if (r4 == 0) goto L_0x0020
            r3.c()
            r3.c = r5
        L_0x0020:
            aucj r4 = r3.b
            aqtw r4 = (defpackage.aqtw) r4
            int r6 = r4.a
            r6 = r6 | 32
            r4.a = r6
            r4.f = r5
            aqpm r4 = defpackage.aqpm.e
            aucd r4 = r4.o()
            aqrl r6 = defpackage.aqrl.g
            aucd r6 = r6.o()
            boolean r7 = r6.c
            if (r7 != 0) goto L_0x003d
            goto L_0x0042
        L_0x003d:
            r6.c()
            r6.c = r5
        L_0x0042:
            aucj r7 = r6.b
            aqrl r7 = (defpackage.aqrl) r7
            int r8 = r7.a
            r8 = r8 | r2
            r7.a = r8
            r8 = 29
            r7.b = r8
            boolean r7 = r4.c
            if (r7 != 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            r4.c()
            r4.c = r5
        L_0x0059:
            aucj r7 = r4.b
            aqpm r7 = (defpackage.aqpm) r7
            aucj r6 = r6.i()
            aqrl r6 = (defpackage.aqrl) r6
            r6.getClass()
            r7.c = r6
            int r6 = r7.a
            r8 = 2
            r6 = r6 | r8
            r7.a = r6
            dih r6 = r12.a
            boolean r6 = defpackage.dio.a((defpackage.dih) r6)
            r7 = 4
            if (r6 == 0) goto L_0x00dc
            boolean r6 = defpackage.awgy.h()
            if (r6 != 0) goto L_0x007f
            r6 = 2
            goto L_0x0081
        L_0x007f:
            r6 = 10212(0x27e4, float:1.431E-41)
        L_0x0081:
            r9 = 2131952125(0x7f1301fd, float:1.9540684E38)
            java.lang.String r9 = r12.a((int) r9)
            boolean r10 = r4.c
            if (r10 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r4.c()
            r4.c = r5
        L_0x0092:
            aucj r10 = r4.b
            aqpm r10 = (defpackage.aqpm) r10
            r9.getClass()
            int r11 = r10.a
            r11 = r11 | r2
            r10.a = r11
            r10.b = r9
            aqsr r6 = c((int) r6)
            boolean r9 = r4.c
            if (r9 != 0) goto L_0x00a9
            goto L_0x00ae
        L_0x00a9:
            r4.c()
            r4.c = r5
        L_0x00ae:
            aucj r9 = r4.b
            aqpm r9 = (defpackage.aqpm) r9
            r6.getClass()
            r9.d = r6
            int r6 = r9.a
            r6 = r6 | r7
            r9.a = r6
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r3.c()
            r3.c = r5
        L_0x00c6:
            aucj r6 = r3.b
            aqtw r6 = (defpackage.aqtw) r6
            aucj r4 = r4.i()
            aqpm r4 = (defpackage.aqpm) r4
            r4.getClass()
            r6.e = r4
            int r4 = r6.a
            r4 = r4 | 16
            r6.a = r4
            goto L_0x0138
        L_0x00dc:
            r6 = 2131951788(0x7f1300ac, float:1.954E38)
            java.lang.String r6 = r12.a((int) r6)
            boolean r9 = r4.c
            if (r9 != 0) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            r4.c()
            r4.c = r5
        L_0x00ed:
            aucj r9 = r4.b
            aqpm r9 = (defpackage.aqpm) r9
            r6.getClass()
            int r10 = r9.a
            r10 = r10 | r2
            r9.a = r10
            r9.b = r6
            r6 = 10048(0x2740, float:1.408E-41)
            aqsr r6 = c((int) r6)
            boolean r9 = r4.c
            if (r9 != 0) goto L_0x0106
            goto L_0x010b
        L_0x0106:
            r4.c()
            r4.c = r5
        L_0x010b:
            aucj r9 = r4.b
            aqpm r9 = (defpackage.aqpm) r9
            r6.getClass()
            r9.d = r6
            int r6 = r9.a
            r6 = r6 | r7
            r9.a = r6
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x011e
            goto L_0x0123
        L_0x011e:
            r3.c()
            r3.c = r5
        L_0x0123:
            aucj r6 = r3.b
            aqtw r6 = (defpackage.aqtw) r6
            aucj r4 = r4.i()
            aqpm r4 = (defpackage.aqpm) r4
            r4.getClass()
            r6.e = r4
            int r4 = r6.a
            r4 = r4 | 16
            r6.a = r4
        L_0x0138:
            dih r4 = r12.a
            boolean r4 = defpackage.dio.a((defpackage.dih) r4)
            java.lang.String r6 = ""
            if (r4 == 0) goto L_0x01b5
            amsv r4 = r12.f     // Catch:{ all -> 0x01ae }
            java.lang.Object r4 = r4.a()     // Catch:{ all -> 0x01ae }
            iby r4 = (defpackage.iby) r4     // Catch:{ all -> 0x01ae }
            icf r4 = r4.a((defpackage.wkz) r1)     // Catch:{ all -> 0x01ae }
            awgs r9 = defpackage.awgs.a     // Catch:{ all -> 0x01ae }
            awgt r9 = r9.a()     // Catch:{ all -> 0x01ae }
            long r9 = r9.o()     // Catch:{ all -> 0x01ae }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x01ae }
            icl r4 = r4.a(r9, r11)     // Catch:{ all -> 0x01ae }
            wla r4 = (defpackage.wla) r4     // Catch:{ all -> 0x01ae }
            com.google.android.gms.common.api.Status r1 = r4.aO()     // Catch:{ all -> 0x01ab }
            com.google.android.gms.common.api.Status r9 = com.google.android.gms.common.api.Status.a     // Catch:{ all -> 0x01ab }
            boolean r1 = r1.equals(r9)     // Catch:{ all -> 0x01ab }
            if (r1 == 0) goto L_0x01a4
            xfh r1 = r4.b()     // Catch:{ all -> 0x01ab }
            if (r1 == 0) goto L_0x01a4
            xfh r1 = r4.b()     // Catch:{ all -> 0x01ab }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01ab }
        L_0x017a:
            boolean r9 = r1.hasNext()     // Catch:{ all -> 0x01ab }
            if (r9 == 0) goto L_0x01a4
            java.lang.Object r9 = r1.next()     // Catch:{ all -> 0x01ab }
            xaa r9 = (defpackage.xaa) r9     // Catch:{ all -> 0x01ab }
            boolean r10 = r9.k()     // Catch:{ all -> 0x01ab }
            if (r10 == 0) goto L_0x017a
            dih r10 = r12.a     // Catch:{ all -> 0x01ab }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x01ab }
            java.lang.String r11 = r9.c()     // Catch:{ all -> 0x01ab }
            boolean r10 = r10.equals(r11)     // Catch:{ all -> 0x01ab }
            if (r10 == 0) goto L_0x017a
            java.lang.String r6 = r9.d()     // Catch:{ all -> 0x01ab }
            if (r4 == 0) goto L_0x01db
            r4.c()
            goto L_0x01dc
        L_0x01a4:
            if (r4 != 0) goto L_0x01a7
            goto L_0x01db
        L_0x01a7:
            r4.c()
            goto L_0x01db
        L_0x01ab:
            r13 = move-exception
            r1 = r4
            goto L_0x01af
        L_0x01ae:
            r13 = move-exception
        L_0x01af:
            if (r1 == 0) goto L_0x01b4
            r1.c()
        L_0x01b4:
            throw r13
        L_0x01b5:
            boolean r1 = defpackage.awgy.g()
            if (r1 == 0) goto L_0x01db
            cvl r1 = r12.g
            android.os.UserManager r4 = r1.b
            if (r4 != 0) goto L_0x01c2
            goto L_0x01da
        L_0x01c2:
            boolean r4 = defpackage.jkr.f()
            if (r4 == 0) goto L_0x01da
            android.content.Context r4 = r1.a
            java.lang.String r9 = "android.permission.MANAGE_USERS"
            int r4 = defpackage.kf.a((android.content.Context) r4, (java.lang.String) r9)
            if (r4 != 0) goto L_0x01d9
            android.os.UserManager r1 = r1.b
            java.lang.String r6 = r1.getUserName()
            goto L_0x01dc
        L_0x01d9:
            goto L_0x01dc
        L_0x01da:
            goto L_0x01dc
        L_0x01db:
        L_0x01dc:
            boolean r1 = defpackage.amrk.a((java.lang.String) r6)
            if (r1 != 0) goto L_0x01fa
            boolean r1 = r3.c
            if (r1 != 0) goto L_0x01e7
            goto L_0x01ec
        L_0x01e7:
            r3.c()
            r3.c = r5
        L_0x01ec:
            aucj r1 = r3.b
            aqtw r1 = (defpackage.aqtw) r1
            r6.getClass()
            int r4 = r1.a
            r4 = r4 | r8
            r1.a = r4
            r1.b = r6
        L_0x01fa:
            boolean r1 = b((int) r0)
            if (r1 == 0) goto L_0x022a
            boolean r1 = defpackage.jkr.b()
            if (r1 != 0) goto L_0x020a
            r1 = 2131952217(0x7f130259, float:1.954087E38)
            goto L_0x020d
        L_0x020a:
            r1 = 2131952184(0x7f130238, float:1.9540804E38)
        L_0x020d:
            java.lang.String r1 = r12.a((int) r1)
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x0216
            goto L_0x021b
        L_0x0216:
            r3.c()
            r3.c = r5
        L_0x021b:
            aucj r4 = r3.b
            aqtw r4 = (defpackage.aqtw) r4
            r1.getClass()
            int r6 = r4.a
            r6 = r6 | 64
            r4.a = r6
            r4.g = r1
        L_0x022a:
            aqso r1 = defpackage.aqso.f
            aucd r1 = r1.o()
            boolean r4 = r1.c
            if (r4 != 0) goto L_0x0235
            goto L_0x023a
        L_0x0235:
            r1.c()
            r1.c = r5
        L_0x023a:
            aucj r4 = r1.b
            aqso r4 = (defpackage.aqso) r4
            int r6 = r4.a
            r6 = r6 | r8
            r4.a = r6
            r4.e = r5
            r13.getClass()
            r4.d = r13
            r13 = r6 | 1
            r4.a = r13
            aucj r13 = r3.i()
            aqtw r13 = (defpackage.aqtw) r13
            r13.getClass()
            r4.c = r13
            r4.b = r7
            aucj r13 = r1.i()
            aqso r13 = (defpackage.aqso) r13
            boolean r1 = defpackage.awgy.j()
            if (r1 != 0) goto L_0x0268
            goto L_0x0277
        L_0x0268:
            if (r0 != r2) goto L_0x0277
            dih r0 = r12.a
            boolean r0 = defpackage.dio.a((defpackage.dih) r0)
            if (r0 == 0) goto L_0x0277
            cta r13 = defpackage.cta.a(r13)
            return r13
        L_0x0277:
            cta r13 = defpackage.cta.b(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctb.a(aqsr):cta");
    }

    public final String a(int i) {
        return this.e.getString(i);
    }

    public final void a(aqpq aqpq) {
        if (dio.a(this.a)) {
            aucd o = aqrb.c.o();
            String str = this.a.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqrb aqrb = (aqrb) o.b;
            str.getClass();
            aqrb.a = 1;
            aqrb.b = str;
            aqpq.a("extra.accountName", (aqrb) o.i());
        }
    }

    public final void a(aqqj aqqj, cvo cvo) {
        if (cvo.a(this.b)) {
            GoogleSettingsItem googleSettingsItem = cvo.a;
            if (googleSettingsItem != null) {
                aqqj.a(d(2001, googleSettingsItem.o));
            } else {
                aqqj.a(c(2004, cvo.b.b));
            }
        }
    }
}
