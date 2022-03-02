package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvb {
    public static final /* synthetic */ int a = 0;

    static {
        ibq ibq = acyr.a;
    }

    protected static void a(Context context, aucd aucd) {
        boolean z;
        Bundle applicationRestrictions;
        aucd o = aoin.r.o();
        int i = Build.VERSION.SDK_INT;
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager == null || (applicationRestrictions = userManager.getApplicationRestrictions(context.getPackageName())) == null) {
            z = false;
        } else {
            z = "true".equals(applicationRestrictions.getString("restricted_profile"));
        }
        boolean z2 = !z;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aoin aoin = (aoin) o.b;
        aoin.a |= 16384;
        aoin.p = z2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoip aoip = (aoip) aucd.b;
        aoin aoin2 = (aoin) o.i();
        aoip aoip2 = aoip.h;
        aoin2.getClass();
        aoip.d = aoin2;
        aoip.a |= 4;
        String packageName = context.getPackageName();
        AccountManager accountManager = AccountManager.get(context);
        int i2 = Build.VERSION.SDK_INT;
        List asList = Arrays.asList(accountManager.getAccountsByTypeForPackage("com.google", packageName));
        int size = asList.size();
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ((aoip) aucd.b).g = aucj.s();
        for (int i3 = 0; i3 < size; i3++) {
            Account account = (Account) asList.get(i3);
            if (((Boolean) acvc.a.c()).booleanValue()) {
                a(acyr.a(context, new acyq(account)), aucd);
            }
        }
    }

    protected static void a(iby iby, aucd aucd) {
        boolean z;
        try {
            UdcCacheResponse udcCacheResponse = (UdcCacheResponse) acws.a(iby.a(new UdcCacheRequest(new int[]{7, 8, 9, 10})), 10, TimeUnit.SECONDS);
            if (udcCacheResponse != null) {
                aucd o = aoio.f.o();
                for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.a) {
                    if (udcSetting.b == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    switch (udcSetting.a) {
                        case 7:
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aoio aoio = (aoio) o.b;
                            aoio.a |= 4;
                            aoio.d = z;
                            break;
                        case 8:
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aoio aoio2 = (aoio) o.b;
                            aoio2.a |= 1;
                            aoio2.b = z;
                            break;
                        case 9:
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aoio aoio3 = (aoio) o.b;
                            aoio3.a |= 8;
                            aoio3.e = z;
                            break;
                        case 10:
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aoio aoio4 = (aoio) o.b;
                            aoio4.a |= 2;
                            aoio4.c = z;
                            break;
                    }
                }
                aoio aoio5 = (aoio) o.i();
                if (!aoio5.equals(aoio.f)) {
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    aoip aoip = (aoip) aucd.b;
                    aoip aoip2 = aoip.h;
                    aoio5.getClass();
                    if (!aoip.g.a()) {
                        aoip.g = aucj.a(aoip.g);
                    }
                    aoip.g.add(aoio5);
                }
            }
        } catch (ExecutionException | TimeoutException e) {
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
        }
    }
}
