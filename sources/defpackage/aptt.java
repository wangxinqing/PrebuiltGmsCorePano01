package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.api.model.GetAccountInfoResponse;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.MfaInfo;
import com.google.firebase.auth.api.model.ResetPasswordResponse;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;
import java.util.List;
import java.util.Locale;

/* renamed from: aptt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aptt {
    public final ess a;
    public final aptu b;
    public final Context c;
    private final String d;
    private final String e;

    public aptt() {
    }

    public static acwa a(Context context, ess ess, ProxyRequest proxyRequest, auef auef) {
        iby a2 = esq.a(context, ess);
        iha b2 = ihb.b();
        b2.a = new fvn(proxyRequest);
        return a2.b(b2.a()).b(new appu(proxyRequest, auef));
    }

    public aptt(Context context, aptu aptu, String str, aptp aptp) {
        String str2;
        iva.a((Object) context);
        this.c = context;
        iva.a((Object) aptu);
        this.b = aptu;
        iva.c(str);
        this.d = str;
        Object[] objArr = new Object[2];
        objArr[0] = "GmsCore";
        int i = aptp.a;
        if (i == -1) {
            str2 = Integer.toString(aptp.b);
        } else {
            str2 = String.format("X%s", new Object[]{Integer.toString(i)});
        }
        objArr[1] = str2;
        this.e = String.format("Android/%s/%s", objArr);
        esr esr = new esr();
        String str3 = aptu.a;
        if (str3 != null) {
            esr.a.putString("consumerPkg", str3);
        }
        this.a = new ess(esr.a);
    }

    public static void a(Context context, List list, String str) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MfaInfo mfaInfo = (MfaInfo) list.get(i);
            if (!TextUtils.isEmpty(mfaInfo.e)) {
                apox.a.a(context, str, mfaInfo.b, mfaInfo.e);
            }
        }
    }

    public final acwa a(aptv aptv, apth apth, String str, String str2) {
        return a(aptv, apth, str, str2, (String) null);
    }

    public final acwa a(aptv aptv, apth apth, String str, String str2, String str3) {
        return a(this.c, this.a, a(a(str, str2), aptv.a().k(), str3), apth.a()).b(new apps(apth));
    }

    public final ProxyRequest a(String str, byte[] bArr, String str2) {
        String str3;
        if (Boolean.valueOf(this.c.getSharedPreferences(String.format("com.google.firebase.auth.internal.proxyApiHelper.%s", new Object[]{this.b.a}), 0).getBoolean("com.google.firebase.auth.internal.FIREBASE_UI_BIT", false)).booleanValue()) {
            String str4 = this.e;
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 19);
            sb.append(str4);
            sb.append("/FirebaseUI-Android");
            str3 = sb.toString();
        } else {
            String str5 = this.e;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 21);
            sb2.append(str5);
            sb2.append("/FirebaseCore-Android");
            str3 = sb2.toString();
        }
        fvf fvf = new fvf(str);
        fvf.c = bArr;
        iva.b(true, "Unrecognized http method code.");
        fvf.b = 1;
        fvf.a("X-Android-Package", this.b.a);
        Locale locale = Locale.getDefault();
        StringBuilder sb3 = new StringBuilder();
        aptq.a(sb3, locale);
        if (!locale.equals(Locale.US)) {
            if (sb3.length() > 0) {
                sb3.append(", ");
            }
            aptq.a(sb3, Locale.US);
        }
        fvf.a("Accept-Language", sb3.toString());
        fvf.a("X-Client-Version", str3);
        fvf.a("X-Android-Cert", this.b.b);
        fvf.a("X-Firebase-Locale", str2);
        fvf.a("Content-Type", "application/x-protobuf");
        if (fvf.c == null) {
            fvf.c = new byte[0];
        }
        return new ProxyRequest(2, fvf.a, fvf.b, 3000, fvf.c, fvf.d);
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2) {
        return String.format("%s/%s?alt=proto&key=%s", new Object[]{str, str2, this.d});
    }

    public final void a(Context context, apvm apvm, apts apts) {
        a((aptv) apvm, (apth) new apvn(), axic.c(), "verifyPhoneNumber").a((acvp) new apqb(this, context, apts, apvm));
    }

    public final void a(Context context, VerifyAssertionRequest verifyAssertionRequest, apts apts) {
        a((aptv) verifyAssertionRequest, (apth) new apvh(), axic.c(), "verifyAssertion").a((acvp) new appw(context, apts));
    }

    public final void a(apug apug, apts apts) {
        a((aptv) apug, (apth) new GetTokenResponse(), axic.d(), "token").a((acvp) new appr(apts));
    }

    public final void a(apuh apuh, apts apts) {
        a((aptv) apuh, (apth) new GetAccountInfoResponse(), axic.c(), "getAccountInfo").a((acvp) new apqc(apts));
    }

    public final void a(apul apul, apts apts) {
        String str;
        ActionCodeSettings actionCodeSettings = apul.c;
        if (actionCodeSettings != null) {
            str = actionCodeSettings.h;
        } else {
            str = null;
        }
        a(apul, new apum(), axic.c(), "getOobConfirmationCode", str).a((acvp) new appj(apts));
    }

    public final void a(aput aput, apts apts) {
        a((aptv) aput, (apth) new ResetPasswordResponse(), axic.c(), "resetPassword").a((acvp) new appz(apts));
    }

    public final void a(apux apux, apts apts) {
        a((aptv) apux, (apth) new apuy(), axic.c(), "setAccountInfo").a((acvp) new apph(apts));
    }

    public final void a(apuz apuz, apts apts) {
        a((aptv) apuz, (apth) new apva(), axic.c(), "signupNewUser").a((acvp) new appx(apts));
    }
}
