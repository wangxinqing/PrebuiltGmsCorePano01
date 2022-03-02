package defpackage;

import android.widget.ArrayAdapter;
import com.google.android.chimera.Fragment;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.Collections;

/* renamed from: akzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akzn extends akzo {
    final /* synthetic */ akzz a;

    public akzn(akzz akzz) {
        this.a = akzz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(icl icl) {
        rhg rhg = (rhg) icl;
        if (this.a.d != null && rhg.aO().c()) {
            akzw akzw = this.a.d;
            int i = akzz.q;
            int a2 = rhg.a();
            AutocompletePredictionEntity[] autocompletePredictionEntityArr = new AutocompletePredictionEntity[a2];
            for (int i2 = 0; i2 < rhg.a(); i2++) {
                autocompletePredictionEntityArr[i2] = (AutocompletePredictionEntity) rhg.a(i2).r();
            }
            if (((Fragment) akzw).isVisible()) {
                alal alal = (alal) akzw;
                alal.c();
                if (alal.d instanceof ArrayAdapter) {
                    alal.c.clear();
                    Collections.addAll(alal.c, autocompletePredictionEntityArr);
                    ((ArrayAdapter) alal.d).notifyDataSetChanged();
                    if (a2 <= 0) {
                        alal.b.setVisibility(8);
                    } else {
                        alal.b.setVisibility(0);
                    }
                }
            }
        }
    }
}
