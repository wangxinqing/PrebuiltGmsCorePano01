package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.auth.account.be.legacy.AuthCronChimeraService;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: eln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eln implements Callable {
    final /* synthetic */ AuthCronChimeraService a;

    public eln(AuthCronChimeraService authCronChimeraService) {
        this.a = authCronChimeraService;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AuthCronChimeraService authCronChimeraService = this.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (!ent.H()) {
            gck gck = new gck(authCronChimeraService);
            Account[] a2 = qub.a((Context) authCronChimeraService).a("com.google");
            AppDescription a3 = new fyk(authCronChimeraService).a();
            int length = a2.length;
            i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Account account = a2[i2];
                TokenRequest tokenRequest = new TokenRequest(account, "ac2dm");
                tokenRequest.m = false;
                tokenRequest.l = true;
                tokenRequest.j = a3;
                TokenResponse a4 = gck.a(tokenRequest);
                gei b = a4.b();
                if (!gei.SUCCESS.equals(b)) {
                    AuthCronChimeraService.a.d(String.valueOf(b.ac).concat("  while performing schedueled work for account. Rescheduling."), new Object[0]);
                    if (gei.NETWORK_ERROR.equals(a4.b())) {
                        i = 1;
                        break;
                    }
                    i = 1;
                } else {
                    iwd iwd = AuthCronChimeraService.a;
                    String valueOf = String.valueOf(account.name);
                    iwd.b(valueOf.length() == 0 ? new String(" Successfully performed schedueled work for ") : " Successfully performed schedueled work for ".concat(valueOf), new Object[0]);
                }
                i2++;
            }
        } else {
            fxu fxu = new fxu(authCronChimeraService);
            SharedPreferences sharedPreferences = ihs.b().getSharedPreferences("auth_cron_chimera_service_storage", 0);
            long j = sharedPreferences.getLong("key_failed_attempts", 0);
            try {
                iva.b("Calling this from your main thread can crash your app");
                fxu.a(fxu.a);
                if (!((Boolean) fxu.a((fxt) new fxr())).booleanValue()) {
                    if (j <= ent.q()) {
                        long j2 = j + 1;
                        sharedPreferences.edit().putLong("key_failed_attempts", j2).apply();
                        if (j2 > ent.q()) {
                            authCronChimeraService.aH();
                        }
                    }
                    i = 1;
                } else {
                    authCronChimeraService.a(elapsedRealtime, 2);
                    if (j != Long.MAX_VALUE) {
                        sharedPreferences.edit().putLong("key_failed_attempts", Long.MAX_VALUE).apply();
                        authCronChimeraService.aH();
                    }
                    i = 0;
                }
            } catch (IOException e) {
                authCronChimeraService.a(elapsedRealtime, 3);
            } catch (eif e2) {
                authCronChimeraService.a(elapsedRealtime, 4);
            }
        }
        return Integer.valueOf(i);
    }
}
