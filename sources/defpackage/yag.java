package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: yag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yag extends yai {
    private final xww d;

    public yag(xww xww, xwn xwn, xyu xyu, xvp xvp, Uri uri, yaz yaz) {
        super("FSA2_ApiGroupsReader", xwn, xyu, xvp, uri, yaz);
        this.d = xww;
    }

    /* access modifiers changed from: protected */
    public final xvv a() {
        String str;
        xvk a = this.a.a.a();
        int i = a.a;
        String str2 = null;
        if ((i & 4) != 0) {
            str = a.d;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = a.e;
        }
        return new xvv(str, str2);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a.b();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        ((ybh) this.b).h = true;
        if (this.c) {
            this.a.a(System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: protected */
    public final int d() {
        return 2;
    }

    /* access modifiers changed from: protected */
    public final xvv a(xvv xvv, boolean z, yah yah) {
        int i;
        String str;
        xvv xvv2 = xvv;
        xww xww = this.d;
        aucd o = aqwe.g.o();
        xip.a();
        int intValue = Integer.valueOf((int) ayrj.a.a().an()).intValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqwe aqwe = (aqwe) o.b;
        aqwe.a = intValue;
        String str2 = xvv2.a;
        if (str2 != null) {
            str2.getClass();
            aqwe.c = str2;
            aqwd aqwd = aqwd.INCLUDE_DELETED;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqwe aqwe2 = (aqwe) o.b;
            aqwd.getClass();
            if (!aqwe2.d.a()) {
                aqwe2.d = aucj.a(aqwe2.d);
            }
            aqwe2.d.d(aqwd.a());
        }
        String str3 = xvv2.b;
        if (str3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            str3.getClass();
            ((aqwe) o.b).b = str3;
        }
        aqvv aqvv = (aqvv) aqvx.b.o();
        aqvv.a(aqvw.GDATA_COMPATIBILITY);
        aqvx aqvx = (aqvx) aqvv.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqwe aqwe3 = (aqwe) o.b;
        aqvx.getClass();
        aqwe3.e = aqvx;
        aqwp aqwp = xww.f;
        aqwp.getClass();
        aqwe3.f = aqwp;
        try {
            xww.d.a();
            xpp xpp = xww.b;
            ClientContext clientContext = xww.a;
            aqwe aqwe4 = (aqwe) o.i();
            xpo xpo = xpp.b;
            long j = (long) xpp.a;
            if (xpo.f == null) {
                xpo.f = baaj.a(baai.UNARY, "google.internal.people.v2.InternalPeopleService/ListContactGroups", baoq.a(aqwe.g), baoq.a(aqwf.e));
            }
            aqwf aqwf = (aqwf) xpo.a.a(xpo.f, clientContext, aqwe4, j, TimeUnit.MILLISECONDS);
            yav yav = xww.d;
            if (aqwf != null) {
                i = aqwf.a.size();
            } else {
                i = 0;
            }
            yav.a("FSA_listContactGroups", i, xxa.a(aqwf));
            if (aqwf != null) {
                Log.i("FSA2_GroupSyncGrpc", "Received non-null API-group response");
                xvv xvv3 = new xvv(aqwf.c, aqwf.b);
                xww.e.a(xjo.GROUP, xkj.BEFORE_SYNC, xjm.SERVER, aqwf.d);
                aucx aucx = aqwf.a;
                int size = aucx.size();
                for (int i2 = 0; i2 < size; i2++) {
                    avlc avlc = (avlc) aucx.get(i2);
                    try {
                        xvu a = xwy.a(avlc);
                        a.j();
                        a.f();
                        yah.a(a);
                    } catch (xxy e) {
                        yah yah2 = yah;
                        xxy xxy = e;
                        if (xxy.a == 5) {
                            if (avlc != null) {
                                avkw avkw = avlc.d;
                                if (avkw == null) {
                                    avkw = avkw.g;
                                }
                                if ((avkw.a & 1) != 0) {
                                    avkw avkw2 = avlc.d;
                                    if (avkw2 == null) {
                                        avkw2 = avkw.g;
                                    }
                                    avkx avkx = avkw2.b;
                                    if (avkx == null) {
                                        avkx = avkx.c;
                                    }
                                    str = avkx.b;
                                } else {
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            xdt.a("FSA2_GroupSyncGrpc", "Skipping unexpected system group {id=%s}", str);
                        } else {
                            xdt.b("FSA2_GroupSyncGrpc", "Stop syncing because of error when loading API group", xxy);
                            throw new xye(xxy);
                        }
                    } catch (babk e2) {
                        babk babk = e2;
                        xdt.b("FSA2_GroupSyncGrpc", "Stop syncing because of error when loading API group", babk);
                        throw new xye(babk);
                    }
                }
                if (xww.h.a()) {
                    xip.a();
                    if (((Boolean) xgi.a.a()).booleanValue() && z) {
                        ((xxg) xww.h.b()).b(aqwf.d);
                        return xvv3;
                    }
                }
                return xvv3;
            }
            Log.e("FSA2_GroupSyncGrpc", "Received null API-group response");
            return null;
        } catch (babk | eif e3) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e3);
            throw e3;
        } catch (eif e4) {
            Log.e("FSA2_GroupSyncGrpc", "getGroups() failed", e4);
            throw new xye(e4);
        } catch (babk e5) {
            Log.e("FSA2_GroupSyncGrpc", "getGroups() failed", e5);
            throw e5;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        xvu xvu = (xvu) obj;
        return true;
    }
}
