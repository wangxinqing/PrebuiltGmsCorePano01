package defpackage;

import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.concurrent.TimeUnit;

/* renamed from: akzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akzm extends akzo {
    final /* synthetic */ akzz a;

    public akzm(akzz akzz) {
        this.a = akzz;
    }

    public final /* bridge */ /* synthetic */ void b(icl icl) {
        AliasedPlacesResult aliasedPlacesResult = (AliasedPlacesResult) icl;
        if (this.a.g == null) {
            return;
        }
        if (!aliasedPlacesResult.a.c()) {
            this.a.g.d();
            return;
        }
        nz nzVar = new nz(2);
        for (AliasedPlace aliasedPlace : aliasedPlacesResult.b) {
            for (String put : aliasedPlace.b) {
                nzVar.put(put, aliasedPlace.a);
            }
        }
        if (nzVar.h != 0) {
            akzz akzz = this.a;
            ibq ibq = rij.a;
            akzz.o = rjl.a(akzz.a, (String[]) nzVar.values().toArray(new String[nzVar.h]));
            akzz akzz2 = this.a;
            akzz2.o.a(new akzl(akzz2, nzVar), azcc.d(), TimeUnit.MILLISECONDS);
            return;
        }
        this.a.g.a(new nz());
    }
}
