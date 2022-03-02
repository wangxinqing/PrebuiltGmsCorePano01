package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;

/* renamed from: zlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zlk extends yod implements Filterable, yoc {
    public final Context F;
    public final String G;
    public final String H;
    public String I;
    public yrj J;
    public yrl K;
    public yrg L;
    private final LoaderManager Q;
    private Filter R;
    private final zli S = new zli(this);
    private final zlj T = new zlj(this);
    private final zlh U = new zlh(this);

    public zlk(Context context, LoaderManager loaderManager, String str, String str2, String str3, String str4, yqd yqd) {
        super(context, yqd, str3, str4);
        this.b = this;
        this.F = context;
        this.Q = loaderManager;
        this.G = str;
        this.H = str2;
    }

    /* access modifiers changed from: protected */
    public final AudienceSelectionListPersonView a(Object obj, String str, String str2, String str3, String str4, String str5, boolean z, int i, View view, boolean z2, boolean z3, boolean z4) {
        AudienceSelectionListPersonView a = super.a(obj, str, str2, str3, str4, str5, z, i, view, z2, z3, z4);
        a.a(false);
        return a;
    }

    public final void b() {
        this.K.a(this.I);
    }

    public final void e() {
        super.e();
        this.J = (yrj) this.Q.initLoader(1, (Bundle) null, this.S);
        this.K = (yrl) this.Q.initLoader(2, (Bundle) null, this.T);
        this.L = (yrg) this.Q.initLoader(3, (Bundle) null, this.U);
    }

    public final void f() {
        this.Q.destroyLoader(1);
        this.Q.destroyLoader(2);
        this.Q.destroyLoader(3);
        super.f();
    }

    public final Filter getFilter() {
        if (this.R == null) {
            this.R = new zlg(this);
        }
        return this.R;
    }
}
