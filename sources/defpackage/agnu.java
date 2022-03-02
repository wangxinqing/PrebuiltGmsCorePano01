package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: agnu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agnu implements agno {
    static final agnt a = new agnq();
    static final agnt b = new agnr();
    static final agnt c = new agns();
    private volatile hol d;
    private final Context e;
    private final ixy f;
    private final int g;
    private final amsv h;

    public agnu() {
    }

    static void a(agnt agnt, audw audw) {
        if (TextUtils.isEmpty(agnt.b(audw))) {
            agnt.a(audw, ageb.a(agnt.a(audw)));
        } else {
            agnt.a(audw, (Long) null);
        }
        agnt.c(audw);
    }

    public agnu(Context context, ixy ixy, int i, amsv amsv) {
        this.e = context;
        this.f = ixy;
        this.g = i;
        this.h = amsv;
    }

    private static String[] a(String str) {
        return str.replaceFirst("^/+", "").split("/+");
    }

    public final void a(basu basu) {
        avsd avsd;
        int i = agfu.b;
        aucd aucd = (aucd) basu.c(5);
        aucd.a((aucj) basu);
        a(a, aucd);
        basu basu2 = (basu) aucd.b;
        if ((basu2.a & 512) != 0) {
            baqn baqn = basu2.j;
            if (baqn == null) {
                baqn = baqn.c;
            }
            if ((baqn.a & 1) != 0) {
                baqn baqn2 = ((basu) aucd.b).j;
                if (baqn2 == null) {
                    baqn2 = baqn.c;
                }
                baqm baqm = baqn2.b;
                if (baqm == null) {
                    baqm = baqm.k;
                }
                aucd aucd2 = (aucd) baqm.c(5);
                aucd2.a((aucj) baqm);
                a(b, aucd2);
                baqn baqn3 = ((basu) aucd.b).j;
                if (baqn3 == null) {
                    baqn3 = baqn.c;
                }
                aucd aucd3 = (aucd) baqn3.c(5);
                aucd3.a((aucj) baqn3);
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                baqn baqn4 = (baqn) aucd3.b;
                baqm baqm2 = (baqm) aucd2.i();
                baqm2.getClass();
                baqn4.b = baqm2;
                baqn4.a |= 1;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                basu basu3 = (basu) aucd.b;
                baqn baqn5 = (baqn) aucd3.i();
                basu basu4 = basu.s;
                baqn5.getClass();
                basu3.j = baqn5;
                basu3.a |= 512;
            }
        }
        basu basu5 = (basu) aucd.b;
        if ((basu5.a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            baso baso = basu5.i;
            if (baso == null) {
                baso = baso.k;
            }
            if (baso.j.size() != 0) {
                baso baso2 = ((basu) aucd.b).i;
                if (baso2 == null) {
                    baso2 = baso.k;
                }
                aucd aucd4 = (aucd) baso2.c(5);
                aucd4.a((aucj) baso2);
                basm basm = (basm) aucd4;
                for (int i2 = 0; i2 < ((baso) basm.b).j.size(); i2++) {
                    basn basn = (basn) ((baso) basm.b).j.get(i2);
                    aucd aucd5 = (aucd) basn.c(5);
                    aucd5.a((aucj) basn);
                    if (!TextUtils.isEmpty(((basn) aucd5.b).b)) {
                        if (aucd5.c) {
                            aucd5.c();
                            aucd5.c = false;
                        }
                        basn basn2 = basn.e;
                        ((basn) aucd5.b).c = aucj.r();
                        for (String a2 : a(((basn) aucd5.b).b)) {
                            long longValue = ageb.a(a2).longValue();
                            if (aucd5.c) {
                                aucd5.c();
                                aucd5.c = false;
                            }
                            basn basn3 = (basn) aucd5.b;
                            if (!basn3.c.a()) {
                                basn3.c = aucj.a(basn3.c);
                            }
                            basn3.c.a(longValue);
                        }
                    }
                    if (aucd5.c) {
                        aucd5.c();
                        aucd5.c = false;
                    }
                    basn basn4 = (basn) aucd5.b;
                    basn basn5 = basn.e;
                    basn4.a &= -2;
                    basn4.b = basn.e.b;
                    if (basm.c) {
                        basm.c();
                        basm.c = false;
                    }
                    baso baso3 = (baso) basm.b;
                    basn basn6 = (basn) aucd5.i();
                    basn6.getClass();
                    baso3.c();
                    baso3.j.set(i2, basn6);
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                basu basu6 = (basu) aucd.b;
                baso baso4 = (baso) basm.i();
                basu basu7 = basu.s;
                baso4.getClass();
                basu6.i = baso4;
                basu6.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }
        basu basu8 = (basu) aucd.b;
        if ((basu8.a & 32) != 0) {
            baro baro = basu8.g;
            if (baro == null) {
                baro = baro.b;
            }
            if (baro.a.size() != 0) {
                baro baro2 = ((basu) aucd.b).g;
                if (baro2 == null) {
                    baro2 = baro.b;
                }
                aucd aucd6 = (aucd) baro2.c(5);
                aucd6.a((aucj) baro2);
                for (int i3 = 0; i3 < ((baro) aucd6.b).a.size(); i3++) {
                    barn barn = (barn) ((baro) aucd6.b).a.get(i3);
                    aucd aucd7 = (aucd) barn.c(5);
                    aucd7.a((aucj) barn);
                    if (!TextUtils.isEmpty(((barn) aucd7.b).s)) {
                        if (aucd7.c) {
                            aucd7.c();
                            aucd7.c = false;
                        }
                        barn barn2 = barn.w;
                        ((barn) aucd7.b).t = aucj.r();
                        String[] a3 = a(((barn) aucd7.b).s);
                        int length = a3.length;
                        long[] jArr = new long[length];
                        for (int i4 = 0; i4 < length; i4++) {
                            jArr[i4] = ageb.a(a3[i4]).longValue();
                        }
                        for (int i5 = 0; i5 < length; i5++) {
                            long j = jArr[i5];
                            if (aucd7.c) {
                                aucd7.c();
                                aucd7.c = false;
                            }
                            barn barn3 = (barn) aucd7.b;
                            if (!barn3.t.a()) {
                                barn3.t = aucj.a(barn3.t);
                            }
                            barn3.t.a(j);
                        }
                    }
                    if (aucd7.c) {
                        aucd7.c();
                        aucd7.c = false;
                    }
                    barn barn4 = (barn) aucd7.b;
                    barn barn5 = barn.w;
                    barn4.a &= -262145;
                    barn4.s = barn.w.s;
                    if (aucd6.c) {
                        aucd6.c();
                        aucd6.c = false;
                    }
                    baro baro3 = (baro) aucd6.b;
                    barn barn6 = (barn) aucd7.i();
                    barn6.getClass();
                    baro3.c();
                    baro3.a.set(i3, barn6);
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                basu basu9 = (basu) aucd.b;
                baro baro4 = (baro) aucd6.i();
                basu basu10 = basu.s;
                baro4.getClass();
                basu9.g = baro4;
                basu9.a |= 32;
            }
        }
        basu basu11 = (basu) aucd.b;
        if ((basu11.a & 32768) != 0) {
            barw barw = basu11.m;
            if (barw == null) {
                barw = barw.h;
            }
            if (barw.d.size() != 0) {
                barw barw2 = ((basu) aucd.b).m;
                if (barw2 == null) {
                    barw2 = barw.h;
                }
                aucd aucd8 = (aucd) barw2.c(5);
                aucd8.a((aucj) barw2);
                for (int i6 = 0; i6 < ((barw) aucd8.b).d.size(); i6++) {
                    barz barz = (barz) ((barw) aucd8.b).d.get(i6);
                    aucd aucd9 = (aucd) barz.c(5);
                    aucd9.a((aucj) barz);
                    a(c, aucd9);
                    if (aucd8.c) {
                        aucd8.c();
                        aucd8.c = false;
                    }
                    barw barw3 = (barw) aucd8.b;
                    barz barz2 = (barz) aucd9.i();
                    barz2.getClass();
                    barw3.c();
                    barw3.d.set(i6, barz2);
                }
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                basu basu12 = (basu) aucd.b;
                barw barw4 = (barw) aucd8.i();
                basu basu13 = basu.s;
                barw4.getClass();
                basu12.m = barw4;
                basu12.a |= 32768;
            }
        }
        basu basu14 = (basu) aucd.i();
        byte[] k = basu14.k();
        if (axav.b()) {
            int i7 = basu14.a;
            if ((i7 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 && (i7 & FragmentTransaction.TRANSIT_ENTER_MASK) == 0 && (i7 & 262144) == 0) {
                int length2 = k.length;
                if (length2 > this.g) {
                    Log.w("ClearcutTransmitter", String.format("Too large: %d", new Object[]{Integer.valueOf(length2)}));
                    return;
                } else if (!this.f.a()) {
                    Log.w("ClearcutTransmitter", "Dropped event; high load or sample rate");
                    return;
                }
            }
            if (((Boolean) this.h.a()).booleanValue()) {
                hol hol = this.d;
                if (hol == null) {
                    synchronized (this) {
                        hol = this.d;
                        if (hol == null) {
                            hol = new hol(this.e, "GMSCORE_ANDROID_PRIMES", (String) null);
                            if (!axav.a.a().v()) {
                                avsd = !axav.a.a().u() ? avsd.DEFAULT : avsd.UNMETERED_ONLY;
                            } else {
                                avsd = avsd.UNMETERED_OR_DAILY;
                            }
                            hol.a(avsd);
                            this.d = hol;
                        }
                    }
                }
                hol.a(k).b();
            }
        }
    }
}
