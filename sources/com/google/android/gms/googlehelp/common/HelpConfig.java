package com.google.android.gms.googlehelp.common;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HelpConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new nzt();
    public static final Set a;
    public ThemeSettings A;
    public PendingIntent B;
    Boolean C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    @Deprecated
    public String I;
    @Deprecated
    public String J;
    public String K;
    public String L;
    public Map M;
    public boolean N;
    public String O;
    public int P;
    public String Q;
    public float R;
    public long S;
    public boolean T;
    public String U;
    public String V;
    public String W;
    public int X;
    public int Y;
    private int Z;
    public String b;
    public String c;
    public Account d;
    public String e;
    public Bundle f;
    boolean g;
    public boolean h;
    List i;
    public avnq j;
    public avob k;
    public int l;
    @Deprecated
    public Bundle m;
    @Deprecated
    public Bitmap n;
    @Deprecated
    public byte[] o;
    @Deprecated
    public int p;
    @Deprecated
    public int q;
    public String r;
    Uri s;
    public List t;
    List u;
    boolean v;
    public boolean w;
    public int x;
    public String y;
    public ErrorReport z;

    static {
        avmt avmt = avmt.HANGOUTS;
        avmt avmt2 = avmt.CHAT;
        avmt avmt3 = avmt.PHONE;
        avmt avmt4 = avmt.EMAIL;
        Set a2 = jir.a(4, false);
        a2.add(avmt);
        a2.add(avmt2);
        a2.add(avmt3);
        a2.add(avmt4);
        a = Collections.unmodifiableSet(a2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HelpConfig() {
        /*
            r38 = this;
            r0 = r38
            java.util.ArrayList r1 = new java.util.ArrayList
            r8 = r1
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r19 = r1
            r1.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r20 = r1
            r1.<init>()
            com.google.android.gms.feedback.ErrorReport r1 = new com.google.android.gms.feedback.ErrorReport
            r25 = r1
            r1.<init>()
            com.google.android.gms.feedback.ThemeSettings r1 = new com.google.android.gms.feedback.ThemeSettings
            r26 = r1
            r1.<init>()
            r1 = 1
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r1)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 1
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r29 = -1
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.common.HelpConfig.<init>():void");
    }

    private final String J() {
        return ofq.a(axqt.b()) ? (String) this.M.get(nzh.t) : this.I;
    }

    private final boolean K() {
        if (!b()) {
            return false;
        }
        avnn avnn = this.j.d;
        if (avnn == null) {
            avnn = avnn.d;
        }
        if (!avnn.c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.googlehelp.common.HelpConfig a(com.google.android.chimera.Activity r6, android.os.Bundle r7, android.content.Intent r8) {
        /*
            r0 = 1
            java.lang.String r1 = "EXTRA_START_TICK"
            java.lang.String r2 = "EXTRA_HELP_CONFIG"
            if (r7 == 0) goto L_0x001b
            android.os.Parcelable r6 = r7.getParcelable(r2)
            com.google.android.gms.googlehelp.common.HelpConfig r6 = (com.google.android.gms.googlehelp.common.HelpConfig) r6
            if (r6 == 0) goto L_0x001a
            long r2 = java.lang.System.nanoTime()
            long r7 = r7.getLong(r1, r2)
            r6.a((boolean) r0, (long) r7)
        L_0x001a:
            return r6
        L_0x001b:
            r7 = 0
            java.lang.String r3 = "gH_HelpConfig"
            if (r8 != 0) goto L_0x0026
            java.lang.String r6 = "Can't construct HelpConfig; calling intent is null."
            android.util.Log.e(r3, r6)
            return r7
        L_0x0026:
            java.lang.String r4 = "EXTRA_IN_PRODUCT_HELP"
            boolean r5 = r8.hasExtra(r4)
            if (r5 == 0) goto L_0x0083
            android.os.Parcelable$Creator r7 = com.google.android.gms.googlehelp.InProductHelp.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r7 = defpackage.ivy.a((android.content.Intent) r8, (java.lang.String) r4, (android.os.Parcelable.Creator) r7)
            com.google.android.gms.googlehelp.InProductHelp r7 = (com.google.android.gms.googlehelp.InProductHelp) r7
            com.google.android.gms.googlehelp.GoogleHelp r2 = r7.a
            b((com.google.android.gms.googlehelp.GoogleHelp) r2, (android.content.Context) r6)
            com.google.android.gms.googlehelp.GoogleHelp r2 = r7.a
            com.google.android.gms.googlehelp.common.HelpConfig r2 = a((com.google.android.gms.googlehelp.GoogleHelp) r2, (android.content.Context) r6)
            java.lang.String r4 = r7.b
            r2.U = r4
            java.lang.String r4 = r7.c
            r2.V = r4
            boolean r4 = defpackage.axps.b()
            boolean r4 = defpackage.ofq.a(r4)
            if (r4 == 0) goto L_0x0074
            boolean r4 = defpackage.axqh.b()
            boolean r4 = defpackage.ofq.b(r4)
            if (r4 == 0) goto L_0x006b
            int r4 = r7.d
            r2.Z = r4
            int r4 = r7.f
            r2.X = r4
            java.lang.String r7 = r7.e
            r2.W = r7
            goto L_0x00a8
        L_0x006b:
            int r4 = r7.d
            r2.Z = r4
            java.lang.String r7 = r7.e
            r2.W = r7
            goto L_0x00a8
        L_0x0074:
            boolean r4 = defpackage.axpg.b()
            boolean r4 = defpackage.ofq.a(r4)
            if (r4 == 0) goto L_0x00a8
            int r7 = r7.d
            r2.Z = r7
            goto L_0x00a8
        L_0x0083:
            java.lang.String r4 = "EXTRA_GOOGLE_HELP"
            boolean r5 = r8.hasExtra(r4)
            if (r5 == 0) goto L_0x009a
            android.os.Parcelable r7 = r8.getParcelableExtra(r4)
            com.google.android.gms.googlehelp.GoogleHelp r7 = (com.google.android.gms.googlehelp.GoogleHelp) r7
            b((com.google.android.gms.googlehelp.GoogleHelp) r7, (android.content.Context) r6)
            com.google.android.gms.googlehelp.common.HelpConfig r2 = a((com.google.android.gms.googlehelp.GoogleHelp) r7, (android.content.Context) r6)
            goto L_0x00a8
        L_0x009a:
            boolean r4 = r8.hasExtra(r2)
            if (r4 == 0) goto L_0x0119
            android.os.Parcelable r7 = r8.getParcelableExtra(r2)
            r2 = r7
            com.google.android.gms.googlehelp.common.HelpConfig r2 = (com.google.android.gms.googlehelp.common.HelpConfig) r2
        L_0x00a8:
            boolean r7 = r8.hasExtra(r1)
            if (r7 == 0) goto L_0x00b6
            r4 = -1
            long r4 = r8.getLongExtra(r1, r4)
            goto L_0x00ba
        L_0x00b6:
            long r4 = java.lang.System.nanoTime()
        L_0x00ba:
            r2.a((boolean) r7, (long) r4)
            java.lang.String r7 = r2.b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x00f6
            java.lang.String r7 = defpackage.jhg.a((com.google.android.chimera.Activity) r6)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x00f4
            java.lang.String r7 = "Received empty package name, and can't continue. Please fix help integration"
            android.util.Log.e(r3, r7)
            android.content.Intent r7 = new android.content.Intent
            java.lang.String r8 = "android.intent.action.VIEW"
            r7.<init>(r8)
            java.lang.String r8 = defpackage.axmj.z()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            android.content.Intent r7 = r7.setData(r8)
            boolean r8 = defpackage.jhg.a((android.content.Context) r6, (android.content.Intent) r7)
            if (r8 == 0) goto L_0x00f0
            r6.startActivity(r7)
        L_0x00f0:
            r6.finish()
            return r2
        L_0x00f4:
            r2.b = r7
        L_0x00f6:
            r7 = 0
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0108 }
            java.lang.String r8 = r2.b     // Catch:{ NameNotFoundException -> 0x0108 }
            android.content.pm.ApplicationInfo r8 = r6.getApplicationInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x0108 }
            java.lang.CharSequence r6 = r6.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0108 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NameNotFoundException -> 0x0108 }
            goto L_0x0118
        L_0x0108:
            r6 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.String r0 = r2.b
            r8[r7] = r0
            java.lang.String r7 = "Fetching ApplicationInfo of %s failed."
            java.lang.String r7 = java.lang.String.format(r7, r8)
            android.util.Log.w(r3, r7, r6)
        L_0x0118:
            return r2
        L_0x0119:
            java.lang.String r6 = java.lang.String.valueOf(r8)
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r8 = r8 + 45
            r0.<init>(r8)
            java.lang.String r8 = "HelpConfig could not be created from intent: "
            r0.append(r8)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r3, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.common.HelpConfig.a(com.google.android.chimera.Activity, android.os.Bundle, android.content.Intent):com.google.android.gms.googlehelp.common.HelpConfig");
    }

    private static void b(GoogleHelp googleHelp, Context context) {
        Bundle c2;
        nyt nyt = new nyt(googleHelp);
        if ((!nyt.g() && !nyt.h()) || (c2 = nyt.c()) == null) {
            return;
        }
        if (c2.containsKey("gms:googlehelp:sync_help_psd_collection_time_ms")) {
            ofx.a(138, Long.valueOf(c2.getString("gms:googlehelp:sync_help_psd_collection_time_ms")).longValue(), googleHelp, context);
        } else if (c2.containsKey("gms:googlehelp:sync_help_psd_failure")) {
            ofx.a(106, c2.getString("gms:googlehelp:sync_help_psd_failure"), googleHelp, context);
        } else {
            if (c2.containsKey("gms:googlehelp:async_help_psd_failure") && TextUtils.equals("null_api_client", c2.getString("gms:googlehelp:async_help_psd_failure"))) {
                ofx.a(105, 143, googleHelp, context);
            }
            if (c2.containsKey("gms:feedback:async_feedback_psd_failure") && TextUtils.equals("null_api_client", c2.getString("gms:feedback:async_feedback_psd_failure"))) {
                ofx.a(104, 143, googleHelp, context);
            }
            if (c2.containsKey("gms:feedback:async_feedback_psbd_failure") && TextUtils.equals("null_api_client", c2.getString("gms:feedback:async_feedback_psbd_failure"))) {
                ofx.a(103, 143, googleHelp, context);
            }
        }
    }

    public final boolean A() {
        return this.S != -1;
    }

    public final boolean B() {
        return !TextUtils.isEmpty(this.U);
    }

    public final boolean C() {
        return !TextUtils.isEmpty(this.V);
    }

    public final boolean D() {
        return this.Z == 1;
    }

    public final boolean E() {
        return Boolean.parseBoolean(a(nzh.p));
    }

    public final String F() {
        if (TextUtils.isEmpty(a(nzh.q))) {
            return "";
        }
        String valueOf = String.valueOf(axmj.z());
        String valueOf2 = String.valueOf(a(nzh.q));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public final String G() {
        if (TextUtils.isEmpty(a(nzh.r))) {
            return "";
        }
        String valueOf = String.valueOf(axmj.z());
        String valueOf2 = String.valueOf(a(nzh.r));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public final boolean H() {
        return !TextUtils.isEmpty(G()) || !TextUtils.isEmpty(F());
    }

    public final void I() {
        this.w = true;
    }

    public final void a(boolean z2, long j2) {
        this.T = z2;
        this.S = j2;
    }

    public final String c() {
        return ofq.a(axqt.b()) ? (String) this.M.get(nzh.s) : this.J;
    }

    public final boolean d() {
        return !TextUtils.isEmpty(this.c);
    }

    public final String e() {
        avnq avnq;
        String a2 = a(nzh.c);
        if (!(!TextUtils.isEmpty(a2) || (avnq = this.j) == null || (avnq.a & 2048) == 0)) {
            avnu avnu = avnq.h;
            if (avnu == null) {
                avnu = avnu.c;
            }
            a2 = avnu.b;
        }
        if (!ofq.b(axpp.b()) || !TextUtils.isEmpty(a2)) {
            return a2;
        }
        return !TextUtils.isEmpty(this.K) ? this.K : "";
    }

    public final String f() {
        avnq avnq = this.j;
        if (!(avnq == null || (avnq.a & 8) == 0)) {
            avno avno = avnq.e;
            if (avno == null) {
                avno = avno.c;
            }
            if (!avno.b.isEmpty()) {
                avno avno2 = this.j.e;
                if (avno2 == null) {
                    avno2 = avno.c;
                }
                return avno2.b;
            }
        }
        return null;
    }

    public final boolean g() {
        return this.d != null;
    }

    public final boolean h() {
        return i() >= 0;
    }

    public final int i() {
        try {
            return Integer.parseInt(a(nzh.b));
        } catch (NumberFormatException e2) {
            return -1;
        }
    }

    public final boolean j() {
        return b(avmt.C2C);
    }

    public final boolean k() {
        int a2;
        avob avob = this.k;
        if (avob == null || (((a2 = avod.a(avob.b)) == 0 || a2 != 2) && !l())) {
            return false;
        }
        return true;
    }

    public final boolean l() {
        return m() || n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = defpackage.avod.a(r0.b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m() {
        /*
            r2 = this;
            avob r0 = r2.k
            if (r0 == 0) goto L_0x0011
            int r0 = r0.b
            int r0 = defpackage.avod.a(r0)
            if (r0 == 0) goto L_0x0011
            r1 = 3
            if (r0 != r1) goto L_0x0011
            r0 = 1
            return r0
        L_0x0011:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.common.HelpConfig.m():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = defpackage.avod.a(r0.b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n() {
        /*
            r2 = this;
            avob r0 = r2.k
            if (r0 == 0) goto L_0x0011
            int r0 = r0.b
            int r0 = defpackage.avod.a(r0)
            if (r0 == 0) goto L_0x0011
            r1 = 4
            if (r0 != r1) goto L_0x0011
            r0 = 1
            return r0
        L_0x0011:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.common.HelpConfig.n():boolean");
    }

    public final boolean o() {
        return !ofq.a(axqt.b()) ? !TextUtils.isEmpty(this.I) || K() : (E() && !TextUtils.isEmpty(F()) && !TextUtils.isEmpty(J())) || K();
    }

    public final String p() {
        if (!TextUtils.isEmpty(J())) {
            return J();
        }
        if (!b()) {
            return null;
        }
        avnn avnn = this.j.d;
        if (avnn == null) {
            avnn = avnn.d;
        }
        return avnn.c;
    }

    public final boolean q() {
        avnq avnq = this.j;
        if (avnq == null || (avnq.a & FragmentTransaction.TRANSIT_ENTER_MASK) == 0) {
            return false;
        }
        avnt avnt = avnq.i;
        if (avnt == null) {
            avnt = avnt.c;
        }
        if (!TextUtils.isEmpty(avnt.b)) {
            return true;
        }
        return false;
    }

    public final List r() {
        if (a(avmt.PHONE)) {
            avnv avnv = this.j.c;
            if (avnv == null) {
                avnv = avnv.b;
            }
            if (avnv.a.size() > 0) {
                avnv avnv2 = this.j.c;
                if (avnv2 == null) {
                    avnv2 = avnv.b;
                }
                return avnv2.a;
            }
        }
        return this.i;
    }

    public final boolean s() {
        if (!a(avmt.EMAIL)) {
            return false;
        }
        avnp avnp = this.j.b;
        if (avnp == null) {
            avnp = avnp.e;
        }
        if ((avnp.a & 4) != 0) {
            return true;
        }
        return false;
    }

    public final avng t() {
        if (!a(avmt.EMAIL)) {
            return null;
        }
        avnp avnp = this.j.b;
        if (avnp == null) {
            avnp = avnp.e;
        }
        avng avng = avnp.c;
        return avng == null ? avng.f : avng;
    }

    public final Set u() {
        avnq avnq = this.j;
        if (avnq != null) {
            avns avns = avnq.f;
            if (avns == null) {
                avns = avns.c;
            }
            if (avns.a.size() > 0) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(a.size());
                avns avns2 = this.j.f;
                if (avns2 == null) {
                    avns2 = avns.c;
                }
                int size = avns2.a.size();
                for (int i2 = 0; i2 < size; i2++) {
                    avns avns3 = this.j.f;
                    if (avns3 == null) {
                        avns3 = avns.c;
                    }
                    linkedHashSet.add((avmt) avns.b.a(Integer.valueOf(avns3.a.c(i2))));
                }
                linkedHashSet.addAll(a);
                return linkedHashSet;
            }
        }
        return a;
    }

    public final String v() {
        String a2 = a(nzh.d);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        Uri uri = this.s;
        if (uri == null) {
            return nzh.d.v;
        }
        return uri.toString();
    }

    public final boolean w() {
        List list = this.u;
        return list != null && !list.isEmpty();
    }

    public final List x() {
        if (this.u == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        List list = this.u;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(oab.a((OfflineSuggestion) list.get(i2)));
        }
        return arrayList;
    }

    public final boolean y() {
        if (this.w) {
            return true;
        }
        String a2 = a(nzh.e);
        return !TextUtils.isEmpty(a2) ? a2.equalsIgnoreCase("top") : this.v;
    }

    public final boolean z() {
        return !TextUtils.isEmpty(this.O);
    }

    public final boolean d(Context context) {
        List r2 = r();
        if (context == null || r2.isEmpty() || !jkf.a(context, (String) r2.get(0))) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle;
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, i2, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.a(parcel, 8, this.g);
        ivx.a(parcel, 9, this.h);
        ivx.b(parcel, 11, this.i, false);
        ivx.a(parcel, 15, this.m, false);
        ivx.a(parcel, 16, this.n, i2, false);
        ivx.a(parcel, 19, this.r, false);
        ivx.a(parcel, 22, this.s, i2, false);
        ivx.c(parcel, 23, this.t, false);
        ivx.c(parcel, 25, this.u, false);
        ivx.a(parcel, 31, this.y, false);
        ivx.a(parcel, 32, this.o, false);
        ivx.b(parcel, 33, this.p);
        ivx.b(parcel, 34, this.q);
        avnq avnq = this.j;
        Bundle bundle2 = null;
        if (avnq != null) {
            bundle = new Bundle();
            bundle.putByteArray("EXTRA_ESCALATION_OPTIONS", avnq.k());
        } else {
            bundle = null;
        }
        ivx.a(parcel, 35, bundle, false);
        ivx.b(parcel, 36, this.l);
        ivx.a(parcel, 38, this.v);
        ivx.a(parcel, 39, this.z, i2, false);
        ivx.a(parcel, 41, this.A, i2, false);
        ivx.a(parcel, 42, this.w);
        ivx.b(parcel, 43, this.x);
        avob avob = this.k;
        if (avob != null) {
            bundle2 = new Bundle();
            bundle2.putByteArray("EXTRA_REALTIME_SUPPORT_STATUS", avob.k());
        }
        ivx.a(parcel, 50, bundle2, false);
        ivx.a(parcel, 52, this.B, i2, false);
        ivx.a(parcel, 53, this.C);
        ivx.b(parcel, 56, this.D);
        ivx.a(parcel, 57, this.E);
        ivx.a(parcel, 58, this.F);
        ivx.a(parcel, 59, this.G);
        ivx.a(parcel, 60, this.H);
        ivx.a(parcel, 61, this.I, false);
        ivx.a(parcel, 62, this.J, false);
        ivx.a(parcel, 63, this.K, false);
        ivx.a(parcel, 64, this.L, false);
        ivx.b(parcel, a2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HelpConfig(java.lang.String r8, java.lang.String r9, android.accounts.Account r10, java.lang.String r11, android.os.Bundle r12, boolean r13, boolean r14, java.util.List r15, android.os.Bundle r16, android.os.Bundle r17, int r18, android.os.Bundle r19, android.graphics.Bitmap r20, byte[] r21, int r22, int r23, java.lang.String r24, android.net.Uri r25, java.util.List r26, java.util.List r27, boolean r28, boolean r29, int r30, java.lang.String r31, com.google.android.gms.feedback.ErrorReport r32, com.google.android.gms.feedback.ThemeSettings r33, android.app.PendingIntent r34, java.lang.Boolean r35, int r36, boolean r37, boolean r38, boolean r39, boolean r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44) {
        /*
            r7 = this;
            r1 = r7
            r0 = r16
            r2 = r17
            r7.<init>()
            r3 = 0
            r1.Z = r3
            r1.X = r3
            r4 = r36
            r1.D = r4
            r4 = r37
            r1.E = r4
            r4 = r38
            r1.F = r4
            r4 = r39
            r1.G = r4
            r4 = r8
            r1.b = r4
            r4 = r44
            r1.L = r4
            r4 = r9
            r1.c = r4
            r4 = r10
            r1.d = r4
            r4 = r11
            r1.e = r4
            boolean r4 = defpackage.axqb.d()
            boolean r4 = defpackage.ofq.b(r4)
            if (r4 == 0) goto L_0x003e
            android.os.Bundle r4 = defpackage.ofx.a((android.os.Bundle) r12)
            r1.f = r4
            goto L_0x0041
        L_0x003e:
            r4 = r12
            r1.f = r4
        L_0x0041:
            r4 = r13
            r1.g = r4
            r4 = r14
            r1.h = r4
            r4 = r40
            r1.H = r4
            r4 = r15
            r1.i = r4
            r4 = 0
            if (r0 == 0) goto L_0x006b
            java.lang.String r5 = "EXTRA_ESCALATION_OPTIONS"
            boolean r6 = r0.containsKey(r5)
            if (r6 == 0) goto L_0x006b
            byte[] r0 = r0.getByteArray(r5)     // Catch:{ auda -> 0x006a }
            aubs r5 = defpackage.aubs.c()     // Catch:{ auda -> 0x006a }
            avnq r6 = defpackage.avnq.j     // Catch:{ auda -> 0x006a }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r6, (byte[]) r0, (defpackage.aubs) r5)     // Catch:{ auda -> 0x006a }
            avnq r0 = (defpackage.avnq) r0     // Catch:{ auda -> 0x006a }
            goto L_0x006c
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            r0 = r4
        L_0x006c:
            r1.j = r0
            if (r2 == 0) goto L_0x008b
            java.lang.String r0 = "EXTRA_REALTIME_SUPPORT_STATUS"
            boolean r5 = r2.containsKey(r0)
            if (r5 == 0) goto L_0x008b
            byte[] r0 = r2.getByteArray(r0)     // Catch:{ auda -> 0x008a }
            aubs r2 = defpackage.aubs.c()     // Catch:{ auda -> 0x008a }
            avob r5 = defpackage.avob.c     // Catch:{ auda -> 0x008a }
            aucj r0 = defpackage.aucj.a((defpackage.aucj) r5, (byte[]) r0, (defpackage.aubs) r2)     // Catch:{ auda -> 0x008a }
            avob r0 = (defpackage.avob) r0     // Catch:{ auda -> 0x008a }
            r4 = r0
            goto L_0x008c
        L_0x008a:
            r0 = move-exception
        L_0x008b:
        L_0x008c:
            r1.k = r4
            r2 = r18
            r1.l = r2
            r2 = r31
            r1.y = r2
            boolean r0 = defpackage.axqt.b()
            boolean r0 = defpackage.ofq.a(r0)
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a9
        L_0x00a1:
            r2 = r41
            r1.I = r2
            r2 = r42
            r1.J = r2
        L_0x00a9:
            r2 = r34
            r1.B = r2
            boolean r0 = defpackage.axqb.d()
            boolean r0 = defpackage.ofq.b(r0)
            if (r0 == 0) goto L_0x00be
            android.os.Bundle r0 = defpackage.ofx.a((android.os.Bundle) r19)
            r1.m = r0
            goto L_0x00c2
        L_0x00be:
            r2 = r19
            r1.m = r2
        L_0x00c2:
            r2 = r20
            r1.n = r2
            r2 = r21
            r1.o = r2
            r2 = r22
            r1.p = r2
            r2 = r23
            r1.q = r2
            r2 = r32
            r1.z = r2
            r2 = r24
            r1.r = r2
            r2 = r25
            r1.s = r2
            r2 = r26
            r1.t = r2
            r2 = r33
            r1.A = r2
            r2 = r27
            r1.u = r2
            r2 = r28
            r1.v = r2
            r2 = r29
            r1.w = r2
            r2 = r30
            r1.x = r2
            nz r0 = new nz
            r0.<init>()
            r1.M = r0
            r1.N = r3
            java.lang.String r0 = ""
            r1.O = r0
            r2 = 1
            r1.Y = r2
            r2 = -1
            r1.P = r2
            r1.Q = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.R = r0
            r4 = -1
            r1.S = r4
            r1.T = r3
            r2 = r35
            r1.C = r2
            r2 = r43
            r1.K = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.common.HelpConfig.<init>(java.lang.String, java.lang.String, android.accounts.Account, java.lang.String, android.os.Bundle, boolean, boolean, java.util.List, android.os.Bundle, android.os.Bundle, int, android.os.Bundle, android.graphics.Bitmap, byte[], int, int, java.lang.String, android.net.Uri, java.util.List, java.util.List, boolean, boolean, int, java.lang.String, com.google.android.gms.feedback.ErrorReport, com.google.android.gms.feedback.ThemeSettings, android.app.PendingIntent, java.lang.Boolean, int, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void c(Context context) {
        String b2 = ofx.b(this.S);
        GoogleHelp googleHelp = new GoogleHelp(this.c);
        Account account = this.d;
        if (account != null && !TextUtils.isEmpty(account.name)) {
            googleHelp.c = new Account(this.d.name, "com.google");
        }
        googleHelp.e = this.b;
        nyt nyt = new nyt(googleHelp);
        nyt.a(this.e);
        Bundle a2 = ofx.a(context, b2, nyt.a);
        if (a2 != null) {
            this.G = true;
        }
        if (a2 != null) {
            Bundle bundle = this.f;
            if (bundle != null) {
                bundle.putAll(a2);
            } else {
                this.f = a2;
            }
        } else if (System.nanoTime() - this.S > axmj.a.a().M() * 1000000) {
            if (this.f == null) {
                this.f = new Bundle(1);
            }
            this.f.putString("gms:googlehelp:async_help_psd_failure", "timeout");
            this.G = true;
        }
    }

    public final Bundle b(Context context) {
        if (this.E && !this.G) {
            c(context);
        }
        return this.f;
    }

    public final void b(String str, Context context) {
        if (ofq.a(axqt.b())) {
            this.M.put(nzh.t, str);
            nzp a2 = new nzr(context, this).a();
            a2.b(this.M);
            a2.a(this.M);
            a2.a();
            return;
        }
        this.I = str;
    }

    public final boolean b() {
        return a(avmt.CHAT);
    }

    public final boolean b(avmt avmt) {
        if (avmt == avmt.PHONE && !r().isEmpty()) {
            return true;
        }
        if (this.j == null || !a(avmt)) {
            return false;
        }
        int ordinal = avmt.ordinal();
        if (ordinal == 1) {
            avnn avnn = this.j.d;
            if (avnn == null) {
                avnn = avnn.d;
            }
            return avnn.b;
        } else if (ordinal == 2) {
            return true;
        } else {
            if (ordinal == 3) {
                avnp avnp = this.j.b;
                if (avnp == null) {
                    avnp = avnp.e;
                }
                return avnp.b;
            } else if (ordinal != 6) {
                return false;
            } else {
                avno avno = this.j.e;
                if (avno == null) {
                    avno = avno.c;
                }
                return avno.a;
            }
        }
    }

    public static HelpConfig a(GoogleHelp googleHelp, Context context) {
        String str;
        String str2;
        GoogleHelp googleHelp2 = googleHelp;
        nyt nyt = new nyt(googleHelp2);
        String b2 = TextUtils.isEmpty(nyt.e()) ? myo.b() : nyt.e();
        String a2 = nyt.a();
        String a3 = nyt.a();
        String str3 = null;
        if (!ofq.b(axqq.a.a().a()) || !TextUtils.isEmpty(a3)) {
            if (!TextUtils.isEmpty(nyt.b())) {
                str2 = nyt.b();
            } else {
                str2 = (nyt.c() == null || !nyt.c().containsKey("genie-eng:app_pkg_name")) ? null : nyt.c().getString("genie-eng:app_pkg_name");
            }
            if (!TextUtils.isEmpty(str2)) {
                aucd o2 = olo.I.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                olo olo = (olo) o2.b;
                b2.getClass();
                int i2 = olo.a | 64;
                olo.a = i2;
                olo.i = b2;
                a3.getClass();
                int i3 = i2 | 2;
                olo.a = i3;
                olo.d = a3;
                olo.j = 169;
                olo.a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                if (ofx.a(a3, axpm.a.a().a())) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    olo olo2 = (olo) o2.b;
                    olo2.k = 20;
                    olo2.a |= 1024;
                    str3 = str2;
                } else {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    olo olo3 = (olo) o2.b;
                    olo3.k = 21;
                    olo3.a |= 1024;
                }
                MetricsIntentOperation.a(context, (olo) o2.i(), false);
                str = str3;
            } else {
                Context context2 = context;
                str = null;
            }
        } else {
            Context context3 = context;
            str = null;
        }
        Account account = nyt.a.c;
        if (account == null && nyt.f()) {
            List a4 = nzs.a(context);
            if (!a4.isEmpty()) {
                account = (Account) a4.get(0);
            }
        }
        String str4 = googleHelp2.b;
        Bundle c2 = nyt.c();
        GoogleHelp googleHelp3 = nyt.a;
        Uri uri = googleHelp2.q;
        List list = googleHelp3.r;
        List list2 = googleHelp3.t;
        boolean z2 = googleHelp3.u;
        ErrorReport i4 = nyt.i();
        GoogleHelp googleHelp4 = nyt.a;
        return new HelpConfig(a2, str4, account, b2, c2, googleHelp3.h, googleHelp3.i, googleHelp3.j, (Bundle) null, (Bundle) null, 0, googleHelp2.k, googleHelp2.l, googleHelp2.m, googleHelp2.n, googleHelp2.o, googleHelp3.p, uri, list, list2, z2, false, 0, (String) null, i4, googleHelp4.s, googleHelp4.y, true, nyt.a.z, nyt.g(), nyt.h(), false, nyt.f(), (String) null, (String) null, (String) null, str);
    }

    public final HelpConfig a() {
        HelpConfig helpConfig = new HelpConfig();
        helpConfig.b = this.b;
        helpConfig.L = this.L;
        helpConfig.c = this.c;
        helpConfig.d = this.d;
        helpConfig.e = this.e;
        helpConfig.f = this.f;
        helpConfig.A = this.A;
        helpConfig.x = this.x;
        return helpConfig;
    }

    public final String a(nzh nzh) {
        String str = (String) this.M.get(nzh);
        return str == null ? nzh.v : str;
    }

    public final List a(Context context) {
        Bundle b2 = b(context);
        ArrayList arrayList = null;
        if (b2 != null) {
            Set<String> keySet = b2.keySet();
            if (!keySet.isEmpty()) {
                arrayList = new ArrayList(keySet.size());
                for (String str : keySet) {
                    arrayList.add(oaq.a(str, b2.getString(str)));
                }
            }
        }
        return arrayList;
    }

    public final void a(avnq avnq) {
        this.j = avnq;
        int i2 = 0;
        if (axms.a.a().b() && o()) {
            i2 = 3;
        }
        this.l = i2;
    }

    public final void a(String str, Context context) {
        if (ofq.a(axqt.b())) {
            this.M.put(nzh.s, str);
            nzp a2 = new nzr(context, this).a();
            a2.b(this.M);
            a2.a(this.M);
            a2.a();
            return;
        }
        this.J = str;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(avmt avmt) {
        if (this.j == null) {
            return false;
        }
        avmt avmt2 = avmt.UNKNOWN_CONTACT_MODE;
        int ordinal = avmt.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal == 6 && (this.j.a & 8) != 0 : (this.j.a & 1) != 0 : (this.j.a & 2) != 0 : (this.j.a & 4) != 0;
    }
}
