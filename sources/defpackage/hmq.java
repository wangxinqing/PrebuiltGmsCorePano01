package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import java.util.List;

/* renamed from: hmq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hmq {
    private final hmo a;
    private final String b;
    private final float c;

    public hmq(Context context) {
        this.a = new hmo(new iyn(context, (String) his.h.c(), (String) his.i.c(), false, false, (String) his.j.c(), (String) null, "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk", (byte[]) null), context.getPackageName());
        this.b = mq.a(mp.a(context.getResources().getConfiguration()).c()).b();
        this.c = context.getResources().getDisplayMetrics().density;
    }

    private static amzy b(List list) {
        amzt j = amzy.j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            auun auun = (auun) list.get(i);
            aucd aucd = (aucd) auun.c(5);
            aucd.a((aucj) auun);
            String a2 = hiq.a(auun.b);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            auun auun2 = (auun) aucd.b;
            auun auun3 = auun.c;
            a2.getClass();
            auun2.a |= 1;
            auun2.b = a2;
            j.c((auun) aucd.i());
        }
        return j.a();
    }

    public final auur a(List list) {
        aucd o = auuq.d.o();
        amym a2 = amym.a((Iterable) list).a(hmp.a);
        if (o.c) {
            o.c();
            o.c = false;
        }
        auuq auuq = (auuq) o.b;
        if (!auuq.b.a()) {
            auuq.b = aucj.a(auuq.b);
        }
        auab.a((Iterable) a2, (List) auuq.b);
        aucd o2 = auup.h.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auup auup = (auup) o2.b;
        int i = auup.a | 8;
        auup.a = i;
        auup.e = true;
        int i2 = i | 1;
        auup.a = i2;
        auup.b = true;
        String str = this.b;
        str.getClass();
        auup.a = i2 | 4;
        auup.d = str;
        int ceil = (int) Math.ceil((double) (this.c * 26.0f));
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        auup auup2 = (auup) o2.b;
        int i3 = auup2.a | 2;
        auup2.a = i3;
        auup2.c = ceil;
        int i4 = i3 | 16;
        auup2.a = i4;
        auup2.f = true;
        auup2.a = i4 | 32;
        auup2.g = true;
        if (o.c) {
            o.c();
            o.c = false;
        }
        auuq auuq2 = (auuq) o.b;
        auup auup3 = (auup) o2.i();
        auup3.getClass();
        auuq2.c = auup3;
        auuq2.a |= 1;
        auuq auuq3 = (auuq) o.i();
        try {
            hmo hmo = this.a;
            iyn iyn = hmo.d;
            StringBuilder sb = new StringBuilder();
            sb.append("/affiliation:lookup?alt=proto");
            if (!TextUtils.isEmpty(hmo.b)) {
                String valueOf = String.valueOf(iyv.a(hmo.b));
                sb.append(valueOf.length() == 0 ? new String("&key=") : "&key=".concat(valueOf));
            }
            auur auur = (auur) iyn.a(sb.toString(), auuq3.k(), (Object) auur.c, hmo.a, hmo.c);
            aucd aucd = (aucd) auur.c(5);
            aucd.a((aucj) auur);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((auur) aucd.b).a = aucj.s();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            ((auur) aucd.b).b = aucj.s();
            for (auum auum : auur.a) {
                aucd aucd2 = (aucd) auum.c(5);
                aucd2.a((aucj) auum);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                auum auum2 = auum.b;
                ((auum) aucd2.b).a = aucj.s();
                amzy b2 = b(auum.a);
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                auum auum3 = (auum) aucd2.b;
                auum3.c();
                auab.a((Iterable) b2, (List) auum3.a);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                auur auur2 = (auur) aucd.b;
                auum auum4 = (auum) aucd2.i();
                auum4.getClass();
                if (!auur2.a.a()) {
                    auur2.a = aucj.a(auur2.a);
                }
                auur2.a.add(auum4);
            }
            for (auuo auuo : auur.b) {
                aucd aucd3 = (aucd) auuo.c(5);
                aucd3.a((aucj) auuo);
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                auuo auuo2 = auuo.b;
                ((auuo) aucd3.b).a = aucj.s();
                amzy b3 = b(auuo.a);
                if (aucd3.c) {
                    aucd3.c();
                    aucd3.c = false;
                }
                auuo auuo3 = (auuo) aucd3.b;
                if (!auuo3.a.a()) {
                    auuo3.a = aucj.a(auuo3.a);
                }
                auab.a((Iterable) b3, (List) auuo3.a);
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                auur auur3 = (auur) aucd.b;
                auuo auuo4 = (auuo) aucd3.i();
                auuo4.getClass();
                if (!auur3.b.a()) {
                    auur3.b = aucj.a(auur3.b);
                }
                auur3.b.add(auuo4);
            }
            return (auur) aucd.i();
        } catch (eif e) {
            throw new hjm(hjn.a(e), "Error when fetching affiliations.", e);
        } catch (VolleyError e2) {
            throw new hjm(513, "Error when fetching affiliations.", e2);
        }
    }
}
