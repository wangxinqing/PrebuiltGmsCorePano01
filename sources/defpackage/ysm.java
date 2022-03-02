package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ysm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ysm extends ysn implements ica, icb, wln, ysq {
    private static int x = -1;
    private static int y = -1;
    public final Context a;
    public ysr b;
    public icc c;
    public icc d;
    public AudienceMember e;
    public String[] f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public String m;
    public String n;
    public int o;
    public boolean p;
    public int q;
    private String w;

    public ysm(Context context, Context context2, AttributeSet attributeSet) {
        super(context, context2, attributeSet);
        this.a = context;
        if (x == -1) {
            x = context2.getResources().getColor(R.color.plus_add_to_circles_header_text_white);
            y = context2.getResources().getColor(R.color.plus_add_to_circles_header_red);
        }
        a();
        e();
    }

    private final void e() {
        b(4);
        b(false);
    }

    private final void f() {
        wlb wlb = new wlb();
        wlb.b = Arrays.asList(new String[]{this.e.e});
        ibq ibq = wlt.a;
        xco.a(this.c, this.h, this.i, wlb).a((icm) new ysk(this));
        wkx wkx = new wkx();
        wkx.b = this.w;
        xco.a(this.c, this.h, this.i, wkx).a((icm) new ysl(this));
    }

    public final void a(int i2) {
    }

    public final void a(ConnectionResult connectionResult) {
    }

    public final void b() {
        f();
    }

    public final void c() {
        icc icc = this.c;
        if (icc == null || !icc.i() || this.e == null) {
            e();
            return;
        }
        ibq ibq = wlt.a;
        xdp.a(this.c, this, this.h, this.i, 6);
        f();
    }

    public final void d() {
        int length;
        String str;
        if (this.k && this.l) {
            ysr ysr = this.b;
            if (ysr.a) {
                String[] strArr = this.f;
                if (strArr == null || (length = strArr.length) == 0) {
                    a((String) null);
                } else {
                    if (length != 1) {
                        str = this.r.getString(R.string.circle_button_circles, new Object[]{Integer.valueOf(length)});
                    } else {
                        str = ysr.a(strArr[0]);
                    }
                    a(str);
                }
                b(0);
                b(true);
                ArrayList arrayList = new ArrayList();
                String[] strArr2 = this.f;
                if (strArr2 != null && (r2 = strArr2.length) > 0) {
                    for (String str2 : strArr2) {
                        arrayList.add(AudienceMember.b(str2, this.b.a(str2)));
                    }
                }
                if (arrayList.size() <= 0 && this.g != null && this.s == 2) {
                    iie iie = new iie(this.h, this.m);
                    iie.a.putExtra("EXTRA_PLUS_PAGE_ID", this.i);
                    iie.a.putExtra("EXTRA_TARGET_CIRCLE_ID", this.g);
                    iie.a.putExtra("EXTRA_UPDATE_PERSON", this.e);
                    iie.a.putExtra("EXTRA_START_VIEW_NAMESPACE", this.n);
                    iie.a.putExtra("EXTRA_START_VIEW_TYPE_NUM", this.o);
                    setTag(iie.a);
                    return;
                }
                iia iia = new iia("com.google.android.gms.common.acl.UPDATE_CIRCLES");
                iia.a(this.h);
                iia.c(this.i);
                iia.b((List) arrayList);
                iia.a(this.e);
                iia.a.putExtra("com.google.android.gms.common.acl.EXTRA_HEADER_TEXT_COLOR", x);
                iia.a.putExtra("com.google.android.gms.common.acl.EXTRA_HEADER_BACKGROUND_COLOR", y);
                iia.d(this.m);
                setTag(iia.a);
            }
        }
    }

    public final void g(Bundle bundle) {
        this.b.a();
        c();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = true;
        icc icc = this.c;
        if (icc != null) {
            icc.e();
        }
        icc icc2 = this.d;
        if (icc2 != null) {
            icc2.e();
        }
    }

    public void onClick(View view) {
        super.onClick(view);
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 > 0 && this.d != null) {
            FavaDiagnosticsEntity favaDiagnosticsEntity = new FavaDiagnosticsEntity(this.n, this.o);
            while (this.q > 0) {
                ibq ibq = ykq.a;
                ywk.a(this.d, this.i, ylp.h, favaDiagnosticsEntity);
                this.q--;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        icc icc = this.c;
        if (icc != null) {
            icc.g();
        }
        icc icc2 = this.d;
        if (icc2 != null) {
            icc2.g();
        }
        this.j = false;
        super.onDetachedFromWindow();
    }

    private final void a(String str) {
        super.a(str, true);
        a(false);
    }

    public final void a() {
        this.k = false;
        this.l = false;
        this.g = null;
        this.w = this.r.getString(R.string.circle_button_following_circle);
        this.f = null;
        this.b = null;
        this.v = null;
    }

    public final void a(boolean z) {
        if (this.u != z) {
            this.u = z;
            if (!z) {
                ProgressBar progressBar = this.t;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
            } else {
                if (this.t == null) {
                    this.t = new ProgressBar(getContext());
                    this.t.setIndeterminate(true);
                    addView(this.t);
                }
                this.t.setVisibility(0);
            }
            invalidate();
            b(!z);
        }
    }
}
