package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView;
import com.google.android.setupdesign.GlifLayout;
import java.util.Locale;

/* renamed from: acny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acny extends Fragment {
    public static final /* synthetic */ int a = 0;
    private static final iwd b = acqa.a("Setup", "UI", "SetupPinVerificationFragment");
    private abov c;
    private GlifLayout d;
    private ShapeVerificationView e;
    private acnx f;
    private String g;
    private int h;
    private boolean i;
    private boolean j;
    private ss k;

    public static acny a(anxm anxm, String str, boolean z, boolean z2, abov abov) {
        iva.a((Object) str);
        acny acny = new acny();
        Bundle bundle = new Bundle();
        bundle.putString("smartdevice.pin", str);
        anxm anxm2 = anxm.DEFAULT;
        int ordinal = anxm.ordinal();
        int i2 = 4;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        } else if (ordinal != 4) {
            i2 = 0;
        }
        bundle.putInt("verificationStyle", i2);
        bundle.putBoolean("connectListener", z);
        bundle.putBoolean("isSource", z2);
        bundle.putString("device_type", abov.name());
        acny.setArguments(bundle);
        return acny;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        String string = arguments.getString("smartdevice.pin");
        iva.a((Object) string);
        this.g = string;
        this.h = arguments.getInt("verificationStyle", 0);
        this.i = arguments.getBoolean("connectListener");
        this.j = arguments.getBoolean("isSource");
        this.c = abov.a(arguments.getString("device_type"));
        if (this.i) {
            try {
                this.f = (acnx) getActivity();
            } catch (ClassCastException e2) {
                throw new RuntimeException("Containing activity must implement SetupPinVerificationFragment.Listener", e2);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(R.layout.smartdevice_setup_pin_verification, viewGroup, false);
        this.d = glifLayout;
        alhe alhe = (alhe) glifLayout.a(alhe.class);
        boolean d2 = azjh.d();
        int i2 = R.string.common_confirm;
        if (!d2 || this.c != abov.AUTO) {
            int i3 = this.h;
            GlifLayout glifLayout2 = this.d;
            TextView textView = (TextView) glifLayout2.findViewById(R.id.description);
            if (i3 == 1 || i3 == 2) {
                glifLayout2.c(!this.j ? R.string.smartdevice_pairing_verify_shapes_title_target : R.string.smartdevice_pairing_verify_shapes_title_source);
            } else {
                glifLayout2.c(!this.j ? R.string.smartdevice_setup_title_verify_code_target : R.string.smartdevice_setup_title_verify_code_source);
            }
            if (this.j) {
                TypedArray obtainStyledAttributes = glifLayout2.getContext().getTheme().obtainStyledAttributes(2132018060, new int[]{16843660});
                boolean z = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                String string = getString(R.string.common_next);
                if (z) {
                    string = string.toUpperCase(Locale.getDefault());
                }
                textView.setText(TextUtils.expandTemplate(getString(R.string.smartdevice_pairing_verify_confirm), new CharSequence[]{string}));
                i2 = R.string.common_next;
            } else {
                i2 = R.string.common_next;
            }
        } else {
            int i4 = this.h;
            if (i4 != 0) {
                iwd iwd = b;
                StringBuilder sb = new StringBuilder(101);
                sb.append("Auto does not have copy for verification styles other than PIN right now. Received style: ");
                sb.append(i4);
                iwd.d(sb.toString(), new Object[0]);
            }
            this.d.c(R.string.smartdevice_setup_title_auto_confirm_code);
            ((TextView) this.d.findViewById(R.id.description)).setText(R.string.smartdevice_setup_auto_confirm_code_subhead);
            Context context = getContext();
            iva.a((Object) context);
            Drawable a2 = kf.a(context, (int) R.drawable.quantum_gm_ic_compare_arrows_gm_blue_36);
            if (a2 != null) {
                this.d.a(a2);
            }
        }
        alhf alhf = new alhf(this.d.getContext());
        alhf.a(i2);
        alhf.c = 5;
        alhf.d = 2132018060;
        alhg a3 = alhf.a();
        alhf alhf2 = new alhf(this.d.getContext());
        alhf2.a(R.string.smartdevice_d2d_target_help_text);
        alhf2.c = 7;
        alhf2.d = 2132018061;
        alhg a4 = alhf2.a();
        alhe.a(a3);
        alhe.b(a4);
        this.e = (ShapeVerificationView) this.d.findViewById(R.id.shapesView);
        return this.d;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ss ssVar = this.k;
        boolean z = false;
        if (ssVar != null && ssVar.isShowing()) {
            z = true;
        }
        bundle.putBoolean("isDialogActive", z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r17, android.os.Bundle r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            super.onViewCreated(r17, r18)
            r3 = 2131429161(0x7f0b0729, float:1.8479987E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = r0.h
            r5 = 3
            r6 = 4
            r7 = 0
            if (r4 != r5) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            if (r4 != r6) goto L_0x002b
        L_0x001c:
            android.content.res.Resources r4 = r16.getResources()
            r8 = 2131167224(0x7f0707f8, float:1.7948716E38)
            float r4 = r4.getDimension(r8)
            r3.setTextSize(r7, r4)
        L_0x002b:
            int r4 = r0.h
            r8 = 8
            if (r4 == 0) goto L_0x0162
            r9 = 2
            r10 = 1
            if (r4 == r10) goto L_0x008b
            if (r4 == r9) goto L_0x0087
            if (r4 == r5) goto L_0x0077
            if (r4 != r6) goto L_0x006f
            android.content.Context r4 = r17.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2130903074(0x7f030022, float:1.7412956E38)
            int[] r4 = r4.getIntArray(r5)
            java.lang.String r5 = r0.g
            int r6 = r4.length
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r5)
        L_0x0052:
            int r10 = r5.length()
            if (r7 >= r10) goto L_0x006a
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            int r11 = r7 % r6
            r11 = r4[r11]
            r10.<init>(r11)
            int r11 = r7 + 1
            r12 = 34
            r9.setSpan(r10, r7, r11, r12)
            r7 = r11
            goto L_0x0052
        L_0x006a:
            r3.setText(r9)
            goto L_0x0167
        L_0x006f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid style"
            r1.<init>(r2)
            throw r1
        L_0x0077:
            android.content.Context r4 = r17.getContext()
            r5 = 2131101298(0x7f060672, float:1.7815002E38)
            int r4 = defpackage.kf.b(r4, r5)
            r3.setTextColor(r4)
            goto L_0x0162
        L_0x0087:
            com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView r4 = r0.e
            r4.c = r10
        L_0x008b:
            r3.setVisibility(r8)
            com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView r3 = r0.e
            r3.setVisibility(r7)
            com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView r3 = r0.e
            java.lang.String r4 = r0.g
            byte[] r4 = defpackage.acbz.a(r4)
            if (r4 == 0) goto L_0x00d4
            acnz[] r11 = new defpackage.acnz[r6]
            byte r12 = r4[r7]
            byte r13 = r4[r10]
            int[] r14 = r3.b
            acnz r12 = com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView.a(r12, r13, r14)
            r11[r7] = r12
            byte r12 = r4[r9]
            byte r13 = r4[r5]
            int[] r14 = r3.b
            acnz r12 = com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView.a(r12, r13, r14)
            r11[r10] = r12
            byte r12 = r4[r6]
            r13 = 5
            byte r13 = r4[r13]
            int[] r14 = r3.b
            acnz r12 = com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView.a(r12, r13, r14)
            r11[r9] = r12
            r9 = 6
            byte r9 = r4[r9]
            r12 = 7
            byte r4 = r4[r12]
            int[] r12 = r3.b
            acnz r4 = com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView.a(r9, r4, r12)
            r11[r5] = r4
            goto L_0x00d5
        L_0x00d4:
            r11 = 0
        L_0x00d5:
            if (r11 == 0) goto L_0x0167
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources r5 = r4.getResources()
            r9 = 2131167206(0x7f0707e6, float:1.794868E38)
            int r5 = r5.getDimensionPixelSize(r9)
            int r9 = r11.length
        L_0x00e7:
            if (r7 >= r6) goto L_0x0167
            r9 = r11[r7]
            android.widget.LinearLayout r12 = new android.widget.LinearLayout
            r12.<init>(r4)
            r12.setOrientation(r10)
            acoa r13 = new acoa
            r13.<init>(r4)
            int r14 = r9.c
            int r15 = r9.a
            r13.b = r14
            android.graphics.Paint r14 = r13.a
            r14.setColor(r15)
            android.graphics.Paint r14 = r13.a
            android.graphics.Paint$Style r15 = android.graphics.Paint.Style.FILL
            r14.setStyle(r15)
            android.graphics.Paint r14 = r13.a
            r14.setAntiAlias(r10)
            r14 = 16908294(0x1020006, float:2.3877246E-38)
            r13.setId(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            int r15 = r3.d
            r14.<init>(r15, r15)
            int r15 = r3.e
            r14.leftMargin = r15
            int r15 = r3.e
            r14.rightMargin = r15
            r13.setLayoutParams(r14)
            r12.addView(r13)
            boolean r13 = r3.c
            if (r13 == 0) goto L_0x015b
            android.widget.TextView r13 = new android.widget.TextView
            r13.<init>(r4)
            r14 = 16908308(0x1020014, float:2.3877285E-38)
            r13.setId(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r15 = -1
            r6 = -2
            r14.<init>(r15, r6)
            r14.topMargin = r5
            r13.setLayoutParams(r14)
            r6 = 2132018024(0x7f140368, float:1.9674343E38)
            defpackage.ry.a((android.widget.TextView) r13, (int) r6)
            android.graphics.Typeface r6 = com.google.android.gms.smartdevice.setup.ui.ShapeVerificationView.a
            r13.setTypeface(r6)
            r13.setGravity(r10)
            java.lang.String r6 = r9.b
            r13.setText(r6)
            r12.addView(r13)
        L_0x015b:
            r3.addView(r12)
            int r7 = r7 + 1
            r6 = 4
            goto L_0x00e7
        L_0x0162:
            java.lang.String r4 = r0.g
            r3.setText(r4)
        L_0x0167:
            r3 = 2131428567(0x7f0b04d7, float:1.8478782E38)
            android.view.View r1 = r1.findViewById(r3)
            com.google.android.setupdesign.GlifLayout r1 = (com.google.android.setupdesign.GlifLayout) r1
            java.lang.Class<alhe> r3 = defpackage.alhe.class
            alhi r1 = r1.a((java.lang.Class) r3)
            alhe r1 = (defpackage.alhe) r1
            alhg r3 = r1.c
            alhg r1 = r1.d
            boolean r4 = r0.i
            if (r4 == 0) goto L_0x01a8
            acnx r4 = r0.f
            if (r4 == 0) goto L_0x01a0
            acnv r5 = new acnv
            r5.<init>(r4)
            r3.f = r5
            acnw r3 = new acnw
            r3.<init>(r0, r4)
            r1.f = r3
            if (r2 == 0) goto L_0x01af
            java.lang.String r1 = "isDialogActive"
            boolean r1 = r2.getBoolean(r1)
            if (r1 == 0) goto L_0x01af
            r0.a(r4)
            goto L_0x01af
        L_0x01a0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Listener is null"
            r1.<init>(r2)
            throw r1
        L_0x01a8:
            r3.a((int) r8)
            r1.a((int) r8)
        L_0x01af:
            com.google.android.chimera.Activity r1 = r16.getActivity()
            if (r1 == 0) goto L_0x01c2
            android.app.Activity r1 = r1.getContainerActivity()
            com.google.android.setupdesign.GlifLayout r2 = r0.d
            java.lang.CharSequence r2 = r2.e()
            defpackage.acpc.a(r1, r2)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acny.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void a(acnx acnx) {
        acnu acnu = new acnu(acnx);
        if (!azjh.d() || this.c != abov.AUTO) {
            sr a2 = aceg.a((Context) getActivity());
            a2.a((int) R.string.smartdevice_reverify_title);
            a2.b((int) R.string.smartdevice_reverify_body);
            a2.b((int) R.string.common_try_again, (DialogInterface.OnClickListener) acnu);
            a2.a((int) R.string.common_cancel, (DialogInterface.OnClickListener) null);
            this.k = a2.b();
        } else {
            sr a3 = aceg.a((Context) getActivity());
            a3.b((int) R.string.smartdevice_reverify_body_auto);
            a3.b((int) R.string.common_got_it, (DialogInterface.OnClickListener) acnu);
            this.k = a3.b();
        }
        this.k.show();
    }
}
