package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;

/* renamed from: ajvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajvf extends ajvv {
    public DateSelector a;
    public CalendarConstraints b;
    public Month c;
    public ajus d;
    public RecyclerView e;
    public RecyclerView f;
    public View g;
    public int h;
    private int j;
    private View k;

    static int a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    private final void d(int i) {
        this.f.post(new ajuv(this, i));
    }

    /* access modifiers changed from: package-private */
    public final void c(int i) {
        this.h = i;
        if (i == 2) {
            this.e.getLayoutManager().d(((ajwc) this.e.getAdapter()).f(this.c.d));
            this.k.setVisibility(0);
            this.g.setVisibility(8);
            return;
        }
        this.k.setVisibility(8);
        this.g.setVisibility(0);
        a(this.c);
    }

    /* access modifiers changed from: package-private */
    public final abk j() {
        return (abk) this.f.getLayoutManager();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.j = bundle.getInt("THEME_RES_ID_KEY");
        this.a = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.b = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.c = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0131, code lost:
        r9 = new defpackage.acw((byte[]) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            android.view.ContextThemeWrapper r9 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r6.getContext()
            int r1 = r6.j
            r9.<init>(r0, r1)
            ajus r0 = new ajus
            r0.<init>(r9)
            r6.d = r0
            android.view.LayoutInflater r7 = r7.cloneInContext(r9)
            com.google.android.material.datepicker.CalendarConstraints r0 = r6.b
            com.google.android.material.datepicker.Month r0 = r0.a
            boolean r1 = defpackage.ajvl.a((android.content.Context) r9)
            if (r1 != 0) goto L_0x0024
            r2 = 2131624618(0x7f0e02aa, float:1.887642E38)
            goto L_0x0027
        L_0x0024:
            r2 = 2131624623(0x7f0e02af, float:1.887643E38)
        L_0x0027:
            r3 = 0
            android.view.View r7 = r7.inflate(r2, r8, r3)
            r8 = 2131428980(0x7f0b0674, float:1.847962E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.GridView r8 = (android.widget.GridView) r8
            ajuw r2 = new ajuw
            r2.<init>()
            defpackage.qb.a((android.view.View) r8, (defpackage.oz) r2)
            ajuu r2 = new ajuu
            r2.<init>()
            r8.setAdapter(r2)
            int r0 = r0.e
            r8.setNumColumns(r0)
            r8.setEnabled(r3)
            r8 = 2131428983(0x7f0b0677, float:1.8479626E38)
            android.view.View r8 = r7.findViewById(r8)
            android.support.v7.widget.RecyclerView r8 = (android.support.v7.widget.RecyclerView) r8
            r6.f = r8
            ajux r8 = new ajux
            r8.<init>(r6, r1, r1)
            android.support.v7.widget.RecyclerView r0 = r6.f
            r0.setLayoutManager(r8)
            android.support.v7.widget.RecyclerView r8 = r6.f
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r8.setTag(r0)
            ajvt r8 = new ajvt
            com.google.android.material.datepicker.DateSelector r0 = r6.a
            com.google.android.material.datepicker.CalendarConstraints r1 = r6.b
            ajuy r2 = new ajuy
            r2.<init>(r6)
            r8.<init>(r9, r0, r1, r2)
            android.support.v7.widget.RecyclerView r0 = r6.f
            r0.setAdapter(r8)
            android.content.res.Resources r0 = r9.getResources()
            r1 = 2131492958(0x7f0c005e, float:1.8609383E38)
            int r0 = r0.getInteger(r1)
            r1 = 2131428986(0x7f0b067a, float:1.8479632E38)
            android.view.View r2 = r7.findViewById(r1)
            android.support.v7.widget.RecyclerView r2 = (android.support.v7.widget.RecyclerView) r2
            r6.e = r2
            r3 = 1
            if (r2 == 0) goto L_0x00b7
            r2.setHasFixedSize(r3)
            android.support.v7.widget.RecyclerView r2 = r6.e
            abd r4 = new abd
            r4.<init>(r0)
            r2.setLayoutManager(r4)
            android.support.v7.widget.RecyclerView r0 = r6.e
            ajwc r2 = new ajwc
            r2.<init>(r6)
            r0.setAdapter(r2)
            android.support.v7.widget.RecyclerView r0 = r6.e
            ajuz r2 = new ajuz
            r2.<init>(r6)
            r0.addItemDecoration(r2)
        L_0x00b7:
            r0 = 2131428919(0x7f0b0637, float:1.8479496E38)
            android.view.View r2 = r7.findViewById(r0)
            if (r2 == 0) goto L_0x012b
            android.view.View r0 = r7.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r2 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r2)
            ajva r2 = new ajva
            r2.<init>(r6)
            defpackage.qb.a((android.view.View) r0, (defpackage.oz) r2)
            r2 = 2131428921(0x7f0b0639, float:1.84795E38)
            android.view.View r2 = r7.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            java.lang.String r4 = "NAVIGATION_PREV_TAG"
            r2.setTag(r4)
            r4 = 2131428920(0x7f0b0638, float:1.8479498E38)
            android.view.View r4 = r7.findViewById(r4)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            java.lang.String r5 = "NAVIGATION_NEXT_TAG"
            r4.setTag(r5)
            android.view.View r1 = r7.findViewById(r1)
            r6.k = r1
            r1 = 2131428979(0x7f0b0673, float:1.8479618E38)
            android.view.View r1 = r7.findViewById(r1)
            r6.g = r1
            r6.c(r3)
            com.google.android.material.datepicker.Month r1 = r6.c
            java.lang.String r1 = r1.b
            r0.setText(r1)
            android.support.v7.widget.RecyclerView r1 = r6.f
            ajvb r3 = new ajvb
            r3.<init>(r6, r8, r0)
            r1.addOnScrollListener(r3)
            ajvc r1 = new ajvc
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            ajvd r0 = new ajvd
            r0.<init>(r6, r8)
            r4.setOnClickListener(r0)
            ajve r0 = new ajve
            r0.<init>(r6, r8)
            r2.setOnClickListener(r0)
        L_0x012b:
            boolean r9 = defpackage.ajvl.a((android.content.Context) r9)
            if (r9 != 0) goto L_0x0180
            acw r9 = new acw
            r0 = 0
            r9.<init>(r0)
            android.support.v7.widget.RecyclerView r1 = r6.f
            android.support.v7.widget.RecyclerView r2 = r9.a
            if (r2 != r1) goto L_0x013e
            goto L_0x0180
        L_0x013e:
            if (r2 == 0) goto L_0x014a
            acy r3 = r9.c
            r2.removeOnScrollListener(r3)
            android.support.v7.widget.RecyclerView r2 = r9.a
            r2.setOnFlingListener(r0)
        L_0x014a:
            r9.a = r1
            android.support.v7.widget.RecyclerView r0 = r9.a
            if (r0 == 0) goto L_0x0180
            acw r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L_0x0178
            android.support.v7.widget.RecyclerView r0 = r9.a
            acy r1 = r9.c
            r0.addOnScrollListener(r1)
            android.support.v7.widget.RecyclerView r0 = r9.a
            r0.setOnFlingListener(r9)
            android.widget.Scroller r0 = new android.widget.Scroller
            android.support.v7.widget.RecyclerView r1 = r9.a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r0.<init>(r1, r2)
            r9.b = r0
            r9.a()
            goto L_0x0180
        L_0x0178:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "An instance of OnFlingListener already set."
            r7.<init>(r8)
            throw r7
        L_0x0180:
            android.support.v7.widget.RecyclerView r9 = r6.f
            com.google.android.material.datepicker.Month r0 = r6.c
            int r8 = r8.a(r0)
            r9.scrollToPosition(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajvf.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.j);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c);
    }

    /* access modifiers changed from: package-private */
    public final void a(Month month) {
        ajvt ajvt = (ajvt) this.f.getAdapter();
        int a2 = ajvt.a(month);
        int a3 = a2 - ajvt.a(this.c);
        int abs = Math.abs(a3);
        this.c = month;
        if (abs <= 3) {
            d(a2);
        } else if (a3 > 0) {
            this.f.scrollToPosition(a2 - 3);
            d(a2);
        } else {
            this.f.scrollToPosition(a2 + 3);
            d(a2);
        }
    }
}
