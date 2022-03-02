package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: fhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fhg implements fcu {
    private static final iwd a = ehv.b("CompleteSaveAccountLinkingTokenOperation");
    private static final anaf b;
    private final String c;
    private final Account d;
    private final SaveAccountLinkingTokenRequest e;
    private final String f;
    private final Context g;
    private final amsv h;

    static {
        anab h2 = anaf.h();
        h2.a("auth_code", aqkd.OAUTH2_ACCESS_TOKEN);
        b = h2.a();
    }

    public fhg(Context context, String str, Account account, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, String str2) {
        iva.a((Object) context);
        this.g = context.getApplicationContext();
        iva.c(str);
        this.c = str;
        iva.a((Object) account);
        this.d = account;
        iva.a((Object) saveAccountLinkingTokenRequest);
        this.e = saveAccountLinkingTokenRequest;
        iva.c(str2);
        this.f = str2;
        this.h = new fhf(context);
    }

    public final aorr a(fde fde) {
        aqkd aqkd = (aqkd) b.get(this.e.b);
        String valueOf = String.valueOf(this.e.b);
        iva.a((Object) aqkd, (Object) valueOf.length() == 0 ? new String("Invalid type for token: ") : "Invalid type for token: ".concat(valueOf));
        try {
            String b2 = jhg.b(ihs.b(), this.c, "SHA1");
            if (b2 != null) {
                aucd o = aqkj.c.o();
                aucd o2 = aqke.c.o();
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                aqke aqke = (aqke) o2.b;
                b2.getClass();
                aqke.b = b2;
                String str = this.c;
                str.getClass();
                aqke.a = str;
                aqke aqke2 = (aqke) o2.i();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aqkj aqkj = (aqkj) o.b;
                aqke2.getClass();
                aqkj.b = aqke2;
                aqkj.a = 1;
                aqkj aqkj2 = (aqkj) o.i();
                aucd o3 = aqkg.d.o();
                aucd o4 = aqkf.b.o();
                String str2 = this.f;
                if (o4.c) {
                    o4.c();
                    o4.c = false;
                }
                str2.getClass();
                ((aqkf) o4.b).a = str2;
                aqkf aqkf = (aqkf) o4.i();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aqkf.getClass();
                ((aqkg) o3.b).c = aqkf;
                aucd o5 = aqki.b.o();
                if (o5.c) {
                    o5.c();
                    o5.c = false;
                }
                aqkj2.getClass();
                ((aqki) o5.b).a = aqkj2;
                aqki aqki = (aqki) o5.i();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aqki.getClass();
                ((aqkg) o3.b).a = aqki;
                aucd o6 = aqkh.b.o();
                String str3 = this.e.c;
                if (o6.c) {
                    o6.c();
                    o6.c = false;
                }
                str3.getClass();
                ((aqkh) o6.b).a = str3;
                aqkh aqkh = (aqkh) o6.i();
                if (o3.c) {
                    o3.c();
                    o3.c = false;
                }
                aqkh.getClass();
                ((aqkg) o3.b).b = aqkh;
                aqkg aqkg = (aqkg) o3.i();
                fhe fhe = (fhe) this.h.a();
                int i = this.g.getApplicationInfo().uid;
                Account account = this.d;
                String packageName = this.g.getPackageName();
                ClientContext clientContext = new ClientContext(i, account, account, packageName, packageName);
                clientContext.d("https://www.googleapis.com/auth/oauth_integrations");
                if (fhe.b == null) {
                    fhe.b = baaj.a(baai.UNARY, "google.internal.identity.accountlinking.v1.AccountLinkingService/CreateLink", baoq.a(aqkg.d), baoq.a(aqkh.b));
                }
                aqkh aqkh2 = (aqkh) fhe.a.a(fhe.b, clientContext, aqkg, 10000, TimeUnit.MILLISECONDS);
                return aorl.a((Object) null);
            }
            throw qbf.a(28442);
        } catch (PackageManager.NameNotFoundException e2) {
            throw qbf.a(28442);
        } catch (eif e3) {
            a.e("Failed to save token", e3, new Object[0]);
            throw qbf.a(23002);
        } catch (babk e4) {
            a.e("Failed to save token", e4, new Object[0]);
            babj babj = e4.a;
            if (babj != null) {
                babg babg = babj.r;
                if (babg == babg.DEADLINE_EXCEEDED || babg == babg.UNAVAILABLE) {
                    throw qbf.a(7);
                }
                throw qbf.a(8);
            }
        }
    }

    public final qbk a() {
        return qbk.AUTH_API_CREDENTIALS_INTERNAL_COMPLETE_SAVE_ACCOUNT_LINKING_TOKEN;
    }
}
