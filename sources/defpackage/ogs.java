package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.ContactOptionsContainer;
import com.google.android.gms.googlehelp.fragments.AccountPickerContainer;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import java.util.Calendar;
import java.util.List;

/* renamed from: ogs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ogs implements omd {
    public static final String a;
    public final HelpChimeraActivity b;
    public final HelpConfig c;
    public final View d;
    public AccountPickerContainer e;
    public View f;
    public ogk g;
    private View h;
    private MaterialCardView i;
    private MaterialCardView j;
    private ContactOptionsContainer k;
    private PopularArticlesContainer l;

    static {
        String valueOf = String.valueOf(ogk.class.getSimpleName());
        a = valueOf.length() == 0 ? new String("gH_HelpConsole-") : "gH_HelpConsole-".concat(valueOf);
    }

    public ogs(HelpChimeraActivity helpChimeraActivity) {
        this.b = helpChimeraActivity;
        this.c = helpChimeraActivity.x;
        this.d = helpChimeraActivity.findViewById(R.id.gh_help_console);
    }

    static final void a(HelpChimeraActivity helpChimeraActivity, int i2, List list) {
        okg.a((nzu) helpChimeraActivity, i2, list, "");
    }

    private final void i() {
        int i2;
        if (this.h == null) {
            HelpChimeraActivity helpChimeraActivity = this.b;
            if (!this.c.y()) {
                i2 = R.id.gh_bottom_need_more_help_options_view_stub;
            } else {
                i2 = R.id.gh_top_need_more_help_options_view_stub;
            }
            ViewStub viewStub = (ViewStub) helpChimeraActivity.findViewById(i2);
            if (viewStub != null) {
                this.h = viewStub.inflate();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        int i2;
        boolean z;
        ContactOptionsContainer h2 = h();
        LinearLayout linearLayout = (LinearLayout) h2.findViewById(R.id.gh_contact_option_container);
        h2.b = null;
        int i3 = 0;
        h2.d = false;
        h2.c = 0;
        linearLayout.removeAllViews();
        View view = new View(h2.getContext());
        linearLayout.addView(view);
        boolean z2 = false;
        boolean z3 = false;
        for (avmt a2 : h2.f.u()) {
            avmt a3 = obl.a(a2, h2.d, h2.f, h2.e);
            if (a3 != avmt.UNKNOWN_CONTACT_MODE) {
                avnm a4 = obl.a(a3, h2.f);
                int i4 = h2.c;
                h2.c = i4 + 1;
                avmt a5 = avmt.a(a4.b);
                if (a5 == null) {
                    a5 = avmt.UNKNOWN_CONTACT_MODE;
                }
                if (h2.c <= 3) {
                    aucd aucd = (aucd) a4.c(5);
                    aucd.a((aucj) a4);
                    if (a4.e || !h2.f.b(a5)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    avnm avnm = (avnm) aucd.b;
                    avnm avnm2 = avnm.f;
                    avnm.a |= 4;
                    avnm.e = z;
                    ocl ocl = new ocl((avnm) aucd.i(), linearLayout, R.layout.gh_contact_option, new obd(h2, a5, i4));
                    if (a5 == avmt.PHONE || a5 == avmt.C2C) {
                        h2.d = true;
                    } else if (a5 == avmt.CHAT) {
                        h2.b = ocl;
                    }
                    HelpChimeraActivity helpChimeraActivity = h2.e;
                    if (!helpChimeraActivity.x.z()) {
                        okg.a((nzu) helpChimeraActivity, 46, a5, i4);
                    }
                }
                z2 |= obl.a(a4);
                z3 = true;
            }
        }
        View view2 = new View(h2.getContext());
        linearLayout.addView(view2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, (3.0f - ((float) h2.c)) / 2.0f);
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams);
        MaterialButton materialButton = h2.g;
        if (!z2) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        materialButton.setVisibility(i2);
        if (!z3) {
            i3 = 8;
        }
        h2.setVisibility(i3);
    }

    public final void c() {
        int i2;
        if (axna.a.a().b()) {
            b();
        } else if (!this.c.E()) {
            b();
            ContactOptionsContainer contactOptionsContainer = (ContactOptionsContainer) this.b.findViewById(R.id.gh_contact_options_container);
            if ((contactOptionsContainer == null || contactOptionsContainer.getVisibility() != 0) && !TextUtils.isEmpty(this.c.G())) {
                d();
            }
        } else {
            if (!TextUtils.isEmpty(this.c.G())) {
                d();
            }
            if (!TextUtils.isEmpty(this.c.F()) && this.j == null) {
                i();
                View view = this.h;
                if (view == null) {
                    Log.e("gH_HelpConsole", "Error, could not inflate need more help options view.");
                } else {
                    this.j = oao.b(this.b, view, 195);
                }
            }
            HelpChimeraActivity helpChimeraActivity = this.b;
            if (!this.c.y()) {
                i2 = R.id.gh_bottom_feedback_view_stub;
            } else {
                i2 = R.id.gh_top_feedback_view_stub;
            }
            ViewStub viewStub = (ViewStub) helpChimeraActivity.findViewById(i2);
            if (viewStub != null) {
                ((LinearLayout) viewStub.inflate()).findViewById(R.id.gh_feedback_option).setOnClickListener(new ogp(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.i == null) {
            i();
            View view = this.h;
            if (view == null) {
                Log.e("gH_HelpConsole", "Error, could not inflate need more help options view.");
            } else {
                this.i = oao.a(this.b, view, 195);
            }
        }
    }

    public final void e() {
        f();
        c();
    }

    public final void f() {
        int i2;
        HelpChimeraActivity helpChimeraActivity = this.b;
        int i3 = ooe.e;
        HelpConfig helpConfig = helpChimeraActivity.x;
        oab a2 = oab.a(helpConfig.O, oal.a(), helpConfig);
        if (a2 != null) {
            int i4 = helpConfig.Y;
            int i5 = helpConfig.P;
            String str = helpConfig.Q;
            float f2 = helpConfig.R;
            if (!helpConfig.T) {
                i2 = 9;
            } else {
                i2 = 8;
            }
            new ooe(helpChimeraActivity, a2, nzv.a(i4, i5, str, f2, false, i2, ooe.a(helpConfig)), false, true, false, Calendar.getInstance()).executeOnExecutor(helpChimeraActivity.d, new Void[0]);
            return;
        }
        helpChimeraActivity.K();
    }

    public final PopularArticlesContainer g() {
        if (this.l == null) {
            PopularArticlesContainer popularArticlesContainer = (PopularArticlesContainer) this.b.findViewById(R.id.gh_articles_card);
            this.l = popularArticlesContainer;
            popularArticlesContainer.a = this.b;
            if (PopularArticlesContainer.b()) {
                popularArticlesContainer.a();
            }
        }
        return this.l;
    }

    public final ContactOptionsContainer h() {
        int i2;
        int i3;
        if (this.k == null) {
            boolean y = this.c.y();
            if (!y) {
                i2 = R.id.gh_bottom_feedback_view_stub;
            } else {
                i2 = R.id.gh_top_feedback_view_stub;
            }
            if (!y) {
                i3 = R.id.gh_bottom_contact_options_view_stub;
            } else {
                i3 = R.id.gh_top_contact_options_view_stub;
            }
            ViewStub viewStub = (ViewStub) this.b.findViewById(i3);
            if (viewStub != null) {
                ContactOptionsContainer contactOptionsContainer = (ContactOptionsContainer) viewStub.inflate();
                this.k = contactOptionsContainer;
                HelpChimeraActivity helpChimeraActivity = this.b;
                contactOptionsContainer.e = helpChimeraActivity;
                contactOptionsContainer.f = helpChimeraActivity.x;
                if (contactOptionsContainer.f == null) {
                    contactOptionsContainer.f = HelpConfig.a(helpChimeraActivity, (Bundle) null, (Intent) null);
                }
                contactOptionsContainer.g = (MaterialButton) contactOptionsContainer.findViewById(R.id.gh_show_hours);
                contactOptionsContainer.g.setOnClickListener(new obc(contactOptionsContainer));
                if (this.c.x == 0) {
                    okg.a((nzu) this.b);
                }
            }
            ViewStub viewStub2 = (ViewStub) this.b.findViewById(i2);
            if (viewStub2 != null) {
                ((LinearLayout) viewStub2.inflate()).findViewById(R.id.gh_feedback_option).setOnClickListener(new ogr(this));
            }
        }
        return this.k;
    }

    public final void a() {
        if (PopularArticlesContainer.b()) {
            PopularArticlesContainer g2 = g();
            g2.d = true;
            g2.a();
            return;
        }
        ogk ogk = this.g;
        ogk.d = true;
        ogk.a();
    }

    public final void a(HelpChimeraActivity helpChimeraActivity, int i2, long j2) {
        olo a2 = HelpChimeraActivity.a(helpChimeraActivity);
        avmw a3 = avmw.a(a2.r);
        String str = a2.m;
        okg.a((nzu) helpChimeraActivity, i2, j2, a3, str, str, a2.o);
    }

    public final void a(omf omf) {
        int i2;
        List a2 = omf.a((Context) this.b, new oaf(this.b));
        PopularArticlesContainer g2 = g();
        int i3 = omf.c;
        g2.b = a2;
        g2.e = i3;
        LinearLayout linearLayout = (LinearLayout) g2.findViewById(R.id.gh_popular_help_content_container);
        linearLayout.removeAllViews();
        int i4 = 0;
        for (int i5 = 0; i5 < g2.b.size() && i4 < 5; i5++) {
            oab oab = (oab) g2.b.get(i5);
            oac oac = new oac(g2.a, oab, i4, g2.e, (String) null);
            HelpChimeraActivity helpChimeraActivity = g2.a;
            if (!ofq.b(axqb.b())) {
                i2 = R.layout.gh_help_content_list_item_deprecated;
            } else {
                i2 = R.layout.gh_help_content_list_item;
            }
            View a3 = oae.a(helpChimeraActivity, oab, (View.OnClickListener) oac, i2, false);
            if (a3 != null) {
                linearLayout.addView(a3);
                i4++;
            }
        }
        if (this.c.z()) {
            return;
        }
        if (omf.a.startsWith("genie-eng:offline")) {
            a(this.b, 155, a2);
        } else {
            a(this.b, 14, a2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.omf r14) {
        /*
            r13 = this;
            r13.a(r14)
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r14 = r13.b
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r13.c
            java.lang.String r1 = "promoted_content_version"
            r2 = -1
            int r14 = defpackage.nzq.a((android.content.Context) r14, (com.google.android.gms.googlehelp.common.HelpConfig) r0, (java.lang.String) r1, (int) r2)
            r0 = 2
            if (r14 < r0) goto L_0x01fe
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r14 = r13.b
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r13.c
            java.lang.String r3 = "promoted_content_placement"
            r4 = 0
            int r14 = defpackage.nzq.a((android.content.Context) r14, (com.google.android.gms.googlehelp.common.HelpConfig) r0, (java.lang.String) r3, (int) r4)
            avna r14 = defpackage.avna.a(r14)
            if (r14 == 0) goto L_0x0024
            r10 = r14
            goto L_0x0027
        L_0x0024:
            avna r14 = defpackage.avna.UNKNOWN_PROMOTION_PLACEMENT
            r10 = r14
        L_0x0027:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r14 = r13.b
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r13.c
            java.lang.String r3 = "promoted_content_title"
            java.lang.String r5 = ""
            java.lang.String r14 = defpackage.nzq.a((android.content.Context) r14, (com.google.android.gms.googlehelp.common.HelpConfig) r0, (java.lang.String) r3, (java.lang.String) r5)
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = r13.b
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r13.c
            java.lang.String r6 = "promoted_content_snippet"
            java.lang.String r6 = defpackage.nzq.a((android.content.Context) r0, (com.google.android.gms.googlehelp.common.HelpConfig) r3, (java.lang.String) r6, (java.lang.String) r5)
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = r13.b
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r13.c
            java.lang.String r7 = "promoted_content_url"
            java.lang.String r7 = defpackage.nzq.a((android.content.Context) r0, (com.google.android.gms.googlehelp.common.HelpConfig) r3, (java.lang.String) r7, (java.lang.String) r5)
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = r13.b
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r13.c
            java.lang.String r8 = "promoted_content_image_base64"
            java.lang.String r8 = defpackage.nzq.a((android.content.Context) r0, (com.google.android.gms.googlehelp.common.HelpConfig) r3, (java.lang.String) r8, (java.lang.String) r5)
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = r13.b
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r13.c
            java.lang.String r9 = "promoted_content_external_link_text"
            java.lang.String r9 = defpackage.nzq.a((android.content.Context) r0, (com.google.android.gms.googlehelp.common.HelpConfig) r3, (java.lang.String) r9, (java.lang.String) r5)
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = r13.b
            com.google.android.gms.googlehelp.common.HelpConfig r3 = r13.c
            int r11 = defpackage.nzq.a((android.content.Context) r0, (com.google.android.gms.googlehelp.common.HelpConfig) r3, (java.lang.String) r1, (int) r2)
            r5 = r14
            oab r14 = defpackage.oab.a((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (defpackage.avna) r10, (int) r11)
            if (r14 == 0) goto L_0x01fe
            avna r0 = r14.x()
            avna r1 = defpackage.avna.PROMOTION_PLACEMENT_TOP
            if (r0 != r1) goto L_0x00b6
            boolean r0 = defpackage.axqb.c()
            r1 = 2131428552(0x7f0b04c8, float:1.8478752E38)
            if (r0 != 0) goto L_0x0088
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = r13.b
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            goto L_0x0098
        L_0x0088:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = r13.b
            if (r0 == 0) goto L_0x01fe
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x01fe
            android.view.View r0 = r0.inflate()
        L_0x0098:
            int r1 = r0.getPaddingLeft()
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r2 = r13.b
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131166073(0x7f070379, float:1.7946381E38)
            float r2 = r2.getDimension(r3)
            int r2 = (int) r2
            int r3 = r0.getPaddingRight()
            int r5 = r0.getPaddingBottom()
            r0.setPadding(r1, r2, r3, r5)
            goto L_0x00e0
        L_0x00b6:
            avna r1 = defpackage.avna.PROMOTION_PLACEMENT_BOTTOM
            if (r0 != r1) goto L_0x01fe
            boolean r0 = defpackage.axqb.c()
            r1 = 2131428431(0x7f0b044f, float:1.8478506E38)
            if (r0 != 0) goto L_0x00d0
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = r13.b
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            goto L_0x00e0
        L_0x00d0:
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = r13.b
            if (r0 == 0) goto L_0x01fe
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x01fe
            android.view.View r0 = r0.inflate()
        L_0x00e0:
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r13.c
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r2 = r13.b
            boolean r3 = r14.n
            r5 = 8
            java.lang.String r6 = "gH_PromotedContentV2"
            if (r3 == 0) goto L_0x01f4
            java.lang.String r3 = r14.e
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r3 = r3.getScheme()
            java.lang.String r7 = "intent"
            boolean r3 = android.text.TextUtils.equals(r7, r3)
            if (r3 == 0) goto L_0x0111
            java.lang.String r3 = r14.e
            boolean r3 = defpackage.oah.a((java.lang.String) r3, (android.content.Context) r2)
            if (r3 == 0) goto L_0x0107
            goto L_0x0111
        L_0x0107:
            java.lang.String r14 = "Unsupported intent for the Promoted Content."
            android.util.Log.w(r6, r14)
            defpackage.ohg.a(r0, r2, r5)
            return
        L_0x0111:
            android.content.res.Resources r3 = r2.getResources()
            java.lang.String r7 = r14.o
            android.content.res.Resources r8 = r2.getResources()
            r9 = 2131166070(0x7f070376, float:1.7946375E38)
            float r8 = r8.getDimension(r9)
            int r8 = (int) r8
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            r10 = 0
            if (r9 != 0) goto L_0x0143
            byte[] r7 = android.util.Base64.decode(r7, r4)     // Catch:{ IllegalArgumentException -> 0x0140 }
            int r9 = r7.length
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r7, r4, r9)
            if (r7 == 0) goto L_0x0143
            r9 = 1
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createScaledBitmap(r7, r8, r8, r9)
            android.graphics.drawable.BitmapDrawable r8 = new android.graphics.drawable.BitmapDrawable
            r8.<init>(r3, r7)
            goto L_0x0144
        L_0x0140:
            r3 = move-exception
            r8 = r10
            goto L_0x0144
        L_0x0143:
            r8 = r10
        L_0x0144:
            if (r8 != 0) goto L_0x014f
            java.lang.String r14 = "Invalid image for Promoted Content."
            android.util.Log.w(r6, r14)
            defpackage.ohg.a(r0, r2, r5)
            return
        L_0x014f:
            axqb r3 = defpackage.axqb.a
            axqc r3 = r3.a()
            boolean r3 = r3.a()
            boolean r3 = defpackage.ofq.b(r3)
            if (r3 != 0) goto L_0x0160
            goto L_0x016b
        L_0x0160:
            if (r0 != 0) goto L_0x016b
            java.lang.String r14 = "Error, invalid layout provided."
            android.util.Log.w(r6, r14)
            defpackage.ohg.a(r10, r2, r5)
            return
        L_0x016b:
            r3 = 2131428514(0x7f0b04a2, float:1.8478675E38)
            android.view.View r3 = r0.findViewById(r3)
            r7 = 2131428522(0x7f0b04aa, float:1.847869E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r9 = 2131428520(0x7f0b04a8, float:1.8478687E38)
            android.view.View r9 = r3.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r11 = 2131428521(0x7f0b04a9, float:1.8478689E38)
            android.view.View r11 = r3.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131428519(0x7f0b04a7, float:1.8478685E38)
            android.view.View r12 = r3.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            if (r7 != 0) goto L_0x0199
            goto L_0x01ea
        L_0x0199:
            if (r9 == 0) goto L_0x01ea
            if (r11 == 0) goto L_0x01ea
            if (r12 == 0) goto L_0x01ea
            ohf r5 = new ohf
            r5.<init>(r1, r2, r14)
            r3.setOnClickListener(r5)
            r12.setImageDrawable(r8)
            java.lang.String r1 = r14.d
            r7.setText(r1)
            java.lang.String r1 = r14.p
            r9.setText(r1)
            java.lang.String r1 = r14.r()
            android.text.Spanned r1 = defpackage.oag.a(r1)
            r11.setText(r1)
            boolean r1 = defpackage.ofy.b()
            if (r1 == 0) goto L_0x01de
            r1 = 2131231989(0x7f0804f5, float:1.8080075E38)
            android.graphics.drawable.Drawable r1 = defpackage.kf.a((android.content.Context) r2, (int) r1)
            if (r1 == 0) goto L_0x01de
            r3 = 2130969222(0x7f040286, float:1.754712E38)
            int r3 = defpackage.ofy.a(r2, r3)
            android.graphics.drawable.Drawable r1 = defpackage.ofx.b((android.graphics.drawable.Drawable) r1, (android.content.Context) r2, (int) r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r9.setCompoundDrawablesRelativeWithIntrinsicBounds(r10, r10, r1, r10)
        L_0x01de:
            defpackage.ohg.a(r0, r2, r4)
            java.lang.String r14 = defpackage.ohg.a(r14)
            defpackage.okg.b((defpackage.nzu) r2, (java.lang.String) r14)
            return
        L_0x01ea:
            java.lang.String r14 = "Promoted Content's view is missing some field(s)."
            android.util.Log.w(r6, r14)
            defpackage.ohg.a(r0, r2, r5)
            return
        L_0x01f4:
            java.lang.String r14 = "HelpResponse object did not contain Promoted Content."
            android.util.Log.w(r6, r14)
            defpackage.ohg.a(r0, r2, r5)
            return
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogs.c(omf):void");
    }

    public final void b(omf omf) {
        if (axmj.a.a().E()) {
            HelpChimeraActivity helpChimeraActivity = this.b;
            ook.a(helpChimeraActivity.c, helpChimeraActivity, helpChimeraActivity.k, omf.b.values());
        }
    }
}
