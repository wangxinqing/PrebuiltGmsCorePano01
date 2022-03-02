package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: chn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class chn extends cbe implements cjn {
    public final HashMap a = new HashMap();
    private final Context b;

    public chn(Context context) {
        this.b = context;
    }

    public static final void a(bsz bsz, chm chm) {
        juh juh = new juh(bsz, 1);
        juh.a(jut.a(chm.b));
        juh.a(chm.a.k());
        cbi.q().a(juh.a());
    }

    public final chm a(bsz bsz, boolean z) {
        cho cho;
        Object[] objArr = {bsz, Boolean.valueOf(z)};
        iva.a((Object) bsz);
        chm chm = (chm) this.a.get(bsz);
        if (chm == null) {
            juj a2 = cbi.q().a(bsz, 1);
            if (a2 == null || (chm = chm.a(a2)) == null) {
                chm = null;
            } else {
                this.a.put(bsz, chm);
            }
        }
        if (chm == null) {
            aucd o = jya.e.o();
            String valueOf = String.valueOf(UUID.randomUUID());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb.append("1:");
            sb.append(valueOf);
            String sb2 = sb.toString();
            if (o.c) {
                o.c();
                o.c = false;
            }
            jya jya = (jya) o.b;
            sb2.getClass();
            jya.a |= 1;
            jya.b = sb2;
            String a3 = a();
            if (a3 == null) {
                jxz jxz = jxz.NOT_SYNCED_MISSING_GCM_ID;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                jya jya2 = (jya) o.b;
                jya2.d = jxz.d;
                jya2.a |= 4;
            } else {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                jya jya3 = (jya) o.b;
                a3.getClass();
                jya3.a |= 2;
                jya3.c = a3;
                jxz jxz2 = jxz.NOT_SYNCED_BUT_READY_TO_SYNC;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                jya jya4 = (jya) o.b;
                jya4.d = jxz2.d;
                jya4.a |= 4;
            }
            chm chm2 = new chm((jya) o.i(), cbi.i().a());
            this.a.put(bsz, chm2);
            a(bsz, chm2);
            Object[] objArr2 = new Object[2];
            objArr2[0] = bsz;
            jxz a4 = jxz.a(chm2.a.d);
            if (a4 == null) {
                a4 = jxz.NOT_SYNCED_MISSING_GCM_ID;
            }
            objArr2[1] = a4;
            chm = chm2;
        }
        jya jya5 = chm.a;
        String a5 = a();
        if (a5 != null) {
            jxz a6 = jxz.a(jya5.d);
            if (a6 == null) {
                a6 = jxz.NOT_SYNCED_MISSING_GCM_ID;
            }
            if (a6 == jxz.NOT_SYNCED_MISSING_GCM_ID || !TextUtils.equals(a5, jya5.c)) {
                jya jya6 = chm.a;
                aucd aucd = (aucd) jya6.c(5);
                aucd.a((aucj) jya6);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                jya jya7 = (jya) aucd.b;
                jya jya8 = jya.e;
                a5.getClass();
                jya7.a = 2 | jya7.a;
                jya7.c = a5;
                chm.a = (jya) aucd.i();
                chm.b = cbi.i().a();
                chm.a(jxz.NOT_SYNCED_BUT_READY_TO_SYNC);
                a(bsz, chm);
                new Object[1][0] = bsz;
            }
        }
        if (z && chm.a()) {
            new Object[1][0] = bsz;
            cjz z2 = cbi.z();
            new Object[1][0] = bsz;
            if (z2.a != null) {
                cho = new cho(bsz);
            } else {
                cho = null;
            }
            z2.a(cho, 0, Long.MAX_VALUE, "DeviceRegistrationSync", bsz.b);
        }
        return chm;
    }

    public final String a() {
        return nsi.a(this.b);
    }

    public final void a(bsz bsz, juj juj) {
        chm a2 = chm.a(juj);
        if (a2 == null) {
            new Object[1][0] = Integer.valueOf(juj.a());
            return;
        }
        this.a.put(bsz, a2);
        new Object[1][0] = bsz;
    }
}
