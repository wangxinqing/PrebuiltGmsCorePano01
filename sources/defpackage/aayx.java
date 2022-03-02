package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.text.TextUtils;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: aayx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aayx {
    public static final int c = 2;
    public static final int d = 3;
    public final aayc a;
    public final aaxh b;
    public aucd e = aatt.P.o();
    private aatt f = null;
    private final List g;
    private final Map h = new HashMap();
    private final Context i;

    static {
        aayx.class.getCanonicalName();
    }

    public aayx(Context context, aayc aayc, aaxh aaxh) {
        DropBoxManager dropBoxManager = (DropBoxManager) context.getSystemService("dropbox");
        this.a = aayc;
        this.i = context;
        this.b = aaxh;
        this.g = new ArrayList();
    }

    public static aasm a(aaxf aaxf, boolean z) {
        int length;
        if (aaxf == null) {
            return null;
        }
        aucd o = aasm.l.o();
        boolean z2 = aaxf.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aasm aasm = (aasm) o.b;
        aasm.a |= 2;
        aasm.c = z2;
        byte[] bArr = aaxf.b;
        if (bArr != null) {
            auay a2 = auay.a(bArr);
            if (o.c) {
                o.c();
                o.c = false;
            }
            aasm aasm2 = (aasm) o.b;
            a2.getClass();
            aasm2.a |= 4;
            aasm2.d = a2;
        }
        String str = aaxf.a;
        if (str != null) {
            aasm aasm3 = (aasm) o.b;
            str.getClass();
            aasm3.a |= 1;
            aasm3.b = str;
        }
        byte[][] bArr2 = aaxf.c;
        if (!(bArr2 == null || (length = bArr2.length) == 0)) {
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr3 = aaxf.c[i2];
                if (bArr3 != null) {
                    auay a3 = auay.a(bArr3);
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aasm aasm4 = (aasm) o.b;
                    a3.getClass();
                    if (!aasm4.e.a()) {
                        aasm4.e = aucj.a(aasm4.e);
                    }
                    aasm4.e.add(a3);
                }
            }
        }
        if (aaxf.j) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aasm aasm5 = (aasm) o.b;
            aasm5.a |= 32;
            aasm5.k = true;
        }
        int i3 = aaxf.e;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aasm aasm6 = (aasm) o.b;
        int i4 = aasm6.a | 8;
        aasm6.a = i4;
        aasm6.f = i3;
        int i5 = aaxf.i;
        aasm6.a = i4 | 16;
        aasm6.j = i5;
        if (z) {
            List list = aaxf.f;
            if (list != null && list.size() > 0) {
                for (int i6 = 0; i6 < aaxf.f.size(); i6++) {
                    String str2 = (String) aaxf.f.get(i6);
                    if (str2 != null) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aasm aasm7 = (aasm) o.b;
                        str2.getClass();
                        if (!aasm7.g.a()) {
                            aasm7.g = aucj.a(aasm7.g);
                        }
                        aasm7.g.add(str2);
                    }
                }
            }
            String[] strArr = aaxf.g;
            if (strArr != null && (r1 = strArr.length) > 0) {
                for (String str3 : strArr) {
                    if (str3 != null) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aasm aasm8 = (aasm) o.b;
                        str3.getClass();
                        if (!aasm8.h.a()) {
                            aasm8.h = aucj.a(aasm8.h);
                        }
                        aasm8.h.add(str3);
                    }
                }
            }
            List list2 = aaxf.h;
            if (list2 != null && list2.size() > 0) {
                List list3 = aaxf.h;
                int size = list3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    aaxg aaxg = (aaxg) list3.get(i7);
                    aucd o2 = aatm.f.o();
                    String str4 = aaxg.a;
                    if (str4 != null) {
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aatm aatm = (aatm) o2.b;
                        str4.getClass();
                        aatm.a |= 1;
                        aatm.b = str4;
                    }
                    boolean z3 = aaxg.b;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    aatm aatm2 = (aatm) o2.b;
                    int i8 = aatm2.a | 2;
                    aatm2.a = i8;
                    aatm2.c = z3;
                    boolean z4 = aaxg.c;
                    int i9 = i8 | 4;
                    aatm2.a = i9;
                    aatm2.d = z4;
                    String str5 = aaxg.d;
                    if (str5 != null) {
                        str5.getClass();
                        aatm2.a = i9 | 8;
                        aatm2.e = str5;
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aasm aasm9 = (aasm) o.b;
                    aatm aatm3 = (aatm) o2.i();
                    aatm3.getClass();
                    if (!aasm9.i.a()) {
                        aasm9.i = aucj.a(aasm9.i);
                    }
                    aasm9.i.add(aatm3);
                }
            }
        }
        return (aasm) o.i();
    }

    public final aucd a(auay auay) {
        if (this.h.containsKey(auay)) {
            return (aucd) this.h.get(auay);
        }
        aucd o = aask.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aask aask = (aask) o.b;
        auay.getClass();
        aask.a |= 1;
        aask.b = auay;
        this.h.put(auay, o);
        return o;
    }

    public final void a() {
        if (this.f != null) {
            throw new IllegalStateException("Message already finalized");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j) {
        int i2;
        a();
        aucd aucd = this.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aatt aatt = (aatt) aucd.b;
        aatt aatt2 = aatt.P;
        aatt.a |= 1;
        aatt.c = 20000000;
        String a2 = this.a.b.a("shared_uuid");
        if (a2 != null) {
            aucd aucd2 = this.e;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            aatt aatt3 = (aatt) aucd2.b;
            a2.getClass();
            aatt3.a |= 4;
            aatt3.e = a2;
        }
        String a3 = this.a.b.a("uuid");
        if (TextUtils.isEmpty(a3)) {
            aucd aucd3 = this.e;
            String uuid = UUID.randomUUID().toString();
            if (aucd3.c) {
                aucd3.c();
                aucd3.c = false;
            }
            aatt aatt4 = (aatt) aucd3.b;
            uuid.getClass();
            aatt4.a |= 8;
            aatt4.f = uuid;
            aucd aucd4 = this.e;
            if (aucd4.c) {
                aucd4.c();
                aucd4.c = false;
            }
            aatt aatt5 = (aatt) aucd4.b;
            aatt5.a |= 2;
            aatt5.d = false;
        } else {
            aucd aucd5 = this.e;
            if (aucd5.c) {
                aucd5.c();
                aucd5.c = false;
            }
            aatt aatt6 = (aatt) aucd5.b;
            a3.getClass();
            aatt6.a |= 8;
            aatt6.f = a3;
            aucd aucd6 = this.e;
            if (aucd6.c) {
                aucd6.c();
                aucd6.c = false;
            }
            aatt aatt7 = (aatt) aucd6.b;
            aatt7.a |= 2;
            aatt7.d = true;
        }
        String d2 = this.a.d();
        if (!TextUtils.isEmpty(d2)) {
            aucd aucd7 = this.e;
            if (aucd7.c) {
                aucd7.c();
                aucd7.c = false;
            }
            aatt aatt8 = (aatt) aucd7.b;
            d2.getClass();
            aatt8.a |= 32;
            aatt8.h = d2;
        }
        aucd aucd8 = this.e;
        boolean b2 = this.a.b.b("is_sidewinder_device");
        if (aucd8.c) {
            aucd8.c();
            aucd8.c = false;
        }
        aatt aatt9 = (aatt) aucd8.b;
        aatt9.a |= 1024;
        aatt9.m = b2;
        String str = Build.FINGERPRINT;
        a();
        if (str != null) {
            aucd aucd9 = this.e;
            if (aucd9.c) {
                aucd9.c();
                aucd9.c = false;
            }
            aatt aatt10 = (aatt) aucd9.b;
            str.getClass();
            aatt10.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            aatt10.k = str;
        }
        a();
        aaxf a4 = this.b.a("android");
        if (a4 != null) {
            aucd aucd10 = this.e;
            aasm a5 = a(a4, false);
            if (aucd10.c) {
                aucd10.c();
                aucd10.c = false;
            }
            aatt aatt11 = (aatt) aucd10.b;
            a5.getClass();
            aatt11.l = a5;
            aatt11.a |= 512;
        }
        a();
        aucd o = aatn.e.o();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = (((aatn) o.b).d + currentTimeMillis) - j;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aatn aatn = (aatn) o.b;
        aatn.a |= 4;
        aatn.d = j2;
        aayb aayb = this.a.b;
        long j3 = aayb.a.getLong("snet_wake_interval_ms");
        if (j3 == 0) {
            j3 = aayb.a.getLong("wake_interval_ms");
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aatn aatn2 = (aatn) o.b;
        aatn2.a |= 1;
        aatn2.b = j3;
        aayy aayy = new aayy(this.i);
        long b3 = aayy.b();
        if (b3 == -1) {
            aayy.b(currentTimeMillis);
            aucd aucd11 = this.e;
            if (aucd11.c) {
                aucd11.c();
                aucd11.c = false;
            }
            aatt aatt12 = (aatt) aucd11.b;
            aatn aatn3 = (aatn) o.i();
            aatn3.getClass();
            aatt12.i = aatn3;
            aatt12.a |= 64;
        } else {
            long j4 = currentTimeMillis - b3;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aatn aatn4 = (aatn) o.b;
            aatn4.a |= 2;
            aatn4.c = j4;
            aayy.b(currentTimeMillis);
            aucd aucd12 = this.e;
            if (aucd12.c) {
                aucd12.c();
                aucd12.c = false;
            }
            aatt aatt13 = (aatt) aucd12.b;
            aatn aatn5 = (aatn) o.i();
            aatn5.getClass();
            aatt13.i = aatn5;
            aatt13.a |= 64;
        }
        a();
        int i3 = Build.VERSION.SDK_INT;
        try {
            i2 = aaza.b();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            a((Throwable) new RuntimeException("Unable to get user id", e2));
            i2 = -1;
        }
        if (i2 == 0) {
            aucd aucd13 = this.e;
            if (aucd13.c) {
                aucd13.c();
                aucd13.c = false;
            }
            aatt aatt14 = (aatt) aucd13.b;
            aatt14.N = 1;
            aatt14.b |= 1024;
        } else if (i2 == -1) {
            aucd aucd14 = this.e;
            if (aucd14.c) {
                aucd14.c();
                aucd14.c = false;
            }
            aatt aatt15 = (aatt) aucd14.b;
            aatt15.N = 0;
            aatt15.b |= 1024;
        } else {
            aucd aucd15 = this.e;
            if (aucd15.c) {
                aucd15.c();
                aucd15.c = false;
            }
            aatt aatt16 = (aatt) aucd15.b;
            aatt16.N = 2;
            aatt16.b |= 1024;
        }
        if (azfv.a.a().C() && azfv.a.a().y()) {
            aucd aucd16 = this.e;
            if (aucd16.c) {
                aucd16.c();
                aucd16.c = false;
            }
            aatt aatt17 = (aatt) aucd16.b;
            aatt17.b |= 2048;
            aatt17.O = true;
        }
        aucd aucd17 = this.e;
        List list = this.g;
        if (aucd17.c) {
            aucd17.c();
            aucd17.c = false;
        }
        aatt aatt18 = (aatt) aucd17.b;
        if (!aatt18.g.a()) {
            aatt18.g = aucj.a(aatt18.g);
        }
        auab.a((Iterable) list, (List) aatt18.g);
        for (aucd aucd18 : this.h.values()) {
            aucd aucd19 = this.e;
            if (aucd19.c) {
                aucd19.c();
                aucd19.c = false;
            }
            aatt aatt19 = (aatt) aucd19.b;
            aask aask = (aask) aucd18.i();
            aask.getClass();
            if (!aatt19.C.a()) {
                aatt19.C = aucj.a(aatt19.C);
            }
            aatt19.C.add(aask);
        }
        this.f = (aatt) this.e.i();
        if (this.a.b.b("clearcut_idle_logging_enabled")) {
            hol a6 = hol.a(this.i, "ANDROID_SNET_IDLE");
            byte[] k = this.f.k();
            if (azfv.m()) {
                int length = k.length;
                if (length <= 4096) {
                    a6.a(avsd.UNMETERED_OR_DAILY);
                } else if (length <= 102400) {
                    a6.a(avsd.UNMETERED_ONLY);
                }
            }
            a6.a(k).b();
        }
        azft.c();
        this.e = aatt.P.o();
        this.f = null;
    }

    /* access modifiers changed from: package-private */
    public final void a(Exception exc) {
        a();
        StringWriter stringWriter = new StringWriter();
        apev.a((Throwable) exc, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        aayb aayb = this.a.b;
        int i2 = aayb.a.getInt("snet_max_exception_string_size");
        if (i2 == 0) {
            i2 = aayb.a.getInt("max_exception_string_size");
        }
        this.g.add(stringWriter2.substring(0, Math.min(i2, stringWriter2.length())));
    }

    public final void a(Throwable th) {
        a();
        this.g.add(th.toString());
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.util.List, java.util.Collection] */
    /* access modifiers changed from: package-private */
    public final void a(List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            aaxr aaxr = (aaxr) list.get(i2);
            if (!(aaxr.a == null || aaxr.b == null)) {
                aucd o = aasr.c.o();
                List list2 = aaxr.a;
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    aasm a2 = a((aaxf) list2.get(i3), false);
                    if (a2 != null) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aasr aasr = (aasr) o.b;
                        a2.getClass();
                        if (!aasr.a.a()) {
                            aasr.a = aucj.a(aasr.a);
                        }
                        aasr.a.add(a2);
                    }
                }
                ? r8 = aaxr.b;
                int size3 = r8.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    aaxl aaxl = (aaxl) r8.get(i4);
                    if (aaxl.a() != null) {
                        aucd o2 = aasq.d.o();
                        String a3 = aaxl.a();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aasq aasq = (aasq) o2.b;
                        a3.getClass();
                        aasq.a |= 1;
                        aasq.b = a3;
                        int b2 = aaxl.b();
                        if (o2.c) {
                            o2.c();
                            o2.c = false;
                        }
                        aasq aasq2 = (aasq) o2.b;
                        aasq2.a |= 2;
                        aasq2.c = b2;
                        aasq aasq3 = (aasq) o2.i();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aasr aasr2 = (aasr) o.b;
                        aasq3.getClass();
                        if (!aasr2.b.a()) {
                            aasr2.b = aucj.a(aasr2.b);
                        }
                        aasr2.b.add(aasq3);
                    }
                }
                if (((aasr) o.b).a.size() > 0 && ((aasr) o.b).b.size() > 0) {
                    aucd aucd = this.e;
                    aasr aasr3 = (aasr) o.i();
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aatt aatt = (aatt) aucd.b;
                    aatt aatt2 = aatt.P;
                    aasr3.getClass();
                    if (!aatt.H.a()) {
                        aatt.H = aucj.a(aatt.H);
                    }
                    aatt.H.add(aasr3);
                }
            }
        }
    }
}
