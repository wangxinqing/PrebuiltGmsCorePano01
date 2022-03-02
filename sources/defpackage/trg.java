package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: trg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class trg implements Callable {
    long a = 0;
    final /* synthetic */ trk b;
    final /* synthetic */ asas c;
    final /* synthetic */ trh d;

    public trg(trh trh, trk trk, asas asas) {
        this.d = trh;
        this.b = trk;
        this.c = asas;
    }

    /* renamed from: a */
    public final Boolean call() {
        int i;
        asog asog;
        trk trk = this.b;
        ArrayList a2 = anda.a();
        ArrayList a3 = anda.a();
        List c2 = trk.c();
        int size = c2.size();
        for (int i2 = 0; i2 < size; i2++) {
            trj trj = (trj) c2.get(i2);
            if (trj.b != tri.AVAILABLE) {
                a3.add(trj);
            } else {
                a2.add(trj.a);
            }
        }
        Pair create = Pair.create(a2, a3);
        for (trj trj2 : (List) create.second) {
            trh trh = this.d;
            trm trm = trh.d;
            tlh tlh = trh.c;
            ArrayList a4 = anda.a((Object[]) new String[]{trj2.a});
            asas asas = this.c;
            long j = this.a;
            tri tri = trj2.b;
            tri tri2 = tri.UNKNOWN;
            asal asal = asal.UNKNOWN_EVENT_TYPE;
            asao asao = asao.UNKNOWN_PACKET_TYPE;
            asog asog2 = asog.UNKNOWN_PAYLOAD_STATUS;
            int ordinal = tri.ordinal();
            if (ordinal == 1) {
                asog = asog.SUCCESS;
            } else if (ordinal == 2) {
                asog = asog.REMOTE_CANCELLATION;
            } else if (ordinal != 3) {
                ((anih) tky.a.d()).a("Unknown PayloadStatus for EndpointInfo.Status %s!", (Object) tri);
                asog = asog.UNKNOWN_PAYLOAD_STATUS;
            } else {
                asog = asog.REMOTE_ERROR;
            }
            trm.a(tlh, (List) a4, asas, j, asog);
        }
        List<String> list = (List) create.first;
        if (list.isEmpty()) {
            jjg jjg = tky.a;
            return false;
        } else if (this.b.b()) {
            ((anih) tky.a.d()).a("Aborting send of payload %s at offset %d since it is marked canceled.", (Object) this.b, this.a);
            trh trh2 = this.d;
            trh2.d.a(trh2.c, (List) list, this.c, this.a, asog.LOCAL_CANCELLATION);
            return false;
        } else {
            for (String a5 : list) {
                this.b.a(a5, this.a);
            }
            trm trm2 = this.d.d;
            int G = (int) aymi.G();
            for (String a6 : list) {
                long az = aymi.a.a().az();
                tnm a7 = trm2.a.a.a(a6);
                if (a7 != null) {
                    i = a7.k();
                } else {
                    i = 0;
                }
                G = Math.min(G, i - ((int) az));
            }
            try {
                byte[] a8 = this.b.a.a(G);
                long j2 = this.a;
                aucd o = asap.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                asap asap = (asap) o.b;
                asap.a |= 2;
                asap.c = j2;
                if (a8 != null) {
                    auay a9 = auay.a(a8);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    asap asap2 = (asap) o.b;
                    a9.getClass();
                    asap2.a |= 4;
                    asap2.d = a9;
                }
                asap asap3 = (asap) o.b;
                int i3 = asap3.a | 1;
                asap3.a = i3;
                asap3.b = 0;
                if (a8 == null) {
                    asap3.a = i3 | 1;
                    asap3.b = 1;
                }
                asap asap4 = (asap) o.i();
                tob tob = this.d.d.a;
                asas asas2 = this.c;
                aucd o2 = asat.f.o();
                asao asao2 = asao.DATA;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                asat asat = (asat) o2.b;
                asat.b = asao2.d;
                int i4 = asat.a | 1;
                asat.a = i4;
                asas2.getClass();
                asat.c = asas2;
                int i5 = 2 | i4;
                asat.a = i5;
                asap4.getClass();
                asat.d = asap4;
                asat.a = i5 | 4;
                List a10 = tob.a(list, tpk.a(asav.PAYLOAD_TRANSFER, (audx) o2.i()).k(), asas2.b, asap4.c, "DATA");
                if (!a10.isEmpty()) {
                    trh trh3 = this.d;
                    trh3.d.a(trh3.c, a10, this.c, this.a, asog.ENDPOINT_IO_ERROR);
                }
                if (a10.size() < list.size()) {
                    for (String str : list) {
                        if (!a10.contains(str)) {
                            trh trh4 = this.d;
                            trm trm3 = trh4.d;
                            trm3.a((Runnable) new tqx(trm3, this.c, str, asap4, trh4.c));
                        }
                    }
                    jjg jjg2 = tky.a;
                    if (a8 == null) {
                        return false;
                    }
                    this.a += (long) a8.length;
                }
                return true;
            } catch (IOException e) {
                anih anih = (anih) tky.a.b();
                anih.a((Throwable) e);
                anih.a("PayloadManager short-circuiting Payload %s after sending %d bytes because we failed to detach the next chunk.", (Object) this.b, this.a);
                trh trh5 = this.d;
                trh5.d.a(trh5.c, (List) list, this.c, this.a, asog.LOCAL_ERROR);
                return false;
            }
        }
    }
}
