package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: acdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acdg extends Fragment {
    public int a;
    public int b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private accj g;

    private static final void a(Bundle bundle, alhg alhg, String str) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            alhg.a((CharSequence) string);
            alhg.a(0);
            return;
        }
        alhg.a(4);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof accj) {
            this.g = (accj) parentFragment;
        } else if (activity instanceof accj) {
            this.g = (accj) activity;
        } else {
            throw new RuntimeException("Parent fragment or activity must implement ActionListener.");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.a = arguments.getInt("primaryActionId");
            this.b = arguments.getInt("secondaryActionId");
            this.c = arguments.getInt("illustrationResId");
            this.d = arguments.getBoolean("adjustIllustrationBounds", false);
            this.e = arguments.getBoolean("progressBarEnabled");
            this.f = arguments.getBoolean("magicWand");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (!this.f) {
            i = R.layout.smartdevice_d2d_target_glif_fragment;
        } else {
            i = R.layout.magicwand_target_glif_fragment;
        }
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate(i, viewGroup, false);
        if (!this.f) {
            alhe alhe = (alhe) glifLayout.a(alhe.class);
            alhf alhf = new alhf(glifLayout.getContext());
            alhf.c = 5;
            alhf.d = 2132018060;
            alhg a2 = alhf.a();
            alhf alhf2 = new alhf(glifLayout.getContext());
            alhf2.c = 7;
            alhf2.d = 2132018061;
            alhg a3 = alhf2.a();
            alhe.a(a2);
            alhe.b(a3);
        }
        return glifLayout;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:579)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:485)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            super.onViewCreated(r11, r12)
            r12 = 2131428567(0x7f0b04d7, float:1.8478782E38)
            android.view.View r12 = r11.findViewById(r12)
            com.google.android.setupdesign.GlifLayout r12 = (com.google.android.setupdesign.GlifLayout) r12
            android.os.Bundle r0 = r10.getArguments()
            if (r0 != 0) goto L_0x0014
            android.os.Bundle r0 = android.os.Bundle.EMPTY
        L_0x0014:
            java.lang.String r1 = "iconResId"
            int r1 = r0.getInt(r1)
            com.google.android.chimera.Activity r2 = r10.getActivity()
            if (r1 >= 0) goto L_0x0022
            goto L_0x002b
        L_0x0022:
            if (r2 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r1 = defpackage.kf.a((android.content.Context) r2, (int) r1)
            r12.a((android.graphics.drawable.Drawable) r1)
        L_0x002b:
            java.lang.String r1 = "title"
            java.lang.String r1 = r0.getString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x003b
            r12.a((java.lang.CharSequence) r1)
        L_0x003b:
            java.lang.String r3 = "description_html"
            boolean r3 = r0.getBoolean(r3)
            r4 = 2131427940(0x7f0b0264, float:1.847751E38)
            android.view.View r4 = r11.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r5 = "description"
            java.lang.String r5 = r0.getString(r5)
            if (r5 != 0) goto L_0x0054
            goto L_0x005f
        L_0x0054:
            if (r3 == 0) goto L_0x005b
            android.text.Spanned r5 = android.text.Html.fromHtml(r5)
            goto L_0x005c
        L_0x005b:
        L_0x005c:
            r4.setText(r5)
        L_0x005f:
            r3 = 2131427649(0x7f0b0141, float:1.847692E38)
            android.view.View r4 = r11.findViewById(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r5 = "body"
            a((android.os.Bundle) r0, (android.widget.TextView) r4, (java.lang.String) r5)
            acdd r4 = new acdd
            r4.<init>(r10)
            acde r5 = new acde
            r5.<init>(r10)
            boolean r6 = r10.f
            java.lang.String r7 = "secondaryActionText"
            java.lang.String r8 = "primaryActionText"
            if (r6 == 0) goto L_0x00a8
            r6 = 2131429227(0x7f0b076b, float:1.848012E38)
            android.view.View r6 = r11.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r9 = r10.a
            if (r9 == 0) goto L_0x0090
            r6.setOnClickListener(r4)
        L_0x0090:
            r4 = 2131429416(0x7f0b0828, float:1.8480504E38)
            android.view.View r4 = r11.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r9 = r10.b
            if (r9 == 0) goto L_0x00a0
            r4.setOnClickListener(r5)
        L_0x00a0:
            a((android.os.Bundle) r0, (android.widget.TextView) r6, (java.lang.String) r8)
            a((android.os.Bundle) r0, (android.widget.TextView) r4, (java.lang.String) r7)
            goto L_0x00cb
        L_0x00a8:
            java.lang.Class<alhe> r6 = defpackage.alhe.class
            alhi r6 = r12.a((java.lang.Class) r6)
            alhe r6 = (defpackage.alhe) r6
            int r9 = r10.a
            if (r9 == 0) goto L_0x00b8
            alhg r9 = r6.c
            r9.f = r4
        L_0x00b8:
            int r4 = r10.b
            if (r4 != 0) goto L_0x00bd
            goto L_0x00c1
        L_0x00bd:
            alhg r4 = r6.d
            r4.f = r5
        L_0x00c1:
            alhg r4 = r6.c
            a((android.os.Bundle) r0, (defpackage.alhg) r4, (java.lang.String) r8)
            alhg r4 = r6.d
            a((android.os.Bundle) r0, (defpackage.alhg) r4, (java.lang.String) r7)
        L_0x00cb:
            java.lang.String r4 = "bodyHtml"
            java.lang.String r0 = r0.getString(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            r5 = 0
            if (r4 != 0) goto L_0x00e9
            android.view.View r4 = r11.findViewById(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r4.setText(r0)
            r4.setVisibility(r5)
        L_0x00e9:
            r0 = 2131428676(0x7f0b0544, float:1.8479003E38)
            android.view.View r0 = r11.findViewById(r0)
            r4 = 2131428675(0x7f0b0543, float:1.8479001E38)
            android.view.View r11 = r11.findViewById(r4)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            if (r11 == 0) goto L_0x014d
            int r4 = r10.c
            r6 = 8
            if (r4 <= 0) goto L_0x0132
            r11.setImageResource(r4)
            boolean r4 = r10.d
            r11.setAdjustViewBounds(r4)
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r11 = (android.widget.FrameLayout.LayoutParams) r11
            boolean r4 = r10.d
            if (r4 == 0) goto L_0x0118
            r4 = 81
            r11.gravity = r4
            goto L_0x011c
        L_0x0118:
            r4 = 17
            r11.gravity = r4
        L_0x011c:
            r0.setVisibility(r5)
            android.view.View r11 = r12.findViewById(r3)
            r11.setVisibility(r6)
            r11 = 2131427650(0x7f0b0142, float:1.8476922E38)
            android.view.View r11 = r12.findViewById(r11)
            r11.setVisibility(r6)
            goto L_0x0136
        L_0x0132:
            r0.setVisibility(r6)
        L_0x0136:
            boolean r11 = r10.e
            if (r11 == 0) goto L_0x013f
            r11 = 1
            r12.b(r11)
            goto L_0x0143
        L_0x013f:
            r12.b(r5)
        L_0x0143:
            if (r2 == 0) goto L_0x014c
            android.app.Activity r11 = r2.getContainerActivity()
            defpackage.acpc.a(r11, r1)
        L_0x014c:
            return
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acdg.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private static final void a(Bundle bundle, TextView textView, String str) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            textView.setText(string);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(4);
    }

    public final void a(int i) {
        this.g.b(i, Bundle.EMPTY);
    }
}
