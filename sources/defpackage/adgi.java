package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.android.volley.toolbox.ImageLoader;
import com.google.android.chimera.Activity;
import com.google.android.chimera.ContextThemeWrapper;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;
import com.google.android.gms.udc.ConsentFlowConfig;
import java.util.ArrayList;

/* renamed from: adgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adgi extends Fragment implements jmi {
    public static final /* synthetic */ int l = 0;
    private static final jjg m = jjg.a();
    protected ImageLoader a;
    protected String b;
    protected adgq c;
    protected adhe d;
    protected adgh e;
    protected adgg f;
    protected CharSequence g;
    protected ViewGroup h;
    protected adhv i;
    protected int j = 0;
    protected boolean k;
    private boolean n;

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract void a(adfk adfk, boolean z, boolean z2);

    /* access modifiers changed from: protected */
    public final void a(ViewGroup viewGroup) {
        int i2 = Build.VERSION.SDK_INT;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration((long) getResources().getInteger(R.integer.udc_setting_zippy_anim_duration));
        layoutTransition.enableTransitionType(4);
        viewGroup.setLayoutTransition(layoutTransition);
    }

    /* access modifiers changed from: protected */
    public abstract void a(ViewGroup viewGroup, LayoutInflater layoutInflater, ConsentFlowConfig consentFlowConfig, atyx atyx);

    /* access modifiers changed from: protected */
    public final void b() {
        int i2 = Build.VERSION.SDK_INT;
        View decorView = getActivity().getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1280);
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.i.a(29009, this.j);
        adgh adgh = this.e;
        adgq adgq = this.c;
        aucd o = atzr.b.o();
        ArrayList arrayList = adgq.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                auay a2 = auay.a((byte[]) arrayList.get(i2));
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atzr atzr = (atzr) o.b;
                a2.getClass();
                if (!atzr.a.a()) {
                    atzr.a = aucj.a(atzr.a);
                }
                atzr.a.add(a2);
            }
        }
        adgh.a((atzr) o.i());
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.e = (adgh) activity;
        this.f = (adgg) activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (adfh.a == null) {
            adfh.a = new ImageLoader(ihs.b().getRequestQueue(), new adfg(Math.min(3145728, (int) (Runtime.getRuntime().maxMemory() / 8))));
        }
        this.a = adfh.a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        adgq adgq = new adgq(new adgw(this));
        this.c = adgq;
        adgq.a = new ArrayList();
        Bundle arguments = getArguments();
        atyx atyx = (atyx) adgq.a(arguments, "UdcConsentConfig", (auef) atyx.n.c(7));
        iva.a((Object) atyx, (Object) "Fragment requires consent configuration");
        ConsentFlowConfig consentFlowConfig = (ConsentFlowConfig) arguments.getParcelable("UdcConsentFlowConfig");
        Context context = layoutInflater.getContext();
        int i2 = consentFlowConfig.d;
        int i3 = 2132019404;
        if (i2 == 1) {
            i3 = 2132019395;
        } else if (i2 == 2) {
            i3 = 2132019394;
        } else if (i2 == 4) {
            i3 = 2132019396;
        } else if (i2 == 5) {
            i3 = 2132019397;
        } else if (i2 != 6) {
            i3 = 2132019393;
        } else if (azrb.a.a().b()) {
            int i4 = consentFlowConfig.g;
            if (i4 != 0) {
                if (i4 != 1) {
                    i3 = i4 != 3 ? !azrb.b() ? 2132019403 : 2132019400 : !azrb.b() ? 2132019405 : 2132019402;
                } else if (azrb.b()) {
                    i3 = 2132019401;
                }
            } else if (!azrb.a.a().d()) {
                i3 = !azrb.b() ? 2132019403 : 2132019400;
            } else if (azrb.b()) {
                i3 = 2132019401;
            }
        } else {
            i3 = !azrb.b() ? 2132019403 : 2132019400;
        }
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new ContextThemeWrapper(context, i3));
        this.b = arguments.getString("UdcAccountName");
        this.d = new adhe(arguments.getIntegerArrayList("UdcConsentZippyStates"), this.f, this);
        ViewGroup viewGroup2 = (ViewGroup) cloneInContext.inflate(a(), viewGroup, false);
        this.h = viewGroup2;
        Spanned spanned = null;
        if (viewGroup2 == null) {
            anih anih = (anih) m.b();
            anih.a(anig.MEDIUM);
            ((anih) anih.a("adgi", "onCreateView", 144, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to inflate fragment view");
            return null;
        }
        ((ScrollViewWithEvents) viewGroup2.findViewById(R.id.udc_consent_scroll_view)).a = this;
        this.j = arguments.getInt("UdcClearcutEventFlowId", 0);
        this.i = new adhv(getActivity(), this.b);
        atzn atzn = atyx.f;
        if (atzn == null) {
            atzn = atzn.d;
        }
        if (!adgq.a(atzn)) {
            atzn atzn2 = atyx.f;
            if (atzn2 == null) {
                atzn2 = atzn.d;
            }
            adgw adgw = new adgw(this);
            if (!adgq.a(atzn2)) {
                spanned = adfm.a(atzn2.c, adgw);
            }
            this.g = spanned;
        }
        a(this.h, cloneInContext, consentFlowConfig, atyx);
        ViewGroup viewGroup3 = (ViewGroup) this.h.findViewById(R.id.action_container);
        if ((atyx.a & FragmentTransaction.TRANSIT_ENTER_MASK) != 0) {
            adgq adgq2 = this.c;
            atyj atyj = atyx.m;
            if (atyj == null) {
                atyj = atyj.b;
            }
            atzn atzn3 = atyj.a;
            if (atzn3 == null) {
                atzn3 = atzn.d;
            }
            adgq2.a((View) viewGroup3, (int) R.id.action_button_negative, atzn3).setOnClickListener(new adgf(this));
        }
        if ((atyx.a & 2048) != 0) {
            adgq adgq3 = this.c;
            atyj atyj2 = atyx.l;
            if (atyj2 == null) {
                atyj2 = atyj.b;
            }
            atzn atzn4 = atyj2.a;
            if (atzn4 == null) {
                atzn4 = atzn.d;
            }
            adgq3.a((View) viewGroup3, (int) R.id.action_button_positive, atzn4).setOnClickListener(new adge(this));
        }
        if (consentFlowConfig.e == 1) {
            ((LinearLayout.LayoutParams) viewGroup3.findViewById(R.id.action_button_spacer).getLayoutParams()).weight = 1.0f;
        }
        return this.h;
    }

    public final void onResume() {
        super.onResume();
        if (!TextUtils.isEmpty(this.g)) {
            adgq.a((View) this.h, this.g);
        }
    }

    public void a(ScrollView scrollView, boolean z) {
        if (z) {
            boolean z2 = this.k;
            this.n = !z2;
            adhv adhv = this.i;
            int i2 = this.j;
            aucd o = aqna.d.o();
            aucf aucf = (aucf) aqmz.l.o();
            if (aucf.c) {
                aucf.c();
                aucf.c = false;
            }
            aqmz aqmz = (aqmz) aucf.b;
            aqmz.b = 39;
            int i3 = aqmz.a | 1;
            aqmz.a = i3;
            aqmz.c = 29017;
            int i4 = i3 | 2;
            aqmz.a = i4;
            int i5 = i4 | 16;
            aqmz.a = i5;
            aqmz.f = false;
            aqmz.a = i5 | 8;
            aqmz.e = z2 ? 1 : 0;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aqna aqna = (aqna) o.b;
            aqmz aqmz2 = (aqmz) aucf.i();
            aqmz2.getClass();
            aqna.b = aqmz2;
            aqna.a |= 1;
            adhv.a((aqna) o.i(), i2);
            this.k = true;
            return;
        }
        adhv adhv2 = this.i;
        boolean z3 = this.n;
        int i6 = this.j;
        aucd o2 = aqna.d.o();
        aucf aucf2 = (aucf) aqmz.l.o();
        if (aucf2.c) {
            aucf2.c();
            aucf2.c = false;
        }
        aqmz aqmz3 = (aqmz) aucf2.b;
        aqmz3.b = 39;
        int i7 = aqmz3.a | 1;
        aqmz3.a = i7;
        aqmz3.c = 29018;
        int i8 = i7 | 2;
        aqmz3.a = i8;
        int i9 = i8 | 16;
        aqmz3.a = i9;
        aqmz3.f = false;
        aqmz3.a = i9 | 8;
        aqmz3.e = z3 ? 1 : 0;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aqna aqna2 = (aqna) o2.b;
        aqmz aqmz4 = (aqmz) aucf2.i();
        aqmz4.getClass();
        aqna2.b = aqmz4;
        aqna2.a |= 1;
        adhv2.a((aqna) o2.i(), i6);
    }

    /* access modifiers changed from: protected */
    public void b(atzm atzm, View view) {
        adgq adgq = this.c;
        atzn atzn = atzm.c;
        if (atzn == null) {
            atzn = atzn.d;
        }
        adgq.a(view, (int) R.id.header, atzn);
        adgq adgq2 = this.c;
        atzn atzn2 = atzm.e;
        if (atzn2 == null) {
            atzn2 = atzn.d;
        }
        adgq2.a(view, (int) R.id.udc_description, atzn2);
    }

    /* access modifiers changed from: protected */
    public void a(atzm atzm, View view) {
        adgq adgq = this.c;
        atzf atzf = atzm.d;
        if (atzf == null) {
            atzf = atzf.d;
        }
        adgq.a(view, (int) R.id.icon, atzf, this.a);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.LayoutInflater r18, defpackage.adfk r19, defpackage.atyx r20, com.google.android.gms.udc.ConsentFlowConfig r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            aucx r4 = r2.i
            int r4 = r4.size()
            r5 = 0
            if (r4 <= 0) goto L_0x017d
            adhe r4 = r0.d
            aucx r6 = r2.i
            int r6 = r6.size()
        L_0x0019:
            java.util.ArrayList r7 = r4.a
            int r7 = r7.size()
            r8 = 0
            if (r7 >= r6) goto L_0x0028
            java.util.ArrayList r7 = r4.a
            r7.add(r8)
            goto L_0x0019
        L_0x0028:
            r4 = 0
            r6 = 0
        L_0x002a:
            aucx r7 = r2.i
            int r7 = r7.size()
            if (r4 >= r7) goto L_0x017b
            aucx r7 = r2.i
            java.lang.Object r7 = r7.get(r4)
            atzm r7 = (defpackage.atzm) r7
            aucx r9 = r7.f
            int r10 = r9.size()
            r11 = 0
            r12 = 0
        L_0x0042:
            r13 = 1
            if (r11 >= r10) goto L_0x0053
            java.lang.Object r12 = r9.get(r11)
            atzn r12 = (defpackage.atzn) r12
            boolean r12 = defpackage.adgq.a(r12)
            r12 = r12 ^ r13
            int r11 = r11 + 1
            goto L_0x0042
        L_0x0053:
            atzn r9 = r7.c
            if (r9 != 0) goto L_0x0059
            atzn r9 = defpackage.atzn.d
        L_0x0059:
            boolean r9 = defpackage.adgq.a(r9)
            if (r9 == 0) goto L_0x0075
            atzn r9 = r7.e
            if (r9 != 0) goto L_0x0065
            atzn r9 = defpackage.atzn.d
        L_0x0065:
            boolean r9 = defpackage.adgq.a(r9)
            if (r9 != 0) goto L_0x006c
            goto L_0x0075
        L_0x006c:
            if (r12 != 0) goto L_0x0075
            r14 = r18
            r9 = r22
            r12 = r8
            goto L_0x0176
        L_0x0075:
            r0.a(r1, r6, r5)
            r9 = r22
            android.view.View r6 = r1.a(r9)
            if (r6 == 0) goto L_0x0172
            int r10 = r7.a
            r10 = r10 & 4
            if (r10 == 0) goto L_0x008f
            boolean r10 = r3.b
            if (r10 != 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r0.a((defpackage.atzm) r7, (android.view.View) r6)
        L_0x008f:
            r0.b(r7, r6)
            r10 = 2131429745(0x7f0b0971, float:1.8481171E38)
            android.view.View r11 = r6.findViewById(r10)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            aucx r12 = r7.f
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x00e4
            adfk r12 = new adfk
            r14 = r18
            r12.<init>(r14, r11)
            r11.setVisibility(r5)
            aucx r7 = r7.f
            int r11 = r7.size()
            r15 = 0
        L_0x00b4:
            if (r15 >= r11) goto L_0x00de
            java.lang.Object r16 = r7.get(r15)
            r8 = r16
            atzn r8 = (defpackage.atzn) r8
            r13 = 2131625074(0x7f0e0472, float:1.8877346E38)
            android.view.View r13 = r12.a(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            adgq r10 = r0.c
            java.lang.String r5 = r0.b
            r10.a((android.view.View) r13, (defpackage.atzn) r8, (java.lang.String) r5)
            r5 = 0
            r13.setClickable(r5)
            r13.setLongClickable(r5)
            int r15 = r15 + 1
            r5 = 0
            r8 = 0
            r10 = 2131429745(0x7f0b0971, float:1.8481171E38)
            r13 = 1
            goto L_0x00b4
        L_0x00de:
            boolean r5 = r3.a
            if (r5 != 0) goto L_0x00e6
            r5 = 1
            goto L_0x00e7
        L_0x00e4:
            r14 = r18
        L_0x00e6:
            r5 = 0
        L_0x00e7:
            adhe r7 = r0.d
            java.util.ArrayList r8 = r7.a
            int r8 = r8.size()
            if (r4 >= r8) goto L_0x016d
            r8 = 2131429824(0x7f0b09c0, float:1.8481332E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.CheckBox r8 = (android.widget.CheckBox) r8
            if (r8 != 0) goto L_0x0101
            r5 = 0
            r6 = 1
            r12 = 0
            goto L_0x0176
        L_0x0101:
            if (r5 == 0) goto L_0x015f
            adhd r5 = new adhd
            r10 = 2131429745(0x7f0b0971, float:1.8481171E38)
            android.view.View r10 = r6.findViewById(r10)
            adgg r11 = r7.b
            r5.<init>(r10, r8, r4, r11)
            java.util.ArrayList r10 = r7.a
            java.lang.Object r10 = r10.get(r4)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L_0x011f
            boolean r10 = r3.a
            r11 = 1
            goto L_0x0129
        L_0x011f:
            int r10 = r10.intValue()
            r11 = 1
            if (r10 != r11) goto L_0x0128
            r10 = 1
            goto L_0x0129
        L_0x0128:
            r10 = 0
        L_0x0129:
            r8.setChecked(r10)
            r8.setOnCheckedChangeListener(r5)
            r12 = 2131428624(0x7f0b0510, float:1.8478898E38)
            android.view.View r6 = r6.findViewById(r12)
            r6.setOnClickListener(r5)
            int r12 = android.os.Build.VERSION.SDK_INT
            adhc r12 = new adhc
            r12.<init>(r7, r8)
            r6.setAccessibilityDelegate(r12)
            int r6 = android.os.Build.VERSION.SDK_INT
            com.google.android.chimera.Fragment r6 = r7.c
            com.google.android.chimera.Activity r6 = r6.getActivity()
            r7 = 2130772079(0x7f01006f, float:1.7147266E38)
            android.animation.StateListAnimator r6 = android.animation.AnimatorInflater.loadStateListAnimator(r6, r7)
            r8.setStateListAnimator(r6)
            r12 = 0
            r5.onCheckedChanged(r12, r10)
            r5 = 0
            r8.setVisibility(r5)
            r6 = 1
            goto L_0x0176
        L_0x015f:
            r5 = 0
            r11 = 1
            r12 = 0
            r6 = 8
            r8.setVisibility(r6)
            java.util.ArrayList r6 = r7.a
            r6.set(r4, r12)
            goto L_0x0170
        L_0x016d:
            r5 = 0
            r11 = 1
            r12 = 0
        L_0x0170:
            r6 = 1
            goto L_0x0176
        L_0x0172:
            r14 = r18
            r12 = r8
            r6 = 0
        L_0x0176:
            int r4 = r4 + 1
            r8 = r12
            goto L_0x002a
        L_0x017b:
            r5 = r6
            goto L_0x017e
        L_0x017d:
        L_0x017e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adgi.a(android.view.LayoutInflater, adfk, atyx, com.google.android.gms.udc.ConsentFlowConfig, int):boolean");
    }
}
