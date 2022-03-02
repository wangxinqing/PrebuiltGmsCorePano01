package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.MessageType;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.List;

/* renamed from: uyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uyc extends arwa {
    public uyc(Context context) {
        super(context);
    }

    public final auxm a(Message message) {
        aucd o = auxm.d.o();
        aucd o2 = auxo.d.o();
        String str = message.d;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auxo auxo = (auxo) o2.b;
        str.getClass();
        int i = auxo.a | 1;
        auxo.a = i;
        auxo.b = str;
        String str2 = message.c;
        str2.getClass();
        auxo.a = i | 2;
        auxo.c = str2;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auxm auxm = (auxm) o.b;
        auxo auxo2 = (auxo) o2.i();
        auxo2.getClass();
        auxm.b = auxo2;
        auxm.a |= 1;
        if (message.c().d != null) {
            long longValue = b(message.c().d).longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            auxm auxm2 = (auxm) o.b;
            auxm2.a |= 2;
            auxm2.c = longValue;
        }
        return (auxm) o.i();
    }

    public final void a(int i, uya uya) {
        String str;
        String str2;
        aucd o = auwz.n.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwz auwz = (auwz) o.b;
        auwz.b = 10;
        auwz.a |= 1;
        aucd o2 = auwm.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auwm auwm = (auwm) o2.b;
        auwm.b = 1;
        int i2 = auwm.a | 1;
        auwm.a = i2;
        auwm.a = i2 | 2;
        auwm.c = i;
        aucd o3 = auwg.i.o();
        byte a = uya.a().a() == 3 ? ((uya.a().a(0) & 255) << 16) | ((uya.a().a(1) & 255) << 8) | (uya.a().a(2) & 255) : 0;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auwg auwg = (auwg) o3.b;
        auwg.a |= 1;
        auwg.b = a;
        int b = uya.b();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auwg auwg2 = (auwg) o3.b;
        auwg2.a |= 2;
        auwg2.c = b;
        int c = uya.c();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auwg auwg3 = (auwg) o3.b;
        auwg3.a |= 4;
        auwg3.d = c;
        double d = uya.d();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auwg auwg4 = (auwg) o3.b;
        auwg4.a |= 8;
        auwg4.e = d;
        long longValue = b(uya.e()).longValue();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auwg auwg5 = (auwg) o3.b;
        auwg5.a |= 16;
        auwg5.f = longValue;
        int f = uya.f();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        auwg auwg6 = (auwg) o3.b;
        int i3 = f - 1;
        if (f != 0) {
            auwg6.g = i3;
            auwg6.a |= 32;
            int a2 = tgl.a();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            auwg auwg7 = (auwg) o3.b;
            auwg7.h = a2 - 1;
            auwg7.a |= 64;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auwm auwm2 = (auwm) o2.b;
            auwg auwg8 = (auwg) o3.i();
            auwg8.getClass();
            auwm2.d = auwg8;
            auwm2.a |= 4;
            if (o.c) {
                o.c();
                o.c = false;
            }
            auwz auwz2 = (auwz) o.b;
            auwm auwm3 = (auwm) o2.i();
            auwm3.getClass();
            auwz2.m = auwm3;
            auwz2.a |= 2048;
            if (aynf.b()) {
                anih anih = (anih) ((anih) tgc.a.d()).a("uyc", "a", 277, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
                auwm auwm4 = ((auwz) o.b).m;
                if (auwm4 == null) {
                    auwm4 = auwm.e;
                }
                int a3 = avbu.a(auwm4.b);
                if (a3 == 0) {
                    a3 = 1;
                }
                String str3 = a3 != 1 ? "CACHE_TYPE_FAST_PAIR" : "CACHE_TYPE_UNKNOWN";
                auwm auwm5 = ((auwz) o.b).m;
                if (auwm5 == null) {
                    auwm5 = auwm.e;
                }
                auwg auwg9 = auwm5.d;
                if (auwg9 == null) {
                    auwg9 = auwg.i;
                }
                Integer valueOf = Integer.valueOf(auwg9.b);
                auwm auwm6 = ((auwz) o.b).m;
                if (auwm6 == null) {
                    auwm6 = auwm.e;
                }
                auwg auwg10 = auwm6.d;
                if (auwg10 == null) {
                    auwg10 = auwg.i;
                }
                Double valueOf2 = Double.valueOf(auwg10.e);
                String e = uya.e();
                auwm auwm7 = ((auwz) o.b).m;
                if (auwm7 == null) {
                    auwm7 = auwm.e;
                }
                auwg auwg11 = auwm7.d;
                if (auwg11 == null) {
                    auwg11 = auwg.i;
                }
                Long valueOf3 = Long.valueOf(auwg11.f);
                auwm auwm8 = ((auwz) o.b).m;
                if (auwm8 == null) {
                    auwm8 = auwm.e;
                }
                auwg auwg12 = auwm8.d;
                if (auwg12 == null) {
                    auwg12 = auwg.i;
                }
                int b2 = avay.b(auwg12.g);
                if (b2 == 0) {
                    b2 = 1;
                }
                String a4 = avay.a(b2);
                auwm auwm9 = ((auwz) o.b).m;
                if (auwm9 == null) {
                    auwm9 = auwm.e;
                }
                auwg auwg13 = auwm9.d;
                if (auwg13 == null) {
                    auwg13 = auwg.i;
                }
                int a5 = aspa.a(auwg13.h);
                if (a5 == 0) {
                    a5 = 1;
                }
                if (a5 == 1) {
                    str2 = "UNKNOWN_USER_TYPE";
                } else if (a5 == 2) {
                    str2 = "PRODUCTION";
                } else if (a5 == 3) {
                    str2 = "MODULEFOOD";
                } else if (a5 == 4) {
                    str2 = "TEST";
                } else if (a5 != 5) {
                    str = "AUTO_TEST";
                    anih.a("NearbyMessagesLogger UPDATE %s, model %s, distance .%2fm, address %s (salted %s), scan mode %s, user type %s", str3, valueOf, valueOf2, e, valueOf3, a4, str);
                } else {
                    str2 = "PRESTO_DOGFOOD";
                }
                str = str2;
                anih.a("NearbyMessagesLogger UPDATE %s, model %s, distance .%2fm, address %s (salted %s), scan mode %s, user type %s", str3, valueOf, valueOf2, e, valueOf3, a4, str);
            }
            a((String) null, (String) null, (auwz) o.i());
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void a(uyb uyb) {
        aucd o = auwz.n.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwz auwz = (auwz) o.b;
        auwz.b = 4;
        auwz.a |= 1;
        auwv auwv = auwv.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwz auwz2 = (auwz) o.b;
        auwv.getClass();
        auwz2.j = auwv;
        auwz2.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        a(uyb, (auwz) o.i());
    }

    public final void a(uyb uyb, auwz auwz) {
        int a;
        Long l;
        if (aynf.b() && (a = avbs.a(auwz.b)) != 0 && a == 6) {
            anih anih = (anih) ((anih) tgc.a.d()).a("uyc", "a", 297, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
            Integer valueOf = Integer.valueOf(auwz.c);
            auwq auwq = auwz.l;
            if (auwq == null) {
                auwq = auwq.d;
            }
            aucx aucx = auwq.c;
            auwq auwq2 = auwz.l;
            if (auwq2 == null) {
                auwq2 = auwq.d;
            }
            auxm auxm = auwq2.b;
            if (auxm == null) {
                auxm = auxm.d;
            }
            if ((auxm.a & 2) != 0) {
                auwq auwq3 = auwz.l;
                if (auwq3 == null) {
                    auwq3 = auwq.d;
                }
                auxm auxm2 = auwq3.b;
                if (auxm2 == null) {
                    auxm2 = auxm.d;
                }
                l = Long.valueOf(auxm2.c);
            } else {
                l = null;
            }
            anih.a("NearbyMessagesLogger RECEIVED, delay=%sms, subscription IDs=%s, salted address=%s", (Object) valueOf, (Object) aucx, (Object) l);
        }
        ClientAppContext clientAppContext = uyb.a.c;
        a(clientAppContext.b, clientAppContext.c, auwz);
    }

    public final void a(uyb uyb, MessageFilter messageFilter, Strategy strategy, boolean z) {
        aucd o = auwz.n.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwz auwz = (auwz) o.b;
        auwz.b = 3;
        auwz.a |= 1;
        aucd o2 = auwr.e.o();
        List list = messageFilter.c;
        for (int i = 0; i < list.size(); i++) {
            MessageType messageType = (MessageType) list.get(i);
            aucd o3 = auxo.d.o();
            String str = messageType.b;
            if (str != null) {
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                auxo auxo = (auxo) o3.b;
                str.getClass();
                auxo.a |= 1;
                auxo.b = str;
            }
            String str2 = messageType.c;
            if (str2 != null) {
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                auxo auxo2 = (auxo) o3.b;
                str2.getClass();
                auxo2.a |= 2;
                auxo2.c = str2;
            }
            auxo auxo3 = (auxo) o3.i();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            auwr auwr = (auwr) o2.b;
            auxo3.getClass();
            if (!auwr.b.a()) {
                auwr.b = aucj.a(auwr.b);
            }
            auwr.b.add(auxo3);
        }
        aucd o4 = auxd.f.o();
        int i2 = strategy.e;
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        auxd auxd = (auxd) o4.b;
        int i3 = auxd.a | 1;
        auxd.a = i3;
        auxd.b = i2;
        int i4 = strategy.f;
        int i5 = i3 | 2;
        auxd.a = i5;
        auxd.c = i4;
        int i6 = strategy.h;
        int i7 = i5 | 4;
        auxd.a = i7;
        auxd.d = i6;
        int i8 = strategy.i;
        auxd.a = i7 | 8;
        auxd.e = i8;
        auxd auxd2 = (auxd) o4.i();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auwr auwr2 = (auwr) o2.b;
        auxd2.getClass();
        auwr2.c = auxd2;
        int i9 = auwr2.a | 1;
        auwr2.a = i9;
        auwr2.a = i9 | 2;
        auwr2.d = z;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auwz auwz2 = (auwz) o.b;
        auwr auwr3 = (auwr) o2.i();
        auwr3.getClass();
        auwz2.h = auwr3;
        auwz2.a |= 64;
        a(uyb, (auwz) o.i());
    }
}
