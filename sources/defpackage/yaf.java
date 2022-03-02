package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: yaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yaf extends yai {
    private final Set d = new HashSet();
    private final xwv e;
    private final boolean f;
    private final boolean g;
    private yal h;
    private final yap i;

    public yaf(xwv xwv, xwn xwn, xyu xyu, xvp xvp, Uri uri, yaz yaz, wss wss, String str) {
        super("FSA2_ApiContactsReader", xwn, xyu, xvp, uri, yaz);
        this.e = xwv;
        xip.a();
        xip.a();
        this.f = Boolean.valueOf(ayrj.a.a().J()).booleanValue();
        xip.a();
        this.g = Boolean.valueOf(ayrj.a.a().s()).booleanValue();
        if (this.f) {
            this.h = new yal(Integer.valueOf((int) ayrj.a.a().bt()).intValue(), Double.valueOf(ayrj.a.a().aP()).doubleValue(), Integer.valueOf((int) ayrj.a.a().aI()).intValue());
        }
        this.i = new yap(wss, str);
    }

    /* access modifiers changed from: protected */
    public final xvv a() {
        String str;
        xvk a = this.a.a.a();
        int i2 = a.a;
        String str2 = null;
        if ((i2 & 1) != 0) {
            str = a.b;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = a.c;
        }
        return new xvv(str, str2);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a.a((String) null);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        ((ybh) this.b).i = true;
        if (this.c) {
            this.a.a(System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final xvv a(xvv xvv, boolean z, yah yah) {
        int i2;
        int i3;
        int i4;
        int i5;
        xvv xvv2 = xvv;
        if (this.f && z) {
            this.h.a();
        }
        xwv xwv = this.e;
        if (this.g) {
            yap yap = this.i;
            if (yap.a.a(yap.b)) {
                xip.a();
                i2 = Integer.valueOf((int) ayrj.a.a().bc()).intValue();
            } else {
                xip.a();
                i2 = ((Integer) xie.a.a()).intValue();
            }
        } else if (this.f) {
            yal yal = this.h;
            int i6 = yal.d;
            double d2 = (double) i6;
            double d3 = yal.b;
            Double.isNaN(d2);
            yal.d = Math.min((int) (d2 * d3), yal.c);
            i2 = i6;
        } else {
            xip.a();
            i2 = ((Integer) xie.a.a()).intValue();
        }
        aucd o = aqxe.i.o();
        aucd o2 = aqxd.c.o();
        String str = xvv2.a;
        if (str != null) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            str.getClass();
            ((aqxd) o2.b).a = str;
        }
        xip.a();
        int i7 = 3;
        if (Boolean.valueOf(ayrj.a.a().E()).booleanValue() && xwv.g.b) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ((aqxd) o2.b).b = aqxc.a(3);
        } else if (Boolean.valueOf(ayrj.a.a().ab()).booleanValue()) {
            int intValue = Integer.valueOf((int) ayrj.a.a().ap()).intValue();
            if (intValue == 0) {
                i7 = 2;
            } else if (intValue != 1) {
                i7 = intValue != 2 ? 0 : 4;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ((aqxd) o2.b).b = aqxc.a(i7);
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqxd aqxd = (aqxd) o2.i();
        aqxd.getClass();
        ((aqxe) o.b).c = aqxd;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqxe aqxe = (aqxe) o.b;
        aqxe.a = i2;
        String str2 = xwv.c;
        str2.getClass();
        aqxe.h = str2;
        aqvk b = xwv.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqxe aqxe2 = (aqxe) o.b;
        b.getClass();
        aqxe2.g = b;
        String str3 = xvv2.b;
        if (str3 != null) {
            str3.getClass();
            aqxe2.b = str3;
        }
        aqwp aqwp = xwv.f;
        if (aqwp != null) {
            aqwp.getClass();
            aqxe2.e = aqwp;
        }
        aqwu aqwu = (aqwu) aqww.d.o();
        aubv aubv = (aubv) aubw.b.o();
        aubv.a((Iterable) Arrays.asList(xwv.h));
        aubw aubw = (aubw) aubv.i();
        if (aqwu.c) {
            aqwu.c();
            aqwu.c = false;
        }
        aubw.getClass();
        ((aqww) aqwu.b).a = aubw;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqww aqww = (aqww) aqwu.i();
        aqww.getClass();
        ((aqxe) o.b).d = aqww;
        aqwn c = xwv.c();
        aucd aucd = (aucd) c.c(5);
        aucd.a((aucj) c);
        aqwl aqwl = (aqwl) aucd;
        if (Boolean.valueOf(ayrj.a.a().bd()).booleanValue()) {
            if (aqwl.c) {
                aqwl.c();
                aqwl.c = false;
            }
            aqwn aqwn = aqwn.d;
            ((aqwn) aqwl.b).c = aucj.q();
            aqwl.a(aqwm.CORE_ID);
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqwn aqwn2 = (aqwn) aqwl.i();
        aqwn2.getClass();
        ((aqxe) o.b).f = aqwn2;
        xwv.d.a();
        try {
            xpp xpp = xwv.b;
            ClientContext clientContext = xwv.a;
            aqxe aqxe3 = (aqxe) o.i();
            try {
                xpo xpo = xpp.b;
                long j = (long) xpp.a;
                if (xpo.b == null) {
                    xpo.b = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/SyncPeople", baoq.a(aqxe.i), baoq.a(aqwk.g));
                }
                aqwk aqwk = (aqwk) xpo.a.a(xpo.b, clientContext, aqxe3, j, TimeUnit.MILLISECONDS);
                yav yav = xwv.d;
                if (aqwk != null) {
                    i3 = aqwk.a.size();
                } else {
                    i3 = 0;
                }
                yav.a("FSA_syncPeople", i3, xxa.a(aqwk));
                if (aqwk != null) {
                    boolean booleanValue = Boolean.valueOf(ayrj.a.a().aq()).booleanValue();
                    if (!booleanValue) {
                        i4 = aqwk.d;
                    } else {
                        aquj aquj = aqwk.f;
                        if (aquj == null) {
                            aquj = aquj.b;
                        }
                        i4 = aquj.a;
                    }
                    xwv.e.a(xjo.CONTACT, xkj.BEFORE_SYNC, xjm.SERVER, i4);
                    if (xwv.i.a() && ((Boolean) xgj.a.a()).booleanValue() && z) {
                        xxg xxg = (xxg) xwv.i.b();
                        if (!booleanValue) {
                            if (!TextUtils.isEmpty(xvv2.a)) {
                                i5 = aqwk.a.size();
                            } else {
                                i5 = aqwk.d;
                            }
                            xxg.a(i5);
                        } else {
                            int i8 = aqwk.e;
                            if (((ybh) xwv.e).t) {
                                xxg.a(i4);
                                xxg.e(i4 - i8);
                            } else {
                                xxg.a(i8);
                            }
                        }
                    }
                }
                if (aqwk != null) {
                    Log.i("FSA2_ContactSyncGrpc", "Received non-null API-contact response");
                    xvv xvv3 = new xvv(aqwk.c, aqwk.b);
                    if (aqwk.a.size() == 0) {
                        return xvv3;
                    }
                    aqwk.a.size();
                    for (amgi amgi : aqwk.a) {
                        if (amgi == null) {
                            Log.i("FSA2_ContactSyncGrpc", "Ignoring null API person");
                        } else {
                            for (String str4 : yaw.a(amgi)) {
                                xvs a = xwy.a(amgi, str4);
                                if (a == null) {
                                    xdt.a("FSA2_ContactSyncGrpc", "Skipping invalid/unexpected API person {id=%s}", str4);
                                } else if (a.h || !ycm.a((Collection) a.s)) {
                                    yah.a(a);
                                } else {
                                    xdt.a("FSA2_ContactSyncGrpc", "Skipping Other contact {id=%s}", str4);
                                }
                            }
                            yah yah2 = yah;
                        }
                    }
                    return xvv3;
                }
                Log.e("FSA2_ContactSyncGrpc", "Received null API-contact response");
                return null;
            } catch (eif e2) {
                e = e2;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                throw e;
            } catch (babk e3) {
                e = e3;
                Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
                throw e;
            }
        } catch (eif e4) {
            Log.e("FSA2_ContactSyncGrpc", "getContacts() failed", e4);
            throw new xye(e4);
        } catch (babk e5) {
            Log.e("FSA2_ContactSyncGrpc", "getContacts() failed", e5);
            throw e5;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        xvs xvs = (xvs) obj;
        if (this.d.contains(xvs.a)) {
            String str = xvs.a;
            return false;
        }
        this.d.add(xvs.a);
        return true;
    }
}
