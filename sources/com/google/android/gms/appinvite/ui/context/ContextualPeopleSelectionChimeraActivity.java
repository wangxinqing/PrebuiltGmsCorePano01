package com.google.android.gms.appinvite.ui.context;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContextualPeopleSelectionChimeraActivity extends bjs implements View.OnClickListener, dyd, dyf, dxv {
    private View a;
    private View b;
    private dxx c;
    private adl d;
    private View e;
    private CharSequence f;
    private CharSequence g;
    private CharSequence h;

    private final void a(boolean z) {
        this.f = null;
        this.g = null;
        this.h = null;
        Intent intent = getIntent();
        if (!z) {
            this.f = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_HINT_TEXT");
            this.g = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_MODE_HINT_TEXT");
            CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_NO_CONTACTS_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT");
            this.h = charSequenceExtra;
            if (TextUtils.isEmpty(charSequenceExtra)) {
                this.h = this.g;
            }
        }
        if (TextUtils.isEmpty(this.f)) {
            this.f = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_HINT_TEXT");
        }
        if (TextUtils.isEmpty(this.g)) {
            CharSequence charSequenceExtra2 = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_HINT_TEXT");
            this.g = charSequenceExtra2;
            if (TextUtils.isEmpty(charSequenceExtra2)) {
                this.g = this.f;
            }
        }
        if (TextUtils.isEmpty(this.h)) {
            CharSequence charSequenceExtra3 = intent.getCharSequenceExtra("com.google.android.gms.appinvite.CONTEXT_SEARCH_MODE_WITH_SELECTIONS_HINT_TEXT");
            this.h = charSequenceExtra3;
            if (TextUtils.isEmpty(charSequenceExtra3)) {
                this.h = this.g;
            }
        }
    }

    private final void f() {
        dxx dxx = this.c;
        int i = 0;
        boolean z = dxx != null && dxx.a();
        this.a.setVisibility(!z ? 8 : 0);
        View view = this.b;
        if (z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private final void h() {
        this.e.setEnabled(this.c.c() > 0);
    }

    private final void i() {
        CharSequence charSequence;
        dxx dxx = this.c;
        CharSequence charSequence2 = this.f;
        dym dym = dxx.t;
        if (dym != null) {
            dym.b(charSequence2);
        }
        dyj dyj = dxx.u;
        if (dyj != null) {
            dyj.b(charSequence2);
        }
        dxx dxx2 = this.c;
        if (dxx2.c() > 0) {
            charSequence = this.h;
        } else {
            charSequence = this.g;
        }
        dym dym2 = dxx2.t;
        if (dym2 != null) {
            dym2.c(charSequence);
        }
        dyj dyj2 = dxx2.u;
        if (dyj2 != null) {
            dyj2.c(charSequence);
        }
    }

    public final void b(int i, int i2) {
        a(i + i2 > 0);
        i();
        f();
        h();
    }

    public final void e() {
        f();
    }

    public final adl k() {
        return this.d;
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("com.google.android.gms.appinvite.CONTEXT_RESULT_SELECTED_PEOPLE", new ArrayList(this.c.b()));
        setResult(-1, intent);
        finish();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r40) {
        /*
            r39 = this;
            r1 = r39
            super.onCreate(r40)
            java.lang.String r13 = defpackage.jhg.a((com.google.android.chimera.Activity) r39)
            if (r13 == 0) goto L_0x03af
            hya r0 = defpackage.hya.a((android.content.Context) r39)
            boolean r0 = r0.b((java.lang.String) r13)
            if (r0 != 0) goto L_0x0018
            r3 = r1
            goto L_0x03b0
        L_0x0018:
            r0 = 2131624007(0x7f0e0047, float:1.8875182E38)
            r1.setContentView((int) r0)
            r0 = 2131429442(0x7f0b0842, float:1.8480557E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.a = r0
            r0 = 2131429262(0x7f0b078e, float:1.8480192E38)
            android.view.View r0 = r1.findViewById(r0)
            r1.b = r0
            r15 = 0
            android.content.Context r0 = r1.createPackageContext(r13, r15)     // Catch:{ NameNotFoundException -> 0x0036 }
            goto L_0x003b
        L_0x0036:
            r0 = move-exception
            android.app.Activity r0 = r39.getContainerActivity()
        L_0x003b:
            android.content.Intent r2 = r39.getIntent()
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_TITLE"
            java.lang.String r3 = r2.getStringExtra(r3)
            java.lang.String r4 = "com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_COLOR"
            boolean r5 = r2.hasExtra(r4)
            if (r5 == 0) goto L_0x0067
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r4 = r2.getIntExtra(r4, r5)
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r3)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r3.<init>(r4)
            int r4 = r5.length()
            r6 = 18
            r5.setSpan(r3, r15, r4, r6)
            r3 = r5
        L_0x0067:
            r4 = 2131429705(0x7f0b0949, float:1.848109E38)
            android.view.View r4 = r1.findViewById(r4)
            android.support.v7.widget.Toolbar r4 = (android.support.v7.widget.Toolbar) r4
            boolean r5 = defpackage.awhs.d()
            if (r5 != 0) goto L_0x0079
            r1.a((android.support.v7.widget.Toolbar) r4)
        L_0x0079:
            r4.a((java.lang.CharSequence) r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_TEXT_APPEARANCE"
            boolean r5 = r2.hasExtra(r3)
            if (r5 == 0) goto L_0x008b
            int r3 = r2.getIntExtra(r3, r15)
            r4.a((android.content.Context) r0, (int) r3)
        L_0x008b:
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_ACTION_BAR_BACKGROUND_COLOR"
            boolean r5 = r2.hasExtra(r3)
            if (r5 == 0) goto L_0x009b
            int r3 = r2.getIntExtra(r3, r15)
            r4.setBackgroundColor(r3)
        L_0x009b:
            boolean r3 = defpackage.awhs.d()
            if (r3 == 0) goto L_0x00a4
            r1.a((android.support.v7.widget.Toolbar) r4)
        L_0x00a4:
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_ACCOUNT_NAME"
            java.lang.String r3 = r2.getStringExtra(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x00b5
            r39.finish()
            return
        L_0x00b5:
            java.lang.String r4 = "com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON"
            int r4 = r2.getIntExtra(r4, r15)
            r5 = 2131429428(0x7f0b0834, float:1.8480528E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 1
            if (r4 == 0) goto L_0x00e5
            r7 = 2131429430(0x7f0b0836, float:1.8480533E38)
            android.view.View r7 = r1.findViewById(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r0 = r0.inflate(r4, r7)
            r1.e = r0
            r0.setOnClickListener(r1)
            r0 = 8
            r5.setVisibility(r0)
            goto L_0x019e
        L_0x00e5:
            r1.e = r5
            java.lang.String r4 = "com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT"
            java.lang.String r4 = r2.getStringExtra(r4)
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L_0x00f6
            r5.setText(r4)
        L_0x00f6:
            java.lang.String r4 = "com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR_STATES"
            boolean r7 = r2.hasExtra(r4)
            if (r7 == 0) goto L_0x0132
            android.os.Bundle r4 = r2.getBundleExtra(r4)
            int r7 = r4.size()
            int[][] r8 = new int[r7][]
            int[] r9 = new int[r7]
            r10 = 0
        L_0x010c:
            if (r10 < r7) goto L_0x0117
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
            r4.<init>(r8, r9)
            r5.setTextColor(r4)
            goto L_0x014a
        L_0x0117:
            java.lang.String r11 = java.lang.Integer.toString(r10)
            int[] r11 = r4.getIntArray(r11)
            if (r11 != 0) goto L_0x0122
        L_0x0121:
            goto L_0x012f
        L_0x0122:
            int r12 = r11.length
            if (r12 <= 0) goto L_0x0121
            r14 = r11[r15]
            r9[r10] = r14
            int[] r11 = java.util.Arrays.copyOfRange(r11, r6, r12)
            r8[r10] = r11
        L_0x012f:
            int r10 = r10 + 1
            goto L_0x010c
        L_0x0132:
            java.lang.String r4 = "com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_TEXT_COLOR"
            boolean r7 = r2.hasExtra(r4)
            if (r7 == 0) goto L_0x014a
            android.content.res.Resources r7 = r0.getResources()
            int r4 = r2.getIntExtra(r4, r15)
            android.content.res.ColorStateList r4 = r7.getColorStateList(r4)
            r5.setTextColor(r4)
        L_0x014a:
            java.lang.String r4 = "com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR_STATES"
            boolean r7 = r2.hasExtra(r4)
            if (r7 == 0) goto L_0x0186
            android.os.Bundle r0 = r2.getBundleExtra(r4)
            int r4 = r0.size()
            android.graphics.drawable.StateListDrawable r7 = new android.graphics.drawable.StateListDrawable
            r7.<init>()
            r8 = 0
        L_0x0161:
            if (r8 >= r4) goto L_0x0182
            java.lang.String r9 = java.lang.Integer.toString(r8)
            int[] r9 = r0.getIntArray(r9)
            if (r9 != 0) goto L_0x016e
        L_0x016d:
            goto L_0x017f
        L_0x016e:
            int r10 = r9.length
            if (r10 <= 0) goto L_0x016d
            int[] r10 = java.util.Arrays.copyOfRange(r9, r6, r10)
            android.graphics.drawable.ColorDrawable r11 = new android.graphics.drawable.ColorDrawable
            r9 = r9[r15]
            r11.<init>(r9)
            r7.addState(r10, r11)
        L_0x017f:
            int r8 = r8 + 1
            goto L_0x0161
        L_0x0182:
            r5.setBackgroundDrawable(r7)
            goto L_0x019e
        L_0x0186:
            java.lang.String r4 = "com.google.android.gms.appinvite.CONTEXT_CONFIRM_BUTTON_BACKGROUND_COLOR"
            boolean r7 = r2.hasExtra(r4)
            if (r7 == 0) goto L_0x019e
            android.content.res.Resources r0 = r0.getResources()
            int r4 = r2.getIntExtra(r4, r15)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r4)
            r5.setBackgroundDrawable(r0)
        L_0x019e:
            java.lang.String r0 = "com.google.android.gms.appinvite.CONTEXT_MESSAGE"
            java.lang.CharSequence r0 = r2.getCharSequenceExtra(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            r5 = 2131624013(0x7f0e004d, float:1.8875194E38)
            if (r4 != 0) goto L_0x01cd
            android.view.LayoutInflater r4 = r39.getLayoutInflater()
            android.view.View r7 = r1.a
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r4 = r4.inflate(r5, r7, r15)
            adl r7 = new adl
            r7.<init>(r4)
            r1.d = r7
            r7 = 2131428894(0x7f0b061e, float:1.8479445E38)
            android.view.View r4 = r4.findViewById(r7)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r0)
        L_0x01cd:
            com.google.android.chimera.FragmentManager r0 = r39.getSupportFragmentManager()
            com.google.android.chimera.FragmentTransaction r14 = r0.beginTransaction()
            java.lang.String r12 = "selectionFragment"
            com.google.android.chimera.Fragment r0 = r0.findFragmentByTag(r12)
            dxx r0 = (defpackage.dxx) r0
            r1.c = r0
            if (r0 != 0) goto L_0x0394
            android.os.Parcelable$Creator r0 = com.google.android.gms.appinvite.model.ContactPerson.CREATOR
            java.lang.String r4 = "com.google.android.gms.appinvite.CONTEXT_INITIAL_SELECTION"
            java.util.ArrayList r4 = defpackage.ivy.b(r2, r4, r0)
            java.lang.String r0 = "com.google.android.gms.appinvite.CONTEXT_MAX_SELECTED"
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r2.getIntExtra(r0, r7)
            java.lang.String r8 = "com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_ICON"
            boolean r8 = r2.getBooleanExtra(r8, r15)
            java.lang.String r9 = "com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_SELECTION"
            boolean r9 = r2.getBooleanExtra(r9, r15)
            java.lang.String r10 = "com.google.android.gms.appinvite.CONTEXT_OVERRIDE_CONTACT_METHOD_ORDER"
            boolean r10 = r2.getBooleanExtra(r10, r15)
            java.lang.String r11 = "com.google.android.gms.appinvite.CONTEXT_CONTACT_METHOD_TYPES"
            java.lang.String[] r11 = r2.getStringArrayExtra(r11)
            java.lang.String r5 = "com.google.android.gms.appinvite.EXTRA_EXCLUDE_NON_GAIA_CONTACTS"
            boolean r16 = r2.getBooleanExtra(r5, r15)
            java.lang.String r5 = "com.google.android.gms.appinvite.CONTEXT_DOCK_RECIPIENTS"
            boolean r5 = r2.getBooleanExtra(r5, r15)
            android.os.Parcelable$Creator r6 = com.google.android.gms.appinvite.model.ContactPerson.CREATOR
            java.lang.String r15 = "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_GRID_PEOPLE"
            java.util.ArrayList r6 = defpackage.ivy.b(r2, r15, r6)
            java.lang.String r15 = "com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_GAIA_IDS"
            java.util.ArrayList r15 = r2.getStringArrayListExtra(r15)
            java.lang.String r7 = "com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_EMAIL_ADDRESSES"
            java.util.ArrayList r7 = r2.getStringArrayListExtra(r7)
            r20 = r12
            java.lang.String r12 = "com.google.android.gms.appinvite.CONTEXT_EXCLUDED_GRID_PHONE_NUMBERS"
            java.util.ArrayList r12 = r2.getStringArrayListExtra(r12)
            r21 = r14
            android.os.Parcelable$Creator r14 = com.google.android.gms.appinvite.model.ContactPerson.CREATOR
            r22 = r13
            java.lang.String r13 = "com.google.android.gms.appinvite.CONTEXT_ADDITIONAL_LIST_PEOPLE"
            java.util.ArrayList r13 = defpackage.ivy.b(r2, r13, r14)
            java.lang.String r14 = "com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE"
            java.lang.String r14 = r2.getStringExtra(r14)
            r23 = r9
            java.lang.String r9 = "com.google.android.gms.appinvite.CONTEXT_GRID_SOURCE_OPTIONS"
            java.lang.String r9 = r2.getStringExtra(r9)
            r24 = r4
            java.lang.String r4 = "com.google.android.gms.appinvite.CONTEXT_MAX_PORTRAIT_GRID_ITEMS"
            r25 = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r4 = r2.getIntExtra(r4, r0)
            r26 = r3
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_MAX_LANDSCAPE_GRID_ITEMS"
            int r0 = r2.getIntExtra(r3, r0)
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE"
            java.lang.String r3 = r2.getStringExtra(r3)
            r19 = r8
            java.lang.String r8 = "com.google.android.gms.appinvite.CONTEXT_LIST_SOURCE_OPTIONS"
            java.lang.String r8 = r2.getStringExtra(r8)
            r27 = r13
            java.lang.String r13 = "com.google.android.gms.appinvite.CONTEXT_GRID_HEADER_TEXT"
            java.lang.String r13 = r2.getStringExtra(r13)
            r28 = r8
            java.lang.String r8 = "com.google.android.gms.appinvite.CONTEXT_GRID_SUB_HEADER_TEXT"
            java.lang.String r8 = r2.getStringExtra(r8)
            r29 = r3
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_LIST_HEADER_TEXT"
            java.lang.String r3 = r2.getStringExtra(r3)
            r30 = r3
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_LIST_SUB_HEADER_TEXT"
            java.lang.String r3 = r2.getStringExtra(r3)
            r31 = r3
            java.lang.String r3 = "com.google.android.gms.appinvite.INCLUDE_PUBLIC_PROFILE_SEARCH"
            r32 = r8
            r8 = 0
            boolean r33 = r2.getBooleanExtra(r3, r8)
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_DISABLED_GAIA_IDS"
            java.util.ArrayList r34 = r2.getStringArrayListExtra(r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_DISABLED_EMAIL_ADDRESSES"
            java.util.ArrayList r35 = r2.getStringArrayListExtra(r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_DISABLED_PHONE_NUMBERS"
            java.util.ArrayList r36 = r2.getStringArrayListExtra(r3)
            java.lang.String r3 = "com.google.android.gms.appinvite.CONTEXT_DISABLED_MESSAGE"
            java.lang.String r37 = r2.getStringExtra(r3)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            adl r3 = r1.d
            if (r3 == 0) goto L_0x02d0
            com.google.android.gms.appinvite.ui.context.section.CustomSectionInfo r3 = new com.google.android.gms.appinvite.ui.context.section.CustomSectionInfo
            r38 = r13
            r1 = 1
            int[] r13 = new int[r1]
            r1 = 2131624013(0x7f0e004d, float:1.8875194E38)
            r18 = 0
            r13[r18] = r1
            r3.<init>((int[]) r13)
            r8.add(r3)
            goto L_0x02d2
        L_0x02d0:
            r38 = r13
        L_0x02d2:
            com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo r1 = new com.google.android.gms.appinvite.ui.context.section.SelectionSectionInfo
            r1.<init>()
            r1.p = r5
            r3 = 1
            r1.b = r3
            r8.add(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 != 0) goto L_0x0319
            java.lang.String r1 = "com.google.android.gms.appinvite.CONTEXT_DISPLAY_GRID_AS_A_LIST"
            r13 = 0
            boolean r1 = r2.getBooleanExtra(r1, r13)
            if (r1 == 0) goto L_0x02f4
            com.google.android.gms.appinvite.ui.context.section.ListSectionInfo r1 = new com.google.android.gms.appinvite.ui.context.section.ListSectionInfo
            r1.<init>((java.lang.String) r14)
            goto L_0x02f9
        L_0x02f4:
            com.google.android.gms.appinvite.ui.context.section.GridSectionInfo r1 = new com.google.android.gms.appinvite.ui.context.section.GridSectionInfo
            r1.<init>((java.lang.String) r14)
        L_0x02f9:
            r1.d = r9
            r1.b = r11
            r1.c = r10
            r1.j = r4
            r1.k = r0
            r1.l = r6
            r1.m = r15
            r1.a(r7)
            r1.b(r12)
            r0 = r38
            r1.g = r0
            r0 = r32
            r1.h = r0
            r8.add(r1)
            goto L_0x031a
        L_0x0319:
            r13 = 0
        L_0x031a:
            boolean r0 = android.text.TextUtils.isEmpty(r29)
            if (r0 != 0) goto L_0x0342
            com.google.android.gms.appinvite.ui.context.section.ListSectionInfo r0 = new com.google.android.gms.appinvite.ui.context.section.ListSectionInfo
            r1 = r29
            r0.<init>((java.lang.String) r1)
            r1 = r28
            r0.d = r1
            r0.b = r11
            r0.c = r10
            r1 = 1
            r0.e = r1
            r2 = r27
            r0.l = r2
            r2 = r30
            r0.g = r2
            r2 = r31
            r0.h = r2
            r8.add(r0)
            goto L_0x0343
        L_0x0342:
            r1 = 1
        L_0x0343:
            android.content.res.Resources r0 = r39.getResources()
            boolean r2 = defpackage.awhs.c()
            if (r2 != 0) goto L_0x034f
            r7 = 0
            goto L_0x0354
        L_0x034f:
            if (r19 == 0) goto L_0x0353
            r7 = 1
            goto L_0x0354
        L_0x0353:
            r7 = 0
        L_0x0354:
            r6 = 0
            r1 = 2131492873(0x7f0c0009, float:1.860921E38)
            int r10 = r0.getInteger(r1)
            r1 = 2131492872(0x7f0c0008, float:1.8609208E38)
            int r0 = r0.getInteger(r1)
            r1 = r11
            r11 = r0
            r19 = 1
            r2 = r26
            r3 = r25
            r4 = r24
            r5 = r23
            r0 = r8
            r8 = r1
            r9 = r16
            r1 = r20
            r12 = r0
            r15 = 0
            r13 = r22
            r0 = r21
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            dxx r2 = defpackage.dxx.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3 = r39
            r3.c = r2
            r4 = 2131428347(0x7f0b03fb, float:1.8478336E38)
            r0.add(r4, r2, r1)
            goto L_0x0396
        L_0x0394:
            r3 = r1
            r0 = r14
        L_0x0396:
            dxx r1 = r3.c
            r1.e = r3
            r1.f = r3
            r1.x = r3
            r1 = 0
            r3.a(r1)
            r39.i()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x03ae
            r0.commit()
        L_0x03ae:
            return
        L_0x03af:
            r3 = r1
        L_0x03b0:
            r39.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.appinvite.ui.context.ContextualPeopleSelectionChimeraActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        f();
    }

    public final void a(int i, int i2) {
        a(i + i2 > 0);
        i();
        f();
        h();
    }

    public final void a(ContactPerson contactPerson, boolean z) {
        if (!z ? this.c.c() == 0 : this.c.c() == 1) {
            i();
        }
        h();
    }
}
