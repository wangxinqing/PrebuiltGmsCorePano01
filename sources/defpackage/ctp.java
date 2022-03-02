package defpackage;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: ctp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ctp implements amsv {
    private final Context a;

    public ctp(Context context) {
        this.a = context;
    }

    public final Object a() {
        return new dje(ModuleManager.get(this.a));
    }
}
