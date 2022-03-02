package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: ofi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ofi extends AsyncTask {
    final /* synthetic */ old a;
    final /* synthetic */ Context b;
    final /* synthetic */ HelpConfig c;
    final /* synthetic */ okc d;

    public ofi(old old, Context context, HelpConfig helpConfig, okc okc) {
        this.a = old;
        this.b = context;
        this.c = helpConfig;
        this.d = okc;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ofj.a(this.a, 50, this.b, this.c, this.d);
        return null;
    }
}
