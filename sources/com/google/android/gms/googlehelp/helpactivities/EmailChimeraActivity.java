package com.google.android.gms.googlehelp.helpactivities;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class EmailChimeraActivity extends oiy implements obt, ohv {
    public String a;
    private LinearLayout b;
    private TextView c;
    private RelativeLayout d;
    private MenuItem e;
    private List f;
    private String g;
    private aoru h;

    public static LinearLayout.LayoutParams a(Context context) {
        Resources resources = context.getResources();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, resources.getDimensionPixelSize(R.dimen.gh_contact_vertical_padding), 0, 0);
        return layoutParams;
    }

    private final void e() {
        a(true);
        oia oia = new oia(this);
        ohz ohz = new ohz(this);
        HelpConfig helpConfig = this.x;
        okc okc = this.y;
        ArrayList arrayList = new ArrayList();
        String str = this.x.t().b;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.g)) {
            arrayList.add(oaq.a(str, this.g));
        }
        List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            obm obm = (obm) list.get(i);
            if (((View) obm).getVisibility() == 0) {
                arrayList.addAll(obm.c());
            }
        }
        if (this.h == null) {
            this.h = jfm.a(10);
        }
        this.h.execute(new ocx(this, helpConfig, arrayList, oia, ohz, okc));
    }

    public final ofn i() {
        throw null;
    }

    public final oar j() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = r22
            super.onCreate(r23)
            r1 = 2132019251(0x7f140833, float:1.9676832E38)
            r0.setTheme(r1)
            r1 = 1
            defpackage.nzf.a(r0, r1)
            boolean r2 = defpackage.axng.b()
            boolean r2 = defpackage.ofq.a(r2)
            if (r2 != 0) goto L_0x001d
            defpackage.oay.a((com.google.android.chimera.Activity) r22)
            goto L_0x0021
        L_0x001d:
            r0.setRequestedOrientation(r1)
        L_0x0021:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f = r2
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r2.setLayoutParams(r3)
            android.content.res.Resources r3 = r22.getResources()
            r6 = 2131166017(0x7f070341, float:1.7946267E38)
            int r3 = r3.getDimensionPixelSize(r6)
            r6 = 0
            r2.setPadding(r3, r3, r3, r6)
            r2.setOrientation(r1)
            r0.b = r2
            android.widget.ScrollView r2 = new android.widget.ScrollView
            r2.<init>(r0)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r7 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r4, r6, r7)
            r2.setLayoutParams(r3)
            android.widget.LinearLayout r3 = r0.b
            r2.addView(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r0)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r4, r4)
            r3.setLayoutParams(r8)
            r3.setBackgroundColor(r4)
            r3.setOrientation(r1)
            r3.addView(r2)
            r0.setContentView((android.view.View) r3)
            com.google.android.gms.googlehelp.common.HelpConfig r2 = r0.x
            avng r2 = r2.t()
            if (r2 == 0) goto L_0x009c
            java.lang.String r8 = r2.c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0093
            java.lang.String r8 = r2.c
            android.text.Spanned r8 = android.text.Html.fromHtml(r8)
            java.lang.String r8 = r8.toString()
            goto L_0x009a
        L_0x0093:
            r8 = 2131952903(0x7f130507, float:1.9542262E38)
            java.lang.String r8 = r0.getString(r8)
        L_0x009a:
            r0.a = r8
        L_0x009c:
            android.widget.LinearLayout r8 = r0.b
            android.content.res.Resources r9 = r22.getResources()
            r10 = 2131952942(0x7f13052e, float:1.954234E38)
            java.lang.String r9 = r9.getString(r10)
            android.widget.TextView r9 = defpackage.oay.a((android.content.Context) r0, (java.lang.String) r9, (boolean) r6)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r5, r5)
            android.content.res.Resources r11 = r22.getResources()
            r12 = 2131166018(0x7f070342, float:1.794627E38)
            int r11 = r11.getDimensionPixelSize(r12)
            r10.setMargins(r6, r6, r6, r11)
            r9.setLayoutParams(r10)
            android.content.res.Resources r10 = r22.getResources()
            r11 = 2131492897(0x7f0c0021, float:1.8609259E38)
            int r10 = r10.getInteger(r11)
            float r10 = (float) r10
            r9.setTextSize(r10)
            r8.addView(r9)
            android.widget.LinearLayout r8 = r0.b
            com.google.android.gms.googlehelp.common.HelpConfig r9 = r0.x
            android.accounts.Account r9 = r9.d
            java.lang.String r9 = r9.name
            android.widget.TextView r9 = defpackage.oay.a((android.content.Context) r0, (java.lang.String) r9, (boolean) r6)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r5, r5)
            r9.setLayoutParams(r10)
            android.content.res.Resources r10 = r22.getResources()
            r11 = 2131492896(0x7f0c0020, float:1.8609257E38)
            int r10 = r10.getInteger(r11)
            float r10 = (float) r10
            r9.setTextSize(r10)
            r8.addView(r9)
            java.lang.String r8 = r2.d
            boolean r8 = r8.isEmpty()
            r9 = 17
            if (r8 == 0) goto L_0x0106
            goto L_0x012a
        L_0x0106:
            android.widget.LinearLayout r8 = r0.b
            java.lang.String r10 = r2.d
            android.widget.TextView r10 = defpackage.oay.a((android.content.Context) r0, (java.lang.String) r10, (boolean) r1)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r5, r5)
            r11.gravity = r9
            r10.setLayoutParams(r11)
            android.content.res.Resources r11 = r22.getResources()
            r12 = 2131492899(0x7f0c0023, float:1.8609263E38)
            int r11 = r11.getInteger(r12)
            float r11 = (float) r11
            r10.setTextSize(r11)
            r8.addView(r10)
        L_0x012a:
            java.lang.String r8 = r2.e
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x013d
            android.widget.LinearLayout r8 = r0.b
            java.lang.String r10 = r2.e
            android.widget.TextView r10 = r0.a(r10, r1)
            r8.addView(r10)
        L_0x013d:
            oai r8 = new oai
            r8.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            aucx r2 = r2.a
            int r11 = r2.size()
            r12 = 0
        L_0x014e:
            if (r12 >= r11) goto L_0x0306
            java.lang.Object r13 = r2.get(r12)
            avnj r13 = (defpackage.avnj) r13
            obg r14 = new obg
            r14.<init>(r0)
            android.widget.LinearLayout$LayoutParams r15 = a((android.content.Context) r22)
            r14.setLayoutParams(r15)
            r14.setOrientation(r1)
            java.lang.String r15 = r13.c
            java.lang.String r15 = defpackage.jlh.a(r15)
            boolean r9 = r13.d
            android.widget.TextView r9 = defpackage.oay.b(r0, r15, r9)
            r14.addView(r9)
            java.lang.String r9 = r13.i
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0185
            java.lang.String r9 = r13.i
            android.widget.TextView r9 = defpackage.oay.a((android.content.Context) r0, (java.lang.String) r9, (boolean) r1)
            r14.addView(r9)
        L_0x0185:
            java.lang.String r9 = r13.b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01f8
            boolean r9 = r13.o
            if (r9 == 0) goto L_0x01f8
            com.google.android.gms.googlehelp.common.HelpConfig r9 = r0.x
            avng r9 = r9.t()
            int r15 = r13.e
            int r15 = defpackage.avni.a(r15)
            if (r15 == 0) goto L_0x01a0
            goto L_0x01a1
        L_0x01a0:
            r15 = 1
        L_0x01a1:
            switch(r15) {
                case 1: goto L_0x01da;
                case 2: goto L_0x01d4;
                case 3: goto L_0x01d4;
                case 4: goto L_0x01ce;
                case 5: goto L_0x01c8;
                case 6: goto L_0x01c2;
                case 7: goto L_0x01bc;
                case 8: goto L_0x01da;
                case 9: goto L_0x01a4;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a6;
                case 12: goto L_0x01ce;
                case 13: goto L_0x01ce;
                case 14: goto L_0x01a4;
                case 15: goto L_0x01a4;
                case 16: goto L_0x01d4;
                case 17: goto L_0x01a4;
                case 18: goto L_0x01d4;
                default: goto L_0x01a4;
            }
        L_0x01a4:
            r9 = 0
            goto L_0x01f9
        L_0x01a6:
            ocg r9 = new ocg
            r9.<init>(r0, r14, r13)
            goto L_0x01f9
        L_0x01ac:
            java.lang.String r15 = r13.b
            java.lang.String r9 = r9.b
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x01ba
            java.lang.String r9 = r13.g
            r0.g = r9
        L_0x01ba:
            r9 = 0
            goto L_0x01f9
        L_0x01bc:
            occ r9 = new occ
            r9.<init>(r0, r14, r13)
            goto L_0x01f9
        L_0x01c2:
            obq r9 = new obq
            r9.<init>(r0, r14, r13)
            goto L_0x01f9
        L_0x01c8:
            obv r9 = new obv
            r9.<init>(r0, r13)
            goto L_0x01f9
        L_0x01ce:
            ocj r9 = new ocj
            r9.<init>(r0, r14, r13)
            goto L_0x01f9
        L_0x01d4:
            oby r9 = new oby
            r9.<init>(r0, r14, r13)
            goto L_0x01f9
        L_0x01da:
            java.lang.String r15 = r13.b
            java.lang.String r9 = r9.b
            boolean r9 = r15.equals(r9)
            if (r9 != 0) goto L_0x01e5
            goto L_0x01e9
        L_0x01e5:
            java.lang.String r9 = r13.g
            r0.g = r9
        L_0x01e9:
            java.lang.String r9 = r13.g
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01f8
            java.lang.String r9 = r13.g
            android.widget.TextView r9 = defpackage.oay.a((android.content.Context) r0, (java.lang.String) r9, (boolean) r1)
            goto L_0x01f9
        L_0x01f8:
            r9 = 0
        L_0x01f9:
            if (r9 == 0) goto L_0x023a
            boolean r15 = r9 instanceof defpackage.obm
            if (r15 == 0) goto L_0x0207
            java.util.List r15 = r0.f
            r4 = r9
            obm r4 = (defpackage.obm) r4
            r15.add(r4)
        L_0x0207:
            boolean r4 = r9 instanceof defpackage.obv
            if (r4 != 0) goto L_0x020d
            r4 = -1
            goto L_0x020e
        L_0x020d:
            r4 = -2
        L_0x020e:
            android.widget.LinearLayout$LayoutParams r15 = new android.widget.LinearLayout$LayoutParams
            r15.<init>(r4, r5)
            android.content.res.Resources r4 = r22.getResources()
            r5 = 2131166016(0x7f070340, float:1.7946265E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r15.setMargins(r4, r6, r4, r6)
            r9.setLayoutParams(r15)
            r14.addView(r9)
            java.lang.String r4 = r13.j
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0239
            java.lang.String r4 = r13.j
            android.widget.TextView r4 = defpackage.oay.a((android.content.Context) r0, (java.lang.String) r4, (boolean) r1)
            r14.addView(r4)
            goto L_0x023b
        L_0x0239:
            goto L_0x023b
        L_0x023a:
            r14 = 0
        L_0x023b:
            if (r14 == 0) goto L_0x02f1
            android.widget.LinearLayout r4 = r0.b
            r4.addView(r14)
            aucx r4 = r13.m
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x02eb
            aucx r4 = r13.m
            android.widget.LinearLayout r5 = r0.b
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            int r15 = r4.size()
            r7 = 0
        L_0x025d:
            if (r7 >= r15) goto L_0x02c1
            java.lang.Object r16 = r4.get(r7)
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r17 = r2
            java.lang.String r2 = "\\+"
            java.lang.String[] r1 = r1.split(r2)
            int r2 = r1.length
            r18 = r4
            r4 = 0
        L_0x0278:
            if (r4 >= r2) goto L_0x02b0
            r19 = r2
            r2 = r1[r4]
            r20 = r1
            java.lang.String r1 = "\\:"
            java.lang.String[] r1 = r2.split(r1)
            int r2 = r1.length
            r21 = r11
            r11 = 2
            if (r2 != r11) goto L_0x02a6
            r2 = 0
            r11 = r1[r2]
            android.view.View r2 = r5.findViewWithTag(r11)
            ocz r2 = (defpackage.ocz) r2
            r11 = 1
            r1 = r1[r11]
            android.util.Pair r1 = android.util.Pair.create(r2, r1)
            r6.add(r1)
            if (r2 != 0) goto L_0x02a2
            goto L_0x02a7
        L_0x02a2:
            r13.add(r2)
            goto L_0x02a7
        L_0x02a6:
            r11 = 1
        L_0x02a7:
            int r4 = r4 + 1
            r2 = r19
            r1 = r20
            r11 = r21
            goto L_0x0278
        L_0x02b0:
            r21 = r11
            r11 = 1
            r9.add(r6)
            int r7 = r7 + 1
            r2 = r17
            r4 = r18
            r11 = r21
            r1 = 1
            r6 = 0
            goto L_0x025d
        L_0x02c1:
            r17 = r2
            r21 = r11
            r11 = 1
            obe r1 = new obe
            r1.<init>(r13, r9)
            ocv r2 = new ocv
            java.util.List r4 = r1.b
            r2.<init>(r14, r4)
            r10.add(r2)
            java.util.Set r1 = r1.a
            java.util.Iterator r1 = r1.iterator()
        L_0x02db:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x02f6
            java.lang.Object r4 = r1.next()
            ocz r4 = (defpackage.ocz) r4
            r8.a(r4, r2)
            goto L_0x02db
        L_0x02eb:
            r17 = r2
            r21 = r11
            r11 = 1
            goto L_0x02f6
        L_0x02f1:
            r17 = r2
            r21 = r11
            r11 = 1
        L_0x02f6:
            int r12 = r12 + 1
            r2 = r17
            r11 = r21
            r1 = 1
            r4 = -1
            r5 = -2
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 17
            goto L_0x014e
        L_0x0306:
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x030e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x032a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            ocz r4 = (defpackage.ocz) r4
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            r4.a(r2)
            goto L_0x030e
        L_0x032a:
            defpackage.ocv.a(r10)
            android.widget.LinearLayout r1 = r0.b
            r2 = 2131952905(0x7f130509, float:1.9542266E38)
            java.lang.String r2 = r0.getString(r2)
            r4 = 0
            android.widget.TextView r2 = r0.a(r2, r4)
            r1.addView(r2)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            android.content.res.Resources r2 = r22.getResources()
            r4 = 2131166049(0x7f070361, float:1.7946332E38)
            int r2 = r2.getDimensionPixelSize(r4)
            android.content.res.Resources r4 = r22.getResources()
            r5 = 2131166050(0x7f070362, float:1.7946334E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r1.setPadding(r2, r4, r2, r4)
            android.content.res.Resources r2 = r22.getResources()
            r4 = 2131100164(0x7f060204, float:1.7812702E38)
            int r2 = r2.getColor(r4)
            r1.setBackgroundColor(r2)
            android.content.res.Resources r2 = r22.getResources()
            r4 = 2131166047(0x7f07035f, float:1.7946328E38)
            int r2 = r2.getDimensionPixelSize(r4)
            float r2 = (float) r2
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.setLineSpacing(r2, r4)
            android.content.res.Resources r2 = r22.getResources()
            r4 = 2131100168(0x7f060208, float:1.781271E38)
            int r2 = r2.getColor(r4)
            r1.setTextColor(r2)
            android.content.res.Resources r2 = r22.getResources()
            r4 = 2131166048(0x7f070360, float:1.794633E38)
            int r2 = r2.getDimensionPixelSize(r4)
            float r2 = (float) r2
            r4 = 0
            r1.setTextSize(r4, r2)
            avmt r2 = defpackage.avmt.EMAIL
            defpackage.oay.a((android.widget.TextView) r1, (defpackage.oiy) r0, (defpackage.avmt) r2)
            r0.c = r1
            r3.addView(r1)
            android.widget.ProgressBar r1 = new android.widget.ProgressBar
            r1.<init>(r0)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r4 = -2
            r2.<init>(r4, r4)
            r4 = 13
            r2.addRule(r4)
            r1.setLayoutParams(r2)
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
            r2.<init>(r0)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            r2.setLayoutParams(r4)
            r4 = 17
            r2.setGravity(r4)
            r2.addView(r1)
            r1 = 8
            r2.setVisibility(r1)
            r0.d = r2
            r3.addView(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.helpactivities.EmailChimeraActivity.onCreate(android.os.Bundle):void");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gh_email_activity_actions, menu);
        MenuItem findItem = menu.findItem(R.id.gh_contact_action_submit);
        this.e = findItem;
        findItem.setIcon(ofx.a((Context) this, ofy.b() ? ofy.a(this, R.attr.gh_primaryBlueColor) : kf.b(this, R.color.google_blue600)));
        ArrayList arrayList = new ArrayList();
        List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.addAll(((obm) list.get(i)).aY());
        }
        new oct(arrayList, this.e).a();
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.gh_contact_action_submit) {
            return super.onOptionsItemSelected(menuItem);
        }
        e();
        return true;
    }

    private final TextView a(String str, boolean z) {
        TextView a2 = oay.a((Context) this, str, z);
        a2.setLayoutParams(a((Context) this));
        return a2;
    }

    public final void a(Bundle bundle) {
        e();
    }

    public final void a(String str, int i, int i2, int i3) {
        try {
            obv obv = (obv) this.b.findViewWithTag(str);
            if (obv != null) {
                obv.setText(DateFormat.getDateInstance().format(new GregorianCalendar(i, i2, i3).getTime()));
            }
        } catch (ClassCastException e2) {
        }
    }

    public final void a(boolean z) {
        if (!z) {
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.d.setVisibility(8);
        } else {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(0);
        }
        this.e.setEnabled(!z);
    }
}
