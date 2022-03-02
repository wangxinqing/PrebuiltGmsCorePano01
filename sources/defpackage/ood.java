package defpackage;

import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Map;

/* renamed from: ood  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ood extends nzj {
    private final HelpChimeraActivity e;
    private final HelpConfig f;
    private final okc g;

    public ood(HelpChimeraActivity helpChimeraActivity) {
        super(helpChimeraActivity);
        this.e = helpChimeraActivity;
        this.f = helpChimeraActivity.x;
        this.g = helpChimeraActivity.y;
    }

    static String a(olm olm) {
        int i = olm.a;
        if (i != 1) {
            return i == 2 ? String.valueOf(((Boolean) olm.b).booleanValue()) : "";
        }
        return (String) olm.b;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str;
        nzh nzh;
        nzh nzh2;
        oln oln = (oln) obj;
        if (oln == null) {
            this.e.I();
            return;
        }
        if (axqq.b() && !TextUtils.isEmpty(this.f.L)) {
            str = this.f.L;
        } else {
            str = this.f.b;
        }
        Map b = nzh.b();
        oll a = oaq.a(String.format("%s:%s", new Object[]{nzh.d.u.b, str}));
        nz nzVar = new nz(oln.b.size() + oln.c.size() + 2);
        nzVar.put(nzh.b, Integer.toString(oln.a));
        nzVar.put(nzh.c, oln.d);
        aucx aucx = oln.b;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            olk olk = (olk) aucx.get(i);
            oll oll = olk.a;
            if (oll == null) {
                oll = oll.d;
            }
            if (!nzh.a(oll, a)) {
                oll oll2 = olk.a;
                if (oll2 == null) {
                    oll2 = oll.d;
                }
                nzh2 = (nzh) b.get(new nzg(oll2));
            } else {
                nzh2 = nzh.d;
            }
            if (nzh2 != null) {
                olm olm = olk.b;
                if (olm == null) {
                    olm = olm.c;
                }
                nzVar.put(nzh2, a(olm));
            }
        }
        aucx aucx2 = oln.c;
        int size2 = aucx2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            olk olk2 = (olk) aucx2.get(i2);
            oll oll3 = olk2.a;
            if (oll3 == null) {
                oll3 = oll.d;
            }
            if (nzh.a(oll3, a)) {
                nzh = nzh.d;
            } else {
                oll oll4 = olk2.a;
                if (oll4 == null) {
                    oll4 = oll.d;
                }
                nzh = nzh.a(oll4.b);
            }
            if (nzh != null) {
                olm olm2 = olk2.b;
                if (olm2 == null) {
                    olm2 = olm.c;
                }
                nzVar.put(nzh, a(olm2));
            }
        }
        nzh[] a2 = nzh.a();
        for (int i3 = 0; i3 < 9; i3++) {
            String str2 = (String) nzVar.get(a2[i3]);
            if (!TextUtils.isEmpty(str2)) {
                nzVar.put(a2[i3], oau.a(str2));
            }
        }
        nzp a3 = new nzr(this.e, this.f).a();
        a3.b(this.f.M);
        a3.a((Map) nzVar);
        a3.a();
        this.f.M = nzVar;
        this.e.I();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (jkf.a(this.e)) {
            return omo.a(this.e.getApplicationContext(), this.f, this.e.d, this.g);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.e.c((nzj) this);
    }
}
