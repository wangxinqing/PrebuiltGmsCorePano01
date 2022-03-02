package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tkv {
    public final ou a = new ou();
    public final ou b = new ou();
    public final ou c = new ou();
    public asoe d;

    public tkv(asoe asoe) {
        a(asoe);
    }

    private static List a(ou ouVar, int i) {
        asog asog;
        if (i == 5) {
            asog = asog.MOVED_TO_NEW_MEDIUM;
        } else {
            asog = asog.CONNECTION_CLOSED;
        }
        ArrayList arrayList = new ArrayList();
        ou ouVar2 = new ou();
        for (int i2 = 0; i2 < ouVar.h; i2++) {
            tkw tkw = (tkw) ouVar.c(i2);
            aucd a2 = tkw.a();
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            askm askm = (askm) a2.b;
            askm askm2 = askm.h;
            askm.g = asog.j;
            askm.a |= 32;
            arrayList.add((askm) a2.i());
            if (i == 5) {
                ouVar2.put((Long) ouVar.b(i2), new tkw(tkw.b, tkw.a));
            }
        }
        ouVar.clear();
        if (i == 5) {
            ouVar.a(ouVar2);
        }
        return arrayList;
    }

    public final void b(long j, asog asog) {
        ou ouVar = this.c;
        Long valueOf = Long.valueOf(j);
        if (ouVar.containsKey(valueOf)) {
            asoe asoe = this.d;
            if (asoe != null) {
                aucd aucd = (aucd) this.a.get(asoe);
                aucd a2 = ((tkw) this.c.remove(valueOf)).a();
                if (a2.c) {
                    a2.c();
                    a2.c = false;
                }
                askm askm = (askm) a2.b;
                askm askm2 = askm.h;
                askm.g = asog.j;
                askm.a |= 32;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                askl askl = (askl) aucd.b;
                askm askm3 = (askm) a2.i();
                askl askl2 = askl.g;
                askm3.getClass();
                askl.b();
                askl.e.add(askm3);
                return;
            }
            ((anih) ((anih) tky.a.c()).a("tkv", "b", 927, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected call to incomingPayloadDone() while NearbyRecorder has no active current medium.");
        }
    }

    public final List a() {
        if (this.d != null) {
            ((anih) ((anih) tky.a.c()).a("tkv", "a", 871, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("NearbyRecorder expected no more active physical connections before logging this endpoint connection.");
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ou ouVar = this.a;
            if (i < ouVar.h) {
                arrayList.add((askl) ((aucd) ouVar.c(i)).i());
                i++;
            } else {
                ouVar.clear();
                return arrayList;
            }
        }
    }

    public final void a(long j, asog asog) {
        ou ouVar = this.b;
        Long valueOf = Long.valueOf(j);
        if (ouVar.containsKey(valueOf)) {
            asoe asoe = this.d;
            if (asoe != null) {
                aucd aucd = (aucd) this.a.get(asoe);
                aucd a2 = ((tkw) this.b.remove(valueOf)).a();
                if (a2.c) {
                    a2.c();
                    a2.c = false;
                }
                askm askm = (askm) a2.b;
                askm askm2 = askm.h;
                askm.g = asog.j;
                askm.a |= 32;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                askl askl = (askl) aucd.b;
                askm askm3 = (askm) a2.i();
                askl askl2 = askl.g;
                askm3.getClass();
                askl.a();
                askl.d.add(askm3);
                return;
            }
            ((anih) ((anih) tky.a.c()).a("tkv", "a", 900, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected call to outgoingPayloadDone() while NearbyRecorder has no active current medium.");
        }
    }

    public final void a(asoe asoe) {
        if (this.d != null) {
            ((anih) ((anih) tky.a.c()).a("tkv", "a", 798, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected call to physicalConnectionEstablished while NearbyRecorder still has an active current medium.");
        }
        ou ouVar = this.a;
        aucd o = askl.g.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        askl askl = (askl) o.b;
        askl.c = asoe.k;
        askl.a |= 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (o.c) {
            o.c();
            o.c = false;
        }
        askl askl2 = (askl) o.b;
        askl2.a |= 1;
        askl2.b = elapsedRealtime;
        ouVar.put(asoe, o);
        this.d = asoe;
    }

    public final void a(asoe asoe, int i) {
        String str;
        asoe asoe2 = this.d;
        if (asoe2 == null) {
            ((anih) ((anih) tky.a.c()).a("tkv", "a", 813, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected call to physicalConnectionClosed() for medium %s while NearbyRecorder has no active current medium", (Object) asoe.name());
        } else if (asoe2 != asoe) {
            ((anih) ((anih) tky.a.c()).a("tkv", "a", 818, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected call to physicalConnectionClosed() for medium %s while NearbyRecorder has active medium %s", (Object) asoe.name(), (Object) this.d.name());
        }
        aucd aucd = (aucd) this.a.get(asoe);
        if (aucd == null) {
            ((anih) ((anih) tky.a.c()).a("tkv", "a", 826, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unexpected call to physicalConnectionClosed() for medium %s with no corresponding EstablishedConnection that was previously opened.", (Object) asoe.name());
        } else if ((((askl) aucd.b).a & 4) == 0) {
            a(aucd, i);
            if (asoe == this.d) {
                this.d = null;
            }
        } else {
            anih anih = (anih) ((anih) tky.a.c()).a("tkv", "a", 833, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            String name = asoe.name();
            int a2 = asob.a(((askl) aucd.b).f);
            if (a2 == 0) {
                a2 = 1;
            }
            switch (a2) {
                case 1:
                    str = "UNKNOWN_DISCONNECTION_REASON";
                    break;
                case 2:
                    str = "LOCAL_DISCONNECTION";
                    break;
                case 3:
                    str = "REMOTE_DISCONNECTION";
                    break;
                case 4:
                    str = "IO_ERROR";
                    break;
                case 5:
                    str = "UPGRADED";
                    break;
                case 6:
                    str = "SHUTDOWN";
                    break;
                default:
                    str = "UNFINISHED";
                    break;
            }
            anih.a("Unexpected call to physicalConnectionClosed() for medium %s which already has disconnection reason %s", (Object) name, (Object) str);
        }
    }

    public final void a(aucd aucd, int i) {
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        askl askl = (askl) aucd.b;
        int i2 = i - 1;
        askl askl2 = askl.g;
        if (i != 0) {
            askl.f = i2;
            askl.a |= 4;
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((askl) aucd.b).b;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            askl askl3 = (askl) aucd.b;
            askl3.a |= 1;
            askl3.b = elapsedRealtime;
            List a2 = a(this.b, i);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            askl askl4 = (askl) aucd.b;
            askl4.a();
            auab.a((Iterable) a2, (List) askl4.d);
            List a3 = a(this.c, i);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            askl askl5 = (askl) aucd.b;
            askl5.b();
            auab.a((Iterable) a3, (List) askl5.e);
            return;
        }
        throw null;
    }
}
