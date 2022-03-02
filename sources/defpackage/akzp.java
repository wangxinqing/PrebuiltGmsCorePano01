package defpackage;

import com.google.android.gms.location.places.personalized.AliasedPlacesResult;

/* renamed from: akzp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akzp extends akzo {
    final /* synthetic */ akzz a;

    public akzp(akzz akzz) {
        this.a = akzz;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void b(icl icl) {
        AliasedPlacesResult aliasedPlacesResult = (AliasedPlacesResult) icl;
        if (this.a.f == null) {
            return;
        }
        if (aliasedPlacesResult.a.c()) {
            this.a.f.c();
        } else {
            this.a.f.b();
        }
    }
}
