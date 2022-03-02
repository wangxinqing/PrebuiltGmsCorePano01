package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.lockbox.internal.LockboxOptInFlags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acro  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acro {
    protected static agqu a;

    public acro() {
        ibq ibq = acyr.a;
        ibq ibq2 = rou.a;
    }

    public static final List a(Context context) {
        if (!azne.a.a().a() || !acua.a(context)) {
            return a(context, context.getPackageName());
        }
        return Collections.emptyList();
    }

    private static final List a(Context context, String str) {
        List<Account> d = jgu.d(context, str);
        Collections.sort(d, new acrn());
        ArrayList arrayList = new ArrayList();
        try {
            boolean a2 = azpp.a.a().a();
            for (Account account : d) {
                if (!a2) {
                    ick ick = (ick) acws.a(acyr.a(context, new acyq(account)).m(), 15, TimeUnit.SECONDS);
                    if (ick != null && ick.n()) {
                        if (!ick.o()) {
                            if (azmy.b()) {
                            }
                        }
                        arrayList.add(new rpx(Status.a, new LockboxOptInFlags(account.name, ick.n(), ick.o())));
                    }
                } else {
                    if (a == null) {
                        agqw agqw = new agqw();
                        agqw.a(context);
                        agqw.b("gmscorestatsfacsid");
                        a = agqw.a();
                    }
                    agqt a3 = a.a(account);
                    boolean booleanValue = ((Boolean) a3.a(4).get(15, TimeUnit.SECONDS)).booleanValue();
                    boolean booleanValue2 = ((Boolean) a3.a(5).get(15, TimeUnit.SECONDS)).booleanValue();
                    if (booleanValue && (booleanValue2 || azmy.b())) {
                        arrayList.add(new rpx(Status.a, new LockboxOptInFlags(account.name, true, booleanValue2)));
                    }
                }
            }
        } catch (IllegalStateException e) {
            if (azmm.c()) {
                return null;
            }
        } catch (ExecutionException | TimeoutException e2) {
            if (azmm.c()) {
                return null;
            }
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            if (azmm.c()) {
                return null;
            }
        }
        return arrayList;
    }
}
