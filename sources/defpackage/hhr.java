package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.debug.ModuleSetJournalUpdate$ModuleSetJournalIntentOperation;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: hhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hhr {
    private boolean a = false;
    private final ou b = new ou();

    public static String a(hhp hhp) {
        return a(hhp.b, hhp.c);
    }

    public final void b() {
        this.a = true;
    }

    private static String a(String str, long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append(str);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    public static void a(aucd aucd) {
        if (((hhp) aucd.b).d.size() > 10) {
            List unmodifiableList = Collections.unmodifiableList(((hhp) aucd.b).d);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            hhp hhp = hhp.f;
            ((hhp) aucd.b).d = aucj.s();
            aucd.F(unmodifiableList.subList(0, 10));
        }
    }

    public final void a(Context context) {
        byte[] a2 = a();
        boolean z = this.a;
        Intent startIntent = IntentOperation.getStartIntent(context, ModuleSetJournalUpdate$ModuleSetJournalIntentOperation.class, "com.google.android.gms.chimera.debug.WRITE_JOURNAL_UPDATE_ACTION");
        if (startIntent != null) {
            startIntent.putExtra("entries", a2);
            startIntent.putExtra("isComprehensive", z ? 1 : 0);
        } else {
            startIntent = null;
        }
        if (startIntent != null) {
            context.startService(startIntent);
        }
    }

    public final void a(ansk ansk, int i) {
        a(ansk.b, ansk.e, i);
    }

    public final void a(hfg hfg) {
        aucx aucx = hfg.a;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            ansk ansk = (ansk) aucx.get(i);
            int a2 = this.b.a((Object) a(ansk.b, ansk.e));
            if (a2 >= 0) {
                this.b.d(a2);
            }
        }
    }

    public final void a(hfg hfg, int i) {
        if (hfg != null) {
            a((List) hfg.a, i);
        }
    }

    public final void a(String str, long j, int i) {
        aucd o = hhp.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        hhp hhp = (hhp) o.b;
        str.getClass();
        int i2 = hhp.a | 1;
        hhp.a = i2;
        hhp.b = str;
        hhp.a = i2 | 2;
        hhp.c = j;
        long longValue = Long.valueOf(System.currentTimeMillis()).longValue();
        if (o.c) {
            o.c();
            o.c = false;
        }
        hhp hhp2 = (hhp) o.b;
        hhp2.a |= 4;
        hhp2.e = longValue;
        aucd o2 = hho.c.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        hho hho = (hho) o2.b;
        hho.b = i - 1;
        hho.a |= 1;
        if (o.c) {
            o.c();
            o.c = false;
        }
        hhp hhp3 = (hhp) o.b;
        hho hho2 = (hho) o2.i();
        hho2.getClass();
        hhp3.a();
        hhp3.d.add(hho2);
        String a2 = a(str, j);
        int a3 = this.b.a((Object) a2);
        if (a3 >= 0) {
            o.F(((hhp) this.b.c(a3)).d);
        }
        a(o);
        this.b.put(a2, (hhp) o.i());
    }

    public final void a(List list, int i) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a((ansk) it.next(), i);
            }
        }
    }

    public final byte[] a() {
        aucd o = hhl.b.o();
        int i = 0;
        while (true) {
            ou ouVar = this.b;
            if (i >= ouVar.h) {
                return ((hhl) o.i()).k();
            }
            hhp hhp = (hhp) ouVar.c(i);
            if (o.c) {
                o.c();
                o.c = false;
            }
            hhl hhl = (hhl) o.b;
            hhp.getClass();
            hhl.a();
            hhl.a.add(hhp);
            i++;
        }
    }
}
