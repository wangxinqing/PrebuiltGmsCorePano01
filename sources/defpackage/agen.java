package defpackage;

import android.content.SharedPreferences;

/* renamed from: agen  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agen implements awdt {
    private final bapu a;

    public agen(bapu bapu) {
        this.a = bapu;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        SharedPreferences sharedPreferences = (SharedPreferences) ((amsv) ((awdu) this.a).a).a();
        awdx.a((Object) sharedPreferences, "Cannot return null from a non-@Nullable @Provides method");
        return sharedPreferences;
    }
}
