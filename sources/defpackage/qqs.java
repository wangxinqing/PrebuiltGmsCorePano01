package defpackage;

import android.content.SharedPreferences;

/* renamed from: qqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qqs implements awdt {
    private final bapu a;

    public qqs(bapu bapu) {
        this.a = bapu;
    }

    public static qqs a(bapu bapu) {
        return new qqs(bapu);
    }

    /* renamed from: b */
    public final SharedPreferences a() {
        SharedPreferences sharedPreferences = ((qqe) this.a).a().getSharedPreferences("MediastoreIndexerSharedPrefs", 0);
        awdx.a((Object) sharedPreferences, "Cannot return null from a non-@Nullable @Provides method");
        return sharedPreferences;
    }
}
