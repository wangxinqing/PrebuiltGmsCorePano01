package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: omb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class omb extends nzj {
    public omf e;
    private final Context f;
    private final HelpConfig g;
    private final ofn h;
    private final String i;

    public omb(nzu nzu, oat oat, String str) {
        super(oat);
        this.f = (Context) nzu;
        this.g = nzu.f();
        this.h = nzu.i();
        this.i = str;
    }

    public final boolean b() {
        return !TextUtils.isEmpty(this.i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        HelpChimeraActivity helpChimeraActivity = (HelpChimeraActivity) this.f;
        omf a = omg.a(helpChimeraActivity.getApplicationContext(), this.g, helpChimeraActivity.d, ((HelpChimeraActivity) this.f).y, this.i);
        if (!a.e()) {
            a.a(this.h.a(a.c(), this.g.b));
        }
        this.e = a;
        return a;
    }
}
