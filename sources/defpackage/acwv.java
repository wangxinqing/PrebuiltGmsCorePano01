package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tron.CollectionChimeraService;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acwv {
    protected static agqu b;
    public List a = Collections.EMPTY_LIST;
    public iby c;

    private final boolean a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Account account = (Account) it.next();
            if (b == null) {
                agqw agqw = new agqw();
                agqw.a(context);
                agqw.b("gmscoretronfacsid");
                b = agqw.a();
            }
            try {
                if (((Boolean) b.a(account).a(4).get(15, TimeUnit.SECONDS)).booleanValue()) {
                    arrayList.add(account.name);
                }
            } catch (ExecutionException | TimeoutException e) {
                azqq.c();
                return false;
            } catch (InterruptedException e2) {
                azqq.c();
                Thread.currentThread().interrupt();
                return false;
            }
        }
        this.a = arrayList;
        return true;
    }

    public static final int c() {
        if (azqh.a.a().a() && acww.a(ihs.b())) {
            return 0;
        }
        try {
            acwa o = adrz.b(ihs.b()).o();
            ick ick = (ick) acws.a(o, azqe.b(), TimeUnit.SECONDS);
            if (!o.b() || ick == null) {
                return 1;
            }
            if (ick.p()) {
                return 2;
            }
            return 0;
        } catch (ExecutionException | TimeoutException e) {
            if (!azqq.c()) {
                return 1;
            }
            Log.e("CollectionChimeraSvc", "Unable to get checkbox consent");
            return 1;
        } catch (InterruptedException e2) {
            if (azqq.c()) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("CollectionChimeraSvc", valueOf.length() == 0 ? new String("InterruptedException: ") : "InterruptedException: ".concat(valueOf));
            }
            Thread.currentThread().interrupt();
            return 1;
        }
    }

    public final boolean b() {
        return !this.a.isEmpty();
    }

    public final boolean a() {
        if (!azqk.a.a().a() || !acww.a(ihs.b())) {
            ihs b2 = ihs.b();
            List<Account> d = jgu.d(b2, b2.getPackageName());
            if (azqv.a.a().a()) {
                return a(b2, d);
            }
            ArrayList arrayList = new ArrayList();
            for (Account account : d) {
                try {
                    acwa a2 = acyr.a(b2, new acyq(account)).a(CollectionChimeraService.b);
                    UdcCacheResponse udcCacheResponse = (UdcCacheResponse) acws.a(a2, azqe.b(), TimeUnit.SECONDS);
                    if (!a2.b() || udcCacheResponse == null) {
                        return false;
                    }
                    boolean z = false;
                    boolean z2 = false;
                    for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.a) {
                        int i = udcSetting.a;
                        if (i == 8) {
                            z = udcSetting.b == 2;
                        } else if (i == 10) {
                            z2 = udcSetting.b == 2;
                        }
                    }
                    if (z && z2) {
                        arrayList.add(account.name);
                    }
                } catch (ExecutionException | TimeoutException e) {
                    if (azqq.c()) {
                        Log.e("CollectionChimeraSvc", "Error in getting udc consents");
                    }
                    return false;
                } catch (InterruptedException e2) {
                    if (azqq.c()) {
                        String valueOf = String.valueOf(e2.getMessage());
                        Log.e("CollectionChimeraSvc", valueOf.length() == 0 ? new String("InterruptedException: ") : "InterruptedException: ".concat(valueOf));
                    }
                    return false;
                }
            }
            this.a = arrayList;
            return true;
        }
        this.a = Collections.EMPTY_LIST;
        return false;
    }
}
