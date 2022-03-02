package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: oit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oit extends jfx {
    final /* synthetic */ ErrorReport a;
    final /* synthetic */ Context e;
    final /* synthetic */ boolean f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oit(ErrorReport errorReport, Context context, boolean z) {
        super(10);
        this.a = errorReport;
        this.e = context;
        this.f = z;
    }

    public final void run() {
        if (!TextUtils.isEmpty(this.a.T)) {
            ofx.a(this.e.getCacheDir(), this.a.T, ".bmp");
        }
        if (this.f) {
            for (String a2 : this.a.V) {
                ofx.a(this.e.getCacheDir(), a2, ".txt");
            }
        }
    }
}
