package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: onr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onr extends ojs implements jbh {
    private final aoru a = jfm.a(9);
    private final GoogleHelpChimeraService b;
    private final String c;
    private final jbf d;

    public onr(GoogleHelpChimeraService googleHelpChimeraService, String str) {
        this.b = googleHelpChimeraService;
        this.c = str;
        this.d = jbf.a();
    }

    private final boolean a() {
        return ofx.a(this.c, axps.a.a().c());
    }

    public final void b(Bundle bundle, long j, GoogleHelp googleHelp, ojq ojq) {
        if (bundle != null) {
            jbf jbf = this.d;
            GoogleHelpChimeraService googleHelpChimeraService = this.b;
            jbf.a(googleHelpChimeraService, new ooa(googleHelpChimeraService, this.c, ojq, j, bundle, googleHelp));
        }
    }

    public final void c(GoogleHelp googleHelp, ojq ojq) {
        if (!ofx.a(this.c, axnd.b())) {
            String valueOf = String.valueOf(this.c);
            Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("getEscalationOptions failed. Package not whitelisted: ") : "getEscalationOptions failed. Package not whitelisted: ".concat(valueOf));
            ojq.g();
            return;
        }
        googleHelp.e = this.c;
        HelpConfig a2 = a(googleHelp);
        jbf jbf = this.d;
        GoogleHelpChimeraService googleHelpChimeraService = this.b;
        jbf.a(googleHelpChimeraService, new ont(googleHelpChimeraService, this.c, ojq, a2, this.a));
    }

    public final void d(GoogleHelp googleHelp, ojq ojq) {
        if (!ofx.a(this.c, axnd.b())) {
            String valueOf = String.valueOf(this.c);
            Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("getRealtimeSupportStatus failed. Package not whitelisted: ") : "getRealtimeSupportStatus failed. Package not whitelisted: ".concat(valueOf));
            ojq.h();
            return;
        }
        googleHelp.e = this.c;
        HelpConfig a2 = a(googleHelp);
        jbf jbf = this.d;
        GoogleHelpChimeraService googleHelpChimeraService = this.b;
        jbf.a(googleHelpChimeraService, new onu(googleHelpChimeraService, this.c, ojq, a2));
    }

    public final void e(GoogleHelp googleHelp, ojq ojq) {
        a(googleHelp, (String) null);
        jbf jbf = this.d;
        GoogleHelpChimeraService googleHelpChimeraService = this.b;
        jbf.a(googleHelpChimeraService, new onw(googleHelpChimeraService, this.c, ojq, googleHelp));
    }

    @Deprecated
    public final void b(GoogleHelp googleHelp, String str, String str2, ojq ojq) {
        SupportRequestHelp a2 = SupportRequestHelp.a(googleHelp);
        a2.d = str;
        a2.c = str2;
        b(a2, ojq);
    }

    /* access modifiers changed from: package-private */
    public final HelpConfig a(GoogleHelp googleHelp) {
        HelpConfig a2 = HelpConfig.a(googleHelp, (Context) this.b);
        a2.a(false, System.nanoTime());
        return a2;
    }

    public final void b(GoogleHelp googleHelp, ojq ojq) {
        if (!ofx.a(this.c, axnd.b())) {
            String valueOf = String.valueOf(this.c);
            Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("getSuggestions failed. Package not whitelisted: ") : "getSuggestions failed. Package not whitelisted: ".concat(valueOf));
            ojq.f();
            return;
        }
        googleHelp.e = this.c;
        HelpConfig a2 = a(googleHelp);
        jbf jbf = this.d;
        GoogleHelpChimeraService googleHelpChimeraService = this.b;
        jbf.a(googleHelpChimeraService, new onv(googleHelpChimeraService, this.c, ojq, a2, this.a));
    }

    public final void a(Bundle bundle, long j, GoogleHelp googleHelp, ojq ojq) {
        if (bundle != null) {
            jbf jbf = this.d;
            GoogleHelpChimeraService googleHelpChimeraService = this.b;
            jbf.a(googleHelpChimeraService, new oob(googleHelpChimeraService, this.c, ojq, j, bundle, googleHelp));
        }
    }

    public final void a(FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp, ojq ojq) {
        if (feedbackOptions != null) {
            jbf jbf = this.d;
            GoogleHelpChimeraService googleHelpChimeraService = this.b;
            jbf.a(googleHelpChimeraService, new onz(googleHelpChimeraService, this.c, ojq, feedbackOptions, bundle, j, googleHelp));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(GoogleHelp googleHelp, String str) {
        googleHelp.e = this.c;
        HelpConfig a2 = a(googleHelp);
        a2.U = str;
        if (a2.x == 0 && (!a2.B() || !ofq.a(axnz.c()))) {
            String str2 = a2.U;
            aoru aoru = this.a;
            GoogleHelpChimeraService googleHelpChimeraService = this.b;
            if (googleHelpChimeraService.i == null) {
                googleHelpChimeraService.i = new ofn(googleHelpChimeraService);
            }
            omi.a(str2, aoru, googleHelpChimeraService, a2, googleHelpChimeraService.i, this.b.a());
        }
        if (!a2.B()) {
            obk.a(this.a, new onp(this.b), a2, this.b.a());
        }
        GoogleHelpChimeraService.a(a2, false);
        aoru aoru2 = this.a;
        GoogleHelpChimeraService googleHelpChimeraService2 = this.b;
        nze.a(aoru2, googleHelpChimeraService2, googleHelpChimeraService2, a2);
        this.b.a((nzc) new onq(a2));
        new nyt(googleHelp).a(a2.e);
    }

    public final void b(SupportRequestHelp supportRequestHelp, ojq ojq) {
        if (!ofx.a(this.c, axmj.j())) {
            String valueOf = String.valueOf(this.c);
            Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("requestC2cSupport failed. Package not whitelisted: ") : "requestC2cSupport failed. Package not whitelisted: ".concat(valueOf));
            ojq.e();
            return;
        }
        supportRequestHelp.a.e = this.c;
        ohj.a(this.b);
        HelpConfig a2 = a(supportRequestHelp.a);
        jbf jbf = this.d;
        GoogleHelpChimeraService googleHelpChimeraService = this.b;
        jbf.a(googleHelpChimeraService, new ony(googleHelpChimeraService, this.c, ojq, a2, supportRequestHelp.d, supportRequestHelp.c, supportRequestHelp.e));
    }

    @Deprecated
    public final void a(GoogleHelp googleHelp, String str, String str2, ojq ojq) {
        SupportRequestHelp a2 = SupportRequestHelp.a(googleHelp);
        a2.b = str;
        a2.c = str2;
        a(a2, ojq);
    }

    public final void a(GoogleHelp googleHelp, ojq ojq) {
        e(googleHelp, ojq);
    }

    public final void a(InProductHelp inProductHelp, ojq ojq) {
        if (!TextUtils.isEmpty(inProductHelp.c) && !ofx.a(this.c, axnd.b())) {
            String valueOf = String.valueOf(this.c);
            Log.w("gH_GoogleHelpService", valueOf.length() == 0 ? new String("App not permitted to open to URL: ") : "App not permitted to open to URL: ".concat(valueOf));
            inProductHelp.c = null;
        } else if (!TextUtils.isEmpty(inProductHelp.b) && !ofx.a(this.c, axnd.b())) {
            String valueOf2 = String.valueOf(this.c);
            Log.w("gH_GoogleHelpService", valueOf2.length() == 0 ? new String("App not permitted to open to search: ") : "App not permitted to open to search: ".concat(valueOf2));
            inProductHelp.b = null;
        } else if (ofq.a(axpg.b()) && inProductHelp.d == 1) {
            if (!TextUtils.isEmpty(inProductHelp.e)) {
                if (!a()) {
                    String valueOf3 = String.valueOf(this.c);
                    Log.w("gH_GoogleHelpService", valueOf3.length() == 0 ? new String("App not permitted to open to SJ step 3: ") : "App not permitted to open to SJ step 3: ".concat(valueOf3));
                    if (ofq.b(axqh.b())) {
                        inProductHelp.b();
                        inProductHelp.a();
                        inProductHelp.c();
                    } else {
                        inProductHelp.b();
                        inProductHelp.c();
                    }
                }
            } else if (!ofx.a(this.c, axnd.b()) && !a()) {
                String valueOf4 = String.valueOf(this.c);
                Log.w("gH_GoogleHelpService", valueOf4.length() == 0 ? new String("App not permitted to open to SJ: ") : "App not permitted to open to SJ: ".concat(valueOf4));
                if (ofq.b(axqh.b())) {
                    inProductHelp.b();
                    inProductHelp.a();
                } else {
                    inProductHelp.b();
                }
            }
        }
        a(inProductHelp.a, inProductHelp.b);
        jbf jbf = this.d;
        GoogleHelpChimeraService googleHelpChimeraService = this.b;
        jbf.a(googleHelpChimeraService, new onx(googleHelpChimeraService, this.c, ojq, inProductHelp));
    }

    public final void a(SupportRequestHelp supportRequestHelp, ojq ojq) {
        if (ofx.a(this.c, axmj.j())) {
            supportRequestHelp.a.e = this.c;
            ohj.a(this.b);
            aucd o = avnn.d.o();
            String str = supportRequestHelp.b;
            if (str != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                avnn avnn = (avnn) o.b;
                str.getClass();
                avnn.a |= 2;
                avnn.c = str;
            }
            aucd o2 = avnq.j.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            avnq avnq = (avnq) o2.b;
            avnn avnn2 = (avnn) o.i();
            avnn2.getClass();
            avnq.d = avnn2;
            avnq.a |= 4;
            HelpConfig a2 = a(supportRequestHelp.a);
            a2.a((avnq) o2.i());
            a2.y = supportRequestHelp.c;
            jbf jbf = this.d;
            GoogleHelpChimeraService googleHelpChimeraService = this.b;
            jbf.a(googleHelpChimeraService, new off(googleHelpChimeraService, this.c, ojq, a2, supportRequestHelp.e));
            return;
        }
        String valueOf = String.valueOf(this.c);
        Log.e("gH_GoogleHelpService", valueOf.length() == 0 ? new String("requestChatSupport failed. Package not whitelisted: ") : "requestChatSupport failed. Package not whitelisted: ".concat(valueOf));
        ojq.c();
    }
}
