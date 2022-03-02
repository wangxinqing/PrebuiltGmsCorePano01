package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: omf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omf {
    public final String a;
    public final Map b;
    public final int c;

    public omf(String str, Map map, int i) {
        this.a = str;
        this.b = map;
        this.c = i;
    }

    public static omf a(int i, Context context) {
        return a(i, context.getString(R.string.gh_network_request_failed));
    }

    public static omf b(int i, Context context) {
        return a(i, context.getString(R.string.gh_no_results_found));
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((oab) entry.getValue()).e() || ((oab) entry.getValue()).k() || ((oab) entry.getValue()).q()) {
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }

    public final boolean d() {
        return ((oab) this.b.get(this.a)).j && this.b.size() == 2;
    }

    public final boolean e() {
        return ((oab) this.b.get(this.a)).g();
    }

    /* access modifiers changed from: package-private */
    public final List b() {
        return ((oab) this.b.get(this.a)).s;
    }

    public static omf a(int i, String str) {
        oab a2 = oab.a("notification_root", "");
        oab a3 = oab.a(str);
        a2.a(a3);
        nz nzVar = new nz();
        nzVar.put(a2.b, a2);
        nzVar.put(a3.b, a3);
        return new omf(a2.b, nzVar, i);
    }

    public static omf a(List list) {
        oab a2 = oab.a("offline_suggestions", false);
        nz nzVar = new nz();
        nzVar.put(a2.b, a2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oab oab = (oab) it.next();
            a2.a(oab);
            nzVar.put(oab.b, oab);
        }
        return new omf(a2.b, nzVar, 16);
    }

    public final int a() {
        return b().size();
    }

    public final List a(Context context, oaf oaf) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a(); i++) {
            oab a2 = a(i);
            if (a2 != null && oaf.a(a2)) {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(oab.a(context.getString(R.string.gh_no_results_found)));
        }
        return arrayList;
    }

    public final oab a(int i) {
        return (oab) this.b.get((String) b().get(i));
    }

    public final void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            oab oab = (oab) this.b.get(entry.getKey());
            if (oab != null) {
                oab oab2 = (oab) entry.getValue();
                if (TextUtils.equals(oab.b, oab2.b)) {
                    oab.l = oab2.l;
                    oab.m = oab2.m;
                    boolean z = true;
                    if (oab.c == 0) {
                        if (!oab.s.equals(oab2.s) || oab.j != oab2.j) {
                            z = false;
                        }
                    } else if (!TextUtils.equals(oab.d, oab2.d) || !TextUtils.equals(oab.e, oab2.e) || !TextUtils.equals(oab.f, oab2.f) || !TextUtils.equals(oab.g, oab2.g) || !ius.a(oab.h, oab2.h) || !ius.a(oab.i, oab2.i)) {
                        z = false;
                    }
                    oab.r = z;
                }
            }
        }
    }
}
