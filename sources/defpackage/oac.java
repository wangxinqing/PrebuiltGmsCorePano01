package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: oac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oac implements View.OnClickListener {
    private final HelpChimeraActivity a;
    private final oab b;
    private final int c;
    private final String d;
    private final int e;

    public oac(HelpChimeraActivity helpChimeraActivity, oab oab, int i, int i2, String str) {
        this.a = helpChimeraActivity;
        this.b = oab;
        this.c = i;
        this.e = i2;
        this.d = str == null ? "" : str;
    }

    private final nzv c() {
        return nzv.a(this.b, this.e, this.c, this.d, -1.0f);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ooe.a(this.a, this.b, this.e, this.c, this.d);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        okg.a((nzu) this.a, this.e, this.b.e, this.c, this.d);
    }

    public void onClick(View view) {
        if (!axoo.a.a().a()) {
            this.a.m();
        }
        if (!axol.a.a().a()) {
            this.a.findViewById(R.id.gh_search_box).setVisibility(8);
        }
        if (ofq.a(axor.b())) {
            this.a.s.i.clearFocus();
            oay.a(view);
        }
        if (this.b.e() || this.b.k() || this.b.q()) {
            b();
            a();
        } else if (this.b.f()) {
            b();
            a();
        } else if (this.b.j()) {
            b();
            this.a.a(this.b, c(), false);
        } else if (this.b.l()) {
            b();
            this.a.a(this.b, c(), false);
        } else if (this.b.h()) {
            b();
            this.a.a((oab) null, c(), false);
        } else if (this.b.m()) {
            oad.a(new oah(this.a), this.b, this.c, this.e, this.d);
        } else if (this.b.n()) {
            b();
            oad.a(new oho(), this.b, this.a);
        } else if (!this.b.o()) {
            String valueOf = String.valueOf(this.b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 66);
            sb.append("Unsupported help content clicked on; doing nothing. HelpResponse: ");
            sb.append(valueOf);
            Log.w("gH_HelpRespClkListener", sb.toString());
        } else {
            b();
            oad.a(this.b, this.a);
        }
    }
}
