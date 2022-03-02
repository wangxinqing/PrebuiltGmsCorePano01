package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: iwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwv implements iwu {
    private final List a;

    private iwv(List list) {
        this.a = list != null ? Collections.unmodifiableList(list) : null;
    }

    public static iwu a(Context context, boolean z) {
        return a(context, z, false);
    }

    private static boolean c(Context context) {
        if (jgu.d(context) != null) {
            return true;
        }
        try {
            return ((ick) acws.a(adrz.b(context).o(), 5, TimeUnit.SECONDS)).p();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("OptedInLoggerCreator", "Could not retrieve Usage & Diagnostics setting. Giving up.");
            return false;
        }
    }

    public final hol b(Context context) {
        throw null;
    }

    public final boolean b() {
        return this.a != null;
    }

    public static iwu a(Context context, boolean z, boolean z2) {
        List list;
        List list2 = null;
        if (!z) {
            if (jgu.d(context) != null) {
                list2 = Collections.emptyList();
            }
            return new iwv(list2);
        }
        if (!z2) {
            List d = jgu.d(context, "com.google.android.gms");
            if (d.isEmpty()) {
                list = Collections.emptyList();
            } else {
                try {
                    acyp acyp = new acyp();
                    acyp.a = (Account) d.get(0);
                    list = ((adbu) ((ick) acws.a(acyr.a(context, acyp.a()).n())).a).a();
                } catch (InterruptedException | ExecutionException e) {
                    Log.w("OptedInLoggerCreator", "Failed to get opt-in status");
                    list = Collections.emptyList();
                }
            }
            if (!list.isEmpty()) {
                return new iwv(list);
            }
        }
        if (c(context)) {
            return new iwv(Collections.emptyList());
        }
        return new iwv((List) null);
    }

    public final List a(Context context) {
        return a(context, "GMS_CORE");
    }

    public final List a(Context context, String str) {
        if (this.a != null) {
            iva.c(str);
            ArrayList arrayList = new ArrayList();
            if (!this.a.isEmpty()) {
                for (String hol : this.a) {
                    arrayList.add(new hol(context, str, hol));
                }
            } else {
                arrayList.add(new hol(context, str, (String) null));
            }
            if (!awyg.a.a().i() || arrayList.size() <= 1) {
                return arrayList;
            }
            return Arrays.asList(new hol[]{(hol) arrayList.get(0)});
        }
        throw new IllegalStateException("Upload is not allowed.");
    }
}
