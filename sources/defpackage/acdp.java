package defpackage;

import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.ui.TargetChimeraActivity;

/* renamed from: acdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acdp implements jje {
    final /* synthetic */ Bundle a;
    final /* synthetic */ boolean b;
    final /* synthetic */ BootstrapCompletionResult c;

    public acdp(Bundle bundle, boolean z, BootstrapCompletionResult bootstrapCompletionResult) {
        this.a = bundle;
        this.b = z;
        this.c = bootstrapCompletionResult;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((TargetChimeraActivity) obj).a(this.a, this.b, this.c);
        return null;
    }
}
