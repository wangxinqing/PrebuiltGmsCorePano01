package defpackage;

import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: akzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akzx extends akzo {
    final /* synthetic */ akzz a;
    private final String b;

    public akzx(akzz akzz, String str) {
        this.a = akzz;
        this.b = str;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(icl icl) {
        rhr rhr = (rhr) icl;
        if (this.a.d == null) {
            return;
        }
        if (!rhr.b.c()) {
            akzw akzw = this.a.d;
            String str = this.b;
            Fragment fragment = (Fragment) akzw;
            if (fragment.isVisible()) {
                alal alal = (alal) akzw;
                alal.a.setVisibility(8);
                alal.g();
                alal.a((int) R.layout.places_ui_search_failed, fragment.getString(R.string.common_retry), (Runnable) new alad(alal, str));
                return;
            }
            return;
        }
        this.a.p = akzz.b(rhr);
        akzw akzw2 = this.a.d;
        String str2 = this.b;
        rhq[] a2 = akzz.a(rhr);
        Fragment fragment2 = (Fragment) akzw2;
        if (fragment2.isVisible()) {
            alal alal2 = (alal) akzw2;
            alal2.a.setVisibility(8);
            if (a2.length == 0) {
                alal2.g();
                alal2.a((int) R.layout.places_ui_search_no_matching_places, fragment2.getString(R.string.common_retry), (Runnable) new alac(alal2, str2));
                return;
            }
            alai alai = alal2.e;
            if (alai != null) {
                alai.b(a2);
            }
        }
    }
}
