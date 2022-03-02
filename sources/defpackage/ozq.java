package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;

/* renamed from: ozq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozq implements ozs {
    public static final int a = ((int) TimeUnit.DAYS.toSeconds(90));
    private static final Map h;
    private static final Map i;
    public final paq b;
    public final ozb c;
    public final pxf d;
    public final oyq e;
    public final Map f;
    public boolean g = false;
    private final Context j;
    private SecureRandom k;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put((Object) null, oqv.TOKENIZER_TEXT);
        h.put("plain", oqv.TOKENIZER_TEXT);
        h.put("html", oqv.TOKENIZER_HTML);
        h.put("rfc822", oqv.TOKENIZER_RFC822_FORMATTED);
        h.put("url", oqv.TOKENIZER_URL);
        h.put("blob", oqv.TOKENIZER_NONE);
        h.put("date", oqv.TOKENIZER_NONE);
        h.put("location", oqv.TOKENIZER_NONE);
        h.put("verbatim", oqv.TOKENIZER_VERBATIM);
        HashMap hashMap2 = new HashMap(h.size());
        i = hashMap2;
        hashMap2.put(oqv.TOKENIZER_TEXT, "plain");
        for (Map.Entry entry : h.entrySet()) {
            if (entry.getKey() != null && !((oqv) entry.getValue()).equals(oqv.TOKENIZER_TEXT)) {
                i.put((oqv) entry.getValue(), (String) entry.getKey());
            }
        }
    }

    public ozq(NativeIndex nativeIndex, ozb ozb, Context context, String str, File file, oyq oyq) {
        HashMap hashMap = new HashMap();
        this.j = context;
        this.f = hashMap;
        iva.a((Object) nativeIndex);
        this.c = ozb;
        this.d = new pxf(context);
        this.e = oyq;
        par par = new par(context, str, file);
        this.b = par;
        for (ota a2 : par.a()) {
            b(a(a2));
        }
        this.g = false;
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.remove(oqx.VARIANT_ANNOTATION);
        return arrayList;
    }

    public static Map b(osz osz) {
        return a(osz, ozp.a);
    }

    public static Map c(osz osz) {
        return a(osz, ozp.b);
    }

    public static boolean d(osz osz) {
        aucx aucx = osz.j;
        int size = aucx.size();
        int i2 = 0;
        while (i2 < size) {
            int a2 = oqr.a(((oqy) aucx.get(i2)).o);
            if (a2 == 0) {
                a2 = 1;
            }
            i2++;
            if (a2 != 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(osz osz) {
        return oxe.a(osz.c);
    }

    public static boolean f(osz osz) {
        return osz.c.startsWith(".implicit:");
    }

    public static Feature[] g(osz osz) {
        if (!osz.m) {
            return new Feature[0];
        }
        return new Feature[]{dsz.a()};
    }

    public static RegisterCorpusInfo h(osz osz) {
        dtl a2 = RegisterCorpusInfo.a(osz.c);
        a2.a = osz.d;
        a2.a(osz.f);
        aucx aucx = osz.k;
        Feature[] g2 = g(osz);
        dsx dsx = new dsx();
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            ovb ovb = (ovb) aucx.get(i2);
            dsx.a(dtb.a(ovb.b), ovb.d);
        }
        dsx.a(g2);
        a2.d = dsx.a();
        a2.e = osz.g;
        a2.j = osz.r;
        String str = osz.q;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        a2.h = str;
        if (!osz.p.isEmpty() || !osz.o.isEmpty()) {
            a2.f = new Account(osz.p, osz.o);
        }
        aucx aucx2 = osz.j;
        int size2 = aucx2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            oqy oqy = (oqy) aucx2.get(i3);
            Map map = i;
            oqv a3 = oqv.a(oqy.d);
            if (a3 == null) {
                a3 = oqv.TOKENIZER_TEXT;
            }
            String str2 = (String) map.get(a3);
            if (str2 == null) {
                str2 = "plain";
            }
            dtn a4 = RegisterSectionInfo.a(oqy.b);
            a4.a = str2;
            a4.b = !oqy.c;
            a4.c = oqy.e;
            a4.d = oqy.f;
            a4.e = oqy.g;
            dtw a5 = ScoringConfig.a();
            a5.a = oqy.q;
            a4.g = a5.a();
            if (!oqy.m.isEmpty()) {
                a4.f = oqy.m;
            }
            if (new aucu(oqy.h, oqy.i).contains(oqx.VARIANT_NICKNAME)) {
                a4.a(dud.a());
            }
            if (new aucu(oqy.h, oqy.i).contains(oqx.VARIANT_ANNOTATION)) {
                a4.a(dud.a((String[]) oqy.j.toArray(new String[0])));
            }
            int a6 = oqr.a(oqy.o);
            if (a6 != 0 && a6 == 2) {
                a4.a(dud.b());
            } else {
                int a7 = oqr.a(oqy.o);
                if (a7 != 0 && a7 == 3) {
                    a4.a(dud.c());
                }
            }
            a2.a(a4);
        }
        return a2.a();
    }

    private static Map a(osz osz, ozp ozp) {
        int size = osz.j.size();
        HashMap hashMap = new HashMap(size);
        for (int i2 = 0; i2 < size; i2++) {
            oqy oqy = (oqy) osz.j.get(i2);
            String a2 = ozp.a(osz, oqy);
            if (!TextUtils.isEmpty(a2)) {
                hashMap.put(a2, new ozm(i2, oqy));
            }
        }
        return hashMap;
    }

    public final amzy b(ozc ozc, int i2) {
        amzy a2;
        synchronized (a()) {
            amzt j2 = amzy.j();
            for (pao c2 : a(ozc, (String[]) null, false, ozc.f)) {
                ozv c3 = c(c2);
                if (c3 != null) {
                    osz osz = ((ota) c3.c()).b;
                    if (osz == null) {
                        osz = osz.s;
                    }
                    if (osz.e.equals(ozc.f)) {
                        if (i2 != -1) {
                            if (i2 != c3.a()) {
                            }
                        }
                        j2.c((ota) c3.c());
                    }
                }
            }
            a2 = j2.a();
        }
        return a2;
    }

    public final amzy c() {
        amzy a2;
        synchronized (a()) {
            amzt b2 = amzy.b(this.f.size());
            for (ota ota : this.f.values()) {
                otg otg = ota.c;
                if (otg == null) {
                    otg = otg.h;
                }
                int a3 = otf.a(otg.c);
                if (a3 != 0) {
                    if (a3 != 1) {
                    }
                }
                osz osz = ota.b;
                if (osz == null) {
                    osz = osz.s;
                }
                b2.c(osz);
            }
            a2 = b2.a();
        }
        return a2;
    }

    public final SparseIntArray e() {
        SparseIntArray sparseIntArray;
        int i2;
        synchronized (a()) {
            sparseIntArray = new SparseIntArray(this.f.size());
            for (ota ota : this.f.values()) {
                osz osz = ota.b;
                if (osz == null) {
                    osz = osz.s;
                }
                if (((Boolean) ozx.bh.c()).booleanValue() && (i2 = osz.r) > 0) {
                    Integer valueOf = Integer.valueOf(i2);
                    if (e(osz)) {
                        if (((Integer) ozx.bi.c()).intValue() > 0) {
                            oxe a2 = oxe.a(osz.c, osz.e, oyb.a(this.j));
                            if (a2 != null) {
                                valueOf = Integer.valueOf(Math.min(a2.a.c, Math.min(valueOf.intValue(), ((Integer) ozx.bi.c()).intValue())));
                            }
                        }
                    }
                    sparseIntArray.put(osz.b, valueOf.intValue());
                } else if (f(osz)) {
                    sparseIntArray.put(osz.b, Integer.valueOf(a).intValue());
                }
            }
        }
        return sparseIntArray;
    }

    public final otg f(pao pao) {
        otg a2;
        synchronized (a()) {
            a2 = a(pao, otg.h);
        }
        return a2;
    }

    public final anax d() {
        anax anax;
        synchronized (a()) {
            anax = a(ozf.a).a;
        }
        return anax;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.osz d(defpackage.pao r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.a()
            monitor-enter(r0)
            java.util.Map r1 = r2.f     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x001a }
            ota r3 = (defpackage.ota) r3     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x0017
            osz r3 = r3.b     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x0015
            osz r3 = defpackage.osz.s     // Catch:{ all -> 0x001a }
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozq.d(pao):osz");
    }

    public static oqy a(RegisterSectionInfo registerSectionInfo) {
        String a2;
        oqv oqv = (oqv) h.get(registerSectionInfo.b);
        if (oqv == null) {
            oqv = oqv.TOKENIZER_TEXT;
        }
        String str = registerSectionInfo.f;
        if (str == null) {
            str = "";
        }
        aucd o = oqy.r.o();
        String str2 = registerSectionInfo.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        oqy oqy = (oqy) o.b;
        str2.getClass();
        int i2 = 1;
        int i3 = oqy.a | 1;
        oqy.a = i3;
        oqy.b = str2;
        boolean z = registerSectionInfo.c;
        int i4 = i3 | 2;
        oqy.a = i4;
        oqy.c = !z;
        oqy.d = oqv.g;
        int i5 = i4 | 4;
        oqy.a = i5;
        int i6 = registerSectionInfo.d;
        int i7 = i5 | 8;
        oqy.a = i7;
        oqy.e = i6;
        boolean z2 = registerSectionInfo.e;
        int i8 = i7 | 16;
        oqy.a = i8;
        oqy.f = z2;
        str.getClass();
        int i9 = i8 | 32;
        oqy.a = i9;
        oqy.g = str;
        ScoringConfig scoringConfig = registerSectionInfo.i;
        boolean z3 = scoringConfig != null && scoringConfig.a;
        oqy.a = i9 | FragmentTransaction.TRANSIT_ENTER_MASK;
        oqy.q = z3;
        ArrayList arrayList = new ArrayList();
        if (registerSectionInfo.a(1) != null) {
            arrayList.add(oqx.VARIANT_NICKNAME);
        }
        if (registerSectionInfo.a(6) != null) {
            arrayList.add(oqx.VARIANT_ANNOTATION);
            Feature a3 = registerSectionInfo.a(6);
            String[] strArr = null;
            if (!(a3 == null || (a2 = a3.a("annotators")) == null)) {
                strArr = TextUtils.split(a2, ",");
            }
            o.I(Arrays.asList(strArr));
        }
        o.J(arrayList);
        double b2 = dud.b(registerSectionInfo);
        if (b2 < 1.0d) {
            int a4 = NativeIndex.a(b2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            oqy oqy2 = (oqy) o.b;
            oqy2.a |= 64;
            oqy2.k = a4;
        }
        double c2 = dud.c(registerSectionInfo);
        if (c2 < 1.0d) {
            int a5 = NativeIndex.a(c2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            oqy oqy3 = (oqy) o.b;
            oqy3.a |= 128;
            oqy3.l = a5;
        }
        if ("url".equals(registerSectionInfo.b) && dud.a(registerSectionInfo)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            oqy oqy4 = (oqy) o.b;
            oqy4.o = 1;
            oqy4.a |= 1024;
        } else if (registerSectionInfo.a(5) != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            oqy oqy5 = (oqy) o.b;
            oqy5.o = 2;
            oqy5.a |= 1024;
        }
        String str3 = registerSectionInfo.h;
        if (str3 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            oqy oqy6 = (oqy) o.b;
            str3.getClass();
            oqy6.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            oqy6.m = str3;
        }
        String str4 = registerSectionInfo.b;
        if ("date".equals(str4)) {
            i2 = 2;
        } else if ("location".equals(str4)) {
            i2 = 3;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        oqy oqy7 = (oqy) o.b;
        oqy7.p = i2 - 1;
        oqy7.a |= 2048;
        return (oqy) o.i();
    }

    public final anax b() {
        return a(ozk.g).a;
    }

    public final ota b(pao pao) {
        ota ota;
        synchronized (a()) {
            ota = (ota) this.f.get(pao);
            if (ota == null) {
                ota = null;
            }
        }
        return ota;
    }

    public final ozv c(pao pao) {
        ota b2 = b(pao);
        if (b2 == null) {
            return null;
        }
        osz osz = b2.b;
        if (osz == null) {
            osz = osz.s;
        }
        int i2 = osz.l;
        osz osz2 = b2.b;
        if (osz2 == null) {
            osz2 = osz.s;
        }
        return ozv.a(i2, (Object) b2, osz2.n);
    }

    public final ozr b(ozc ozc, String[] strArr, boolean z, String str) {
        HashSet hashSet;
        HashSet hashSet2;
        if (strArr != null) {
            hashSet = new HashSet(Arrays.asList(strArr));
        } else {
            hashSet = null;
        }
        if (!ozc.b) {
            HashSet hashSet3 = new HashSet();
            for (oyz oyz : this.c.b(ozc)) {
                synchronized (a()) {
                    for (pao pao : oyz.a()) {
                        ota ota = (ota) this.f.get(pao);
                        if (ota != null) {
                            hashSet3.add(ota);
                        }
                    }
                }
            }
            hashSet2 = hashSet3;
        } else {
            hashSet2 = null;
        }
        return a((ozk) new ozg(this, hashSet, str, hashSet2, ozc, z));
    }

    public final void c(pao pao, otg otg) {
        synchronized (a()) {
            ota ota = (ota) this.f.get(pao);
            if (ota != null) {
                aucd aucd = (aucd) ota.c(5);
                aucd.a((aucj) ota);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                ota ota2 = (ota) aucd.b;
                otg.getClass();
                ota2.c = otg;
                ota2.a |= 2;
                ota ota3 = (ota) aucd.i();
                this.f.put(pao, ota3);
                this.g = true;
                paq paq = this.b;
                String valueOf = String.valueOf(((par) paq).a(new pao(ota3)));
                ((par) paq).a.edit().putString(valueOf.length() == 0 ? new String("corpuskey:") : "corpuskey:".concat(valueOf), plc.a((audx) ota3)).apply();
                return;
            }
            oso.b("Cannot set status for non-existent key: %s", (Object) pao.b());
        }
    }

    public final ozv e(pao pao) {
        ozv c2 = c(pao);
        if (c2 == null) {
            return null;
        }
        osz osz = ((ota) c2.c()).b;
        if (osz == null) {
            osz = osz.s;
        }
        return c2.a((Object) osz);
    }

    public final void b(ota ota) {
        pao pao = new pao(ota);
        this.f.put(pao, ota);
        this.g = true;
        osz osz = ota.b;
        if (osz == null) {
            osz = osz.s;
        }
        oyz c2 = this.c.c(osz.e);
        synchronized (c2.e) {
            c2.f.add(pao);
        }
    }

    public final void b(pao pao, otg otg) {
        ota ota = (ota) this.f.get(pao);
        if (ota != null) {
            Map map = this.f;
            aucd aucd = (aucd) ota.c(5);
            aucd.a((aucj) ota);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ota ota2 = (ota) aucd.b;
            otg.getClass();
            ota2.c = otg;
            ota2.a |= 2;
            map.put(pao, (ota) aucd.i());
        }
    }

    public static osz a(String str, oqo oqo) {
        aucd o = osz.s.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        osz osz = (osz) o.b;
        ".implicit:".getClass();
        int i2 = osz.a | 2;
        osz.a = i2;
        osz.c = ".implicit:";
        str.getClass();
        osz.a = i2 | 8;
        osz.e = str;
        for (int i3 = 0; i3 < oqo.e.size(); i3++) {
            oqy oqy = ((oqn) oqo.e.get(i3)).d;
            if (oqy == null) {
                oqy = oqy.r;
            }
            int i4 = oqy.n;
            o.a(oqy);
            if (i4 != DocumentSection.a) {
                ovb a2 = pbj.a(i4, new ouz[]{pbj.a(i3)});
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                osz osz2 = (osz) o.b;
                a2.getClass();
                osz2.b();
                osz2.k.add(a2);
            }
        }
        return (osz) o.i();
    }

    public static osz a(oyz oyz, RegisterCorpusInfo registerCorpusInfo) {
        String str = oyz.b;
        aucd o = osz.s.o();
        String b2 = amrk.b(registerCorpusInfo.a);
        int i2 = 0;
        if (o.c) {
            o.c();
            o.c = false;
        }
        osz osz = (osz) o.b;
        b2.getClass();
        int i3 = osz.a | 2;
        osz.a = i3;
        osz.c = b2;
        str.getClass();
        osz.a = i3 | 8;
        osz.e = str;
        String b3 = amrk.b(registerCorpusInfo.b);
        if (o.c) {
            o.c();
            o.c = false;
        }
        osz osz2 = (osz) o.b;
        b3.getClass();
        osz2.a |= 4;
        osz2.d = b3;
        String uri = registerCorpusInfo.c.toString();
        if (o.c) {
            o.c();
            o.c = false;
        }
        osz osz3 = (osz) o.b;
        uri.getClass();
        int i4 = osz3.a | 16;
        osz3.a = i4;
        osz3.f = uri;
        boolean z = registerCorpusInfo.f;
        int i5 = i4 | 32;
        osz3.a = i5;
        osz3.g = z;
        int i6 = registerCorpusInfo.k;
        osz3.a = i5 | 16384;
        osz3.r = i6;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = registerCorpusInfo.e;
        boolean z2 = true;
        if (globalSearchCorpusConfig == null) {
            z2 = false;
        } else if (Feature.a(1, globalSearchCorpusConfig.b) == null) {
            z2 = false;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        osz osz4 = (osz) o.b;
        osz4.a |= 512;
        osz4.m = z2;
        Account account = registerCorpusInfo.g;
        if (account != null && account.type != null && registerCorpusInfo.g.name != null) {
            String str2 = registerCorpusInfo.g.type;
            if (o.c) {
                o.c();
                o.c = false;
            }
            osz osz5 = (osz) o.b;
            str2.getClass();
            osz5.a |= 2048;
            osz5.o = str2;
            String str3 = registerCorpusInfo.g.name;
            if (o.c) {
                o.c();
                o.c = false;
            }
            osz osz6 = (osz) o.b;
            str3.getClass();
            osz6.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            osz6.p = str3;
        } else if (((osz) o.b).e.equals("com.google.android.gm") && registerCorpusInfo.a != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            osz osz7 = (osz) o.b;
            "com.google".getClass();
            int i7 = osz7.a | 2048;
            osz7.a = i7;
            osz7.o = "com.google";
            String str4 = registerCorpusInfo.a;
            str4.getClass();
            osz7.a = i7 | FragmentTransaction.TRANSIT_ENTER_MASK;
            osz7.p = str4;
        }
        String str5 = registerCorpusInfo.i;
        if (str5 != null) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            osz osz8 = (osz) o.b;
            str5.getClass();
            osz8.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            osz8.q = str5;
        }
        while (true) {
            RegisterSectionInfo[] registerSectionInfoArr = registerCorpusInfo.d;
            if (i2 >= registerSectionInfoArr.length) {
                return (osz) o.i();
            }
            o.a(a(registerSectionInfoArr[i2]));
            i2++;
        }
    }

    public static boolean a(osz osz) {
        return !osz.f.isEmpty();
    }

    public final amzy a(oyz oyz) {
        amzy a2;
        synchronized (a()) {
            Set<pao> a3 = oyz.a();
            amzt b2 = amzy.b(a3.size());
            for (pao pao : a3) {
                ota ota = (ota) this.f.get(pao);
                if (ota != null) {
                    otg otg = ota.c;
                    if (otg == null) {
                        otg = otg.h;
                    }
                    int a4 = otf.a(otg.c);
                    if (a4 == 0 || a4 == 1) {
                        b2.c(pao);
                    }
                }
            }
            a2 = b2.a();
        }
        return a2;
    }

    public final Object a() {
        return this.c.a.a.g;
    }

    public final String a(pao pao) {
        synchronized (a()) {
            osz d2 = d(pao);
            if (d2 == null) {
                return null;
            }
            byte[] bytes = d2.e.getBytes(Charset.defaultCharset());
            byte[] bytes2 = d2.c.getBytes(Charset.defaultCharset());
            Mac mac = ((par) this.b).c;
            mac.reset();
            mac.update(bytes);
            mac.update((byte) 45);
            mac.update(bytes2);
            String d3 = jjp.d(mac.doFinal());
            String hexString = Long.toHexString(d2.h);
            StringBuilder sb = new StringBuilder(String.valueOf(d3).length() + 1 + String.valueOf(hexString).length());
            sb.append(d3);
            sb.append("-");
            sb.append(hexString);
            String sb2 = sb.toString();
            return sb2;
        }
    }

    public final List a(ozc ozc, GlobalSearchQuerySpecification globalSearchQuerySpecification, boolean z) {
        boolean z2;
        ozl ozl;
        Set set;
        iva.a(Thread.holdsLock(a()));
        if (z) {
            z2 = true;
        } else {
            z2 = ozc != null;
        }
        iva.b(z2);
        amzy c2 = c();
        boolean a2 = this.c.a.a();
        ArrayList arrayList = new ArrayList(c2.size());
        anhk i2 = c2.listIterator();
        while (i2.hasNext()) {
            osz osz = (osz) i2.next();
            if (osz.k.isEmpty()) {
                ozl = ozl.NO_UNIVERSAL_SECTION_MAPPING;
            } else {
                if (globalSearchQuerySpecification != null) {
                    String str = osz.e;
                    String str2 = osz.c;
                    Map map = globalSearchQuerySpecification.r;
                    if (map != null && ((set = (Set) map.get(str)) == null || (!set.isEmpty() && !set.contains(str2)))) {
                        ozl = ozl.FILTERED_BY_SPEC;
                    } else if (globalSearchQuerySpecification.e == 3 && !d(osz)) {
                        ozl = ozl.NOT_OMNIBOX_CORPUS_IN_CHROME_OMNIBOX;
                    }
                }
                if (!z && !a(ozc, osz)) {
                    ozl = ozl.NOT_AUTHORIZED_FOR_INTERNAL_CORPUS;
                } else if (this.c.e(osz.e)) {
                    oyz d2 = this.c.d(osz.e);
                    if (d2 == null) {
                        ozl = ozl.CLIENT_NOT_EXIST;
                    } else if (e(osz) && !ozx.c(osz.e)) {
                        ozl = ozl.CONTENT_CORPUS_NOT_ENABLED;
                    } else if (!z && !d2.a(osz.c, a2)) {
                        ozl = ozl.SETTINGS_USER_DISABLED;
                    } else {
                        ozl = ozl.OK;
                    }
                } else {
                    ozl = ozl.PACKAGE_NOT_GLOBALLY_SEARCHABLE;
                }
            }
            if (!ozl.equals(ozl.OK)) {
                oso.e("CorpusConfig package name : %s, Corpus name : %s is not active for global search due to %s.", osz.e, osz.c, ozl);
            } else {
                arrayList.add(osz);
            }
        }
        return arrayList;
    }

    public final Set a(ozc ozc, String[] strArr, boolean z, String str) {
        return b(ozc, strArr, z, str).a;
    }

    public final ota a(ota ota) {
        osz osz = ota.b;
        if (osz == null) {
            osz = osz.s;
        }
        if ("com.google.android.gm".equals(osz.e)) {
            osz osz2 = ota.b;
            if (osz2 == null) {
                osz2 = osz.s;
            }
            if (osz2.c.startsWith("messages")) {
                osz osz3 = ota.b;
                if (osz3 == null) {
                    osz3 = osz.s;
                }
                if (osz3.k.isEmpty()) {
                    aucd aucd = (aucd) ota.c(5);
                    aucd.a((aucj) ota);
                    osz osz4 = ota.b;
                    if (osz4 == null) {
                        osz4 = osz.s;
                    }
                    aucd aucd2 = (aucd) osz4.c(5);
                    aucd2.a((aucj) osz4);
                    aucd2.K(Arrays.asList(new ovb[]{pbj.a(0, new ouz[]{pbj.a(0)}), pbj.a(1, new ouz[]{pbj.a(2)}), pbj.a(3, new ouz[]{pbj.a("android.intent.action.VIEW")}), pbj.a(4, new ouz[]{pbj.a(6)})}));
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    ota ota2 = (ota) aucd.b;
                    osz osz5 = (osz) aucd2.i();
                    ota ota3 = ota.d;
                    osz5.getClass();
                    ota2.b = osz5;
                    ota2.a |= 1;
                    return (ota) aucd.i();
                }
            }
        }
        return ota;
    }

    public final otg a(pao pao, otg otg) {
        ota ota = (ota) this.f.get(pao);
        if (ota == null) {
            return otg;
        }
        otg otg2 = ota.c;
        return otg2 == null ? otg.h : otg2;
    }

    public final ozr a(ozk ozk) {
        ozr ozr;
        synchronized (a()) {
            anav anav = new anav();
            anav anav2 = new anav();
            for (Map.Entry entry : this.f.entrySet()) {
                ota ota = (ota) entry.getValue();
                otg otg = ota.c;
                if (otg == null) {
                    otg = otg.h;
                }
                int a2 = otf.a(otg.c);
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                    }
                }
                int a3 = ozk.a(ota);
                if (a3 == 0) {
                    throw null;
                } else if (a3 == 1) {
                    anav.b((pao) entry.getKey());
                } else if (a3 == 0) {
                    throw null;
                } else if (a3 != 2) {
                    anav2.b((pao) entry.getKey());
                }
            }
            ozr = new ozr(anav.a(), anav2.a());
        }
        return ozr;
    }

    public final void a(pao pao, List list, Integer num, otd otd) {
        synchronized (a()) {
            otg a2 = a(pao, (otg) null);
            if (a2 != null) {
                aucd aucd = (aucd) a2.c(5);
                aucd.a((aucj) a2);
                if (list != null && !list.equals(a2.b)) {
                    this.g = true;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    ((otg) aucd.b).b = aucj.s();
                    aucd.L(list);
                }
                if (!(num == null || a2.e == num.intValue())) {
                    this.g = true;
                    int intValue = num.intValue();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    otg otg = (otg) aucd.b;
                    otg.a |= 16;
                    otg.e = intValue;
                }
                if (otd != null) {
                    otd otd2 = a2.f;
                    if (otd2 == null) {
                        otd2 = otd.d;
                    }
                    if (!otd.equals(otd2)) {
                        this.g = true;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        otg otg2 = (otg) aucd.b;
                        otd.getClass();
                        otg2.f = otd;
                        otg2.a |= 32;
                    }
                }
                b(pao, (otg) aucd.i());
                return;
            }
            oso.b("Cannot set status for non-existent key: %s", (Object) pao.b());
        }
    }

    public final void a(pao pao, ozv ozv) {
        try {
            a(pao, ozv, (orz) null);
        } catch (pax e2) {
        }
    }

    public final void a(pao pao, ozv ozv, orz orz) {
        ozv ozv2;
        long j2;
        int i2;
        long j3;
        orz orz2 = orz;
        synchronized (a()) {
            oso.a("Setting config for %s", (Object) pao.b());
            ota ota = (ota) this.f.get(pao);
            if (ota == null) {
                BitSet bitSet = new BitSet();
                for (ota ota2 : this.f.values()) {
                    osz osz = ota2.b;
                    if (osz == null) {
                        osz = osz.s;
                    }
                    bitSet.set(osz.b);
                }
                if (bitSet.length() == bitSet.cardinality()) {
                    i2 = bitSet.length();
                } else {
                    int i3 = 0;
                    while (i3 < bitSet.length() && bitSet.get(i3)) {
                        i3++;
                    }
                    i2 = i3;
                }
                if (i2 <= 65534) {
                    if (this.k == null) {
                        this.k = new SecureRandom();
                    }
                    j2 = this.k.nextLong();
                    ozv2 = ozv.a(0, (Object) ota.d, 0);
                } else {
                    throw new pau("Too many corpora");
                }
            } else {
                osz osz2 = ota.b;
                if (osz2 == null) {
                    osz2 = osz.s;
                }
                int i4 = osz2.b;
                osz osz3 = ota.b;
                if (osz3 == null) {
                    osz3 = osz.s;
                }
                long j4 = osz3.h;
                osz osz4 = ota.b;
                if (osz4 == null) {
                    osz4 = osz.s;
                }
                int i5 = osz4.l;
                osz osz5 = ota.b;
                if (osz5 == null) {
                    osz5 = osz.s;
                }
                ozv2 = ozv.a(i5, (Object) ota, osz5.n);
                i2 = i4;
                j2 = j4;
            }
            if (!ozv2.a(ozv)) {
                String d2 = ozv.d();
                String d3 = ozv2.d();
                StringBuilder sb = new StringBuilder(String.valueOf(d2).length() + 38 + String.valueOf(d3).length());
                sb.append("CorpusConfig: cannot ");
                sb.append(d2);
                sb.append(" when previously ");
                sb.append(d3);
                throw new pau(sb.toString());
            } else if (((osz) ozv.c()).c.isEmpty() || ((osz) ozv.c()).e.isEmpty()) {
                throw new pau("Need name and package name");
            } else {
                ota ota3 = (ota) ozv2.c();
                aucd aucd = (aucd) ota3.c(5);
                aucd.a((aucj) ota3);
                osz osz6 = (osz) ozv.c();
                aucd aucd2 = (aucd) osz6.c(5);
                aucd2.a((aucj) osz6);
                int a2 = ozv.a();
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                osz osz7 = (osz) aucd2.b;
                osz osz8 = osz.s;
                osz7.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                osz7.l = a2;
                long b2 = ozv.b();
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                osz osz9 = (osz) aucd2.b;
                int i6 = osz9.a | 1024;
                osz9.a = i6;
                osz9.n = b2;
                int i7 = i6 | 1;
                osz9.a = i7;
                osz9.b = i2;
                osz9.a = i7 | 64;
                osz9.h = j2;
                String str = ((osz) ozv.c()).e;
                String str2 = ((osz) ozv.c()).c;
                String str3 = ((osz) ozv.c()).d;
                synchronized (a()) {
                    Mac mac = ((par) this.b).c;
                    mac.reset();
                    mac.update(str2.getBytes(Charset.defaultCharset()));
                    mac.update((byte) 45);
                    mac.update(str.getBytes(Charset.defaultCharset()));
                    mac.update((byte) 45);
                    mac.update(str3.getBytes(Charset.defaultCharset()));
                    byte[] doFinal = mac.doFinal();
                    j3 = (long) (doFinal[7] & Byte.MAX_VALUE);
                    for (int i8 = 6; i8 >= 0; i8--) {
                        j3 = (j3 << 8) + ((long) (doFinal[i8] & 255));
                    }
                }
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                osz osz10 = (osz) aucd2.b;
                osz10.a |= 128;
                osz10.i = j3;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                ota ota4 = (ota) aucd.b;
                osz osz11 = (osz) aucd2.i();
                osz11.getClass();
                ota4.b = osz11;
                ota4.a |= 1;
                ota ota5 = (ota) aucd.i();
                if (orz2 != null) {
                    osz osz12 = ota5.b;
                    if (osz12 == null) {
                        osz12 = osz.s;
                    }
                    if (!orz2.a.n.a(osz12.i, osz12.b, osf.b(d(osz12)))) {
                        orz2.a.r.a("pre_corpus_config_committed_add_corpus_failed");
                        throw new pax("Could not add new corpus");
                    }
                }
                ota a3 = a(ota5);
                b(a3);
                if (!this.b.a(a3)) {
                    this.e.a("metadata_union_writeMetadata_err");
                }
            }
        }
    }

    public final boolean a(ozc ozc, osz osz) {
        if (!"com.google.android.gms".equals(osz.e)) {
            return true;
        }
        if (ozc == null) {
            return false;
        }
        pxf pxf = this.d;
        String str = ozc.f;
        int i2 = ozc.a;
        String str2 = (String) pno.f.get(osz.c);
        if (str2 == null) {
            return true;
        }
        ClientContext clientContext = new ClientContext();
        clientContext.e = str;
        clientContext.b = i2;
        if (ixk.a(pxf.a, clientContext).a(str2) != 0) {
            return false;
        }
        return true;
    }

    public final String[] a(ozc ozc, int i2) {
        amzy b2 = b(ozc, i2);
        int size = b2.size();
        String[] strArr = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            osz osz = ((ota) b2.get(i3)).b;
            if (osz == null) {
                osz = osz.s;
            }
            strArr[i3] = osz.c;
        }
        return strArr;
    }
}
