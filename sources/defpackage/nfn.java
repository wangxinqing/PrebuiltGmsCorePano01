package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: nfn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfn implements Callable {
    final /* synthetic */ SharedPreferences a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public nfn(SharedPreferences sharedPreferences, String str, String str2) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        return this.a.getString(this.b, this.c);
    }
}
