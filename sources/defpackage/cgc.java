package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: cgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cgc extends ccy {
    public static final ccj l = new ccj(new cgb(), "XGeoHeaderProducer", new int[]{52}, (int[]) null);
    protected auja b;
    protected auja k;
    protected aucd m;
    private final cap n = cbi.r();
    private TelephonyManager o;
    private long p;
    private long q;
    private amxb r;

    public cgc(Context context, bsz bsz, String str, but but) {
        super(context, bsz, l, str, but);
    }

    protected static final int a(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoCdma) {
            return ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoGsm) {
            return ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoLte) {
            return ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
        }
        int i = Build.VERSION.SDK_INT;
        if (cellInfo instanceof CellInfoWcdma) {
            return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
        }
        return Integer.MIN_VALUE;
    }

    protected static final aujb k() {
        auja auja = (auja) aujb.y.o();
        if (auja.c) {
            auja.c();
            auja.c = false;
        }
        aujb aujb = (aujb) auja.b;
        aujb.b = 1;
        int i = 1 | aujb.a;
        aujb.a = i;
        aujb.c = 12;
        aujb.a = i | 2;
        return (aujb) auja.i();
    }

    private final List l() {
        TelephonyManager telephonyManager = this.o;
        if (telephonyManager == null) {
            return null;
        }
        try {
            return telephonyManager.getAllCellInfo();
        } catch (SecurityException e) {
            ((anih) ((anih) bxk.a.b()).a("cgc", "l", 605, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[XGeoHeaderProducer] ACCESS_COARSE_LOCATION not granted, can't read cellInfo from TelephonyManager");
            return null;
        }
    }

    private static final aujo m() {
        aucd o2 = aujo.j.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aujo aujo = (aujo) o2.b;
        aujo.b = 0;
        aujo.a |= 1;
        return (aujo) o2.i();
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i) {
        return (this.p & ((long) i)) != 0;
    }

    /* access modifiers changed from: protected */
    public final IntentFilter c() {
        if (!b(80)) {
            return null;
        }
        if (this.o == null) {
            ((anih) ((anih) bxk.a.b()).a("cgc", "c", 205, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[XGeoHeaderProducer] TelephonyManager not supported!");
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i) {
        return (this.q & ((long) i)) != 0;
    }

    /* access modifiers changed from: protected */
    public final void h() {
        jtm jtm = new jtm();
        if (b(1)) {
            jtm.a(1);
        }
        if (b(8)) {
            jtm.a(48);
        }
        if (b(2)) {
            jtm.a(18);
        }
        if (b(4)) {
            jtm.a(6);
        }
        if (b(160)) {
            jtm.a(17);
        }
        gra.c(this.d, this.g).a(jtm.a(), (jtv) this).a((acvp) new bva("[%s] registerContextListener, account=%s", this.c, this.e));
    }

    /* access modifiers changed from: protected */
    public final void i() {
        gra.c(this.d, this.g).a((jtv) this).a((acvp) new bva("[%s] unregisterContextListener, account=%s", this.c, this.e));
    }

    /* access modifiers changed from: protected */
    public final boolean j() {
        if (this.b == null || cbi.i().a() - TimeUnit.MICROSECONDS.toMillis(((aujb) this.b.b).d) >= 300000) {
            return false;
        }
        return true;
    }

    private final void b(long j) {
        atve atve;
        aucd o2 = atve.k.o();
        amzt j2 = amzy.j();
        atve atve2 = (atve) this.m.b;
        if (atve2.c || atve2.d || atve2.e || atve2.j) {
            String valueOf = String.valueOf(Base64.encodeToString(((aujb) this.b.i()).k(), 10));
            String str = valueOf.length() == 0 ? new String("w ") : "w ".concat(valueOf);
            if (str != null) {
                j2.c(str);
                boolean z = ((atve) this.m.b).c;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                atve atve3 = (atve) o2.b;
                int i = atve3.a | 2;
                atve3.a = i;
                atve3.c = z;
                atve atve4 = (atve) this.m.b;
                boolean z2 = atve4.d;
                int i2 = i | 4;
                atve3.a = i2;
                atve3.d = z2;
                boolean z3 = atve4.e;
                int i3 = i2 | 8;
                atve3.a = i3;
                atve3.e = z3;
                boolean z4 = atve4.j;
                atve3.a = i3 | 512;
                atve3.j = z4;
            }
        }
        if (!j() && bvd.a(this.d)) {
            atve atve5 = (atve) this.m.b;
            if (atve5.f || atve5.h || atve5.g || atve5.i) {
                String valueOf2 = String.valueOf(Base64.encodeToString(((aujb) this.k.i()).k(), 10));
                String str2 = valueOf2.length() == 0 ? new String("w ") : "w ".concat(valueOf2);
                if (str2 != null) {
                    j2.c(str2);
                    boolean z5 = ((atve) this.m.b).f;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atve atve6 = (atve) o2.b;
                    int i4 = atve6.a | 32;
                    atve6.a = i4;
                    atve6.f = z5;
                    atve atve7 = (atve) this.m.b;
                    boolean z6 = atve7.h;
                    int i5 = i4 | 128;
                    atve6.a = i5;
                    atve6.h = z6;
                    boolean z7 = atve7.g;
                    int i6 = i5 | 64;
                    atve6.a = i6;
                    atve6.g = z7;
                    boolean z8 = atve7.i;
                    atve6.a = i6 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    atve6.i = z8;
                }
            }
        }
        amzy a = j2.a();
        if (!a.isEmpty()) {
            String a2 = amre.a(" ").a((Iterable) a);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atve atve8 = (atve) o2.b;
            a2.getClass();
            atve8.a |= 1;
            atve8.b = a2;
            atve = (atve) o2.i();
        } else {
            atve = null;
        }
        if (atve != null) {
            jti jti = new jti(3, 52, 2);
            jti.a(jut.a(j));
            jti.a(atve.l, atve);
            c(jti.a());
        }
    }

    private final aujm a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            try {
                aujm aujm = (aujm) aucj.a((aucj) aujm.g, Base64.decode(str, 11), aubs.c());
                if (!(aujm == null || (aujm.a & 1) == 0)) {
                    auip auip = aujm.b;
                    if (auip == null) {
                        auip = auip.c;
                    }
                    if (auip.a != 0) {
                        auip auip2 = aujm.b;
                        if (auip2 == null) {
                            auip2 = auip.c;
                        }
                        if (auip2.b != 0) {
                            aucd o2 = aujm.g.o();
                            auip auip3 = aujm.b;
                            if (auip3 == null) {
                                auip3 = auip.c;
                            }
                            if (o2.c) {
                                o2.c();
                                o2.c = false;
                            }
                            aujm aujm2 = (aujm) o2.b;
                            auip3.getClass();
                            aujm2.b = auip3;
                            aujm2.a |= 1;
                            aujm aujm3 = (aujm) o2.i();
                            if (!str.equals(Base64.encodeToString(aujm3.k(), 11))) {
                                return null;
                            }
                            return aujm3;
                        }
                    }
                }
                return null;
            } catch (auda e) {
                return null;
            }
        } catch (IllegalArgumentException e2) {
            ((anih) ((anih) bxk.a.b()).a("cgc", "a", 484, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[XGeoHeaderProducer] Error decoding place.");
            return null;
        }
    }

    protected static final aujq a(CellInfo cellInfo, boolean z) {
        aujo aujo;
        int i = Build.VERSION.SDK_INT;
        if (cellInfo == null) {
            aujo = m();
        } else {
            aucd o2 = aujo.j.o();
            if (cellInfo instanceof CellInfoCdma) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo2 = (aujo) o2.b;
                aujo2.b = 3;
                aujo2.a |= 1;
                CellIdentityCdma cellIdentity = ((CellInfoCdma) cellInfo).getCellIdentity();
                int basestationId = cellIdentity.getBasestationId();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo3 = (aujo) o2.b;
                aujo3.a |= 2;
                aujo3.c = basestationId;
                int networkId = cellIdentity.getNetworkId();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo4 = (aujo) o2.b;
                aujo4.a |= 4;
                aujo4.d = networkId;
                int systemId = cellIdentity.getSystemId();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo5 = (aujo) o2.b;
                aujo5.a |= 16;
                aujo5.f = systemId;
            } else if (cellInfo instanceof CellInfoGsm) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo6 = (aujo) o2.b;
                aujo6.b = 1;
                aujo6.a |= 1;
                CellIdentityGsm cellIdentity2 = ((CellInfoGsm) cellInfo).getCellIdentity();
                int cid = cellIdentity2.getCid();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo7 = (aujo) o2.b;
                aujo7.a |= 2;
                aujo7.c = cid;
                int lac = cellIdentity2.getLac();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo8 = (aujo) o2.b;
                aujo8.a |= 4;
                aujo8.d = lac;
                int mcc = cellIdentity2.getMcc();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo9 = (aujo) o2.b;
                aujo9.a |= 8;
                aujo9.e = mcc;
                int mnc = cellIdentity2.getMnc();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo10 = (aujo) o2.b;
                aujo10.a |= 16;
                aujo10.f = mnc;
            } else if (cellInfo instanceof CellInfoLte) {
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo11 = (aujo) o2.b;
                aujo11.b = 2;
                aujo11.a |= 1;
                CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
                int ci = cellIdentity3.getCi();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo12 = (aujo) o2.b;
                aujo12.a |= 2;
                aujo12.c = ci;
                int mcc2 = cellIdentity3.getMcc();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo13 = (aujo) o2.b;
                aujo13.a |= 8;
                aujo13.e = mcc2;
                int mnc2 = cellIdentity3.getMnc();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo14 = (aujo) o2.b;
                aujo14.a |= 16;
                aujo14.f = mnc2;
                int pci = cellIdentity3.getPci();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo15 = (aujo) o2.b;
                aujo15.a |= 64;
                aujo15.h = pci;
                int tac = cellIdentity3.getTac();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aujo aujo16 = (aujo) o2.b;
                aujo16.a |= 128;
                aujo16.i = tac;
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (cellInfo instanceof CellInfoWcdma) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aujo aujo17 = (aujo) o2.b;
                    aujo17.b = 4;
                    aujo17.a |= 1;
                    CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                    int cid2 = cellIdentity4.getCid();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aujo aujo18 = (aujo) o2.b;
                    aujo18.a |= 2;
                    aujo18.c = cid2;
                    int lac2 = cellIdentity4.getLac();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aujo aujo19 = (aujo) o2.b;
                    aujo19.a |= 4;
                    aujo19.d = lac2;
                    int mcc3 = cellIdentity4.getMcc();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aujo aujo20 = (aujo) o2.b;
                    aujo20.a |= 8;
                    aujo20.e = mcc3;
                    int mnc3 = cellIdentity4.getMnc();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aujo aujo21 = (aujo) o2.b;
                    aujo21.a |= 16;
                    aujo21.f = mnc3;
                    int psc = cellIdentity4.getPsc();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aujo aujo22 = (aujo) o2.b;
                    aujo22.a |= 32;
                    aujo22.g = psc;
                } else {
                    aujo = m();
                }
            }
            aujo = (aujo) o2.i();
        }
        aucd o3 = aujq.f.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aujq aujq = (aujq) o3.b;
        aujo.getClass();
        aujq.c = aujo;
        aujq.b = 2;
        if (z) {
            aujq.a |= 4;
            aujq.d = true;
        }
        return (aujq) o3.i();
    }

    public final void b() {
        amxb amxb = this.r;
        if (amxb != null && !amxb.k()) {
            this.n.b(this.r.n());
            this.r.d();
        }
        this.r = null;
        this.o = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:223:0x0143 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.contextmanager.ContextData r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r4 = "cgc"
            if (r2 != 0) goto L_0x000c
            goto L_0x051e
        L_0x000c:
            int r0 = r22.g()
            r5 = 17
            r6 = 6
            r7 = 18
            r8 = 48
            r9 = 4
            r10 = 8
            r11 = 2
            r12 = 1
            if (r0 != r12) goto L_0x0025
            boolean r13 = r1.b((int) r12)
            if (r13 == 0) goto L_0x0025
            goto L_0x0047
        L_0x0025:
            if (r0 != r8) goto L_0x002d
            boolean r13 = r1.b((int) r10)
            if (r13 != 0) goto L_0x0047
        L_0x002d:
            if (r0 != r7) goto L_0x0035
            boolean r13 = r1.b((int) r11)
            if (r13 != 0) goto L_0x0047
        L_0x0035:
            if (r0 != r6) goto L_0x003d
            boolean r13 = r1.b((int) r9)
            if (r13 != 0) goto L_0x0047
        L_0x003d:
            if (r0 != r5) goto L_0x051e
            r0 = 160(0xa0, float:2.24E-43)
            boolean r0 = r1.b((int) r0)
            if (r0 == 0) goto L_0x051e
        L_0x0047:
            int r0 = r22.g()
            if (r0 == r12) goto L_0x03b9
            r18 = 0
            if (r0 == r6) goto L_0x02bd
            if (r0 == r8) goto L_0x01ca
            if (r0 == r5) goto L_0x01b9
            if (r0 == r7) goto L_0x0059
            goto L_0x051d
        L_0x0059:
            auci r0 = defpackage.attu.c
            java.lang.Object r0 = r2.a((defpackage.aubq) r0)
            attu r0 = (defpackage.attu) r0
            if (r0 == 0) goto L_0x051d
            aucx r5 = r0.a
            int r5 = r5.size()
            if (r5 == 0) goto L_0x051d
            aucx r5 = r0.a
            int r6 = r5.size()
            r7 = 0
            r11 = r18
            r9 = 0
        L_0x0076:
            if (r9 >= r6) goto L_0x0147
            java.lang.Object r0 = r5.get(r9)
            r13 = r0
            atts r13 = (defpackage.atts) r13
            java.lang.String r0 = r13.d
            if (r0 == 0) goto L_0x0122
            boolean r16 = r0.isEmpty()
            if (r16 != 0) goto L_0x0122
            r10 = 11
            byte[] r14 = android.util.Base64.decode(r0, r10)     // Catch:{ IllegalArgumentException -> 0x0107 }
            aubs r15 = defpackage.aubs.c()     // Catch:{ auda -> 0x0103 }
            aujm r10 = defpackage.aujm.g     // Catch:{ auda -> 0x0103 }
            aucj r10 = defpackage.aucj.a((defpackage.aucj) r10, (byte[]) r14, (defpackage.aubs) r15)     // Catch:{ auda -> 0x0103 }
            aujm r10 = (defpackage.aujm) r10     // Catch:{ auda -> 0x0103 }
            if (r10 == 0) goto L_0x0122
            int r14 = r10.a     // Catch:{ auda -> 0x0103 }
            r14 = r14 & r12
            if (r14 == 0) goto L_0x0122
            auip r14 = r10.b     // Catch:{ auda -> 0x0103 }
            if (r14 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            auip r14 = defpackage.auip.c     // Catch:{ auda -> 0x0103 }
        L_0x00a9:
            long r14 = r14.a     // Catch:{ auda -> 0x0103 }
            r19 = 0
            int r17 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r17 == 0) goto L_0x0100
            auip r14 = r10.b     // Catch:{ auda -> 0x0103 }
            if (r14 == 0) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            auip r14 = defpackage.auip.c     // Catch:{ auda -> 0x0103 }
        L_0x00b8:
            long r14 = r14.b     // Catch:{ auda -> 0x0103 }
            r19 = 0
            int r17 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r17 == 0) goto L_0x0100
            aujm r14 = defpackage.aujm.g     // Catch:{ auda -> 0x0103 }
            aucd r14 = r14.o()     // Catch:{ auda -> 0x0103 }
            auip r10 = r10.b     // Catch:{ auda -> 0x0103 }
            if (r10 == 0) goto L_0x00cb
            goto L_0x00cd
        L_0x00cb:
            auip r10 = defpackage.auip.c     // Catch:{ auda -> 0x0103 }
        L_0x00cd:
            boolean r15 = r14.c     // Catch:{ auda -> 0x0103 }
            if (r15 != 0) goto L_0x00d2
            goto L_0x00d8
        L_0x00d2:
            r14.c()     // Catch:{ auda -> 0x0103 }
            r15 = 0
            r14.c = r15     // Catch:{ auda -> 0x0103 }
        L_0x00d8:
            aucj r15 = r14.b     // Catch:{ auda -> 0x0103 }
            aujm r15 = (defpackage.aujm) r15     // Catch:{ auda -> 0x0103 }
            r10.getClass()     // Catch:{ auda -> 0x0103 }
            r15.b = r10     // Catch:{ auda -> 0x0103 }
            int r10 = r15.a     // Catch:{ auda -> 0x0103 }
            r10 = r10 | r12
            r15.a = r10     // Catch:{ auda -> 0x0103 }
            aucj r10 = r14.i()     // Catch:{ auda -> 0x0103 }
            aujm r10 = (defpackage.aujm) r10     // Catch:{ auda -> 0x0103 }
            byte[] r14 = r10.k()     // Catch:{ auda -> 0x0103 }
            r15 = 11
            java.lang.String r14 = android.util.Base64.encodeToString(r14, r15)     // Catch:{ auda -> 0x0103 }
            boolean r0 = r0.equals(r14)     // Catch:{ auda -> 0x0103 }
            if (r0 == 0) goto L_0x00fd
            goto L_0x0124
        L_0x00fd:
            r10 = r18
            goto L_0x0124
        L_0x0100:
            r10 = r18
            goto L_0x0124
        L_0x0103:
            r0 = move-exception
            r10 = r18
            goto L_0x0124
        L_0x0107:
            r0 = move-exception
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.b()
            anih r0 = (defpackage.anih) r0
            r10 = 484(0x1e4, float:6.78E-43)
            java.lang.String r14 = "a"
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r14, (int) r10, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            java.lang.String r10 = "[XGeoHeaderProducer] Error decoding place."
            r0.a((java.lang.String) r10)
            r10 = r18
            goto L_0x0124
        L_0x0122:
            r10 = r18
        L_0x0124:
            r14 = 5
            java.lang.Object r0 = r10.c(r14)
            aucd r0 = (defpackage.aucd) r0
            r0.a((defpackage.aucj) r10)
            if (r0 == 0) goto L_0x0142
            double r13 = r13.b
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0139
            r15 = r13
            goto L_0x013a
        L_0x0139:
            r15 = r7
        L_0x013a:
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r11 = r0
        L_0x0140:
            r7 = r15
            goto L_0x0143
        L_0x0142:
        L_0x0143:
            int r9 = r9 + 1
            goto L_0x0076
        L_0x0147:
            if (r11 == 0) goto L_0x051d
            float r0 = (float) r7
            boolean r3 = r11.c
            if (r3 != 0) goto L_0x014f
            goto L_0x0155
        L_0x014f:
            r11.c()
            r3 = 0
            r11.c = r3
        L_0x0155:
            aucj r3 = r11.b
            aujm r3 = (defpackage.aujm) r3
            aujm r4 = defpackage.aujm.g
            int r4 = r3.a
            r5 = 2
            r4 = r4 | r5
            r3.a = r4
            r3.d = r0
            auja r0 = r1.b
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x016a
            goto L_0x0170
        L_0x016a:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x0170:
            aucj r3 = r0.b
            aujb r3 = (defpackage.aujb) r3
            aujb r4 = defpackage.aujb.y
            aucx r4 = defpackage.aucj.s()
            r3.v = r4
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0181
            goto L_0x0187
        L_0x0181:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x0187:
            aucj r0 = r0.b
            aujb r0 = (defpackage.aujb) r0
            aucj r3 = r11.i()
            aujm r3 = (defpackage.aujm) r3
            r3.getClass()
            r0.c()
            aucx r0 = r0.v
            r0.add(r3)
            aucd r0 = r1.m
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x01a3
            goto L_0x01a9
        L_0x01a3:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x01a9:
            aucj r0 = r0.b
            atve r0 = (defpackage.atve) r0
            atve r3 = defpackage.atve.k
            int r3 = r0.a
            r4 = 4
            r3 = r3 | r4
            r0.a = r3
            r0.d = r12
            goto L_0x0509
        L_0x01b9:
            auci r0 = defpackage.atvc.c
            java.lang.Object r0 = r2.a((defpackage.aubq) r0)
            atvc r0 = (defpackage.atvc) r0
            boolean r0 = r1.a((boolean) r12, (defpackage.atvc) r0)
            if (r0 != 0) goto L_0x0509
            goto L_0x051d
        L_0x01ca:
            auci r0 = defpackage.atut.g
            java.lang.Object r0 = r2.a((defpackage.aubq) r0)
            atut r0 = (defpackage.atut) r0
            if (r0 == 0) goto L_0x051d
            auja r3 = r1.b
            aucj r3 = r3.b
            aujb r3 = (defpackage.aujb) r3
            auiz r3 = r3.s
            if (r3 != 0) goto L_0x01e0
            auiz r3 = defpackage.auiz.w
        L_0x01e0:
            r4 = 5
            java.lang.Object r4 = r3.c(r4)
            aucd r4 = (defpackage.aucd) r4
            r4.a((defpackage.aucj) r3)
            auit r4 = (defpackage.auit) r4
            double r5 = r0.c
            double r5 = java.lang.Math.toDegrees(r5)
            int r3 = (int) r5
            boolean r5 = r4.c
            if (r5 == 0) goto L_0x01fe
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x01fe:
            aucj r5 = r4.b
            auiz r5 = (defpackage.auiz) r5
            int r6 = r5.a
            r7 = 2
            r6 = r6 | r7
            r5.a = r6
            r5.c = r3
            double r5 = r0.b
            r7 = 4615288897914535936(0x400cccccc0000000, double:3.5999999046325684)
            double r5 = r5 * r7
            long r5 = java.lang.Math.round(r5)
            int r3 = (int) r5
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x021d
            goto L_0x0223
        L_0x021d:
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x0223:
            aucj r5 = r4.b
            auiz r5 = (defpackage.auiz) r5
            int r6 = r5.a
            r9 = 8
            r6 = r6 | r9
            r5.a = r6
            r5.e = r3
            int r3 = r0.a
            r5 = 4
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0256
            double r5 = r0.d
            double r5 = r5 * r7
            long r5 = java.lang.Math.round(r5)
            int r3 = (int) r5
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0244
            goto L_0x024a
        L_0x0244:
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x024a:
            aucj r5 = r4.b
            auiz r5 = (defpackage.auiz) r5
            int r6 = r5.a
            r6 = r6 | 16
            r5.a = r6
            r5.f = r3
        L_0x0256:
            int r3 = r0.a
            r5 = 8
            r3 = r3 & r5
            if (r3 == 0) goto L_0x027b
            double r5 = r0.e
            double r5 = java.lang.Math.toDegrees(r5)
            int r0 = (int) r5
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x0269
            goto L_0x026f
        L_0x0269:
            r4.c()
            r3 = 0
            r4.c = r3
        L_0x026f:
            aucj r3 = r4.b
            auiz r3 = (defpackage.auiz) r3
            int r5 = r3.a
            r6 = 4
            r5 = r5 | r6
            r3.a = r5
            r3.d = r0
        L_0x027b:
            auja r0 = r1.b
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0282
            goto L_0x0288
        L_0x0282:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x0288:
            aucj r0 = r0.b
            aujb r0 = (defpackage.aujb) r0
            aucj r3 = r4.i()
            auiz r3 = (defpackage.auiz) r3
            aujb r4 = defpackage.aujb.y
            r3.getClass()
            r0.s = r3
            int r3 = r0.a
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 | r4
            r0.a = r3
            aucd r0 = r1.m
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x02a7
            goto L_0x02ad
        L_0x02a7:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x02ad:
            aucj r0 = r0.b
            atve r0 = (defpackage.atve) r0
            atve r3 = defpackage.atve.k
            int r3 = r0.a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r0.a = r3
            r0.j = r12
            goto L_0x0509
        L_0x02bd:
            auci r0 = defpackage.atrs.c
            java.lang.Object r0 = r2.a((defpackage.aubq) r0)
            atrs r0 = (defpackage.atrs) r0
            if (r0 == 0) goto L_0x051d
            aucx r3 = r0.a
            int r3 = r3.size()
            if (r3 == 0) goto L_0x051d
            aucx r0 = r0.a
            int r3 = r0.size()
            r4 = 1001(0x3e9, float:1.403E-42)
            r5 = 0
            r6 = 0
        L_0x02d9:
            if (r5 >= r3) goto L_0x0317
            java.lang.Object r7 = r0.get(r5)
            atrq r7 = (defpackage.atrq) r7
            int r8 = r7.c
            if (r8 <= r6) goto L_0x0313
            int r4 = r7.b
            atrp r4 = defpackage.atrp.a(r4)
            if (r4 == 0) goto L_0x02ee
            goto L_0x02f0
        L_0x02ee:
            atrp r4 = defpackage.atrp.IN_VEHICLE
        L_0x02f0:
            int r4 = r4.x
            int r4 = defpackage.auin.a(r4)
            if (r4 == 0) goto L_0x02fa
            r6 = 1
            goto L_0x02fb
        L_0x02fa:
            r6 = 0
        L_0x02fb:
            java.lang.Object[] r8 = new java.lang.Object[r12]
            int r9 = r7.b
            atrp r9 = defpackage.atrp.a(r9)
            if (r9 == 0) goto L_0x0306
            goto L_0x0308
        L_0x0306:
            atrp r9 = defpackage.atrp.IN_VEHICLE
        L_0x0308:
            r10 = 0
            r8[r10] = r9
            java.lang.String r9 = "no matching location.unified.ActivityRecord.Type for personalization.context.detected_activity.ActivityRecord.Type: %s"
            defpackage.iva.a(r6, r9, r8)
            int r6 = r7.c
            goto L_0x0314
        L_0x0313:
        L_0x0314:
            int r5 = r5 + 1
            goto L_0x02d9
        L_0x0317:
            auio r0 = defpackage.auio.d
            aucd r0 = r0.o()
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x0322
            goto L_0x0328
        L_0x0322:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x0328:
            aucj r3 = r0.b
            auio r3 = (defpackage.auio) r3
            int r5 = r4 + -1001
            if (r4 == 0) goto L_0x03b7
            r3.b = r5
            int r4 = r3.a
            r4 = r4 | r12
            r3.a = r4
            r5 = 2
            r4 = r4 | r5
            r3.a = r4
            r3.c = r6
            aucj r0 = r0.i()
            auio r0 = (defpackage.auio) r0
            auja r3 = r1.b
            aucj r3 = r3.b
            aujb r3 = (defpackage.aujb) r3
            auiz r3 = r3.s
            if (r3 != 0) goto L_0x034f
            auiz r3 = defpackage.auiz.w
        L_0x034f:
            r4 = 5
            java.lang.Object r4 = r3.c(r4)
            aucd r4 = (defpackage.aucd) r4
            r4.a((defpackage.aucj) r3)
            auit r4 = (defpackage.auit) r4
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x0361
            goto L_0x0367
        L_0x0361:
            r4.c()
            r3 = 0
            r4.c = r3
        L_0x0367:
            aucj r3 = r4.b
            auiz r3 = (defpackage.auiz) r3
            aucx r5 = defpackage.aucj.s()
            r3.l = r5
            r4.a(r0)
            aucj r0 = r4.i()
            auiz r0 = (defpackage.auiz) r0
            auja r3 = r1.b
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x0381
            goto L_0x0387
        L_0x0381:
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x0387:
            aucj r3 = r3.b
            aujb r3 = (defpackage.aujb) r3
            aujb r4 = defpackage.aujb.y
            r0.getClass()
            r3.s = r0
            int r0 = r3.a
            r4 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r4
            r3.a = r0
            aucd r0 = r1.m
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x03a0
            goto L_0x03a6
        L_0x03a0:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x03a6:
            aucj r0 = r0.b
            atve r0 = (defpackage.atve) r0
            atve r3 = defpackage.atve.k
            int r3 = r0.a
            r4 = 8
            r3 = r3 | r4
            r0.a = r3
            r0.e = r12
            goto L_0x0509
        L_0x03b7:
            throw r18
        L_0x03b9:
            auci r0 = defpackage.atus.j
            java.lang.Object r0 = r2.a((defpackage.aubq) r0)
            atus r0 = (defpackage.atus) r0
            jut r3 = r22.j()
            long r3 = r3.c()
            if (r0 == 0) goto L_0x051d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x03f1
            auja r5 = r1.b
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r6.toMicros(r3)
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x03e3
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x03e3:
            aucj r5 = r5.b
            aujb r5 = (defpackage.aujb) r5
            aujb r6 = defpackage.aujb.y
            int r6 = r5.a
            r7 = 4
            r6 = r6 | r7
            r5.a = r6
            r5.d = r3
        L_0x03f1:
            auir r3 = defpackage.auir.d
            aucd r3 = r3.o()
            int r4 = r0.b
            boolean r5 = r3.c
            if (r5 != 0) goto L_0x03fe
            goto L_0x0404
        L_0x03fe:
            r3.c()
            r5 = 0
            r3.c = r5
        L_0x0404:
            aucj r5 = r3.b
            auir r5 = (defpackage.auir) r5
            int r6 = r5.a
            r6 = r6 | r12
            r5.a = r6
            r5.b = r4
            int r4 = r0.c
            r7 = 2
            r6 = r6 | r7
            r5.a = r6
            r5.c = r4
            aucj r3 = r3.i()
            auir r3 = (defpackage.auir) r3
            auja r4 = r1.b
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0424
            goto L_0x042a
        L_0x0424:
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x042a:
            aucj r4 = r4.b
            aujb r4 = (defpackage.aujb) r4
            aujb r5 = defpackage.aujb.y
            r3.getClass()
            r4.f = r3
            int r3 = r4.a
            r3 = r3 | 16
            r4.a = r3
            float r3 = r0.g
            r4 = 0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x045f
            auja r5 = r1.b
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r6
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x044d
            goto L_0x0453
        L_0x044d:
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x0453:
            aucj r5 = r5.b
            aujb r5 = (defpackage.aujb) r5
            int r6 = r5.a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r5.a = r6
            r5.i = r3
        L_0x045f:
            float r3 = r0.e
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x046c
            r5 = 1135869952(0x43b40000, float:360.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x046c
            goto L_0x0472
        L_0x046c:
            float r3 = r0.d
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x04ee
        L_0x0472:
            auja r3 = r1.b
            aucj r3 = r3.b
            aujb r3 = (defpackage.aujb) r3
            auiz r3 = r3.s
            if (r3 != 0) goto L_0x047e
            auiz r3 = defpackage.auiz.w
        L_0x047e:
            r4 = 5
            java.lang.Object r4 = r3.c(r4)
            aucd r4 = (defpackage.aucd) r4
            r4.a((defpackage.aucj) r3)
            auit r4 = (defpackage.auit) r4
            float r3 = r0.e
            int r3 = java.lang.Math.round(r3)
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x0496
            goto L_0x049c
        L_0x0496:
            r4.c()
            r5 = 0
            r4.c = r5
        L_0x049c:
            aucj r5 = r4.b
            auiz r5 = (defpackage.auiz) r5
            int r6 = r5.a
            r7 = 2
            r6 = r6 | r7
            r5.a = r6
            r5.c = r3
            float r0 = r0.d
            r3 = 1080452710(0x40666666, float:3.6)
            float r0 = r0 * r3
            int r0 = java.lang.Math.round(r0)
            boolean r3 = r4.c
            if (r3 != 0) goto L_0x04b8
            goto L_0x04be
        L_0x04b8:
            r4.c()
            r3 = 0
            r4.c = r3
        L_0x04be:
            aucj r3 = r4.b
            auiz r3 = (defpackage.auiz) r3
            int r5 = r3.a
            r6 = 8
            r5 = r5 | r6
            r3.a = r5
            r3.e = r0
            aucj r0 = r4.i()
            auiz r0 = (defpackage.auiz) r0
            auja r3 = r1.b
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x04d8
            goto L_0x04de
        L_0x04d8:
            r3.c()
            r4 = 0
            r3.c = r4
        L_0x04de:
            aucj r3 = r3.b
            aujb r3 = (defpackage.aujb) r3
            r0.getClass()
            r3.s = r0
            int r0 = r3.a
            r4 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 | r4
            r3.a = r0
        L_0x04ee:
            aucd r0 = r1.m
            boolean r3 = r0.c
            if (r3 != 0) goto L_0x04f5
            goto L_0x04fb
        L_0x04f5:
            r0.c()
            r3 = 0
            r0.c = r3
        L_0x04fb:
            aucj r0 = r0.b
            atve r0 = (defpackage.atve) r0
            atve r3 = defpackage.atve.k
            int r3 = r0.a
            r4 = 2
            r3 = r3 | r4
            r0.a = r3
            r0.c = r12
        L_0x0509:
            android.content.Context r0 = r1.d
            int r0 = defpackage.rns.c(r0)
            if (r0 == 0) goto L_0x051d
            jut r0 = r22.j()
            long r2 = r0.c()
            r1.b((long) r2)
            return
        L_0x051d:
            return
        L_0x051e:
            jjg r0 = defpackage.bxk.a
            anie r0 = r0.c()
            anih r0 = (defpackage.anih) r0
            r5 = 314(0x13a, float:4.4E-43)
            java.lang.String r6 = "b"
            anie r0 = r0.a((java.lang.String) r4, (java.lang.String) r6, (int) r5, (java.lang.String) r3)
            anih r0 = (defpackage.anih) r0
            if (r2 == 0) goto L_0x053b
            int r2 = r22.g()
            java.lang.String r2 = java.lang.Integer.toString(r2)
            goto L_0x053d
        L_0x053b:
            java.lang.String r2 = "null"
        L_0x053d:
            java.lang.String r3 = "[XGeoHeaderProducer] Received unexpected context %s"
            r0.a((java.lang.String) r3, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgc.b(com.google.android.gms.contextmanager.ContextData):void");
    }

    private static final aujq a(atvd atvd, boolean z) {
        aucd o2 = aujp.d.o();
        if ((atvd.a & 1) != 0) {
            String str = atvd.b;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aujp aujp = (aujp) o2.b;
            str.getClass();
            aujp.a |= 1;
            aujp.b = str;
        }
        int i = atvd.f;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aujp aujp2 = (aujp) o2.b;
        aujp2.a |= 2;
        aujp2.c = i;
        aucd o3 = aujq.f.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        aujq aujq = (aujq) o3.b;
        aujp aujp3 = (aujp) o2.i();
        aujp3.getClass();
        aujq.c = aujp3;
        aujq.b = 1;
        if (z) {
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            aujq aujq2 = (aujq) o3.b;
            aujq2.a |= 4;
            aujq2.d = true;
        }
        return (aujq) o3.i();
    }

    private static final cas a(cas cas, atjv atjv) {
        car car = cas.b;
        String str = car.c.b;
        String a = car.a();
        car car2 = cas.b;
        ContextManagerClientInfo contextManagerClientInfo = new ContextManagerClientInfo(str, a, car2.b, car2.b(), 0, -1, -1);
        String c = cas.b.c();
        int i = atjv.bA;
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 36);
        sb.append(c);
        sb.append("_XGeoHeader_Interest_Key_");
        sb.append(i);
        caq caq = new caq(sb.toString(), atjv, cas.e(), contextManagerClientInfo);
        cbc g = cas.g();
        if (g != null) {
            if (atjv == atjv.DETECTED_ACTIVITY) {
                caq.a(cbc.a(g.b()));
            } else {
                caq.a(g);
            }
        }
        return caq.a();
    }

    private final void a(car car) {
        this.n.b((Collection) this.r.c((Object) car));
        this.r.e(car);
    }

    private final boolean a(boolean z, atvc atvc) {
        List<CellInfo> list;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        int a;
        boolean z4;
        boolean z5;
        atvc atvc2 = atvc;
        if (z && atvc2 == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            if (atvc2.a.size() != 0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                boolean b2 = b(128);
                aucx aucx = atvc2.a;
                int size = aucx.size();
                atvd atvd = null;
                for (int i = 0; i < size; i++) {
                    atvd atvd2 = (atvd) aucx.get(i);
                    if ((atvd2.a & 1) != 0) {
                        if (atvd2.h) {
                            arrayList3.add(atvd2);
                        } else if (b2 && (atvd == null || atvd.f < atvd2.f)) {
                            atvd = atvd2;
                        }
                    }
                }
                aucd aucd = this.m;
                if (!b(32) || arrayList3.size() != 1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                atve atve = (atve) aucd.b;
                atve atve2 = atve.k;
                atve.a |= 64;
                atve.g = z4;
                if (((atve) this.m.b).g) {
                    arrayList2.add(a((atvd) arrayList3.remove(0), true));
                }
                if (b2) {
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        atvd atvd3 = (atvd) arrayList3.get(i2);
                        if (atvd == null || atvd.f < atvd3.f) {
                            atvd = atvd3;
                        }
                    }
                }
                aucd aucd2 = this.m;
                if (atvd != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                atve atve3 = (atve) aucd2.b;
                atve3.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                atve3.i = z5;
                if (((atve) this.m.b).i) {
                    arrayList2.add(a(atvd, false));
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                return false;
            }
        } else {
            for (aujq aujq : Collections.unmodifiableList(((aujb) this.k.b).w)) {
                if (aujq.b == 1) {
                    arrayList2.add(aujq);
                }
            }
        }
        TelephonyManager telephonyManager = this.o;
        if (telephonyManager != null) {
            try {
                list = telephonyManager.getAllCellInfo();
            } catch (SecurityException e) {
                ((anih) ((anih) bxk.a.b()).a("cgc", "l", 605, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[XGeoHeaderProducer] ACCESS_COARSE_LOCATION not granted, can't read cellInfo from TelephonyManager");
                list = null;
            }
            if (!jir.a((Collection) list)) {
                arrayList = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                boolean b3 = b(64);
                int i3 = Integer.MIN_VALUE;
                CellInfo cellInfo = null;
                for (CellInfo next : list) {
                    if (!(next instanceof CellInfoCdma) && !(next instanceof CellInfoGsm) && !(next instanceof CellInfoLte)) {
                        int i4 = Build.VERSION.SDK_INT;
                        if (!(next instanceof CellInfoWcdma)) {
                        }
                    }
                    if (next.isRegistered()) {
                        arrayList4.add(next);
                    } else if (b3 && (a = a(next)) > i3) {
                        cellInfo = next;
                        i3 = a;
                    }
                }
                aucd aucd3 = this.m;
                if (!b(16) || arrayList4.isEmpty()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                atve atve4 = (atve) aucd3.b;
                atve atve5 = atve.k;
                atve4.a = 32 | atve4.a;
                atve4.f = z2;
                if (((atve) this.m.b).f) {
                    arrayList.add(a((CellInfo) arrayList4.remove(0), true));
                }
                if (b3) {
                    int size3 = arrayList4.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        CellInfo cellInfo2 = (CellInfo) arrayList4.get(i5);
                        int a2 = a(cellInfo2);
                        int i6 = a2 > i3 ? a2 : i3;
                        if (a2 > i3) {
                            cellInfo = cellInfo2;
                        }
                        i5++;
                        i3 = i6;
                    }
                }
                aucd aucd4 = this.m;
                if (cellInfo != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (aucd4.c) {
                    aucd4.c();
                    aucd4.c = false;
                }
                atve atve6 = (atve) aucd4.b;
                atve6.a |= 128;
                atve6.h = z3;
                if (((atve) this.m.b).h) {
                    arrayList.add(a(cellInfo, false));
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            } else if (!z) {
                return false;
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        auja auja = this.k;
        if (auja.c) {
            auja.c();
            auja.c = false;
        }
        aujb aujb = aujb.y;
        ((aujb) auja.b).w = aucj.s();
        if (auja.c) {
            auja.c();
            auja.c = false;
        }
        aujb aujb2 = (aujb) auja.b;
        aujb2.e();
        auab.a((Iterable) arrayList2, (List) aujb2.w);
        if (!bvd.a(this.d) || j()) {
            return false;
        }
        return true;
    }

    public final void a() {
        this.p = awwz.a.a().a();
        int i = Build.VERSION.SDK_INT;
        this.q = this.p & awwz.a.a().b();
        this.m = atve.k.o();
        if (b(15)) {
            aujb k2 = k();
            aucd aucd = (aucd) k2.c(5);
            aucd.a((aucj) k2);
            this.b = (auja) aucd;
        }
        if (c(15)) {
            this.r = amzg.q();
        }
        if (b(240)) {
            aujb k3 = k();
            aucd aucd2 = (aucd) k3.c(5);
            aucd2.a((aucj) k3);
            this.k = (auja) aucd2;
            if (b(80)) {
                this.o = (TelephonyManager) this.d.getSystemService("phone");
                a(false, (atvc) null);
            }
            if (b(160)) {
                jtm jtm = new jtm();
                jtm.a(17);
                jtm.b(1);
                cjb a = cbi.p().a((ContextDataFilterImpl) jtm.a(), cbi.a(this.e, "XGeoHeaderProducer"), Long.MAX_VALUE);
                if (ibt.c(a.a)) {
                    ArrayList arrayList = a.b;
                    if (!jir.a((Collection) arrayList)) {
                        a(true, (atvc) ((ContextData) arrayList.get(0)).a((aubq) atvc.c));
                    }
                }
            }
        }
    }

    public final void a(Context context, Intent intent) {
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        if (valueOf.length() == 0) {
            new String("Received intent: ");
        } else {
            "Received intent: ".concat(valueOf);
        }
        if (action.equals("android.net.conn.CONNECTIVITY_CHANGE") && a(false, (atvc) null)) {
            b(cbi.i().a());
        }
    }

    public final void a(cas cas) {
        if (this.r != null) {
            a(cas.b);
        }
    }

    public final void a(cas cas, cas cas2) {
        if (this.r != null) {
            if (cas2 != null) {
                a(cas2.b);
            }
            if (cas.g() != null && cas.g().a() == 3) {
                if (c(1)) {
                    cas a = a(cas, atjv.USER_LOCATION);
                    this.r.a((Object) cas.b, (Object) a);
                    this.n.a(a);
                }
                if (c(2)) {
                    cas a2 = a(cas, atjv.PLACES);
                    this.r.a((Object) cas.b, (Object) a2);
                    this.n.a(a2);
                }
                if (c(4)) {
                    cas a3 = a(cas, atjv.DETECTED_ACTIVITY);
                    this.r.a((Object) cas.b, (Object) a3);
                    this.n.a(a3);
                }
            }
        }
    }
}
