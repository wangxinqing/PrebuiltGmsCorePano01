package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;
import com.google.location.nearby.messages.debug.internal.DebugPokeResponse;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* renamed from: vbb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vbb implements uws {
    public RemoteCallbackList a;
    public RemoteCallbackList b;
    private final uyv c;
    private final uyy d;
    private final ved e;
    private final vav f;
    private final Context g;
    private final vbf h;
    private auyt i;
    private vgr j;
    private RemoteCallbackList k;
    private RemoteCallbackList l;
    private RemoteCallbackList m;
    private vay n;

    public vbb(Context context) {
        this.g = context;
        vbf vbf = (vbf) thl.a(context, vbf.class);
        this.h = vbf;
        this.c = vbf.d;
        this.d = vbf.e;
        this.e = (ved) thl.a(context, ved.class);
        this.f = (vav) thl.a(context, vav.class);
        this.f.g.add(new vba(this));
    }

    private static final int a(RemoteCallbackList remoteCallbackList) {
        if (remoteCallbackList == null) {
            return 0;
        }
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        remoteCallbackList.finishBroadcast();
        return beginBroadcast;
    }

    private final DebugPokeResponse b(DebugPokeRequest debugPokeRequest) {
        asne asne = debugPokeRequest.c;
        if (asne == null) {
            ((anih) ((anih) tgc.a.b()).a("vbb", "b", 467, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: UNREGISTER_TOKEN_OBSERVER_CALLBACK with no tokenCallback");
            return new DebugPokeResponse(13);
        }
        RemoteCallbackList remoteCallbackList = this.a;
        if (remoteCallbackList != null) {
            remoteCallbackList.unregister(asne);
        }
        jjg jjg = tgc.a;
        return new DebugPokeResponse(0);
    }

    private final DebugPokeResponse c(DebugPokeRequest debugPokeRequest) {
        if (debugPokeRequest.c == null) {
            ((anih) ((anih) tgc.a.b()).a("vbb", "c", 481, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: REGISTER_TOKEN_ADVERTISER_CALLBACK with no tokenCallback");
            return new DebugPokeResponse(13);
        }
        if (this.b == null) {
            this.b = new RemoteCallbackList();
        }
        this.b.register(debugPokeRequest.c);
        if (this.n == null) {
            vay vay = new vay(this);
            this.n = vay;
            this.c.a = vay;
        }
        jjg jjg = tgc.a;
        return new DebugPokeResponse(0);
    }

    private final DebugPokeResponse d(DebugPokeRequest debugPokeRequest) {
        asne asne = debugPokeRequest.c;
        if (asne == null) {
            ((anih) ((anih) tgc.a.b()).a("vbb", "d", 503, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: UNREGISTER_TOKEN_ADVERTISER_CALLBACK with no tokenCallback");
            return new DebugPokeResponse(13);
        }
        RemoteCallbackList remoteCallbackList = this.b;
        if (remoteCallbackList != null) {
            remoteCallbackList.unregister(asne);
        }
        jjg jjg = tgc.a;
        return new DebugPokeResponse(0);
    }

    private final boolean e() {
        return a(this.m) > 0;
    }

    private final DebugPokeResponse f() {
        aucf aucf = (aucf) auvh.b.o();
        aucd o = auvj.j.o();
        auyt auyt = this.f.f;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auvj auvj = (auvj) o.b;
        auyt.getClass();
        auvj.b = auyt;
        int i2 = auvj.a | 1;
        auvj.a = i2;
        vav vav = this.f;
        auyt auyt2 = vav.b;
        auyt2.getClass();
        auvj.c = auyt2;
        int i3 = i2 | 2;
        auvj.a = i3;
        auyt auyt3 = vav.c;
        auyt3.getClass();
        auvj.d = auyt3;
        int i4 = i3 | 4;
        auvj.a = i4;
        auyt auyt4 = vav.e;
        auyt4.getClass();
        auvj.e = auyt4;
        int i5 = i4 | 8;
        auvj.a = i5;
        auyt auyt5 = vav.d;
        auyt5.getClass();
        auvj.f = auyt5;
        auvj.a = i5 | 16;
        aucd o2 = auvk.e.o();
        String m2 = aync.m();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auvk auvk = (auvk) o2.b;
        m2.getClass();
        auvk.a |= 1;
        auvk.b = m2;
        String l2 = aync.l();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auvk auvk2 = (auvk) o2.b;
        l2.getClass();
        auvk2.a |= 2;
        auvk2.c = l2;
        String b2 = aync.b();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auvk auvk3 = (auvk) o2.b;
        b2.getClass();
        auvk3.a |= 4;
        auvk3.d = b2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auvj auvj2 = (auvj) o.b;
        auvk auvk4 = (auvk) o2.i();
        auvk4.getClass();
        auvj2.g = auvk4;
        auvj2.a |= 32;
        aucd o3 = auvk.e.o();
        String m3 = aync.m();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auvk auvk5 = (auvk) o3.b;
        m3.getClass();
        auvk5.a |= 1;
        auvk5.b = m3;
        String l3 = aync.l();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auvk auvk6 = (auvk) o3.b;
        l3.getClass();
        auvk6.a |= 2;
        auvk6.c = l3;
        String b3 = aync.b();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auvk auvk7 = (auvk) o3.b;
        b3.getClass();
        auvk7.a |= 4;
        auvk7.d = b3;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auvj auvj3 = (auvj) o.b;
        auvk auvk8 = (auvk) o3.i();
        auvk8.getClass();
        auvj3.h = auvk8;
        auvj3.a |= 64;
        aucd o4 = auvk.e.o();
        String m4 = aync.m();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        auvk auvk9 = (auvk) o4.b;
        m4.getClass();
        auvk9.a |= 1;
        auvk9.b = m4;
        String l4 = aync.l();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        auvk auvk10 = (auvk) o4.b;
        l4.getClass();
        auvk10.a |= 2;
        auvk10.c = l4;
        String b4 = aync.b();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        auvk auvk11 = (auvk) o4.b;
        b4.getClass();
        auvk11.a |= 4;
        auvk11.d = b4;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auvj auvj4 = (auvj) o.b;
        auvk auvk12 = (auvk) o4.i();
        auvk12.getClass();
        auvj4.i = auvk12;
        auvj4.a |= 128;
        auvj auvj5 = (auvj) o.i();
        aucd o5 = auvf.d.o();
        auvd auvd = auvd.GET_CONFIGURATION;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        auvf auvf = (auvf) o5.b;
        auvf.b = auvd.B;
        int i6 = auvf.a | 1;
        auvf.a = i6;
        auvj5.getClass();
        auvf.c = auvj5;
        auvf.a = i6 | 2;
        auvf auvf2 = (auvf) o5.i();
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        auvh auvh = (auvh) aucf.b;
        auvf2.getClass();
        if (!auvh.a.a()) {
            auvh.a = aucj.a(auvh.a);
        }
        auvh.a.add(auvf2);
        return new DebugPokeResponse(1, 0, ((auvh) aucf.i()).k());
    }

    private static auzb a(String str, int i2) {
        auza auza = (auza) auzb.d.o();
        if (auza.c) {
            auza.c();
            auza.c = false;
        }
        auzb auzb = (auzb) auza.b;
        str.getClass();
        int i3 = auzb.a | 2;
        auzb.a = i3;
        auzb.c = str;
        auzb.a = i3 | 1;
        auzb.b = i2;
        return (auzb) auza.i();
    }

    public final boolean b() {
        return a(this.k) > 0;
    }

    public final void d() {
        if (e()) {
            aucd o = asng.c.o();
            vav vav = this.f;
            boolean z = !vav.d.equals(vav.a);
            if (o.c) {
                o.c();
                o.c = false;
            }
            asng asng = (asng) o.b;
            asng.a |= 1;
            asng.b = z;
            a((audx) o.i(), this.m);
        }
    }

    public final boolean c() {
        return a(this.l) > 0;
    }

    private final DebugPokeResponse a(auvy auvy) {
        if (auvy == null) {
            ((anih) ((anih) tgc.a.b()).a("vbb", "a", 517, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No updateConfiguration for UPDATE_CONFIGURATION");
            return new DebugPokeResponse(13);
        }
        auvk auvk = auvy.c;
        if (auvk == null) {
            auvk = auvk.e;
        }
        if ((auvk.a & 1) != 0) {
            agvx agvx = ayne.V;
            auvk auvk2 = auvy.c;
            if (auvk2 == null) {
                auvk2 = auvk.e;
            }
            agvx.b((Object) auvk2.b);
        }
        auvk auvk3 = auvy.c;
        if (auvk3 == null) {
            auvk3 = auvk.e;
        }
        if ((auvk3.a & 2) != 0) {
            agvx agvx2 = ayne.T;
            auvk auvk4 = auvy.c;
            if (auvk4 == null) {
                auvk4 = auvk.e;
            }
            agvx2.b((Object) auvk4.c);
        }
        auvk auvk5 = auvy.c;
        if (auvk5 == null) {
            auvk5 = auvk.e;
        }
        if ((auvk5.a & 4) != 0) {
            agvx agvx3 = ayne.d;
            auvk auvk6 = auvy.c;
            if (auvk6 == null) {
                auvk6 = auvk.e;
            }
            agvx3.b((Object) auvk6.d);
        }
        if ((auvy.a & 1) != 0) {
            vav vav = this.f;
            auyt auyt = auvy.b;
            if (auyt == null) {
                auyt = auyt.p;
            }
            vav.a(auyt);
        }
        return f();
    }

    private final DebugPokeResponse a(DebugPokeRequest debugPokeRequest) {
        if (debugPokeRequest.c == null) {
            ((anih) ((anih) tgc.a.b()).a("vbb", "a", 445, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: REGISTER_TOKEN_OBSERVER_CALLBACK with no tokenCallback");
            return new DebugPokeResponse(13);
        }
        if (this.a == null) {
            this.a = new RemoteCallbackList();
        }
        this.a.register(debugPokeRequest.c);
        if (this.j == null) {
            vaz vaz = new vaz(this);
            this.j = vaz;
            uyy uyy = this.d;
            uyy.d.b();
            uyy.c = vaz;
        }
        jjg jjg = tgc.a;
        return new DebugPokeResponse(0);
    }

    private static void a(audx audx, RemoteCallbackList remoteCallbackList) {
        byte[] bArr;
        if (remoteCallbackList != null) {
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            if (beginBroadcast > 0) {
                bArr = audx.k();
            } else {
                bArr = null;
            }
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                try {
                    asnf asnf = (asnf) remoteCallbackList.getBroadcastItem(i2);
                    Parcel aQ = asnf.aQ();
                    aQ.writeByteArray(bArr);
                    asnf.c(2, aQ);
                } catch (RemoteException e2) {
                    anih anih = (anih) tgc.a.c();
                    anih.a((Throwable) e2);
                    ((anih) anih.a("vbb", "a", 185, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: lost client with registered callback");
                } catch (Throwable th) {
                    remoteCallbackList.finishBroadcast();
                    throw th;
                }
            }
            remoteCallbackList.finishBroadcast();
        }
    }

    private final void a(auvm auvm) {
        auyt b2 = arwe.b();
        aucd aucd = (aucd) b2.c(5);
        aucd.a((aucj) b2);
        aucf aucf = (aucf) aucd;
        auyy auyy = ((auyt) aucf.b).d;
        if (auyy == null) {
            auyy = auyy.v;
        }
        aucd aucd2 = (aucd) auyy.c(5);
        aucd2.a((aucj) auyy);
        aucf aucf2 = (aucf) aucd2;
        auvd auvd = auvd.COMMAND_UNKNOWN;
        avch avch = avch.TOKEN_MEDIUM_UNKNOWN;
        avch a2 = avch.a(auvm.a);
        if (a2 == null) {
            a2 = avch.TOKEN_MEDIUM_UNKNOWN;
        }
        int ordinal = a2.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 8) {
                        anih anih = (anih) ((anih) tgc.a.b()).a("vbb", "a", 236, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                        avch a3 = avch.a(auvm.a);
                        if (a3 == null) {
                            a3 = avch.TOKEN_MEDIUM_UNKNOWN;
                        }
                        anih.a("DebugPoke: Unknown medium requested: %s", (Object) a3);
                    } else if (auvm.c) {
                        jjg jjg = tgc.a;
                        boolean z = auvm.b;
                        if (aucf2.c) {
                            aucf2.c();
                            aucf2.c = false;
                        }
                        auyy auyy2 = (auyy) aucf2.b;
                        int i2 = auyy2.a | 32768;
                        auyy2.a = i2;
                        auyy2.q = z;
                        boolean z2 = auvm.b;
                        auyy2.a = i2 | 16384;
                        auyy2.p = z2;
                    }
                } else if (auvm.c) {
                    jjg jjg2 = tgc.a;
                    boolean z3 = auvm.b;
                    if (aucf2.c) {
                        aucf2.c();
                        aucf2.c = false;
                    }
                    auyy auyy3 = (auyy) aucf2.b;
                    int i3 = auyy3.a | 64;
                    auyy3.a = i3;
                    auyy3.h = z3;
                    boolean z4 = auvm.b;
                    auyy3.a = i3 | 32;
                    auyy3.g = z4;
                }
            } else if (auvm.c) {
                jjg jjg3 = tgc.a;
                boolean z5 = auvm.b;
                if (aucf2.c) {
                    aucf2.c();
                    aucf2.c = false;
                }
                auyy auyy4 = (auyy) aucf2.b;
                int i4 = auyy4.a | 16;
                auyy4.a = i4;
                auyy4.f = z5;
                boolean z6 = auvm.b;
                auyy4.a = i4 | 8;
                auyy4.e = z6;
            }
        } else if (auvm.c) {
            jjg jjg4 = tgc.a;
            boolean z7 = auvm.b;
            if (aucf2.c) {
                aucf2.c();
                aucf2.c = false;
            }
            auyy auyy5 = (auyy) aucf2.b;
            int i5 = auyy5.a | 4;
            auyy5.a = i5;
            auyy5.d = z7;
            boolean z8 = auvm.b;
            auyy5.a = i5 | 2;
            auyy5.c = z8;
        }
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        auyt auyt = (auyt) aucf.b;
        auyy auyy6 = (auyy) aucf2.i();
        auyt auyt2 = auyt.p;
        auyy6.getClass();
        auyt.d = auyy6;
        auyt.a |= 4;
        this.f.a((auyt) aucf.i());
    }

    public final void a(asnh asnh) {
        a((audx) asnh, this.l);
    }

    public final void a(asnj asnj) {
        a((audx) asnj, this.k);
    }

    public final void a(DebugPokeRequest debugPokeRequest, asnb asnb) {
        aucx aucx;
        DebugPokeResponse debugPokeResponse;
        auvd auvd;
        aucx aucx2;
        DebugPokeResponse debugPokeResponse2;
        DebugPokeResponse debugPokeResponse3;
        DebugPokeRequest debugPokeRequest2 = debugPokeRequest;
        DebugPokeResponse debugPokeResponse4 = new DebugPokeResponse(0);
        int i2 = 2;
        if (debugPokeRequest2.b != null) {
            auvg auvg = auvg.b;
            try {
                auvg = (auvg) aucj.a((aucj) auvg.b, debugPokeRequest2.b, aubs.c());
            } catch (auda e2) {
                anih anih = (anih) tgc.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("vbb", "a", 279, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: Unable to parse nano proto");
            }
            aucx aucx3 = auvg.a;
            int size = aucx3.size();
            int i3 = 0;
            while (i3 < size) {
                auve auve = (auve) aucx3.get(i3);
                jjg jjg = tgc.a;
                auvd a2 = auvd.a(auve.b);
                if (a2 == null) {
                    a2 = auvd.COMMAND_UNKNOWN;
                }
                avch avch = avch.TOKEN_MEDIUM_UNKNOWN;
                switch (a2.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                    case UrlRequest.Status.READING_RESPONSE /*14*/:
                    case Service.START_CONTINUATION_MASK:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        a2.name();
                        break;
                    default:
                        String valueOf = String.valueOf(a2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                        sb.append("COMMAND_UNKNOWN(");
                        sb.append(valueOf);
                        sb.append(")");
                        sb.toString();
                        break;
                }
                auvd a3 = auvd.a(auve.b);
                if (a3 == null) {
                    a3 = auvd.COMMAND_UNKNOWN;
                }
                if (a3 != auvd.CLEAR_OVERRIDES) {
                    auvd a4 = auvd.a(auve.b);
                    if (a4 == null) {
                        a4 = auvd.COMMAND_UNKNOWN;
                    }
                    int i4 = 5;
                    if (a4 == auvd.SAVE_CLIENT_OVERRIDES) {
                        auyt b2 = arwe.b();
                        aucd aucd = (aucd) b2.c(5);
                        aucd.a((aucj) b2);
                        aucf aucf = (aucf) aucd;
                        aucf.a((aucj) this.f.d);
                        this.i = (auyt) aucf.i();
                        aucx = aucx3;
                        debugPokeResponse = debugPokeResponse4;
                    } else {
                        auvd a5 = auvd.a(auve.b);
                        if (a5 == null) {
                            a5 = auvd.COMMAND_UNKNOWN;
                        }
                        if (a5 == auvd.RESTORE_CLIENT_OVERRIDES && this.i != null) {
                            this.f.a();
                            this.f.a(this.i);
                            this.i = null;
                            aucx = aucx3;
                            debugPokeResponse = debugPokeResponse4;
                        } else {
                            auvd a6 = auvd.a(auve.b);
                            if (a6 == null) {
                                a6 = auvd.COMMAND_UNKNOWN;
                            }
                            if (a6 != auvd.MEDIUM_OVERRIDE) {
                                aucx2 = aucx3;
                                debugPokeResponse2 = debugPokeResponse4;
                            } else if ((auve.a & i2) != 0) {
                                auvl auvl = auve.c;
                                if (auvl == null) {
                                    auvl = auvl.b;
                                }
                                if (auvl.a.size() == 0) {
                                    ((anih) ((anih) tgc.a.b()).a("vbb", "a", 304, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No Params provided for medium override Command.");
                                    aucx = aucx3;
                                    debugPokeResponse = debugPokeResponse4;
                                } else {
                                    auvl auvl2 = auve.c;
                                    if (auvl2 == null) {
                                        auvl2 = auvl.b;
                                    }
                                    aucx aucx4 = auvl2.a;
                                    int size2 = aucx4.size();
                                    int i5 = 0;
                                    while (i5 < size2) {
                                        auvm auvm = (auvm) aucx4.get(i5);
                                        auyt b3 = arwe.b();
                                        aucd aucd2 = (aucd) b3.c(i4);
                                        aucd2.a((aucj) b3);
                                        aucf aucf2 = (aucf) aucd2;
                                        auyy auyy = ((auyt) aucf2.b).d;
                                        if (auyy == null) {
                                            auyy = auyy.v;
                                        }
                                        aucd aucd3 = (aucd) auyy.c(i4);
                                        aucd3.a((aucj) auyy);
                                        aucf aucf3 = (aucf) aucd3;
                                        avch a7 = avch.a(auvm.a);
                                        if (a7 == null) {
                                            a7 = avch.TOKEN_MEDIUM_UNKNOWN;
                                        }
                                        int ordinal = a7.ordinal();
                                        aucx aucx5 = aucx3;
                                        if (ordinal != 1) {
                                            debugPokeResponse3 = debugPokeResponse4;
                                            if (ordinal != 2) {
                                                if (ordinal != 3) {
                                                    if (ordinal != 8) {
                                                        anih anih2 = (anih) ((anih) tgc.a.b()).a("vbb", "a", 236, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                                                        avch a8 = avch.a(auvm.a);
                                                        if (a8 == null) {
                                                            a8 = avch.TOKEN_MEDIUM_UNKNOWN;
                                                        }
                                                        anih2.a("DebugPoke: Unknown medium requested: %s", (Object) a8);
                                                    } else if (auvm.c) {
                                                        boolean z = auvm.b;
                                                        if (aucf3.c) {
                                                            aucf3.c();
                                                            aucf3.c = false;
                                                        }
                                                        auyy auyy2 = (auyy) aucf3.b;
                                                        int i6 = auyy2.a | 32768;
                                                        auyy2.a = i6;
                                                        auyy2.q = z;
                                                        boolean z2 = auvm.b;
                                                        auyy2.a = i6 | 16384;
                                                        auyy2.p = z2;
                                                    }
                                                } else if (auvm.c) {
                                                    boolean z3 = auvm.b;
                                                    if (aucf3.c) {
                                                        aucf3.c();
                                                        aucf3.c = false;
                                                    }
                                                    auyy auyy3 = (auyy) aucf3.b;
                                                    int i7 = auyy3.a | 64;
                                                    auyy3.a = i7;
                                                    auyy3.h = z3;
                                                    boolean z4 = auvm.b;
                                                    auyy3.a = i7 | 32;
                                                    auyy3.g = z4;
                                                }
                                            } else if (auvm.c) {
                                                boolean z5 = auvm.b;
                                                if (aucf3.c) {
                                                    aucf3.c();
                                                    aucf3.c = false;
                                                }
                                                auyy auyy4 = (auyy) aucf3.b;
                                                int i8 = auyy4.a | 16;
                                                auyy4.a = i8;
                                                auyy4.f = z5;
                                                boolean z6 = auvm.b;
                                                auyy4.a = i8 | 8;
                                                auyy4.e = z6;
                                            }
                                        } else {
                                            debugPokeResponse3 = debugPokeResponse4;
                                            if (auvm.c) {
                                                boolean z7 = auvm.b;
                                                if (aucf3.c) {
                                                    aucf3.c();
                                                    aucf3.c = false;
                                                }
                                                auyy auyy5 = (auyy) aucf3.b;
                                                int i9 = auyy5.a | 4;
                                                auyy5.a = i9;
                                                auyy5.d = z7;
                                                boolean z8 = auvm.b;
                                                auyy5.a = i9 | 2;
                                                auyy5.c = z8;
                                            }
                                        }
                                        if (aucf2.c) {
                                            aucf2.c();
                                            aucf2.c = false;
                                        }
                                        auyt auyt = (auyt) aucf2.b;
                                        auyy auyy6 = (auyy) aucf3.i();
                                        auyt auyt2 = auyt.p;
                                        auyy6.getClass();
                                        auyt.d = auyy6;
                                        auyt.a |= 4;
                                        this.f.a((auyt) aucf2.i());
                                        i5++;
                                        aucx3 = aucx5;
                                        debugPokeResponse4 = debugPokeResponse3;
                                        i4 = 5;
                                    }
                                    aucx = aucx3;
                                    debugPokeResponse = debugPokeResponse4;
                                }
                            } else {
                                aucx2 = aucx3;
                                debugPokeResponse2 = debugPokeResponse4;
                            }
                            auvd a9 = auvd.a(auve.b);
                            if (a9 == null) {
                                a9 = auvd.COMMAND_UNKNOWN;
                            }
                            if (a9 == auvd.STOP_BEACON && (auve.a & 8) != 0) {
                                auvt auvt = auve.e;
                                if (auvt == null) {
                                    auvt = auvt.b;
                                }
                                if (auvt.a.size() == 0) {
                                    ((anih) ((anih) tgc.a.b()).a("vbb", "a", 312, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No Params provided for StopBeacon command.");
                                } else {
                                    auvt auvt2 = auve.e;
                                    if (auvt2 == null) {
                                        auvt2 = auvt.b;
                                    }
                                    aucx aucx6 = auvt2.a;
                                    int size3 = aucx6.size();
                                    int i10 = 0;
                                    while (i10 < size3) {
                                        Iterator it = new aucu(((auvv) aucx6.get(i10)).a, auvv.b).iterator();
                                        while (true) {
                                            int i11 = i10 + 1;
                                            if (it.hasNext()) {
                                                this.c.a((avch) it.next());
                                            } else {
                                                i10 = i11;
                                            }
                                        }
                                    }
                                }
                            } else {
                                auvd a10 = auvd.a(auve.b);
                                if (a10 == null) {
                                    a10 = auvd.COMMAND_UNKNOWN;
                                }
                                if (a10 == auvd.START_BEACON && (auve.a & 4) != 0) {
                                    auvo auvo = auve.d;
                                    if (auvo == null) {
                                        auvo = auvo.b;
                                    }
                                    if (auvo.a.size() == 0) {
                                        ((anih) ((anih) tgc.a.b()).a("vbb", "a", 324, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No Params provided for StartBeacon command.");
                                    } else {
                                        auvo auvo2 = auve.d;
                                        if (auvo2 == null) {
                                            auvo2 = auvo.b;
                                        }
                                        aucx aucx7 = auvo2.a;
                                        int size4 = aucx7.size();
                                        int i12 = 0;
                                        while (i12 < size4) {
                                            auvq auvq = (auvq) aucx7.get(i12);
                                            avch[] avchArr = (avch[]) new aucu(auvq.a, auvq.b).toArray(new avch[0]);
                                            auvi auvi = auvq.c;
                                            if (auvi == null) {
                                                auvi = auvi.b;
                                            }
                                            String str = auvi.a;
                                            String str2 = auvq.d;
                                            auvi auvi2 = auvq.c;
                                            if (auvi2 == null) {
                                                auvi2 = auvi.b;
                                            }
                                            vgo vgo = new vgo(tgh.a(str), a(str2, auvi2.a.length()));
                                            int length = avchArr.length;
                                            int i13 = 0;
                                            while (true) {
                                                int i14 = i12 + 1;
                                                if (i13 < length) {
                                                    this.c.a(avchArr[i13], vgo);
                                                    i13++;
                                                } else {
                                                    i12 = i14;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    auvd a11 = auvd.a(auve.b);
                                    if (a11 == null) {
                                        a11 = auvd.COMMAND_UNKNOWN;
                                    }
                                    if (a11 == auvd.START_LISTEN && (auve.a & 16) != 0) {
                                        auvr auvr = auve.f;
                                        if (auvr == null) {
                                            auvr = auvr.b;
                                        }
                                        if (auvr.a.size() != 0) {
                                            if (debugPokeRequest2.c != null) {
                                                a(debugPokeRequest);
                                                auvr auvr2 = auve.f;
                                                if (auvr2 == null) {
                                                    auvr2 = auvr.b;
                                                }
                                                aucx aucx8 = auvr2.a;
                                                int size5 = aucx8.size();
                                                for (int i15 = 0; i15 < size5; i15++) {
                                                    auvs auvs = (auvs) aucx8.get(i15);
                                                    if ((auvs.a & 4) != 0) {
                                                        auzb a12 = a(auvs.c, auvs.d);
                                                        vbf vbf = this.h;
                                                        avch a13 = avch.a(auvs.b);
                                                        if (a13 == null) {
                                                            a13 = avch.TOKEN_MEDIUM_UNKNOWN;
                                                        }
                                                        vbf.a(a13, a12, (Set) null);
                                                    }
                                                }
                                            } else {
                                                ((anih) ((anih) tgc.a.b()).a("vbb", "a", 341, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: Listen command requested, but no listener provided.");
                                            }
                                        }
                                    } else {
                                        auvd a14 = auvd.a(auve.b);
                                        if (a14 == null) {
                                            a14 = auvd.COMMAND_UNKNOWN;
                                        }
                                        if (a14 == auvd.STOP_LISTEN && (auve.a & 32) != 0) {
                                            auvw auvw = auve.g;
                                            if (auvw == null) {
                                                auvw = auvw.b;
                                            }
                                            aucx aucx9 = auvw.a;
                                            int size6 = aucx9.size();
                                            for (int i16 = 0; i16 < size6; i16++) {
                                                vbf vbf2 = this.h;
                                                avch a15 = avch.a(((auvx) aucx9.get(i16)).a);
                                                if (a15 == null) {
                                                    a15 = avch.TOKEN_MEDIUM_UNKNOWN;
                                                }
                                                vbf2.a(a15);
                                            }
                                        } else {
                                            auvd a16 = auvd.a(auve.b);
                                            if (a16 == null) {
                                                a16 = auvd.COMMAND_UNKNOWN;
                                            }
                                            if (a16 != auvd.REGISTER_TOKEN_OBSERVER_CALLBACK) {
                                                auvd a17 = auvd.a(auve.b);
                                                if (a17 == null) {
                                                    a17 = auvd.COMMAND_UNKNOWN;
                                                }
                                                if (a17 != auvd.UNREGISTER_TOKEN_OBSERVER_CALLBACK) {
                                                    auvd a18 = auvd.a(auve.b);
                                                    if (a18 == null) {
                                                        a18 = auvd.COMMAND_UNKNOWN;
                                                    }
                                                    if (a18 != auvd.REGISTER_TOKEN_ADVERTISER_CALLBACK) {
                                                        auvd a19 = auvd.a(auve.b);
                                                        if (a19 == null) {
                                                            a19 = auvd.COMMAND_UNKNOWN;
                                                        }
                                                        if (a19 != auvd.UNREGISTER_TOKEN_ADVERTISER_CALLBACK) {
                                                            auvd a20 = auvd.a(auve.b);
                                                            if (a20 == null) {
                                                                a20 = auvd.COMMAND_UNKNOWN;
                                                            }
                                                            if (a20 != auvd.GET_CONFIGURATION) {
                                                                auvd a21 = auvd.a(auve.b);
                                                                if (a21 == null) {
                                                                    a21 = auvd.COMMAND_UNKNOWN;
                                                                }
                                                                if (a21 != auvd.UPDATE_CONFIGURATION) {
                                                                    auvd a22 = auvd.a(auve.b);
                                                                    if (a22 == null) {
                                                                        a22 = auvd.COMMAND_UNKNOWN;
                                                                    }
                                                                    if (a22 == auvd.SCHEDULE_PRESEEDED_TOKENS_ROTATION) {
                                                                        ved ved = this.e;
                                                                        ved.b.b();
                                                                        ved.a.clear();
                                                                    } else {
                                                                        auvd a23 = auvd.a(auve.b);
                                                                        if (a23 == null) {
                                                                            a23 = auvd.COMMAND_UNKNOWN;
                                                                        }
                                                                        if (a23 == auvd.CLEAR_CACHE) {
                                                                            vgw vgw = (vgw) thl.a(this.g, vgw.class);
                                                                            vgw.c.b();
                                                                            vgw.a.size();
                                                                            vgw.a.clear();
                                                                        } else {
                                                                            auvd a24 = auvd.a(auve.b);
                                                                            if (a24 == null) {
                                                                                a24 = auvd.COMMAND_UNKNOWN;
                                                                            }
                                                                            if (a24 == auvd.CLEAR_DIRECTIVES) {
                                                                                vbf vbf3 = this.h;
                                                                                vbf3.a(Collections.emptySet());
                                                                                vbf3.a(Collections.emptySet(), (Set) null);
                                                                                uyz uyz = vbf3.f;
                                                                                Context context = vbf3.a;
                                                                                uyz.e.b();
                                                                                uyz.a(context, (String) null, 5);
                                                                            } else {
                                                                                auvd a25 = auvd.a(auve.b);
                                                                                if (a25 == null) {
                                                                                    a25 = auvd.COMMAND_UNKNOWN;
                                                                                }
                                                                                if (a25 != auvd.REGISTER_NETWORK_CALLBACK) {
                                                                                    auvd a26 = auvd.a(auve.b);
                                                                                    if (a26 == null) {
                                                                                        a26 = auvd.COMMAND_UNKNOWN;
                                                                                    }
                                                                                    if (a26 != auvd.UNREGISTER_NETWORK_CALLBACK) {
                                                                                        auvd a27 = auvd.a(auve.b);
                                                                                        if (a27 == null) {
                                                                                            a27 = auvd.COMMAND_UNKNOWN;
                                                                                        }
                                                                                        if (a27 != auvd.REGISTER_CONFIGURATION_CALLBACK) {
                                                                                            auvd a28 = auvd.a(auve.b);
                                                                                            if (a28 == null) {
                                                                                                a28 = auvd.COMMAND_UNKNOWN;
                                                                                            }
                                                                                            if (a28 != auvd.UNREGISTER_CONFIGURATION_CALLBACK) {
                                                                                                auvd a29 = auvd.a(auve.b);
                                                                                                if (a29 == null) {
                                                                                                    a29 = auvd.COMMAND_UNKNOWN;
                                                                                                }
                                                                                                if (a29 != auvd.REGISTER_GCM_CALLBACK) {
                                                                                                    auvd a30 = auvd.a(auve.b);
                                                                                                    if (a30 == null) {
                                                                                                        a30 = auvd.COMMAND_UNKNOWN;
                                                                                                    }
                                                                                                    if (a30 != auvd.UNREGISTER_GCM_CALLBACK) {
                                                                                                        debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                                        anih anih3 = (anih) ((anih) tgc.a.b()).a("vbb", "a", 429, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                                                                                                        if ((auve.a & 1) != 0) {
                                                                                                            auvd = auvd.a(auve.b);
                                                                                                            if (auvd == null) {
                                                                                                                auvd = auvd.COMMAND_UNKNOWN;
                                                                                                            }
                                                                                                        } else {
                                                                                                            auvd = null;
                                                                                                        }
                                                                                                        anih3.a("DebugPoke: UNKNOWN Command %s", (Object) auvd);
                                                                                                    } else {
                                                                                                        asnf asnf = debugPokeRequest2.f;
                                                                                                        if (asnf == null) {
                                                                                                            ((anih) ((anih) tgc.a.b()).a("vbb", "a", 420, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No callback provided for UNREGISTER_GCM_CALLBACK");
                                                                                                            debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                                        } else {
                                                                                                            RemoteCallbackList remoteCallbackList = this.l;
                                                                                                            if (remoteCallbackList != null) {
                                                                                                                remoteCallbackList.unregister(asnf);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else if (debugPokeRequest2.f == null) {
                                                                                                    ((anih) ((anih) tgc.a.b()).a("vbb", "a", 410, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No callback provided for REGISTER_GCM_CALLBACK");
                                                                                                    debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                                } else {
                                                                                                    if (this.l == null) {
                                                                                                        this.l = new RemoteCallbackList();
                                                                                                    }
                                                                                                    this.l.register(debugPokeRequest2.f);
                                                                                                }
                                                                                            } else {
                                                                                                asnf asnf2 = debugPokeRequest2.e;
                                                                                                if (asnf2 == null) {
                                                                                                    ((anih) ((anih) tgc.a.b()).a("vbb", "a", 400, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No callback provided for UNREGISTER_CONFIGURATION_CALLBACK");
                                                                                                    debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                                } else {
                                                                                                    RemoteCallbackList remoteCallbackList2 = this.m;
                                                                                                    if (remoteCallbackList2 != null) {
                                                                                                        remoteCallbackList2.unregister(asnf2);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else if (debugPokeRequest2.e == null) {
                                                                                            ((anih) ((anih) tgc.a.b()).a("vbb", "a", 388, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No callback provided for REGISTER_CONFIGURATION_CALLBACK");
                                                                                            debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                        } else {
                                                                                            if (this.m == null) {
                                                                                                this.m = new RemoteCallbackList();
                                                                                            }
                                                                                            this.m.register(debugPokeRequest2.e);
                                                                                            d();
                                                                                        }
                                                                                    } else {
                                                                                        asnf asnf3 = debugPokeRequest2.d;
                                                                                        if (asnf3 == null) {
                                                                                            ((anih) ((anih) tgc.a.b()).a("vbb", "a", 379, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No callback provided for UNREGISTER_NETWORK_CALLBACK");
                                                                                            debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                        } else {
                                                                                            RemoteCallbackList remoteCallbackList3 = this.k;
                                                                                            if (remoteCallbackList3 != null) {
                                                                                                remoteCallbackList3.unregister(asnf3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else if (debugPokeRequest2.d == null) {
                                                                                    ((anih) ((anih) tgc.a.b()).a("vbb", "a", 369, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No callback provided for REGISTER_NETWORK_CALLBACK");
                                                                                    debugPokeResponse4 = new DebugPokeResponse(13);
                                                                                } else {
                                                                                    if (this.k == null) {
                                                                                        this.k = new RemoteCallbackList();
                                                                                    }
                                                                                    this.k.register(debugPokeRequest2.d);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    auvy auvy = auve.h;
                                                                    if (auvy == null) {
                                                                        auvy = auvy.d;
                                                                    }
                                                                    if (auvy == null) {
                                                                        ((anih) ((anih) tgc.a.b()).a("vbb", "a", 517, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: No updateConfiguration for UPDATE_CONFIGURATION");
                                                                        debugPokeResponse4 = new DebugPokeResponse(13);
                                                                    } else {
                                                                        auvk auvk = auvy.c;
                                                                        if (auvk == null) {
                                                                            auvk = auvk.e;
                                                                        }
                                                                        if ((auvk.a & 1) != 0) {
                                                                            agvx agvx = ayne.V;
                                                                            auvk auvk2 = auvy.c;
                                                                            if (auvk2 == null) {
                                                                                auvk2 = auvk.e;
                                                                            }
                                                                            agvx.b((Object) auvk2.b);
                                                                        }
                                                                        auvk auvk3 = auvy.c;
                                                                        if (auvk3 == null) {
                                                                            auvk3 = auvk.e;
                                                                        }
                                                                        if ((auvk3.a & 2) != 0) {
                                                                            agvx agvx2 = ayne.T;
                                                                            auvk auvk4 = auvy.c;
                                                                            if (auvk4 == null) {
                                                                                auvk4 = auvk.e;
                                                                            }
                                                                            agvx2.b((Object) auvk4.c);
                                                                        }
                                                                        auvk auvk5 = auvy.c;
                                                                        if (auvk5 == null) {
                                                                            auvk5 = auvk.e;
                                                                        }
                                                                        if ((auvk5.a & 4) != 0) {
                                                                            agvx agvx3 = ayne.d;
                                                                            auvk auvk6 = auvy.c;
                                                                            if (auvk6 == null) {
                                                                                auvk6 = auvk.e;
                                                                            }
                                                                            agvx3.b((Object) auvk6.d);
                                                                        }
                                                                        if ((auvy.a & 1) != 0) {
                                                                            vav vav = this.f;
                                                                            auyt auyt3 = auvy.b;
                                                                            if (auyt3 == null) {
                                                                                auyt3 = auyt.p;
                                                                            }
                                                                            vav.a(auyt3);
                                                                        }
                                                                        debugPokeResponse4 = f();
                                                                    }
                                                                }
                                                            } else {
                                                                debugPokeResponse4 = f();
                                                            }
                                                        } else {
                                                            asne asne = debugPokeRequest2.c;
                                                            if (asne == null) {
                                                                ((anih) ((anih) tgc.a.b()).a("vbb", "d", 503, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: UNREGISTER_TOKEN_ADVERTISER_CALLBACK with no tokenCallback");
                                                                debugPokeResponse4 = new DebugPokeResponse(13);
                                                            } else {
                                                                RemoteCallbackList remoteCallbackList4 = this.b;
                                                                if (remoteCallbackList4 != null) {
                                                                    remoteCallbackList4.unregister(asne);
                                                                }
                                                                debugPokeResponse4 = new DebugPokeResponse(0);
                                                            }
                                                        }
                                                    } else if (debugPokeRequest2.c == null) {
                                                        ((anih) ((anih) tgc.a.b()).a("vbb", "c", 481, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: REGISTER_TOKEN_ADVERTISER_CALLBACK with no tokenCallback");
                                                        debugPokeResponse4 = new DebugPokeResponse(13);
                                                    } else {
                                                        if (this.b == null) {
                                                            this.b = new RemoteCallbackList();
                                                        }
                                                        this.b.register(debugPokeRequest2.c);
                                                        if (this.n == null) {
                                                            vay vay = new vay(this);
                                                            this.n = vay;
                                                            this.c.a = vay;
                                                        }
                                                        debugPokeResponse4 = new DebugPokeResponse(0);
                                                    }
                                                } else {
                                                    asne asne2 = debugPokeRequest2.c;
                                                    if (asne2 == null) {
                                                        ((anih) ((anih) tgc.a.b()).a("vbb", "b", 467, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: UNREGISTER_TOKEN_OBSERVER_CALLBACK with no tokenCallback");
                                                        debugPokeResponse4 = new DebugPokeResponse(13);
                                                    } else {
                                                        RemoteCallbackList remoteCallbackList5 = this.a;
                                                        if (remoteCallbackList5 != null) {
                                                            remoteCallbackList5.unregister(asne2);
                                                        }
                                                        debugPokeResponse4 = new DebugPokeResponse(0);
                                                    }
                                                }
                                            } else {
                                                debugPokeResponse4 = a(debugPokeRequest);
                                            }
                                            i3++;
                                            aucx3 = aucx;
                                            i2 = 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    aucx = aucx3;
                    debugPokeResponse = debugPokeResponse4;
                    this.f.a();
                }
                debugPokeResponse4 = debugPokeResponse;
                i3++;
                aucx3 = aucx;
                i2 = 2;
            }
            DebugPokeResponse debugPokeResponse5 = debugPokeResponse4;
        }
        try {
            Parcel aQ = asnb.aQ();
            bhx.a(aQ, (Parcelable) debugPokeResponse4);
            asnb.c(2, aQ);
        } catch (RemoteException e3) {
            anih anih4 = (anih) tgc.a.b();
            anih4.a((Throwable) e3);
            ((anih) anih4.a("vbb", "a", 438, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("DebugPoke: Unable to propagate CopresenceDebugPokeResponse back to client app");
        }
    }

    public final boolean a() {
        return this.i != null || b() || e() || c() || a(this.a) > 0 || a(this.b) > 0;
    }
}
