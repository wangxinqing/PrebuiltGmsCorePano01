package defpackage;

import android.bluetooth.le.ScanResult;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: txo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class txo extends arwm {
    final /* synthetic */ ScanResult a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ txr d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public txo(txr txr, String str, ScanResult scanResult, String str2, int i) {
        super(str);
        this.d = txr;
        this.a = scanResult;
        this.b = str2;
        this.c = i;
    }

    public final void run() {
        int i;
        double d2;
        int i2;
        asqq asqq;
        txr txr = this.d;
        ScanResult scanResult = this.a;
        byte[] serviceData = scanResult.getScanRecord().getServiceData(txr.f);
        txr.a.d();
        String a2 = jjp.a(serviceData);
        tzg tzg = (tzg) txr.a.a(a2);
        if (tzg == null || aymt.l()) {
            if (aymt.l()) {
                ((anih) tsp.a.d()).a("FastPairCache: Forcing server request for %s", (Object) a2);
            }
            txr.e.a(asom.FAST_PAIR_DEVICE_INFO_SERVER_REQUEST_SENT, a2, 0);
            long a3 = txr.d.a();
            byte[] serviceData2 = scanResult.getScanRecord().getServiceData(txr.f);
            if (serviceData2 == null || !tga.b(serviceData2)) {
                ((anih) tsp.a.d()).a("FastPairCache: service data is null or the service data is not model id skip get device info.");
                asqq = null;
            } else {
                ((anih) tsp.a.d()).a("FastPairCache: scanner found model id is %s, request the information from server.", (Object) jjp.a(serviceData2));
                asqq = ((twd) thl.a(txr.b, twd.class)).a(jjp.a(serviceData2));
            }
            if (asqq == null) {
                ((anih) tsp.a.c()).a("FastPairCache: Failed to get result from server");
                txr.e.a(asom.FAST_PAIR_DEVICE_INFO_SERVER_ERROR_RESPONSE, a2, txr.d.a() - a3);
                tzg = tzg.f;
            } else {
                anih anih = (anih) tsp.a.d();
                asqj asqj = asqq.a;
                if (asqj == null) {
                    asqj = asqj.q;
                }
                anih.a("FastPairCache: Got response from server %s", (Object) asqj.b);
                txr.e.a(asom.FAST_PAIR_DEVICE_INFO_SERVER_RESPONSE_RECEIVED, a2, txr.d.a() - a3);
                tzg = txr.a(asqq, true);
            }
        } else {
            anih anih2 = (anih) tsp.a.d();
            asqq asqq2 = tzg.c;
            if (asqq2 == null) {
                asqq2 = asqq.d;
            }
            asqj asqj2 = asqq2.a;
            if (asqj2 == null) {
                asqj2 = asqj.q;
            }
            anih2.a("FastPairCache: Item exists in cache, returning %s", (Object) asqj2.b);
            txr.e.a(asom.FAST_PAIR_LOCAL_DB_CACHE_HIT, a2, 0);
        }
        if (!tzg.equals(tzg.f)) {
            asqq asqq3 = tzg.c;
            if (asqq3 == null) {
                asqq3 = asqq.d;
            }
            asqj asqj3 = asqq3.a;
            if (asqj3 == null) {
                asqj3 = asqj.q;
            }
            aucd o = asqj.q.o();
            long parseLong = Long.parseLong(this.b, 16);
            if (o.c) {
                o.c();
                o.c = false;
            }
            ((asqj) o.b).a = parseLong;
            if (!asqj3.equals(o.i())) {
                asqj asqj4 = asqq3.a;
                if (asqj4 == null) {
                    asqj4 = asqj.q;
                }
                if (asqj4.d == 0) {
                    i = this.c;
                } else {
                    asqj asqj5 = asqq3.a;
                    if (asqj5 == null) {
                        asqj5 = asqj.q;
                    }
                    i = asqj5.d;
                }
                asqj asqj6 = asqq3.a;
                if (asqj6 == null) {
                    asqj6 = asqj.q;
                }
                if (asqj6.e == 0.0f) {
                    d2 = aymt.a.a().H();
                } else {
                    asqj asqj7 = asqq3.a;
                    if (asqj7 == null) {
                        asqj7 = asqj.q;
                    }
                    d2 = (double) asqj7.e;
                }
                if (d2 != 0.0d) {
                    double d3 = (double) (i - 41);
                    Double.isNaN(d3);
                    i2 = (int) Math.floor(d3 - (Math.log10(d2) * 20.0d));
                } else {
                    i2 = i;
                }
                tzf tzf = (tzf) this.d.get(this.a.getDevice().getAddress());
                if (tzf == null) {
                    ((anih) tsp.a.c()).a("FastPairCache: Cached Item was evicted before observed device call completed");
                    aucd o2 = tzf.A.o();
                    long a4 = ((jiq) thl.a(this.d.b, jiq.class)).a();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    tzf tzf2 = (tzf) o2.b;
                    tzf2.a |= 32;
                    tzf2.g = a4;
                    String address = this.a.getDevice().getAddress();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    tzf tzf3 = (tzf) o2.b;
                    address.getClass();
                    tzf3.a |= 128;
                    tzf3.i = address;
                    int rssi = this.a.getRssi();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    tzf tzf4 = (tzf) o2.b;
                    int i3 = tzf4.a | 2;
                    tzf4.a = i3;
                    tzf4.c = rssi;
                    String str = this.b;
                    str.getClass();
                    tzf4.a = i3 | 1;
                    tzf4.b = str;
                    tzf = (tzf) o2.i();
                }
                aucd aucd = (aucd) tzf.c(5);
                aucd.a((aucj) tzf);
                asqj asqj8 = asqq3.a;
                if (asqj8 == null) {
                    asqj8 = asqj.q;
                }
                String str2 = asqj8.c;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf5 = (tzf) aucd.b;
                str2.getClass();
                tzf5.a |= 64;
                tzf5.h = str2;
                asqj asqj9 = asqq3.a;
                if (asqj9 == null) {
                    asqj9 = asqj.q;
                }
                String str3 = asqj9.b;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf6 = (tzf) aucd.b;
                str3.getClass();
                int i4 = 16 | tzf6.a;
                tzf6.a = i4;
                tzf6.f = str3;
                auay auay = asqq3.b;
                auay.getClass();
                int i5 = i4 | 8;
                tzf6.a = i5;
                tzf6.e = auay;
                int i6 = i5 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                tzf6.a = i6;
                tzf6.j = i2;
                tzf6.a = i6 | 4;
                tzf6.d = i;
                aucd o3 = tzc.d.o();
                asqt asqt = asqq3.c;
                if (asqt == null) {
                    asqt = asqt.c;
                }
                String str4 = asqt.a;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                tzc tzc = (tzc) o3.b;
                str4.getClass();
                tzc.a |= 1;
                tzc.b = str4;
                asqt asqt2 = asqq3.c;
                if (asqt2 == null) {
                    asqt2 = asqt.c;
                }
                String str5 = asqt2.b;
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                tzc tzc2 = (tzc) o3.b;
                str5.getClass();
                tzc2.a |= 2;
                tzc2.c = str5;
                tzc tzc3 = (tzc) o3.i();
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf7 = (tzf) aucd.b;
                tzc3.getClass();
                tzf7.m = tzc3;
                tzf7.a |= 2048;
                asqj asqj10 = asqq3.a;
                if (asqj10 == null) {
                    asqj10 = asqj.q;
                }
                asqg asqg = asqj10.f;
                if (asqg == null) {
                    asqg = asqg.b;
                }
                auay auay2 = asqg.a;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf8 = (tzf) aucd.b;
                auay2.getClass();
                tzf8.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
                tzf8.n = auay2;
                asqj asqj11 = asqq3.a;
                if (asqj11 == null) {
                    asqj11 = asqj.q;
                }
                boolean z = asqj11.k;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf9 = (tzf) aucd.b;
                tzf9.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
                tzf9.o = z;
                asqj asqj12 = asqq3.a;
                if (asqj12 == null) {
                    asqj12 = asqj.q;
                }
                int i7 = asqj12.h;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf10 = (tzf) aucd.b;
                tzf10.a |= 16384;
                tzf10.p = i7;
                asqj asqj13 = asqq3.a;
                if (asqj13 == null) {
                    asqj13 = asqj.q;
                }
                int i8 = asqj13.g;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf11 = (tzf) aucd.b;
                tzf11.a |= 4194304;
                tzf11.z = i8;
                asqj asqj14 = asqq3.a;
                if (asqj14 == null) {
                    asqj14 = asqj.q;
                }
                avan avan = asqj14.i;
                if (avan == null) {
                    avan = avan.d;
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf12 = (tzf) aucd.b;
                avan.getClass();
                tzf12.q = avan;
                tzf12.a |= 32768;
                asqj asqj15 = asqq3.a;
                if (asqj15 == null) {
                    asqj15 = asqj.q;
                }
                boolean z2 = asqj15.j;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf13 = (tzf) aucd.b;
                tzf13.a |= 65536;
                tzf13.r = z2;
                asqj asqj16 = asqq3.a;
                if (asqj16 == null) {
                    asqj16 = asqj.q;
                }
                String str6 = asqj16.l;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf14 = (tzf) aucd.b;
                str6.getClass();
                tzf14.a |= 131072;
                tzf14.s = str6;
                asqj asqj17 = asqq3.a;
                if (asqj17 == null) {
                    asqj17 = asqj.q;
                }
                aucd.Z(new aucu(asqj17.m, asqj.n));
                asqj asqj18 = asqq3.a;
                if (asqj18 == null) {
                    asqj18 = asqj.q;
                }
                int a5 = asqs.a(asqj18.o);
                if (a5 == 0) {
                    a5 = 1;
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                tzf tzf15 = (tzf) aucd.b;
                if (a5 != 1) {
                    tzf15.v = a5 - 2;
                    tzf15.a |= 262144;
                    asqj asqj19 = asqq3.a;
                    if (asqj19 == null) {
                        asqj19 = asqj.q;
                    }
                    asqh asqh = asqj19.p;
                    if (asqh == null) {
                        asqh = asqh.c;
                    }
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    tzf tzf16 = (tzf) aucd.b;
                    asqh.getClass();
                    tzf16.x = asqh;
                    tzf16.a |= 1048576;
                    String address2 = this.a.getDevice().getAddress();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    tzf tzf17 = (tzf) aucd.b;
                    address2.getClass();
                    tzf17.a |= 128;
                    tzf17.i = address2;
                    tzf tzf18 = (tzf) aucd.i();
                    this.d.put(this.a.getDevice().getAddress(), tzf18);
                    this.d.a(this.a, tzf18);
                    return;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            ((anih) tsp.a.c()).a("FastPairCache: Failed to get observedDevice");
            return;
        }
        this.d.remove(this.a.getDevice().getAddress());
    }
}
