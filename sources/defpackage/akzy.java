package defpackage;

import com.google.android.gms.location.places.personalized.AliasedPlace;
import com.google.android.gms.location.places.personalized.AliasedPlacesResult;
import java.util.List;

/* renamed from: akzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akzy extends akzo {
    final /* synthetic */ akzz a;
    private final String b;
    private final String c;

    public akzy(akzz akzz, String str, String str2) {
        this.a = akzz;
        this.b = str;
        this.c = str2;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(icl icl) {
        AliasedPlacesResult aliasedPlacesResult = (AliasedPlacesResult) icl;
        if (this.a.f == null) {
            return;
        }
        if (aliasedPlacesResult.a.c()) {
            List list = aliasedPlacesResult.b;
            if (list != null) {
                String str = (String) ((AliasedPlace) list.get(0)).b.get(0);
                this.a.f.a(((AliasedPlace) aliasedPlacesResult.b.get(0)).a);
                return;
            }
            this.a.f.a((String) null);
            return;
        }
        this.a.f.a(this.b, this.c);
    }
}
