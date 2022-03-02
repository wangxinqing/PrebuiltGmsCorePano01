package defpackage;

import android.content.Context;
import com.google.firebase.auth.api.model.GetTokenResponse;

/* renamed from: apsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apsd implements apts {
    final /* synthetic */ apvm a;
    final /* synthetic */ Context b;
    final /* synthetic */ aptg c;
    final /* synthetic */ apte d;

    public apsd(apte apte, apvm apvm, Context context, aptg aptg) {
        this.d = apte;
        this.a = apvm;
        this.b = context;
        this.c = aptg;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apvm apvm = this.a;
        apvm.g = ((GetTokenResponse) obj).b;
        this.d.b.a(this.b, apvm, (apts) new apsc(this, this));
    }

    public final void a(String str) {
        this.c.a(apvs.a(str));
    }
}
