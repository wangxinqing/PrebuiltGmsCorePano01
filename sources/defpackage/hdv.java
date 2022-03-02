package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.chimera.ContextThemeWrapper;

/* renamed from: hdv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hdv extends ContextThemeWrapper {
    final /* synthetic */ hdx a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hdv(hdx hdx, Context context) {
        super(context);
        this.a = hdx;
    }

    public final Resources getResources() {
        return this.a.getResources();
    }
}
