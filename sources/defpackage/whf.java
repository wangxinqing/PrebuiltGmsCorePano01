package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: whf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class whf {
    public final whd a;
    public final vvk b;
    public final vva c;
    public boolean d = false;
    private final Context e;
    private final List f = new ArrayList();
    private final vvk g;
    private final vvk h;
    private final vvk i;
    private final vvk j;
    private final wbo k;
    private boolean l = false;

    public whf(Context context, wbo wbo, vva vva) {
        whd whd = new whd(new izd(context, ayni.a.a().aW(), (int) ayni.a.a().aX(), context.getApplicationInfo().uid, 9732, (byte[]) null));
        this.e = context;
        this.k = wbo;
        this.g = new vvk("uploadContacts");
        this.h = new vvk("uploadPublicCertificates");
        this.i = new vvk("downloadPublicCertificates");
        this.j = new vvk("updateDeviceName");
        this.b = new vvk("checkContactsReachability");
        this.a = whd;
        this.c = vva;
    }

    public static int a(Exception exc) {
        if (!(exc instanceof babk)) {
            return exc instanceof eif ? 9 : 3;
        }
        babg babg = babg.OK;
        int ordinal = ((babk) exc).a.r.ordinal();
        if (ordinal == 4) {
            return 5;
        }
        if (ordinal == 7) {
            return 6;
        }
        if (ordinal != 14) {
            return ordinal != 16 ? 4 : 8;
        }
        return 7;
    }

    public final aspx b(Account account, vih vih) {
        if (this.d) {
            jjg jjg = vvj.a;
            return null;
        } else if (account == null) {
            jjg jjg2 = vvj.a;
            return null;
        } else if (vih.a.size() == 0) {
            jjg jjg3 = vvj.a;
            return null;
        } else if (this.b.a(ayni.a.a().s(), ayni.a.a().t())) {
            return null;
        } else {
            this.b.a();
            asps asps = (asps) aspv.b.o();
            aucx aucx = vih.a;
            int size = aucx.size();
            for (int i2 = 0; i2 < size; i2++) {
                vig vig = (vig) aucx.get(i2);
                aspt aspt = (aspt) aspu.d.o();
                vii vii = vig.b;
                if (vii == null) {
                    vii = vii.d;
                }
                String str = vii.c;
                if (aspt.c) {
                    aspt.c();
                    aspt.c = false;
                }
                str.getClass();
                ((aspu) aspt.b).a = str;
                aspt.a(vig.e);
                aspt.b(vig.f);
                asps.a(aspt);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                whd whd = this.a;
                ClientContext c2 = c(account);
                aspv aspv = (aspv) asps.i();
                if (whd.b == null) {
                    whd.b = baaj.a(baai.UNARY, "location.nearby.sharing.v1.NearbySharingService/CheckContactsReachability", baoq.a(aspv.b), baoq.a(aspx.b));
                }
                aspx aspx = (aspx) whd.a.a(whd.b, c2, aspv, 10000, TimeUnit.MILLISECONDS);
                this.c.a(vvb.a(4, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                jjg jjg4 = vvj.a;
                return aspx;
            } catch (babk | eif e2) {
                this.c.a(vvb.a(4, a(e2), SystemClock.elapsedRealtime() - elapsedRealtime));
                anih anih = (anih) vvj.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("whf", "b", 558, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("'checkContactsReachability' failed.");
                return null;
            }
        }
    }

    public final ClientContext c(Account account) {
        ClientContext clientContext = new ClientContext();
        clientContext.b = Process.myUid();
        clientContext.c = account;
        clientContext.e = this.e.getPackageName();
        clientContext.f = this.e.getPackageName();
        clientContext.d(ayni.a.a().e());
        return clientContext;
    }

    public final synchronized void a() {
        this.f.clear();
        this.a.a.b();
        this.d = true;
    }

    public final synchronized void a(wdr wdr) {
        this.f.add(wdr);
    }

    public final synchronized boolean a(Account account) {
        if (this.d) {
            jjg jjg = vvj.a;
            return false;
        } else if (!this.l) {
            String f2 = this.k.f();
            if (TextUtils.isEmpty(f2)) {
                jjg jjg2 = vvj.a;
                return false;
            } else if (this.j.a(ayni.a.a().bp(), ayni.a.a().bq())) {
                return false;
            } else {
                this.j.a();
                aucd o = asqe.c.o();
                aubv aubv = (aubv) aubw.b.o();
                aubv.a("display_name");
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aubw aubw = (aubw) aubv.i();
                aubw.getClass();
                ((asqe) o.b).b = aubw;
                aucd o2 = asqc.e.o();
                String valueOf = String.valueOf(this.k.a());
                String str = valueOf.length() == 0 ? new String("users/me/devices/") : "users/me/devices/".concat(valueOf);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                asqc asqc = (asqc) o2.b;
                str.getClass();
                asqc.a = str;
                f2.getClass();
                asqc.b = f2;
                asqc asqc2 = (asqc) o2.i();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    asqc2.getClass();
                    ((asqe) o.b).a = asqc2;
                    asqf a2 = this.a.a(c(account), (asqe) o.i());
                    for (wdr a3 : this.f) {
                        a3.a(a2);
                    }
                    this.c.a(vvb.a(6, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                    jjg jjg3 = vvj.a;
                    return true;
                } catch (babk | eif e2) {
                    this.c.a(vvb.a(6, a(e2), SystemClock.elapsedRealtime() - elapsedRealtime));
                    anih anih = (anih) vvj.a.b();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("whf", "a", 201, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("'updateDeviceName' failed.");
                    return true;
                }
            }
        } else {
            jjg jjg4 = vvj.a;
            return false;
        }
    }

    public final synchronized List b(Account account) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            if (this.d) {
                jjg jjg = vvj.a;
                return arrayList;
            } else if (this.l) {
                jjg jjg2 = vvj.a;
                return arrayList;
            } else if (account == null) {
                jjg jjg3 = vvj.a;
                return arrayList;
            } else if (this.i.a(ayni.a.a().N(), ayni.a.a().O())) {
                return arrayList;
            } else {
                this.i.a();
                int i2 = 1;
                String format = String.format("users/me/devices/%s", new Object[]{this.k.a()});
                long ao = ayni.a.a().ao();
                aucd o = aspy.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aspy aspy = (aspy) o.b;
                format.getClass();
                aspy.a = format;
                aspy.b = (int) ao;
                aspy aspy2 = (aspy) o.i();
                String str = "0";
                long elapsedRealtime = SystemClock.elapsedRealtime();
                while (!TextUtils.isEmpty(str)) {
                    try {
                        try {
                            int parseInt = Integer.parseInt(str);
                            whd whd = this.a;
                            ClientContext c2 = c(account);
                            aucd aucd = (aucd) aspy2.c(5);
                            aucd.a((aucj) aspy2);
                            String num = Integer.toString(parseInt);
                            if (aucd.c) {
                                aucd.c();
                                aucd.c = false;
                            }
                            num.getClass();
                            ((aspy) aucd.b).c = num;
                            aspy aspy3 = (aspy) aucd.i();
                            if (whd.c == null) {
                                whd.c = baaj.a(baai.UNARY, "location.nearby.sharing.v1.NearbySharingService/ListPublicCertificates", baoq.a(aspy.d), baoq.a(aspz.c));
                            }
                            aspz aspz = (aspz) whd.a.a(whd.c, c2, aspy3, 10000, TimeUnit.MILLISECONDS);
                            for (asqd asqd : aspz.b) {
                                aucd o2 = vhn.i.o();
                                auay auay = asqd.a;
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                vhn vhn = (vhn) o2.b;
                                auay.getClass();
                                int i3 = vhn.a | i2;
                                vhn.a = i3;
                                vhn.b = auay;
                                auay auay2 = asqd.b;
                                auay2.getClass();
                                int i4 = i3 | 2;
                                vhn.a = i4;
                                vhn.c = auay2;
                                auay auay3 = asqd.c;
                                auay3.getClass();
                                vhn.a = i4 | 4;
                                vhn.d = auay3;
                                aufc aufc = asqd.d;
                                if (aufc == null) {
                                    aufc = aufc.c;
                                }
                                long a2 = augk.a(aufc);
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                vhn vhn2 = (vhn) o2.b;
                                vhn2.a |= 8;
                                vhn2.e = a2;
                                aufc aufc2 = asqd.e;
                                if (aufc2 == null) {
                                    aufc2 = aufc.c;
                                }
                                long a3 = augk.a(aufc2);
                                if (o2.c) {
                                    o2.c();
                                    o2.c = false;
                                }
                                vhn vhn3 = (vhn) o2.b;
                                int i5 = vhn3.a | 16;
                                vhn3.a = i5;
                                vhn3.f = a3;
                                auay auay4 = asqd.h;
                                auay4.getClass();
                                int i6 = i5 | 32;
                                vhn3.a = i6;
                                vhn3.g = auay4;
                                auay auay5 = asqd.i;
                                auay5.getClass();
                                vhn3.a = i6 | 64;
                                vhn3.h = auay5;
                                arrayList.add((vhn) o2.i());
                                i2 = 1;
                            }
                            str = aspz.a;
                            jjg jjg4 = vvj.a;
                            i2 = 1;
                        } catch (NumberFormatException e2) {
                        }
                    } catch (babk | eif e3) {
                        this.c.a(vvb.a(3, a(e3), SystemClock.elapsedRealtime() - elapsedRealtime));
                        anih anih = (anih) vvj.a.b();
                        anih.a((Throwable) e3);
                        ((anih) anih.a("whf", "b", 482, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("'downloadPublicCertificates' failed for parent: %s.", (Object) format);
                    }
                }
                this.c.a(vvb.a(3, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
        return arrayList;
    }

    public final synchronized boolean a(Account account, List list) {
        if (this.d) {
            jjg jjg = vvj.a;
            return false;
        } else if (this.l) {
            jjg jjg2 = vvj.a;
            return false;
        } else if (account != null) {
            String f2 = this.k.f();
            if (TextUtils.isEmpty(f2)) {
                jjg jjg3 = vvj.a;
                return false;
            } else if (this.h.a(ayni.a.a().bu(), ayni.a.a().bv())) {
                return false;
            } else {
                this.h.a();
                aucd o = asqe.c.o();
                aubv aubv = (aubv) aubw.b.o();
                aubv.a("display_name");
                aubv.a("public_certificates");
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aubw aubw = (aubw) aubv.i();
                aubw.getClass();
                ((asqe) o.b).b = aubw;
                aucd o2 = asqc.e.o();
                String valueOf = String.valueOf(this.k.a());
                String str = valueOf.length() == 0 ? new String("users/me/devices/") : "users/me/devices/".concat(valueOf);
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                asqc asqc = (asqc) o2.b;
                str.getClass();
                asqc.a = str;
                f2.getClass();
                asqc.b = f2;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    whe whe = (whe) it.next();
                    vhn vhn = whe.a;
                    aucd o3 = asqd.j.o();
                    auay auay = vhn.b;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    asqd asqd = (asqd) o3.b;
                    auay.getClass();
                    asqd.a = auay;
                    auay auay2 = vhn.d;
                    auay2.getClass();
                    asqd.c = auay2;
                    auay auay3 = vhn.c;
                    auay3.getClass();
                    asqd.b = auay3;
                    aucd o4 = aufc.c.o();
                    long j2 = vhn.e / 1000;
                    if (o4.c) {
                        o4.c();
                        o4.c = false;
                    }
                    ((aufc) o4.b).a = j2;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aufc aufc = (aufc) o4.i();
                    aufc.getClass();
                    ((asqd) o3.b).d = aufc;
                    aucd o5 = aufc.c.o();
                    long j3 = vhn.f / 1000;
                    if (o5.c) {
                        o5.c();
                        o5.c = false;
                    }
                    ((aufc) o5.b).a = j3;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    aufc aufc2 = (aufc) o5.i();
                    aufc2.getClass();
                    ((asqd) o3.b).e = aufc2;
                    auay auay4 = whe.b;
                    if (o3.c) {
                        o3.c();
                        o3.c = false;
                    }
                    asqd asqd2 = (asqd) o3.b;
                    auay4.getClass();
                    asqd2.g = auay4;
                    auay auay5 = vhn.g;
                    auay5.getClass();
                    asqd2.h = auay5;
                    asqd2.f = whe.c;
                    auay auay6 = vhn.h;
                    auay6.getClass();
                    asqd2.i = auay6;
                    asqd asqd3 = (asqd) o3.i();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    asqc asqc2 = (asqc) o2.b;
                    asqd3.getClass();
                    if (!asqc2.d.a()) {
                        asqc2.d = aucj.a(asqc2.d);
                    }
                    asqc2.d.add(asqd3);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    asqc asqc3 = (asqc) o2.i();
                    asqc3.getClass();
                    ((asqe) o.b).a = asqc3;
                    asqf a2 = this.a.a(c(account), (asqe) o.i());
                    for (wdr a3 : this.f) {
                        a3.a(a2);
                    }
                    this.c.a(vvb.a(2, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                    jjg jjg4 = vvj.a;
                    return true;
                } catch (babk | eif e2) {
                    this.c.a(vvb.a(2, a(e2), SystemClock.elapsedRealtime() - elapsedRealtime));
                    anih anih = (anih) vvj.a.b();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("whf", "a", 403, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("'uploadCertificates' failed.");
                    return false;
                }
            }
        } else {
            jjg jjg5 = vvj.a;
            return false;
        }
    }

    public final synchronized void b() {
        this.f.clear();
        this.l = true;
    }

    public final synchronized boolean a(Account account, vih vih) {
        int i2;
        aucx aucx;
        int i3;
        aucx aucx2;
        Account account2 = account;
        synchronized (this) {
            if (this.d) {
                jjg jjg = vvj.a;
                return false;
            } else if (this.l) {
                jjg jjg2 = vvj.a;
                return false;
            } else if (account2 != null) {
                String f2 = this.k.f();
                if (TextUtils.isEmpty(f2)) {
                    jjg jjg3 = vvj.a;
                    return false;
                } else if (this.g.a(ayni.a.a().bs(), ayni.a.a().bt())) {
                    return false;
                } else {
                    this.g.a();
                    aucd o = asqe.c.o();
                    aubv aubv = (aubv) aubw.b.o();
                    aubv.a("display_name");
                    aubv.a("contacts");
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aubw aubw = (aubw) aubv.i();
                    aubw.getClass();
                    ((asqe) o.b).b = aubw;
                    aucd o2 = asqc.e.o();
                    String valueOf = String.valueOf(this.k.a());
                    String str = valueOf.length() == 0 ? new String("users/me/devices/") : "users/me/devices/".concat(valueOf);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    asqc asqc = (asqc) o2.b;
                    str.getClass();
                    asqc.a = str;
                    f2.getClass();
                    asqc.b = f2;
                    nz nzVar = new nz();
                    aucx aucx3 = vih.a;
                    int size = aucx3.size();
                    int i4 = 0;
                    while (i4 < size) {
                        vig vig = (vig) aucx3.get(i4);
                        if (vig.h) {
                            boolean z = vig.g;
                            aucx aucx4 = vig.e;
                            int size2 = aucx4.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                String str2 = (String) aucx4.get(i5);
                                asqb asqb = (asqb) nzVar.get(str2);
                                if (asqb != null) {
                                    if (asqb.b) {
                                        aucx2 = aucx3;
                                        i3 = size;
                                        i5++;
                                        aucx3 = aucx2;
                                        size = i3;
                                    }
                                }
                                aucd o3 = asqb.c.o();
                                aucd o4 = asqa.c.o();
                                aucx2 = aucx3;
                                if (o4.c) {
                                    o4.c();
                                    o4.c = false;
                                }
                                asqa asqa = (asqa) o4.b;
                                str2.getClass();
                                i3 = size;
                                asqa.a = 3;
                                asqa.b = str2;
                                asqa asqa2 = (asqa) o4.i();
                                if (o3.c) {
                                    o3.c();
                                    o3.c = false;
                                }
                                asqb asqb2 = (asqb) o3.b;
                                asqa2.getClass();
                                asqb2.a = asqa2;
                                asqb2.b = z;
                                nzVar.put(str2, (asqb) o3.i());
                                i5++;
                                aucx3 = aucx2;
                                size = i3;
                            }
                            aucx = aucx3;
                            i2 = size;
                            aucx aucx5 = vig.f;
                            int size3 = aucx5.size();
                            for (int i6 = 0; i6 < size3; i6++) {
                                String str3 = (String) aucx5.get(i6);
                                asqb asqb3 = (asqb) nzVar.get(str3);
                                if (asqb3 != null) {
                                    if (asqb3.b) {
                                    }
                                }
                                aucd o5 = asqb.c.o();
                                aucd o6 = asqa.c.o();
                                if (o6.c) {
                                    o6.c();
                                    o6.c = false;
                                }
                                asqa asqa3 = (asqa) o6.b;
                                str3.getClass();
                                asqa3.a = 2;
                                asqa3.b = str3;
                                asqa asqa4 = (asqa) o6.i();
                                if (o5.c) {
                                    o5.c();
                                    o5.c = false;
                                }
                                asqb asqb4 = (asqb) o5.b;
                                asqa4.getClass();
                                asqb4.a = asqa4;
                                asqb4.b = z;
                                nzVar.put(str3, (asqb) o5.i());
                            }
                        } else {
                            aucx = aucx3;
                            i2 = size;
                        }
                        i4++;
                        aucx3 = aucx;
                        size = i2;
                    }
                    if (vvb.a() != 2) {
                        aucd o7 = asqb.c.o();
                        aucd o8 = asqa.c.o();
                        String str4 = account2.name;
                        if (o8.c) {
                            o8.c();
                            o8.c = false;
                        }
                        asqa asqa5 = (asqa) o8.b;
                        str4.getClass();
                        asqa5.a = 3;
                        asqa5.b = str4;
                        asqa asqa6 = (asqa) o8.i();
                        if (o7.c) {
                            o7.c();
                            o7.c = false;
                        }
                        asqb asqb5 = (asqb) o7.b;
                        asqa6.getClass();
                        asqb5.a = asqa6;
                        asqb5.b = true;
                        asqb asqb6 = (asqb) o7.i();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        asqc asqc2 = (asqc) o2.b;
                        asqb6.getClass();
                        asqc2.a();
                        asqc2.c.add(asqb6);
                    }
                    ArrayList arrayList = new ArrayList(nzVar.values());
                    List subList = arrayList.subList(0, Math.min((int) ayni.a.a().br(), arrayList.size()));
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    asqc asqc3 = (asqc) o2.b;
                    asqc3.a();
                    auab.a((Iterable) subList, (List) asqc3.c);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        asqc asqc4 = (asqc) o2.i();
                        asqc4.getClass();
                        ((asqe) o.b).a = asqc4;
                        asqf a2 = this.a.a(c(account), (asqe) o.i());
                        for (wdr a3 : this.f) {
                            a3.a(a2);
                        }
                        this.c.a(vvb.a(5, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                        jjg jjg4 = vvj.a;
                        return true;
                    } catch (babk | eif e2) {
                        this.c.a(vvb.a(5, a(e2), SystemClock.elapsedRealtime() - elapsedRealtime));
                        anih anih = (anih) vvj.a.b();
                        anih.a((Throwable) e2);
                        ((anih) anih.a("whf", "a", 324, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("'uploadContacts' failed.");
                        return false;
                    }
                }
            } else {
                jjg jjg5 = vvj.a;
                return false;
            }
        }
    }
}
