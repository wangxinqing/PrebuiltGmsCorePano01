package defpackage;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

/* renamed from: vem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vem {
    private static auzc a(uyg uyg) {
        if (uyg == null) {
            return null;
        }
        aucf aucf = (aucf) auzc.e.o();
        aucf aucf2 = (aucf) auzd.c.o();
        if (aucf2.c) {
            aucf2.c();
            aucf2.c = false;
        }
        auzd auzd = (auzd) aucf2.b;
        auzd.b = 1;
        auzd.a |= 1;
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        auzc auzc = (auzc) aucf.b;
        auzd auzd2 = (auzd) aucf2.i();
        auzd2.getClass();
        auzc.c = auzd2;
        auzc.a |= 2;
        int i = uyg.c.e;
        if (i == Integer.MAX_VALUE || i > 86400) {
            ((anih) ((anih) tgc.a.b()).a("vem", "a", 57, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("ProtoConverter: Publish with unexpectedly long TTL(%d seconds). Using default TTL(%d seconds).", i, 300);
            i = 300;
        }
        long b = vds.b(i);
        if (aucf.c) {
            aucf.c();
            aucf.c = false;
        }
        auzc auzc2 = (auzc) aucf.b;
        auzc2.a = 1 | auzc2.a;
        auzc2.b = b;
        auzl a = a(uyg.c.f);
        if (a != null) {
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            auzc auzc3 = (auzc) aucf.b;
            a.getClass();
            auzc3.d = a;
            auzc3.a |= 8;
        }
        return (auzc) aucf.i();
    }

    public static auzl a(int i) {
        if (i != 1) {
            return null;
        }
        aucd o = auzl.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auzl auzl = (auzl) o.b;
        auzl.b = 1;
        auzl.a = 1 | auzl.a;
        return (auzl) o.i();
    }

    public static auzr a(Message message) {
        if (message == null) {
            return null;
        }
        aucd o = auzr.e.o();
        auzu a = a(message.d, message.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auzr auzr = (auzr) o.b;
        a.getClass();
        auzr.b = a;
        auzr.a |= 1;
        auay a2 = auay.a(message.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auzr auzr2 = (auzr) o.b;
        a2.getClass();
        auzr2.a |= 2;
        auzr2.c = a2;
        return (auzr) o.i();
    }

    public static auzu a(String str, String str2) {
        if (str == null && str2 == null) {
            return null;
        }
        aucd o = auzu.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auzu auzu = (auzu) o.b;
        str.getClass();
        int i = auzu.a | 1;
        auzu.a = i;
        auzu.b = str;
        str2.getClass();
        auzu.a = i | 2;
        auzu.c = str2;
        return (auzu) o.i();
    }

    public static avaj a(Strategy strategy) {
        if (strategy == null) {
            return null;
        }
        aucd o = avaj.e.o();
        int i = strategy.i;
        if (i == 1) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avaj avaj = (avaj) o.b;
            avaj.c = 2;
            avaj.a |= 2;
        } else if (i == 2) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avaj avaj2 = (avaj) o.b;
            avaj2.c = 3;
            avaj2.a |= 2;
        } else if (i != 3) {
            ((anih) ((anih) tgc.a.b()).a("vem", "a", 91, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert illegal DiscoveryMode=%d", strategy.i);
            if (o.c) {
                o.c();
                o.c = false;
            }
            avaj avaj3 = (avaj) o.b;
            avaj3.c = 1;
            avaj3.a |= 2;
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            avaj avaj4 = (avaj) o.b;
            avaj4.c = 1;
            avaj4.a |= 2;
        }
        int i2 = strategy.h;
        if (i2 == -1) {
            avaj avaj5 = (avaj) o.b;
            avaj5.d = 1;
            avaj5.a |= 8;
        } else if (i2 == 2) {
            avaj avaj6 = (avaj) o.b;
            avaj6.d = 2;
            avaj6.a |= 8;
        } else if (i2 != 4) {
            ((anih) ((anih) tgc.a.b()).a("vem", "a", 114, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to convert illegal DiscoveryMedium=%d", strategy.h);
            if (o.c) {
                o.c();
                o.c = false;
            }
            avaj avaj7 = (avaj) o.b;
            avaj7.d = 1;
            avaj7.a |= 8;
        } else {
            avaj avaj8 = (avaj) o.b;
            avaj8.d = 4;
            avaj8.a |= 8;
        }
        return (avaj) o.i();
    }

    public static Message a(auzr auzr) {
        return a(auzr, (NearbyDevice[]) null);
    }

    public static Message a(auzr auzr, NearbyDevice[] nearbyDeviceArr) {
        long j;
        byte[] k = auzr.c.k();
        auzu auzu = auzr.b;
        if (auzu == null) {
            auzu = auzu.d;
        }
        String str = auzu.b;
        auzu auzu2 = auzr.b;
        if (auzu2 == null) {
            auzu2 = auzu.d;
        }
        String str2 = auzu2.c;
        if ((auzr.a & 4) != 0) {
            j = auzr.d;
        } else {
            j = 0;
        }
        return new Message(k, str, str2, nearbyDeviceArr, j);
    }
}
