package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.chimera.ContextThemeWrapper;

/* renamed from: hdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hdp extends ContextThemeWrapper {
    final /* synthetic */ hdr a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hdp(hdr hdr, Context context) {
        super(context);
        this.a = hdr;
    }

    public final Resources getResources() {
        return this.a.getResources();
    }
}
