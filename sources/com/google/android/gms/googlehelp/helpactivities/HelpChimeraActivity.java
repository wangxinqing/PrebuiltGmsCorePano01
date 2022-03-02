package com.google.android.gms.googlehelp.helpactivities;

import android.accounts.Account;
import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.webkit.URLUtil;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import com.google.android.gms.googlehelp.fragments.AccountPickerContainer;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.metrics.ReportBatchedMetricsChimeraGcmTaskService;
import com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class HelpChimeraActivity extends oiy implements nzc, oat, nzu {
    private static final Set B = jir.b();
    private static int C;
    public static final String a;
    static final String b;
    private final Handler A = new qvr(Looper.getMainLooper());
    private ohd D;
    private ogo E;
    private oas F;
    private nzx G = new nzx();
    private final nzx H = new nzx();
    private boolean I = false;
    private boolean J = false;
    private boolean K;
    private final Set L = jir.b();
    private SparseArray M;
    public final aoru c = jfm.a(10);
    public final aoru d = jfm.a(9);
    public final ocr e = new ocr(this.d);
    public final myp f = new myp();
    public View g;
    public View h;
    public ogs i;
    public onf j;
    public ofn k;
    public oar l;
    public nze m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public ong q;
    public MenuItem r;
    public OpenSearchView s;
    public onc t;
    public final List u = jir.a();
    public Deque v;
    public one w;

    static {
        String valueOf = String.valueOf(ohd.class.getSimpleName());
        a = valueOf.length() == 0 ? new String("gH_HelpActivity-") : "gH_HelpActivity-".concat(valueOf);
        String valueOf2 = String.valueOf(ogo.class.getSimpleName());
        b = valueOf2.length() == 0 ? new String("gH_HelpActivity-") : "gH_HelpActivity-".concat(valueOf2);
    }

    public static final boolean P() {
        return ofq.a(axof.b()) && ofq.a(axor.b());
    }

    private final boolean Q() {
        return ofq.a(this.x.b, axnr.a.a().a(), axnr.a.a().c(), axnr.a.a().b());
    }

    private final void R() {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.googlehelp.helpactivities.ClickToCallActivity");
        HelpConfig helpConfig = this.x;
        HelpConfig a2 = helpConfig.a();
        aucd o2 = avnq.j.o();
        avno avno = helpConfig.j.e;
        if (avno == null) {
            avno = avno.c;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        avnq avnq = (avnq) o2.b;
        avno.getClass();
        avnq.e = avno;
        avnq.a |= 8;
        a2.j = (avnq) o2.i();
        a2.E = helpConfig.E;
        a2.G = helpConfig.G;
        startActivity(className.putExtra("EXTRA_HELP_CONFIG", a2).putExtra("EXTRA_START_TICK", this.x.S));
    }

    private final void S() {
        this.x.x = 0;
    }

    public static olo a(HelpChimeraActivity helpChimeraActivity) {
        aucd o2 = olo.I.o();
        int i2 = helpChimeraActivity.G().e;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        olo olo = (olo) o2.b;
        int i3 = olo.a | 2097152;
        olo.a = i3;
        olo.r = i2;
        olo.a = i3 | 16384;
        olo.o = -1;
        if (i2 != 2 || helpChimeraActivity.H() == null) {
            return (olo) o2.i();
        }
        nzv H2 = helpChimeraActivity.H();
        int i4 = H2.b;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        olo olo2 = (olo) o2.b;
        int i5 = olo2.a | 16384;
        olo2.a = i5;
        olo2.o = i4;
        String str = H2.c;
        str.getClass();
        int i6 = i5 | FragmentTransaction.TRANSIT_ENTER_MASK;
        olo2.a = i6;
        olo2.m = str;
        oab oab = H2.a;
        if (oab != null) {
            String str2 = oab.e;
            str2.getClass();
            olo2.a = i6 | FragmentTransaction.TRANSIT_EXIT_MASK;
            olo2.n = str2;
        }
        return (olo) o2.i();
    }

    private final void f(String str) {
        Log.e("gH_HelpActivity", str);
        setResult(0);
        finish();
    }

    private final void g(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String valueOf = String.valueOf(axmj.t());
            String valueOf2 = String.valueOf(str);
            intent.setData(Uri.parse(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2)));
            intent.addFlags(268435456);
            intent.addFlags(32768);
            startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            String valueOf3 = String.valueOf(axmj.a.a().ap());
            String valueOf4 = String.valueOf(str);
            intent2.setData(Uri.parse(valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4)));
            try {
                startActivity(intent2);
            } catch (ActivityNotFoundException e3) {
                Log.w("gH_HelpActivity", "Can't view GmsCore in Play Store", e3);
            }
        }
    }

    public final void A() {
        ajse ajse;
        View findViewById = findViewById(R.id.gh_help_toolbar);
        if ((!ofq.b(axpp.c()) || findViewById != null) && (ajse = (ajse) findViewById.getLayoutParams()) != null) {
            ajse.a = 21;
        }
    }

    public final void B() {
        okg.j(this);
        F();
    }

    public final void C() {
        if (!this.x.l()) {
            startActivity(new Intent().setClassName(this, "com.google.android.gms.googlehelp.contact.chat.ChatSupportRequestFormActivity").putExtra("EXTRA_HELP_CONFIG", this.x).putExtra("EXTRA_START_TICK", this.x.S));
            return;
        }
        ChatRequestAndConversationChimeraService.a((Context) this, this.x);
        startActivity(ChatConversationChimeraActivity.a(this, this.x));
    }

    public final void D() {
        if (axnz.a.a().c() || ofx.a(this.x.b, axnz.a.a().d())) {
            String e2 = this.x.e();
            if (TextUtils.isEmpty(e2)) {
                R();
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            String w2 = axmj.w();
            if (axor.c() && this.x.f() != null) {
                w2 = this.x.f();
            }
            String z = axmj.z();
            int length = String.valueOf(z).length();
            StringBuilder sb = new StringBuilder(length + 10 + String.valueOf(e2).length() + String.valueOf(w2).length());
            sb.append(z);
            sb.append("/");
            sb.append(e2);
            sb.append("/contact/");
            sb.append(w2);
            Intent data = intent.setData(Uri.parse(sb.toString()));
            data.putExtra("requireGcmToken", true);
            opa.a((Activity) this, data, this.x, 4);
            return;
        }
        R();
    }

    public final void E() {
        Intent className = new Intent().setClassName(this, "com.google.android.gms.googlehelp.helpactivities.EmailActivity");
        HelpConfig helpConfig = this.x;
        HelpConfig a2 = helpConfig.a();
        avnq avnq = helpConfig.j;
        if (!(avnq == null || (avnq.a & 1) == 0)) {
            aucd o2 = avnq.j.o();
            avnp avnp = helpConfig.j.b;
            if (avnp == null) {
                avnp = avnp.e;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avnq avnq2 = (avnq) o2.b;
            avnp.getClass();
            avnq2.b = avnp;
            avnq2.a |= 1;
            a2.j = (avnq) o2.i();
        }
        a2.E = helpConfig.E;
        a2.G = helpConfig.G;
        startActivity(className.putExtra("EXTRA_HELP_CONFIG", a2).putExtra("EXTRA_START_TICK", this.x.S));
    }

    /* access modifiers changed from: package-private */
    public final void F() {
        Screenshot screenshot;
        HelpConfig helpConfig = this.x;
        if (helpConfig.B != null && ofx.a(helpConfig.b, axmj.a.a().x())) {
            try {
                this.x.B.send();
                okg.a((nzu) this, true);
                return;
            } catch (Exception e2) {
                Log.w("gH_HelpActivity", "Could not launch custom Feedback, falling back to default case.", e2);
                okg.a((nzu) this, false);
            }
        }
        ErrorReport errorReport = this.x.z;
        if (errorReport == null) {
            errorReport = new ErrorReport();
        }
        if (TextUtils.isEmpty(errorReport.a.packageName)) {
            String str = this.x.b;
            String installerPackageName = getPackageManager().getInstallerPackageName(this.x.b);
            errorReport.a.packageName = str;
            errorReport.a.type = 11;
            errorReport.a.installerPackageName = installerPackageName;
        }
        if (this.x.g()) {
            errorReport.B = this.x.d.name;
        }
        Bundle bundle = this.x.m;
        if (bundle != null && bundle.size() > 0) {
            errorReport.D = this.x.m;
        }
        errorReport.Y = this.x.A;
        if (TextUtils.isEmpty(errorReport.T)) {
            HelpConfig helpConfig2 = this.x;
            byte[] bArr = helpConfig2.o;
            if (bArr != null) {
                screenshot = Screenshot.a(bArr, helpConfig2.p, helpConfig2.q);
            } else {
                Bitmap bitmap = helpConfig2.n;
                screenshot = bitmap != null ? Screenshot.a(bitmap) : null;
            }
            if (screenshot != null) {
                Screenshot.a(errorReport, screenshot);
            }
        }
        errorReport.ag = this.x.e;
        Intent intent = new Intent("android.intent.action.APP_ERROR");
        intent.setPackage(getPackageName());
        intent.addFlags(268435456);
        intent.putExtra("com.android.feedback.SAFEPARCELABLE_REPORT", errorReport);
        HelpConfig helpConfig3 = this.x;
        if (helpConfig3.F) {
            intent.putExtra("ASYNC_PSD_START_TICK_NANOS", helpConfig3.S);
        }
        startActivity(intent);
    }

    public final avmw G() {
        return (avmw) this.v.peek();
    }

    public final nzv H() {
        ohd y = y();
        if (!y.b.isEmpty()) {
            return (nzv) y.b.peek();
        }
        return null;
    }

    public final void I() {
        this.I = true;
        this.H.a();
        ogs ogs = this.i;
        if (PopularArticlesContainer.b()) {
            ogs.g().a();
        } else {
            ogs.g.a();
        }
        if (this.o && this.x.q()) {
            M();
        }
    }

    public final void J() {
        int i2 = this.x.l;
        if (i2 == 1) {
            a(37, avmt.CHAT);
        } else if (i2 == 2) {
            a(42, avmt.CHAT);
        }
    }

    public final void K() {
        ogo ogo = this.E;
        ogo.f = false;
        ogo.g = true;
        ogo.i.removeCallbacks(ogo.j);
        ogo.h = null;
        long currentTimeMillis = System.currentTimeMillis() - ogo.d;
        long aH = (long) ((int) axmj.a.a().aH());
        if (currentTimeMillis >= aH || ogo.d == -1) {
            ogo.a();
        } else if (!ogo.e) {
            ogo.i.postDelayed(ogo.k, aH - currentTimeMillis);
            ogo.e = true;
        }
    }

    public final boolean L() {
        return this.E.g;
    }

    /* access modifiers changed from: package-private */
    public final void M() {
        String str;
        int i2;
        boolean L2 = L();
        int i3 = ooe.e;
        HelpConfig helpConfig = this.x;
        if (helpConfig.q()) {
            avnt avnt = helpConfig.j.i;
            if (avnt == null) {
                avnt = avnt.c;
            }
            if (!TextUtils.isEmpty(avnt.a)) {
                avnt avnt2 = helpConfig.j.i;
                if (avnt2 == null) {
                    avnt2 = avnt.c;
                }
                String str2 = avnt2.b;
                avnt avnt3 = helpConfig.j.i;
                if (avnt3 == null) {
                    avnt3 = avnt.c;
                }
                String str3 = avnt3.a;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                sb.append(str2);
                sb.append("#");
                sb.append(str3);
                str = sb.toString();
            } else {
                avnt avnt4 = helpConfig.j.i;
                if (avnt4 == null) {
                    avnt4 = avnt.c;
                }
                str = avnt4.b;
            }
        } else {
            str = null;
        }
        if (str != null) {
            oab a2 = oab.a(str, oal.a(), helpConfig);
            if (!helpConfig.z() || !TextUtils.equals(helpConfig.O, a2.e)) {
                okg.a((nzu) this, a2);
            }
            if (!helpConfig.T) {
                i2 = 7;
            } else {
                i2 = 6;
            }
            new ooe(this, a2, nzv.a(24, 0, "", -1.0f, true, i2, ooe.a(helpConfig)), L2, false, true, Calendar.getInstance()).executeOnExecutor(this.d, new Void[0]);
        }
    }

    public final void N() {
        int i2;
        olo a2 = a(this);
        HelpConfig helpConfig = this.x;
        if (!helpConfig.T) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        myp myp = new myp(helpConfig.S);
        myp.c();
        okg.a((nzu) this, i2, myp.a(), avmw.a(a2.r), a2.m, a2.n, a2.o);
    }

    public final boolean O() {
        HelpConfig helpConfig = this.x;
        return helpConfig != null && helpConfig.H;
    }

    /* access modifiers changed from: package-private */
    public final void b(avmt avmt) {
        a(60, avmt);
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        opa.a((Activity) this, Uri.parse(str), this.x, this.y);
    }

    public final void d(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf)));
        startActivity(intent);
    }

    public final void e() {
        this.J = true;
        Intent intent = getIntent();
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.removeExtra("EXTRA_GOOGLE_HELP");
        }
        this.x.a((avnq) null);
        intent.putExtra("EXTRA_HELP_CONFIG", this.x);
        intent.putExtra("EXTRA_START_TICK", System.nanoTime());
        intent.addFlags(67108864);
        startActivity(intent);
    }

    public final ofn i() {
        return this.k;
    }

    public final oar j() {
        return this.l;
    }

    public final Context k() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        omi.a((String) null, this.d, this, this.x, this.k, this.y);
    }

    public final void m() {
        ajse ajse;
        View findViewById = findViewById(R.id.gh_help_toolbar);
        if ((!ofq.b(axpp.c()) || findViewById != null) && (ajse = (ajse) findViewById.getLayoutParams()) != null) {
            ajse.a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        ofp.a(this.c, (Context) this);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        ArrayList<String> stringArrayListExtra;
        if (i2 == 27 && i3 == -1 && (stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS")) != null && !stringArrayListExtra.isEmpty()) {
            this.q.a(stringArrayListExtra.get(0), true);
            this.w.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c6, code lost:
        if (((defpackage.nzv) r1.b.peek()).a() != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        if (r8.x.B() != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f4, code lost:
        if (defpackage.ofq.a(defpackage.axnz.c()) != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0110, code lost:
        if (r8.x.D() != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0159, code lost:
        if (r8.x.B() != false) goto L_0x01b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
            r8 = this;
            ogo r0 = r8.E
            nzj r1 = r0.h
            r2 = 8
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            boolean r5 = r1 instanceof defpackage.ood
            if (r5 != 0) goto L_0x0032
            boolean r1 = r1.b
            if (r1 != 0) goto L_0x0032
            r0.f = r3
            r0.g = r4
            android.os.Handler r1 = r0.i
            java.lang.Runnable r4 = r0.j
            r1.removeCallbacks(r4)
            nzj r1 = r0.h
            r1.c()
            r1 = 0
            r0.h = r1
            android.view.View r1 = r0.c
            r1.setVisibility(r3)
            android.view.View r0 = r0.b
            r0.setVisibility(r2)
            goto L_0x0196
        L_0x0032:
            avmw r0 = r8.G()
            avmt r1 = defpackage.avmt.UNKNOWN_CONTACT_MODE
            avmw r1 = defpackage.avmw.HELP_CONSOLE
            int r1 = r0.ordinal()
            if (r1 == 0) goto L_0x0183
            if (r1 == r4) goto L_0x0153
            r5 = 2
            if (r1 == r5) goto L_0x0047
            goto L_0x015c
        L_0x0047:
            ohd r1 = r8.y()
            java.util.Deque r5 = r1.b
            int r5 = r5.size()
            if (r5 > r4) goto L_0x011c
            java.util.Deque r4 = r1.b
            java.lang.Object r4 = r4.peek()
            nzv r4 = (defpackage.nzv) r4
            oab r4 = r4.a
            if (r4 == 0) goto L_0x0114
            boolean r5 = r4.j()
            if (r5 == 0) goto L_0x0066
        L_0x0065:
            goto L_0x006d
        L_0x0066:
            boolean r4 = r4.l()
            if (r4 == 0) goto L_0x0071
            goto L_0x0065
        L_0x006d:
            com.google.android.chimera.WebView r4 = r1.a
            if (r4 != 0) goto L_0x0072
        L_0x0071:
            goto L_0x009d
        L_0x0072:
            boolean r4 = r4.canGoBack()
            if (r4 == 0) goto L_0x009d
            com.google.android.chimera.WebView r4 = r1.a
            android.webkit.WebBackForwardList r4 = r4.copyBackForwardList()
            int r5 = r4.getCurrentIndex()
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x009d
            android.webkit.WebHistoryItem r4 = r4.getItemAtIndex(r5)
            java.lang.String r4 = r4.getUrl()
            java.lang.String r5 = "about:blank"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x009d
            com.google.android.chimera.WebView r0 = r1.a
            r0.goBack()
            goto L_0x0145
        L_0x009d:
            java.util.Deque r4 = r1.b
            java.lang.Object r4 = r4.peek()
            nzv r4 = (defpackage.nzv) r4
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x00ae
            r1.a()
        L_0x00ae:
            ohd r1 = r8.y()
            java.util.Deque r4 = r1.b
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x00c8
            java.util.Deque r1 = r1.b
            java.lang.Object r1 = r1.peek()
            nzv r1 = (defpackage.nzv) r1
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x01b9
        L_0x00c8:
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r8.x
            boolean r1 = r1.C()
            if (r1 != 0) goto L_0x01b9
            boolean r1 = defpackage.axoo.b()
            if (r1 != 0) goto L_0x00de
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r8.x
            boolean r1 = r1.B()
            if (r1 != 0) goto L_0x01b9
        L_0x00de:
            boolean r1 = defpackage.axoo.b()
            if (r1 == 0) goto L_0x00f6
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r8.x
            boolean r1 = r1.B()
            if (r1 == 0) goto L_0x00f6
            boolean r1 = defpackage.axnz.c()
            boolean r1 = defpackage.ofq.a(r1)
            if (r1 != 0) goto L_0x01b9
        L_0x00f6:
            boolean r1 = defpackage.axpp.d()
            boolean r1 = defpackage.ofq.b(r1)
            if (r1 == 0) goto L_0x015c
            ohd r1 = r8.y()
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x015c
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r8.x
            boolean r1 = r1.D()
            if (r1 == 0) goto L_0x015c
            goto L_0x01b9
        L_0x0114:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot call goBack when there is no leafContent."
            r0.<init>(r1)
            throw r0
        L_0x011c:
            nzu r0 = r1.c
            boolean r2 = r0 instanceof com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity
            if (r2 == 0) goto L_0x0135
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r0 = (com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity) r0
            olo r0 = a((com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity) r0)
            nzu r2 = r1.c
            avmw r5 = defpackage.avmw.HELP_ANSWER_FRAGMENT
            int r6 = r0.o
            java.lang.String r7 = r0.m
            java.lang.String r0 = r0.n
            defpackage.okg.a((defpackage.nzu) r2, (defpackage.avmw) r5, (int) r6, (java.lang.String) r7, (java.lang.String) r0)
        L_0x0135:
            java.util.Deque r0 = r1.b
            r0.pop()
            java.util.Deque r0 = r1.b
            java.lang.Object r0 = r0.peek()
            nzv r0 = (defpackage.nzv) r0
            r1.a(r0, r4)
        L_0x0145:
            ohd r0 = r8.y()
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0196
            r8.supportInvalidateOptionsMenu()
            goto L_0x0196
        L_0x0153:
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r8.x
            boolean r1 = r1.B()
            if (r1 == 0) goto L_0x015c
            goto L_0x01b9
        L_0x015c:
            olo r1 = a((com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity) r8)
            int r4 = r1.o
            java.lang.String r5 = r1.m
            java.lang.String r1 = r1.n
            defpackage.okg.a((defpackage.nzu) r8, (defpackage.avmw) r0, (int) r4, (java.lang.String) r5, (java.lang.String) r1)
            java.util.Deque r0 = r8.v
            java.lang.Object r0 = r0.pop()
            avmw r0 = (defpackage.avmw) r0
            r8.a((defpackage.avmw) r0, (int) r2)
            java.util.Deque r0 = r8.v
            java.lang.Object r0 = r0.peek()
            avmw r0 = (defpackage.avmw) r0
            r8.a((defpackage.avmw) r0, (int) r3)
            r8.supportInvalidateOptionsMenu()
            goto L_0x0196
        L_0x0183:
            boolean r0 = P()
            if (r0 == 0) goto L_0x01b9
            com.google.android.libraries.material.opensearchbar.OpenSearchView r0 = r8.s
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x01b9
            com.google.android.libraries.material.opensearchbar.OpenSearchView r0 = r8.s
            r0.f()
        L_0x0196:
            boolean r0 = defpackage.axof.b()
            boolean r0 = defpackage.ofq.a(r0)
            if (r0 == 0) goto L_0x01b8
            avmw r0 = r8.G()
            avmw r1 = defpackage.avmw.HELP_CONSOLE
            if (r0 != r1) goto L_0x01b8
            r0 = 2131428528(0x7f0b04b0, float:1.8478703E38)
            android.view.View r0 = r8.findViewById(r0)
            r0.setVisibility(r3)
            r8.A()
            r8.supportInvalidateOptionsMenu()
        L_0x01b8:
            return
        L_0x01b9:
            r0 = 25
            r8.z = r0
            super.onBackPressed()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.onBackPressed():void");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        LinearLayout.LayoutParams layoutParams;
        int i2;
        MenuInflater menuInflater = getMenuInflater();
        HelpConfig helpConfig = this.x;
        boolean a2 = nzf.a(helpConfig);
        int i3 = R.menu.gh_main_menu_dark;
        int i4 = 1;
        if (!a2 && helpConfig.A.a != 1) {
            i3 = R.menu.gh_main_menu_light;
        }
        menuInflater.inflate(i3, menu);
        if (Q() && ofq.a(axof.b())) {
            MenuItem findItem = menu.findItem(R.id.gh_menu_share_article);
            if (ofy.b()) {
                i2 = ofy.a(this, R.attr.ghf_greyIconColor);
            } else {
                i2 = kf.b(this, R.color.google_grey700);
            }
            ofx.a(findItem, (Context) this, i2);
        }
        if (!P()) {
            this.r = menu.findItem(R.id.gh_menu_search);
            avmw avmw = (avmw) this.v.peek();
            boolean z = z();
            if (z || avmw == avmw.HELP_CONSOLE || avmw == avmw.HELP_SUB_CONSOLE) {
                pk.a(this.r, (pj) new oiu(this));
                SearchView searchView = (SearchView) pk.a(this.r);
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) searchView.findViewById(R.id.search_src_text);
                try {
                    Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                    declaredField.setAccessible(true);
                    declaredField.set(autoCompleteTextView, 0);
                } catch (Exception e2) {
                    Log.e("gH_HelpActivity", "Could not set mCursorDrawableRes on search view's EditText", e2);
                }
                if (ofq.a(axof.b())) {
                    searchView.a((CharSequence) getString(R.string.gh_describe_your_issue));
                    autoCompleteTextView.setHintTextColor(kf.b(this, R.color.google_grey600));
                } else {
                    searchView.a((CharSequence) getString(R.string.gh_describe_your_issue));
                    HelpConfig helpConfig2 = this.x;
                    int i5 = helpConfig2.A.a;
                    int i6 = R.color.gh_text_white_opacity_70_percent;
                    if (i5 == 0 && !nzf.a(helpConfig2)) {
                        i6 = R.color.gh_black_opacity_70_percent;
                    }
                    autoCompleteTextView.setHintTextColor(kf.b(this, i6));
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) autoCompleteTextView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = getResources().getDimensionPixelSize(R.dimen.gh_accessibility_required_min_width_and_height);
                }
                autoCompleteTextView.setPadding(0, autoCompleteTextView.getPaddingTop(), 0, autoCompleteTextView.getPaddingBottom());
                LinearLayout linearLayout = (LinearLayout) searchView.findViewById(R.id.search_edit_frame);
                if (!(linearLayout == null || (layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams()) == null)) {
                    layoutParams.leftMargin = 0;
                    layoutParams.rightMargin = 0;
                }
                this.r.setVisible(false);
                this.w = new one(searchView);
                one one = this.w;
                one.a.a(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
                if (z || (this.x.B() && TextUtils.isEmpty(this.q.b))) {
                    this.r.expandActionView();
                    this.q.a(this.x.U, false);
                }
            } else {
                menu.removeItem(R.id.gh_menu_search);
                this.w = null;
            }
        }
        this.M = new SparseArray(this.x.t.size());
        List list = this.x.t;
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            OverflowMenuItem overflowMenuItem = (OverflowMenuItem) list.get(i7);
            menu.add(0, i4, 0, overflowMenuItem.b);
            this.M.put(i4, overflowMenuItem);
            i7++;
            i4++;
        }
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        boolean z = false;
        c(false);
        ocr ocr = this.e;
        if (ocr.a()) {
            ocr.removeCallbacks(ocr.d);
            ocr.b = null;
        }
        HelpConfig helpConfig = this.x;
        if (helpConfig != null) {
            ErrorReport errorReport = helpConfig.z;
            if (errorReport != null) {
                String[] strArr = errorReport.V;
                if (strArr != null && strArr.length > 0) {
                    z = true;
                }
                if (z || !TextUtils.isEmpty(errorReport.T)) {
                    new oit(errorReport, this, z).start();
                }
            }
            int i2 = this.z;
            if (i2 != 1) {
                olo a2 = a(this);
                okg.a((nzu) this, i2, avmw.a(a2.r), a2.o, a2.m, a2.n);
            }
            if (!this.J) {
                GoogleHelpChimeraService.a(GoogleHelpChimeraService.c(this.x));
            }
        }
        ofn ofn = this.k;
        if (ofn != null) {
            ofn.close();
        }
        oar oar = this.l;
        if (oar != null) {
            oar.close();
        }
        super.onDestroy();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Uri data;
        oab oab;
        oab oab2;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.gh_menu_share_article) {
            nzv H2 = H();
            if (H2 == null) {
                Log.e("gH_HelpActivity", "Can't share Help article. Help element is null.");
            } else {
                oab oab3 = H2.a;
                if (oab3 != null) {
                    ju a2 = ju.a(getContainerActivity());
                    a2.b("text/plain");
                    a2.a((CharSequence) oab3.e);
                    a2.a(oab3.d);
                    Intent a3 = a2.a();
                    if (jhg.a((Context) this, a3)) {
                        startActivity(Intent.createChooser(a3, getString(R.string.gh_menu_share_article)));
                        okg.c((nzu) this, oab3.e);
                    }
                } else {
                    Log.e("gH_HelpActivity", "Can't share Help article. Leaf content is null.");
                }
            }
        } else if (itemId == R.id.gh_menu_feedback) {
            F();
            return true;
        } else if (itemId == R.id.gh_menu_play_store) {
            g(this.x.b);
            return true;
        } else {
            int i2 = 0;
            if (itemId == R.id.gh_menu_print) {
                avmt avmt = avmt.UNKNOWN_CONTACT_MODE;
                avmw avmw = avmw.HELP_CONSOLE;
                int ordinal = ((avmw) this.v.peek()).ordinal();
                if (ordinal == 0) {
                    ogs ogs = this.i;
                    HelpChimeraActivity helpChimeraActivity = ogs.b;
                    List list = ogs.g().b;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    String a4 = ohe.a(helpChimeraActivity, false);
                    sb.append(a4);
                    sb2.append(ohe.a(a4, list, false));
                    ohe.a((nzu) helpChimeraActivity, sb.toString(), sb2.toString());
                } else if (ordinal != 1) {
                    if (ordinal == 2) {
                        ohd y = y();
                        y.a((ohb) new oha(y));
                    }
                } else if (!P()) {
                    onf onf = this.j;
                    HelpChimeraActivity helpChimeraActivity2 = onf.a;
                    List list2 = onf.g.b;
                    String a5 = ohe.a(helpChimeraActivity2, true);
                    ohe.a((nzu) helpChimeraActivity2, a5, ohe.a(a5, list2, true));
                }
                return true;
            } else if (itemId == R.id.gh_menu_clear_history) {
                oas oas = this.F;
                if (oas != null) {
                    oas.a();
                    this.F = null;
                }
                new ooc(this).start();
                HelpConfig helpConfig = this.x;
                nze nze = this.m;
                String[] strArr = obl.a;
                nzp a6 = new nzr(this, helpConfig).a();
                a6.a("name");
                a6.a("display_country");
                a6.a("phone_number");
                a6.a("locale");
                a6.a();
                if (nze != null) {
                    nze.d("escalation_options");
                }
                ogs ogs2 = this.i;
                PopularArticlesContainer g2 = ogs2.g();
                List list3 = g2.b;
                if (list3 != null) {
                    int size = list3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((oab) list3.get(i3)).c();
                    }
                }
                if (PopularArticlesContainer.b() && (oab2 = g2.c) != null) {
                    oab2.q = false;
                    oab2.r = false;
                    oab2.l = "";
                }
                if (!PopularArticlesContainer.b() && (oab = ogs2.g.c) != null) {
                    oab.q = false;
                    oab.r = false;
                    oab.l = "";
                }
                ohg.a(ogs2.b, ogs2.c);
                onf onf2 = this.j;
                if (onf2.b()) {
                    onl onl = onf2.d;
                    if (onl.a != null) {
                        while (i2 < onl.a.size()) {
                            ((oab) onl.a.get(i2)).c();
                            i2++;
                        }
                    }
                } else {
                    List list4 = onf2.g.b;
                    if (list4 != null) {
                        int size2 = list4.size();
                        while (i2 < size2) {
                            ((oab) list4.get(i2)).c();
                            i2++;
                        }
                    }
                }
                String string = getString(R.string.gh_clear_history_announcement);
                this.g.announceForAccessibility(string);
                Toast.makeText(this, string, 1).show();
                return true;
            } else if (itemId == R.id.gh_menu_version_info) {
                oiz oiz = new oiz();
                FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                beginTransaction.add((Fragment) oiz, "version_dialog");
                beginTransaction.commitAllowingStateLoss();
                return true;
            } else {
                OverflowMenuItem overflowMenuItem = (OverflowMenuItem) this.M.get(itemId);
                if (overflowMenuItem != null) {
                    Intent intent = overflowMenuItem.c;
                    HelpConfig helpConfig2 = this.x;
                    if (jhg.a((Context) this, intent)) {
                        startActivity(intent);
                    } else if (intent.getAction().equals("android.intent.action.VIEW") && (data = intent.getData()) != null && "https".equals(data.getScheme())) {
                        opa.a((Activity) this, new Intent(intent), helpConfig2);
                    }
                }
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onPause() {
        ocr ocr = this.e;
        if (ocr.a()) {
            ocr.removeCallbacks(ocr.d);
        }
        super.onPause();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPrepareOptionsMenu(android.view.Menu r13) {
        /*
            r12 = this;
            super.onPrepareOptionsMenu(r13)
            android.view.View r0 = r12.g
            int r0 = r0.getVisibility()
            java.util.Deque r1 = r12.v
            java.lang.Object r1 = r1.peek()
            avmw r1 = (defpackage.avmw) r1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0021
            avmw r4 = defpackage.avmw.HELP_SUB_CONSOLE
            if (r1 == r4) goto L_0x001f
            avmw r4 = defpackage.avmw.HELP_ANSWER_FRAGMENT
            if (r1 != r4) goto L_0x0021
            r4 = 1
            goto L_0x0022
        L_0x001f:
            r4 = 1
            goto L_0x0022
        L_0x0021:
            r4 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r12.x
            int r5 = r0.l
            r6 = 3
            if (r5 == r6) goto L_0x0043
            boolean r0 = r0.j()
            if (r0 != 0) goto L_0x0043
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r12.x
            boolean r0 = r0.d(r12)
            if (r0 != 0) goto L_0x0043
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r12.x
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0043:
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            boolean r5 = P()
            if (r5 != 0) goto L_0x00a6
            one r5 = r12.w
            if (r5 == 0) goto L_0x008d
            ong r5 = r12.q
            avmw r6 = defpackage.avmw.HELP_SUB_CONSOLE
            one r7 = r5.a()
            if (r7 == 0) goto L_0x0085
            android.support.v7.widget.SearchView r8 = r7.a
            r8.m = r5
            r8.x = r5
            onm r8 = new onm
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r9 = r5.a
            one r10 = r5.a()
            com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity r11 = r5.a
            aoru r11 = r11.d
            r8.<init>(r9, r10, r11)
            android.support.v7.widget.SearchView r9 = r7.a
            r9.q = r8
            android.support.v7.widget.SearchView$SearchAutoComplete r8 = r9.a
            ahu r9 = r9.q
            r8.setAdapter(r9)
            if (r1 != r6) goto L_0x0081
            java.lang.CharSequence r5 = r5.b
            r7.a(r5, r3)
        L_0x0081:
            r7.a()
            goto L_0x008d
        L_0x0085:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "initialize called before search view was set."
            r13.<init>(r0)
            throw r13
        L_0x008d:
            avmw r5 = defpackage.avmw.HELP_SUB_CONSOLE
            if (r1 != r5) goto L_0x00a6
            android.view.MenuItem r1 = r12.r
            r1.expandActionView()
            ong r1 = r12.q
            java.lang.CharSequence r5 = r1.b
            r1.a(r5, r3)
            android.view.MenuItem r1 = r12.r
            android.view.View r1 = r1.getActionView()
            r1.clearFocus()
        L_0x00a6:
            boolean r1 = r12.Q()
            if (r1 == 0) goto L_0x0133
            r1 = 2131428499(0x7f0b0493, float:1.8478644E38)
            android.view.MenuItem r1 = r13.findItem(r1)
            android.app.Activity r5 = r12.getContainerActivity()
            ju r5 = defpackage.ju.a((android.app.Activity) r5)
            java.lang.String r6 = "text/plain"
            r5.b(r6)
            java.lang.String r6 = ""
            r5.a((java.lang.CharSequence) r6)
            r5.a((java.lang.String) r6)
            android.content.Intent r5 = r5.a()
            boolean r6 = defpackage.axpp.d()
            boolean r6 = defpackage.ofq.b(r6)
            if (r6 == 0) goto L_0x0114
            ohd r6 = r12.y()
            avmw r7 = r12.G()
            avmw r8 = defpackage.avmw.HELP_ANSWER_FRAGMENT
            if (r7 != r8) goto L_0x0112
            boolean r7 = r6.b()
            if (r7 != 0) goto L_0x0112
            boolean r7 = r6.c()
            if (r7 != 0) goto L_0x0112
            java.util.Deque r7 = r6.b
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0108
            java.util.Deque r6 = r6.b
            java.lang.Object r6 = r6.peek()
            nzv r6 = (defpackage.nzv) r6
            oab r6 = r6.a
            if (r6 == 0) goto L_0x0108
            int r6 = r6.w
            r7 = 27
            if (r6 == r7) goto L_0x0112
        L_0x0108:
            boolean r5 = defpackage.jhg.a((android.content.Context) r12, (android.content.Intent) r5)
            if (r5 != 0) goto L_0x0110
            r5 = 0
            goto L_0x0130
        L_0x0110:
            r5 = 1
            goto L_0x0130
        L_0x0112:
            r5 = 0
            goto L_0x0130
        L_0x0114:
            avmw r6 = r12.G()
            avmw r7 = defpackage.avmw.HELP_ANSWER_FRAGMENT
            if (r6 != r7) goto L_0x012f
            ohd r6 = r12.y()
            boolean r6 = r6.b()
            if (r6 != 0) goto L_0x012f
            boolean r5 = defpackage.jhg.a((android.content.Context) r12, (android.content.Intent) r5)
            if (r5 != 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r5 = 1
            goto L_0x0130
        L_0x012f:
            r5 = 0
        L_0x0130:
            r1.setVisible(r5)
        L_0x0133:
            r1 = 2131428495(0x7f0b048f, float:1.8478636E38)
            android.view.MenuItem r1 = r13.findItem(r1)
            if (r4 != 0) goto L_0x013e
            r0 = 0
            goto L_0x0143
        L_0x013e:
            if (r0 != 0) goto L_0x0142
            r0 = 1
            goto L_0x0143
        L_0x0142:
            r0 = 0
        L_0x0143:
            r1.setVisible(r0)
            r0 = 2131428496(0x7f0b0490, float:1.8478638E38)
            android.view.MenuItem r0 = r13.findItem(r0)
            boolean r1 = r12.K
            if (r1 == 0) goto L_0x0159
            boolean r1 = defpackage.opa.a((android.content.Context) r12)
            if (r1 == 0) goto L_0x0159
            r1 = 1
            goto L_0x015a
        L_0x0159:
            r1 = 0
        L_0x015a:
            r0.setVisible(r1)
            axpy r0 = defpackage.axpy.a
            axpz r0 = r0.a()
            boolean r0 = r0.b()
            boolean r0 = defpackage.ofq.a(r0)
            r1 = 2131428497(0x7f0b0491, float:1.847864E38)
            if (r0 == 0) goto L_0x0178
            android.view.MenuItem r13 = r13.findItem(r1)
            r13.setVisible(r3)
            goto L_0x01d6
        L_0x0178:
            android.view.MenuItem r13 = r13.findItem(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            boolean r0 = defpackage.opa.a((android.content.Context) r12)
            if (r0 == 0) goto L_0x01d2
            android.view.View r0 = r12.g
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01d2
            avmt r0 = defpackage.avmt.UNKNOWN_CONTACT_MODE
            avmw r0 = defpackage.avmw.HELP_CONSOLE
            java.util.Deque r0 = r12.v
            java.lang.Object r0 = r0.peek()
            avmw r0 = (defpackage.avmw) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01c5
            if (r0 == r2) goto L_0x01b4
            r1 = 2
            if (r0 == r1) goto L_0x01a5
            goto L_0x01d3
        L_0x01a5:
            ohd r0 = r12.y()
            java.util.Deque r0 = r0.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01b2
            goto L_0x01d3
        L_0x01b2:
            r3 = 1
            goto L_0x01d3
        L_0x01b4:
            boolean r0 = P()
            if (r0 != 0) goto L_0x01d3
            onf r0 = r12.j
            ohh r0 = r0.g
            java.util.List r0 = r0.b
            if (r0 != 0) goto L_0x01c3
            goto L_0x01d3
        L_0x01c3:
            r3 = 1
            goto L_0x01d3
        L_0x01c5:
            ogs r0 = r12.i
            com.google.android.gms.googlehelp.recommendations.PopularArticlesContainer r0 = r0.g()
            java.util.List r0 = r0.b
            if (r0 != 0) goto L_0x01d0
            goto L_0x01d2
        L_0x01d0:
            r3 = 1
            goto L_0x01d3
        L_0x01d2:
        L_0x01d3:
            r13.setVisible(r3)
        L_0x01d6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public final void onResume() {
        ocr ocr = this.e;
        if (ocr.a()) {
            ocr.postAtTime(ocr.d, Math.min(SystemClock.uptimeMillis(), ocr.a));
        }
        super.onResume();
        ArrayList arrayList = new ArrayList(this.u);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nzj nzj = (nzj) arrayList.get(i2);
            nzj.c = false;
            Object obj = nzj.d;
            if (obj != null) {
                nzj.a(obj);
                nzj.d = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        int size = this.u.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((nzj) this.u.get(i2)).c = true;
        }
        super.onSaveInstanceState(bundle);
    }

    public final void onStop() {
        oab oab;
        super.onStop();
        oas oas = this.F;
        if (oas != null) {
            long currentTimeMillis = System.currentTimeMillis();
            nzp a2 = oas.c.a();
            a2.a("ongoing_session_last_stopped_ms", currentTimeMillis);
            a2.a("ongoing_session_id", oas.b.e);
            String str = oas.b.c;
            if (str != null) {
                a2.a("ongoing_session_context", str);
            }
            if (oas.a.G() != avmw.HELP_ANSWER_FRAGMENT) {
                HelpConfig helpConfig = oas.b;
                helpConfig.O = "";
                helpConfig.Y = 1;
                helpConfig.P = -1;
                helpConfig.R = -1.0f;
                helpConfig.Q = "";
            } else {
                nzv H2 = oas.a.H();
                if (H2 != null && !H2.a() && !H2.b() && (oab = H2.a) != null) {
                    a2.a("ongoing_session_browse_url", oab.e);
                    int i2 = H2.h;
                    int i3 = i2 - 1;
                    if (i2 != 0) {
                        a2.a("ongoing_session_user_action_type", i3);
                        a2.a("ongoing_session_click_rank", H2.b);
                        a2.a.putFloat(a2.b.a("ongoing_session_scroll_pos_y"), oas.a.y().d());
                        if (!TextUtils.isEmpty(H2.c)) {
                            a2.a("ongoing_session_query", H2.c);
                        }
                    } else {
                        throw null;
                    }
                }
            }
            a2.a();
        }
        if (axmj.y()) {
            ReportBatchedMetricsChimeraGcmTaskService.a((Context) this, (int) axmj.a.a().ag(), false);
        }
    }

    public final void p() {
        boolean r2 = r();
        boolean s2 = s();
        if (r2 || s2) {
            a(r2, s2);
        }
        if (this.g.getVisibility() != 0) {
            if (!s2) {
                b(true);
            }
            this.g.setVisibility(0);
        }
    }

    public final void q() {
        if (this.g.getVisibility() != 0) {
            if (r()) {
                w().executeOnExecutor(this.c, new Void[0]);
            }
            if (!s() || !jkf.a(this)) {
                b(false);
            } else {
                a(a(false));
            }
            this.g.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean r() {
        return !t() && !this.p;
    }

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return !this.x.B() && !this.o;
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if ("android.speech.action.RECOGNIZE_SPEECH".equals(intent.getAction())) {
            startActivityForResult(new Intent("android.speech.action.RECOGNIZE_SPEECH").putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form").putExtra("android.speech.extra.PROMPT", (String) null).putExtra("android.speech.extra.MAX_RESULTS", 1).putExtra("calling_package", getClass().getPackage().getName()), 27);
        } else {
            super.startActivity(intent, bundle);
        }
    }

    public final boolean t() {
        return this.x.x != 0;
    }

    public final boolean u() {
        return this.x.x == 3;
    }

    public final AsyncTask w() {
        return new ome(this, this.x.c, this.i);
    }

    public final ooh x() {
        return new ooh(this);
    }

    public final ohd y() {
        if (this.D == null) {
            ohd ohd = (ohd) getFragmentManager().findFragmentByTag(a);
            if (ohd == null) {
                FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                ohd ohd2 = new ohd();
                this.D = ohd2;
                beginTransaction.replace(R.id.gh_help_content, ohd2, a);
                beginTransaction.commitAllowingStateLoss();
                getFragmentManager().executePendingTransactions();
            } else {
                this.D = ohd;
            }
        }
        return this.D;
    }

    public final boolean z() {
        return this.v.peek() == avmw.HELP_ANSWER_FRAGMENT && y().b();
    }

    public final void b(String str) {
        new ool(this.l, new omv(str)).start();
    }

    public final boolean o() {
        if (jkf.a(this)) {
            if (!this.x.N) {
                return true;
            }
            oas oas = this.F;
            return oas != null && oas.d;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int i2;
        Drawable drawable;
        int i3;
        long j2;
        boolean z;
        byte[] bArr;
        int length;
        File file;
        HelpConfig helpConfig;
        super.onCreate(bundle);
        if ("android.intent.action.SEARCH".equals(getIntent().getAction())) {
            f("GoogleHelp: unsupported: activity started with search intent.");
            return;
        }
        String a2 = jhg.a((Activity) this);
        if (!TextUtils.isEmpty(a2)) {
            try {
                jhg.c((Activity) this);
            } catch (SecurityException e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 39 + String.valueOf(a2).length());
                sb.append("SecurityException ");
                sb.append(message);
                sb.append(" in calling package: ");
                sb.append(a2);
                f(sb.toString());
                return;
            }
        }
        if (this.x == null) {
            Log.e("gH_HelpActivity", "No HelpConfig provided!");
            setResult(0);
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent != null && ofq.a(this.x.b, axpj.a.a().c(), axpj.a.a().b(), axpj.a.a().a())) {
            long longExtra = intent.hasExtra("EXTRA_START_TICK") ? intent.getLongExtra("EXTRA_START_TICK", -1) : System.nanoTime();
            if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
                GoogleHelp googleHelp = (GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP");
                long nanoTime = System.nanoTime();
                PackageManager packageManager = getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(axpj.b(), 0);
                    if (jkr.g()) {
                        j2 = packageInfo.getLongVersionCode();
                    } else {
                        j2 = (long) packageInfo.versionCode;
                    }
                    if (j2 >= axpj.a.a().e()) {
                        String str = (ofq.b(axno.b()) && (helpConfig = this.x) != null) ? helpConfig.b : "";
                        Intent component = new Intent().setComponent(new ComponentName(axpj.b(), axpj.a.a().g()));
                        component.putExtra("EXTRA_START_TICK", longExtra);
                        component.putExtra("OCARINA_REDIRECT_CHECK_START_TICK", nanoTime);
                        if (ofq.b(axno.b()) && !TextUtils.isEmpty(str)) {
                            component.putExtra("OCARINA_APP_PACKAGE_NAME", str);
                        }
                        if (intent.hasExtra("EXTRA_OPEN_TO_CONTACT_OPTION")) {
                            component.putExtra("EXTRA_OPEN_TO_CONTACT_OPTION", intent.getIntExtra("EXTRA_OPEN_TO_CONTACT_OPTION", 0));
                        }
                        if (packageManager.resolveActivity(component, 0) != null) {
                            z = true;
                        } else if (packageManager.resolveService(component, 0) == null) {
                            okg.d(this, 189);
                        } else {
                            z = false;
                        }
                        long nanoTime2 = System.nanoTime();
                        if (googleHelp != null) {
                            Parcel obtain = Parcel.obtain();
                            try {
                                googleHelp.writeToParcel(obtain, 0);
                                bArr = obtain.marshall();
                                obtain.recycle();
                            } catch (RuntimeException e3) {
                                obtain.recycle();
                                bArr = null;
                            } catch (Throwable th) {
                                obtain.recycle();
                                throw th;
                            }
                        } else {
                            bArr = null;
                        }
                        if (bArr == null || (length = bArr.length) == 0) {
                            okg.d(this, 190);
                        } else {
                            okg.a((nzu) this, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime2));
                            okg.a((nzu) this, length);
                            if (((long) length) <= axpj.a.a().d()) {
                                component.putExtra("OCARINA_GOOGLEHELP_BYTES", bArr);
                            } else {
                                File file2 = new File(getCacheDir(), "googlehelp");
                                if (file2.exists() || file2.mkdirs()) {
                                    file = new File(file2, "googlehelpbytes");
                                } else {
                                    file = null;
                                }
                                if (file != null) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                        try {
                                            bufferedOutputStream.write(bArr);
                                            bufferedOutputStream.flush();
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e4) {
                                            }
                                            try {
                                                bufferedOutputStream.close();
                                            } catch (IOException e5) {
                                            }
                                        } catch (IOException e6) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e7) {
                                            }
                                            try {
                                                bufferedOutputStream.close();
                                                file = null;
                                            } catch (IOException e8) {
                                                file = null;
                                            }
                                        } catch (Throwable th2) {
                                            Throwable th3 = th2;
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e9) {
                                            }
                                            try {
                                                bufferedOutputStream.close();
                                            } catch (IOException e10) {
                                            }
                                            throw th3;
                                        }
                                    } catch (FileNotFoundException e11) {
                                        file = null;
                                    }
                                } else {
                                    file = null;
                                }
                                if (file != null) {
                                    okg.e(this);
                                    Uri a3 = ki.a(this, "com.google.android.gms.fileprovider", file);
                                    grantUriPermission(axpj.b(), a3, 1);
                                    component.putExtra("OCARINA_GOOGLEHELP_FILE", a3);
                                } else {
                                    okg.d(this, 191);
                                }
                            }
                            File file3 = new File(getFilesDir(), "gH_async_psd");
                            if (file3.exists() || file3.mkdirs()) {
                                Uri a4 = ki.a(this, "com.google.android.gms.fileprovider", new File(file3, String.valueOf(Long.toString(longExtra)).concat("_gH_async_help_psd")));
                                grantUriPermission(axpj.b(), a4, 1);
                                component.putExtra("OCARINA_HELP_ASYNC_PSD", a4);
                            }
                            okg.b((nzu) this, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
                            okg.f(this);
                            if (z) {
                                startActivityForResult(component, 99);
                            } else {
                                startService(component);
                            }
                            n();
                            this.z = 1;
                            finish();
                            return;
                        }
                    } else {
                        okg.d(this, 187);
                    }
                } catch (PackageManager.NameNotFoundException e12) {
                    okg.d(this, 188);
                }
            }
        }
        if (O()) {
            nzs.a(this, this.x);
        }
        if (intent != null) {
            nzo nzo = new nzo(intent);
            HelpConfig helpConfig2 = this.x;
            int intExtra = nzo.a.getIntExtra("EXTRA_OPEN_TO_CONTACT_OPTION", 0);
            if (intExtra != 0) {
                if (nzo.b == null) {
                    nzo.b = new HashSet();
                    Collections.addAll(nzo.b, ofx.a(axmm.a.a().a()));
                }
                if (!nzo.b.contains(helpConfig2.b)) {
                    Log.e("gH_InvocInterceptor", "App not permitted to use this feature.");
                    helpConfig2.I();
                } else {
                    helpConfig2.x = intExtra;
                }
            }
        }
        if (axmx.a.a().j()) {
            jfm.a(9).execute(new oin());
        }
        this.k = new ofn(this);
        nzz d2 = GoogleHelpChimeraService.d(this.x);
        if (d2 == null || d2.c) {
            if (!t()) {
                l();
            }
            obk.a(this.d, new oip(this), this.x, this.y);
            GoogleHelpChimeraService.a(this.x, true);
        }
        if (!ofq.a(axof.b())) {
            setContentView((int) R.layout.gh_help_activity);
        } else {
            if (ofy.a()) {
                ofy.a((Activity) this, this.x, (int) R.style.gh_NoActionBarLightActivityStyle, (int) R.style.gh_NoActionBarDarkActivityStyle, (int) R.style.gh_NoActionBarDayNightActivityStyle);
                okg.c(this, this.x, this.y);
            } else if (ofy.a(this.x)) {
                setTheme(R.style.gh_NoActionBarDarkActivityStyle);
                okg.c(this, this.x, this.y);
            } else {
                setTheme(R.style.gh_NoActionBarLightActivityStyle);
                if (ofq.a(axox.b())) {
                    okg.c(this, this.x, this.y);
                }
            }
            if (!ofq.a(axor.b())) {
                i2 = R.layout.gh_help_home_activity;
            } else {
                i2 = R.layout.gh_help_main_activity;
            }
            setContentView(i2);
            Toolbar toolbar = (Toolbar) findViewById(R.id.gh_help_toolbar);
            toolbar.i();
            ActionMenuView actionMenuView = toolbar.a;
            actionMenuView.a();
            yh yhVar = actionMenuView.c;
            yd ydVar = yhVar.h;
            if (ydVar == null) {
                drawable = yhVar.j ? yhVar.i : null;
            } else {
                drawable = ydVar.getDrawable();
            }
            if (ofy.b()) {
                i3 = ofy.a(this, R.attr.ghf_greyIconColor);
            } else {
                i3 = kf.b(this, R.color.google_grey700);
            }
            Drawable b2 = ofx.b(drawable, (Context) this, i3);
            toolbar.i();
            ActionMenuView actionMenuView2 = toolbar.a;
            actionMenuView2.a();
            yh yhVar2 = actionMenuView2.c;
            yd ydVar2 = yhVar2.h;
            if (ydVar2 == null) {
                yhVar2.j = true;
                yhVar2.i = b2;
            } else {
                ydVar2.setImageDrawable(b2);
            }
            a(toolbar);
            nzf.a(this, false);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        ogo ogo = (ogo) supportFragmentManager.findFragmentByTag(b);
        this.E = ogo;
        if (ogo == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            ogo ogo2 = new ogo();
            this.E = ogo2;
            beginTransaction.add(R.id.gh_help_section, ogo2, b);
            beginTransaction.commitAllowingStateLoss();
        }
        this.i = new ogs(this);
        new ood(this).executeOnExecutor(ofq.b(axpa.a.b().a()) ? this.d : this.c, new Void[0]);
        this.j = new onf(this);
        this.l = new onj(this, this.x.b);
        if (!P()) {
            this.q = new ong(this);
        }
        this.g = findViewById(R.id.gh_help_section);
        View findViewById = findViewById(R.id.gh_help_content);
        this.h = findViewById;
        this.E.c = findViewById;
        String b3 = axmj.a.a().b();
        if (b3.hashCode() != C) {
            B.clear();
            Collections.addAll(B, ofx.a(b3));
            C = b3.hashCode();
        }
        this.K = !B.contains(this.x.b);
        ArrayDeque arrayDeque = new ArrayDeque();
        this.v = arrayDeque;
        arrayDeque.push(avmw.HELP_CONSOLE);
        nze.a(this.d, this, this, this.x);
        HelpConfig helpConfig3 = this.x;
        helpConfig3.M = nzq.a(this, helpConfig3);
        if (!PopularArticlesContainer.b()) {
            ogs ogs = this.i;
            FragmentManager supportFragmentManager2 = ogs.b.getSupportFragmentManager();
            FragmentTransaction beginTransaction2 = supportFragmentManager2.beginTransaction();
            ogs.g = (ogk) supportFragmentManager2.findFragmentByTag(ogs.a);
            ogk ogk = ogs.g;
            if (ogk != null) {
                beginTransaction2.detach(ogk).attach(ogs.g);
                beginTransaction2.commitAllowingStateLoss();
            } else {
                FragmentTransaction beginTransaction3 = supportFragmentManager2.beginTransaction();
                ogs.g = new ogk();
                Bundle bundle2 = new Bundle(1);
                bundle2.putParcelable("EXTRA_HELP_CONFIG", ogs.c);
                ogs.g.setArguments(bundle2);
                beginTransaction3.add(R.id.gh_browse_all_articles_fragment, ogs.g, ogs.a);
                beginTransaction3.commitAllowingStateLoss();
            }
        }
        if (!ofq.a(axof.b())) {
            ((ViewStub) findViewById(R.id.gh_search_card_section_divider_view_stub)).inflate();
            View inflate = ((ViewStub) findViewById(R.id.gh_search_card_view_stub)).inflate();
            CardView cardView = (CardView) inflate.findViewById(R.id.gh_search_box);
            cardView.setOnClickListener(new oig(this));
            int i4 = this.x.A.b;
            if (i4 == 0) {
                i4 = kf.b(this, R.color.material_blue_grey_500);
            }
            Drawable a5 = ofx.a(kf.a((Context) this, (int) R.drawable.quantum_ic_arrow_forward_white_24), getResources());
            ofx.a(a5, i4);
            ((ImageView) cardView.findViewById(R.id.gh_arrow_forward_icon)).setImageDrawable(a5);
            inflate.findViewById(R.id.gh_search_box_line).setBackgroundColor(i4);
            okg.h(this);
        } else if (ofq.a(axor.b())) {
            OpenSearchView openSearchView = (OpenSearchView) findViewById(R.id.gh_open_search_view);
            this.s = openSearchView;
            openSearchView.f.a((View.OnClickListener) new oib(this));
            EditText editText = this.s.i;
            editText.setOnEditorActionListener(new oid(this, editText));
            editText.addTextChangedListener(new oiq(this, editText));
            findViewById(R.id.gh_search_box).setOnClickListener(new oie(this, editText));
            okg.h(this);
        } else {
            View findViewById2 = findViewById(R.id.gh_search_box);
            findViewById2.setOnClickListener(new oif(this, findViewById2));
            okg.h(this);
        }
        ohj.a(this);
        n();
        new oim(this, this).start();
    }

    public final void onStart() {
        avmt avmt;
        Drawable drawable;
        int i2;
        Account account;
        super.onStart();
        if (O()) {
            Account account2 = this.x.d;
            int size = nzs.a(this).size();
            String str = "";
            if (size != 0) {
                if (account2 == null) {
                    nzs.a(this, this.x);
                    e();
                    return;
                } else if (size <= 1) {
                    AccountPickerContainer accountPickerContainer = this.i.e;
                    if (accountPickerContainer != null) {
                        accountPickerContainer.setVisibility(8);
                    }
                } else {
                    ogs ogs = this.i;
                    if (ogs.e == null) {
                        ogs.e = (AccountPickerContainer) ((ViewStub) ogs.b.findViewById(R.id.gh_account_picker_view_stub)).inflate();
                    }
                    AccountPickerContainer accountPickerContainer2 = ogs.e;
                    HelpChimeraActivity helpChimeraActivity = ogs.b;
                    TextView textView = (TextView) accountPickerContainer2.findViewById(R.id.gh_account_picker_icon_and_label);
                    Drawable a2 = kf.a(accountPickerContainer2.getContext(), (int) R.drawable.quantum_ic_account_circle_googblue_24);
                    if (ofy.b()) {
                        drawable = ofx.b(a2, accountPickerContainer2.getContext(), ofy.a(accountPickerContainer2.getContext(), R.attr.gh_primaryBlueColor));
                    } else {
                        drawable = ofx.a(a2, accountPickerContainer2.getResources());
                        ofx.a(drawable, accountPickerContainer2.getContext(), (int) R.color.google_blue600);
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    Spinner spinner = (Spinner) accountPickerContainer2.findViewById(R.id.gh_account_picker_spinner);
                    List a3 = nzs.a(accountPickerContainer2.getContext());
                    ArrayList arrayList = new ArrayList(a3.size());
                    for (int i4 = 0; i4 < a3.size(); i4++) {
                        arrayList.add(((Account) a3.get(i4)).name);
                    }
                    ArrayAdapter arrayAdapter = new ArrayAdapter(helpChimeraActivity, R.layout.gh_help_account_picker_selected_line_item, (String[]) arrayList.toArray(new String[arrayList.size()]));
                    arrayAdapter.setDropDownViewResource(R.layout.gh_help_account_picker_dropdown_line_item);
                    spinner.setAdapter(arrayAdapter);
                    if (arrayList.size() < 2) {
                        spinner.setEnabled(false);
                        spinner.setBackgroundColor(accountPickerContainer2.getDrawingCacheBackgroundColor());
                    } else {
                        spinner.setOnItemSelectedListener(new ogj(helpChimeraActivity, spinner));
                    }
                    Context context = accountPickerContainer2.getContext();
                    HelpConfig helpConfig = helpChimeraActivity.x;
                    List a4 = nzs.a(context);
                    if (!a4.isEmpty()) {
                        if (!(helpConfig == null || (account = helpConfig.d) == null)) {
                            str = account.name;
                        }
                        if (str.isEmpty()) {
                            str = nzs.a(context, helpConfig, a4);
                        }
                        i2 = 0;
                        while (true) {
                            if (i2 < a4.size()) {
                                if (((Account) a4.get(i2)).name.equals(str)) {
                                    break;
                                }
                                i2++;
                            } else {
                                i2 = 0;
                                break;
                            }
                        }
                    } else {
                        i2 = -1;
                    }
                    if (i2 >= 0) {
                        spinner.setSelection(i2);
                    }
                }
            } else if (account2 != null) {
                a(str);
                e();
                return;
            } else {
                ogs ogs2 = this.i;
                if (ogs2.f == null) {
                    ogs2.f = ((ViewStub) ogs2.b.findViewById(R.id.gh_sign_in_banner_view_stub)).inflate();
                    ogs2.f.findViewById(R.id.gh_sign_in_button).setOnClickListener(new ogq(ogs2));
                    okg.m(ogs2.b);
                }
            }
        }
        if (!this.x.C()) {
            if (this.x.B()) {
                if (ofq.b(axou.a.a().b())) {
                    if (this.g.getVisibility() != 0) {
                        if (P()) {
                            this.s.a((CharSequence) this.x.U);
                        }
                        b(this.x.U);
                    }
                } else if (P()) {
                    this.s.a((CharSequence) this.x.U);
                }
                if (!ofq.a(axnz.c())) {
                    if (ofq.a(axof.b())) {
                        findViewById(R.id.gh_search_box).setVisibility(8);
                        m();
                    }
                    p();
                } else if (this.g.getVisibility() != 0) {
                    a((Runnable) new oii(this));
                }
            } else if (ofq.a(axpg.b()) && this.x.D()) {
                a((Runnable) new oih(this));
                okg.b((Context) this, this.x, this.y);
                if (!ofq.b(axqh.b())) {
                    return;
                }
                if (!TextUtils.isEmpty(this.x.W)) {
                    HelpConfig helpConfig2 = this.x;
                    int i5 = helpConfig2.X;
                    if (i5 == 2 || i5 == 1 || i5 == 3 || i5 == 4) {
                        okc okc = this.y;
                        if (i5 == 1) {
                            avmt = avmt.CHAT;
                        } else if (i5 == 2) {
                            avmt = avmt.C2C;
                        } else if (i5 != 3) {
                            avmt = avmt.PHONE;
                        } else {
                            avmt = avmt.EMAIL;
                        }
                        okg.a((Context) this, helpConfig2, okc, avmt);
                        return;
                    }
                    okg.b(this, helpConfig2, this.y, 207);
                    return;
                }
                okg.b(this, this.x, this.y, 206);
            } else if (o()) {
                p();
            } else {
                q();
            }
        } else if (this.g.getVisibility() != 0) {
            okg.a((Context) this, this.x, this.y);
            oab a5 = oab.a(this.x.V, oal.a(), this.x);
            if (a5 == null) {
                c(this.x.V);
                finish();
                return;
            }
            if (!axnz.b() || !ofq.b(axpp.b())) {
                int i6 = ooe.e;
                myp myp = new myp();
                myp.c();
                new ooe(this, a5, nzv.a(29, 0, "", -1.0f, false, 11, myp), L(), Calendar.getInstance()).executeOnExecutor(this.d, new Void[0]);
            } else if (!TextUtils.isEmpty(this.x.e()) || !TextUtils.isEmpty(a5.u)) {
                if (TextUtils.isEmpty(this.x.e())) {
                    this.x.K = a5.u;
                }
                ooe.a(this, a5, 29, 0);
            } else {
                c(this.x.V);
                finish();
                return;
            }
            this.g.setVisibility(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v() {
        /*
            r4 = this;
            avmt r0 = defpackage.avmt.UNKNOWN_CONTACT_MODE
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r4.x
            int r1 = r1.x
            r2 = 1
            if (r1 == r2) goto L_0x0041
            r3 = 2
            if (r1 == r3) goto L_0x002a
            r3 = 3
            if (r1 == r3) goto L_0x0013
            r4.a((defpackage.avmt) r0)
            goto L_0x005b
        L_0x0013:
            avmt r0 = defpackage.avmt.CHAT
            r4.a((defpackage.avmt) r0)
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r4.x
            boolean r1 = r1.k()
            if (r1 == 0) goto L_0x005b
            r4.b((defpackage.avmt) r0)
            r4.C()
            r4.S()
            goto L_0x0057
        L_0x002a:
            avmt r0 = defpackage.avmt.C2C
            r4.a((defpackage.avmt) r0)
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r4.x
            boolean r1 = r1.j()
            if (r1 == 0) goto L_0x005b
            r4.b((defpackage.avmt) r0)
            r4.D()
            r4.S()
            goto L_0x0057
        L_0x0041:
            avmt r0 = defpackage.avmt.EMAIL
            r4.a((defpackage.avmt) r0)
            com.google.android.gms.googlehelp.common.HelpConfig r1 = r4.x
            boolean r1 = r1.s()
            if (r1 == 0) goto L_0x005b
            r4.b((defpackage.avmt) r0)
            r4.E()
            r4.S()
        L_0x0057:
            r4.finish()
            return r2
        L_0x005b:
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r4.x
            r1 = 0
            r0.x = r1
            r0.I()
            defpackage.okg.a((defpackage.nzu) r4)
            r4.l()
            com.google.android.gms.googlehelp.common.HelpConfig r0 = r4.x
            com.google.android.gms.googlehelp.service.GoogleHelpChimeraService.a((com.google.android.gms.googlehelp.common.HelpConfig) r0, (boolean) r2)
            boolean r0 = r4.o()
            if (r0 == 0) goto L_0x0078
            r4.a((boolean) r2, (boolean) r1)
            goto L_0x0083
        L_0x0078:
            android.os.AsyncTask r0 = r4.w()
            aoru r2 = r4.c
            java.lang.Void[] r3 = new java.lang.Void[r1]
            r0.executeOnExecutor(r2, r3)
        L_0x0083:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity.v():boolean");
    }

    public final void c(nzj nzj) {
        ogo ogo = this.E;
        ogo.d = -1;
        ogo.e = false;
        ogo.g = false;
        ogo.i.removeCallbacks(ogo.k);
        ogo.h = nzj;
        if (!ogo.f) {
            ogo.i.postDelayed(ogo.j, axmj.a.a().aG());
            ogo.f = true;
        }
    }

    public final void b(nzj nzj) {
        synchronized (this.u) {
            this.u.remove(nzj);
        }
    }

    public final void b(boolean z) {
        int i2;
        if (getMainLooper().getThread() != Thread.currentThread()) {
            this.A.post(new ois(this, z));
        } else if (this.x.q() && this.I) {
            M();
        } else if (!t() || ((u() && this.x.g()) || !v())) {
            supportInvalidateOptionsMenu();
            if (this.p) {
                this.i.c();
            }
            if (this.x.b()) {
                x().executeOnExecutor(this.c, new Void[0]);
            } else if (u()) {
                v();
            }
            if (this.p) {
                K();
            }
            if (this.p && this.x.A()) {
                if (!z) {
                    olo a2 = a(this);
                    HelpConfig helpConfig = this.x;
                    if (!helpConfig.T) {
                        i2 = 5;
                    } else {
                        i2 = 4;
                    }
                    myp myp = new myp(helpConfig.S);
                    myp.c();
                    okg.a((nzu) this, i2, myp.a(), avmw.a(a2.r), a2.m, a2.n, a2.o);
                } else {
                    N();
                }
            }
            this.o = true;
        }
    }

    public final void c(boolean z) {
        nzj.a(z, this.u);
    }

    public final void e(String str) {
        onc onc;
        c(true);
        if (P() && (onc = this.t) != null) {
            onc.c();
        }
        if (!jkf.a(this)) {
            Toast.makeText(this, R.string.gh_network_not_connected, 0).show();
        } else if (!axnz.c() || TextUtils.isEmpty(this.x.e())) {
            oiv oiv = new oiv(this);
            new omb(this, oiv, str).executeOnExecutor(this.d, new Void[0]);
        } else {
            int i2 = ooe.e;
            HelpConfig helpConfig = this.x;
            if (helpConfig != null && !TextUtils.isEmpty(helpConfig.e())) {
                String format = String.format(axmj.a.a().aD(), new Object[]{axmj.z(), this.x.e(), Uri.encode(str)});
                oaa oaa = new oaa();
                oaa.e = format;
                oaa.o = false;
                oab a2 = oaa.a();
                myp myp = new myp();
                myp.c();
                new ooe(this, a2, nzv.a(1, -1, "", -1.0f, 1, myp, 3), L(), false, true, Calendar.getInstance()).executeOnExecutor(this.d, new Void[0]);
            }
        }
    }

    private final void a(Runnable runnable) {
        if (!this.I) {
            this.H.addObserver(new oic(runnable));
        } else {
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    public final nzc a(boolean z) {
        return new oir(this, z);
    }

    public final void a(int i2, avmt avmt) {
        if (i2 != 46 || this.L.add(avmt)) {
            okg.a((nzu) this, i2, avmt, -1);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(avmt avmt) {
        a(61, avmt);
    }

    /* access modifiers changed from: package-private */
    public final void a(avmw avmw) {
        avmt avmt = avmt.UNKNOWN_CONTACT_MODE;
        avmw avmw2 = avmw.HELP_CONSOLE;
        int ordinal = ((avmw) this.v.peek()).ordinal();
        if (ordinal != 0) {
            if (!(ordinal == 1 && avmw == avmw.HELP_ANSWER_FRAGMENT)) {
                return;
            }
        } else if (!(avmw == avmw.HELP_SUB_CONSOLE || avmw == avmw.HELP_ANSWER_FRAGMENT)) {
            return;
        }
        a((avmw) this.v.peek(), 8);
        this.v.push(avmw);
        a(avmw, 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(avmw avmw, int i2) {
        boolean z;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        avmt avmt = avmt.UNKNOWN_CONTACT_MODE;
        avmw avmw2 = avmw.HELP_CONSOLE;
        int ordinal = avmw.ordinal();
        if (ordinal == 0) {
            this.i.d.setVisibility(i2);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                y().a(z);
            }
        } else if (!P()) {
            this.j.f.setVisibility(i2);
        } else if (this.s.d() ^ z) {
            this.s.a(z);
        }
    }

    public final void a(String str, nzz nzz, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (z && (nzz == null || nzz.d)) {
            w().executeOnExecutor(this.c, new Void[0]);
            z3 = false;
        } else {
            z3 = z;
        }
        if (z2 && (nzz == null || nzz.e)) {
            a(a(true));
            z4 = false;
        } else {
            z4 = z2;
        }
        if (z3 || z4) {
            this.n = true;
            oik oik = new oik(this, str, nzz, z3, z4);
            nzz.a();
            nzz.f.addObserver(oik);
        } else if (!this.x.w) {
            GoogleHelpChimeraService.a(str);
            this.n = false;
        }
    }

    public final void a(nzc nzc) {
        nze nze = this.m;
        if (nze == null) {
            nzx nzx = this.G;
            if (nzx != null) {
                nzx.addObserver(new oil(this, nzc));
                return;
            }
            return;
        }
        nzc.a(nze);
    }

    public final void a(nze nze) {
        if (this.G != null) {
            this.m = nze;
            oas oas = new oas(this, this.m);
            this.F = oas;
            oas.d = !TextUtils.equals(oas.b.c, oas.c.a("ongoing_session_context", (String) null));
            if (oas.a(oas.b, oas.c)) {
                oas.b(oas.b, oas.c);
                okg.k(oas.a);
            }
            oas.a();
            this.G.a();
            this.G = null;
        }
    }

    public final void a(nzj nzj) {
        synchronized (this.u) {
            this.u.add(nzj);
        }
    }

    public final void a(oab oab, nzv nzv, boolean z) {
        oab oab2 = nzv.a;
        if (oab2 != null) {
            if (oab2.l()) {
                String str = nzv.a.e;
                String str2 = null;
                if (!TextUtils.isEmpty(str)) {
                    String[] split = str.split("(\\?|&)id=");
                    if (split.length >= 2) {
                        String[] split2 = split[1].split("&");
                        if (split2.length > 0) {
                            str2 = split2[0];
                        }
                    }
                }
                if (str2 == null) {
                    Log.w("gH_HelpActivity", String.format("Could not extract package name from url: %s", new Object[]{str}));
                    c(str);
                } else {
                    g(str2);
                }
            } else if (nzv.a.j()) {
                c(nzv.a.e);
                if (nzv.a()) {
                    finish();
                    return;
                }
            } else {
                y().a();
                if (P() && this.s.d()) {
                    this.s.a(false);
                }
                a(avmw.HELP_ANSWER_FRAGMENT);
                y().a(nzv, false);
            }
            this.h.setVisibility(0);
            if (this.x != null && ofq.a(axof.b())) {
                m();
                View findViewById = findViewById(R.id.gh_search_box);
                if (!ofq.b(axpp.c()) || findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            if (!L()) {
                K();
            }
        } else {
            if (z) {
                if (nzv.a()) {
                    this.i.a(omf.a(nzv.h, (Context) this));
                    this.i.c();
                    this.i.a();
                } else if (nzv.f && oab != null && URLUtil.isValidUrl(oab.e) && jkf.a(this)) {
                    c(oab.e);
                } else {
                    Toast.makeText(this, getString(R.string.gh_fetching_failed), 0).show();
                }
            }
            if (this.x.C()) {
                finish();
                return;
            }
            this.h.setVisibility(0);
            K();
            if (nzv.f && oab != null) {
                okg.a((nzu) this, 31, oab.e, nzv.b, nzv.c);
            }
        }
        supportInvalidateOptionsMenu();
    }

    public final void a(omf omf, CharSequence charSequence, myp myp) {
        onf onf = this.j;
        List a2 = omf.a((Context) onf.a, onf.b);
        if (onf.b()) {
            onf.c.setAdapter(onf.d);
            onf.d.a(charSequence.toString(), a2);
        } else {
            ohh ohh = onf.g;
            ohh.a = charSequence.toString();
            ohh.b = a2;
            ohh.notifyDataSetChanged();
        }
        okg.a((nzu) onf.a, 15, a2, charSequence.toString());
        a(avmw.HELP_SUB_CONSOLE);
        this.h.setVisibility(0);
        K();
        olo a3 = a(this);
        okg.a((nzu) this, 10, myp.a(), avmw.a(a3.r), a3.m, a3.n, a3.o);
    }

    public final void a(boolean z, boolean z2) {
        a((Runnable) new oij(this, z, z2));
    }

    public final boolean a(String str) {
        return nzs.a((Context) this, this.x, str);
    }
}
