package defpackage;

import android.content.Context;

/* renamed from: pfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pfq implements awdt {
    private final bapu a;

    public pfq(bapu bapu) {
        this.a = bapu;
    }

    /* renamed from: b */
    public final aalw a() {
        aafj aafj = new aafj();
        aafj.a = "AppsUploadModule";
        aalw a2 = aafi.a((Context) this.a.a(), aafj.a());
        awdx.a((Object) a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
