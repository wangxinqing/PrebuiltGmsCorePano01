package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: bsx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bsx extends cbe implements bsy {
    public final HashSet a = new HashSet();
    private final Context b;
    private boolean c = false;

    public bsx(Context context) {
        this.b = context;
        bsz.a(this);
    }

    public static String a(String str) {
        if (((Boolean) iks.a.c()).booleanValue()) {
            return str;
        }
        int hashCode = str != null ? str.hashCode() : 0;
        StringBuilder sb = new StringBuilder(20);
        sb.append("account#");
        sb.append(hashCode);
        sb.append("#");
        return sb.toString();
    }

    public static final bsz b(String str) {
        iva.c(str);
        if (TextUtils.equals(str, "@@ContextManagerNullAccount@@")) {
            return bsz.a;
        }
        return new bsz(str);
    }

    private final void d() {
        jxx jxx = null;
        juj a2 = cbi.q().a((bsz) null, 3);
        if (a2 != null) {
            try {
                jxx = (jxx) aucj.a((aucj) jxx.b, a2.c(), aubs.c());
            } catch (auda e) {
                anih anih = (anih) bxk.a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("bsx", "d", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AccountManager] Bad proto");
            }
            if (jxx != null) {
                aucx aucx = jxx.a;
                int size = aucx.size();
                for (int i = 0; i < size; i++) {
                    this.a.add(b(((jxw) aucx.get(i)).b));
                }
            }
        }
    }

    private final void e() {
        aucd o = jxx.b.o();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            aucd o2 = jxw.c.o();
            String str = ((bsz) it.next()).b;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            jxw jxw = (jxw) o2.b;
            str.getClass();
            jxw.a |= 1;
            jxw.b = str;
            jxw jxw2 = (jxw) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            jxx jxx = (jxx) o.b;
            jxw2.getClass();
            if (!jxx.a.a()) {
                jxx.a = aucj.a(jxx.a);
            }
            jxx.a.add(jxw2);
        }
        cbi.q().a(juj.a(3, (jxx) o.i()));
    }

    public final void c() {
        if (!this.c) {
            this.c = true;
            jxx jxx = null;
            juj a2 = cbi.q().a((bsz) null, 3);
            if (a2 != null) {
                try {
                    jxx = (jxx) aucj.a((aucj) jxx.b, a2.c(), aubs.c());
                } catch (auda e) {
                    anih anih = (anih) bxk.a.b();
                    anih.a((Throwable) e);
                    ((anih) anih.a("bsx", "d", 155, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AccountManager] Bad proto");
                }
                if (jxx != null) {
                    aucx aucx = jxx.a;
                    int size = aucx.size();
                    for (int i = 0; i < size; i++) {
                        this.a.add(b(((jxw) aucx.get(i)).b));
                    }
                }
            }
        }
    }

    public final Set a() {
        c();
        return (Set) this.a.clone();
    }

    public final boolean b() {
        Set<bsz> a2 = a();
        if (!a2.isEmpty()) {
            jtm jtm = new jtm();
            jtm.a(-1);
            jtm.b(1);
            jtn a3 = jtm.a();
            cjd p = cbi.p();
            for (bsz bsz : a2) {
                cjb a4 = p.a((ContextDataFilterImpl) a3, cbi.a(bsz, "AccountManager"));
                if (a4.a != 0) {
                    ((anih) ((anih) bxk.a.c()).a("bsx", "b", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[AccountManager] Can't read store: %s, %s", (Object) bsz, a4.a);
                } else {
                    ArrayList arrayList = a4.b;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void a(bsz bsz) {
        c();
        if (!this.a.contains(bsz)) {
            this.a.add(bsz);
            e();
        }
    }

    public final boolean b(bsz bsz) {
        return jgu.a(this.b, bsz.a());
    }

    public final void c(bsz bsz) {
        c();
        if (this.a.remove(bsz)) {
            e();
        }
    }
}
