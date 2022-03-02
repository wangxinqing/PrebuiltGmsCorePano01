package com.google.android.gms.auth.uiflows.consent;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.login.CustomWebView;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class BrowserConsentChimeraActivity extends gnx implements gnq {
    private static final iwd a = ehv.a("BrowserConsentActivity");
    private static final fzk b = fzk.a("account");
    private static final fzk c = fzk.a("url");
    private static final fzk d = fzk.a("cookies");
    private gnr e;

    public static Intent a(Context context, Account account, String str, BrowserResolutionCookie[] browserResolutionCookieArr, ijn ijn) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.consent.BrowserConsentActivity");
        fzl fzl = new fzl();
        fzl.b(b, account);
        fzl.b(c, str);
        fzl.b(d, browserResolutionCookieArr);
        fzl.b(gmz.i, ijn.a());
        return className.putExtras(fzl.a);
    }

    private final void e() {
        a.b("Consent declined.", new Object[0]);
        a(0, new Intent().putExtra(ConsentResult.a, new ConsentResult(gei.PERMISSION_DENIED, (String) null, (FACLConfig) null, gda.REJECTED, (String) null)));
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "BrowserConsentActivity";
    }

    public final void c() {
        e();
    }

    public final void onBackPressed() {
        CustomWebView customWebView = this.e.c;
        if (customWebView.canGoBack()) {
            customWebView.goBack();
            return;
        }
        e();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gnr gnr = (gnr) getSupportFragmentManager().findFragmentByTag("browser");
        this.e = gnr;
        if (gnr == null) {
            Parcelable[] parcelableArr = (Parcelable[]) f().a(d);
            BrowserResolutionCookie[] browserResolutionCookieArr = new BrowserResolutionCookie[0];
            if (parcelableArr != null) {
                browserResolutionCookieArr = new BrowserResolutionCookie[parcelableArr.length];
                for (int i = 0; i < parcelableArr.length; i++) {
                    browserResolutionCookieArr[i] = (BrowserResolutionCookie) parcelableArr[i];
                }
            }
            gnr gnr2 = new gnr();
            fzl fzl = new fzl();
            fzl.b(gnr.d, (Account) f().a(b));
            fzl.b(gnr.e, (String) f().a(c));
            fzl.b(gnr.f, browserResolutionCookieArr);
            gnr2.setArguments(fzl.a);
            this.e = gnr2;
            getSupportFragmentManager().beginTransaction().add(16908290, this.e, "browser").commit();
        }
    }

    public final void b(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public final void a(String str) {
        if (str == null) {
            a.d("ConsentResult was null.", new Object[0]);
            e();
            return;
        }
        Intent intent = new Intent();
        try {
            if (((aqli) aucj.a((aucj) aqli.b, jhy.c(str), aubs.c())).a) {
                a.b("Consent granted.", new Object[0]);
                intent.putExtra(ConsentResult.a, new ConsentResult(gei.SUCCESS, gda.GRANTED, str));
                a(-1, intent);
                return;
            }
            a.c("ConsentResult cookie present, but consent was not granted.", new Object[0]);
            e();
        } catch (auda | IllegalArgumentException e2) {
            a.d("ConsentResult cookie string present, but was invalid and could not be parsed.", new Object[0]);
            e();
        }
    }
}
