package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zve implements zvd {
    private static final zsg a = zsg.a("DeviceUsageSettings");
    private final Context b;
    private final iby c;

    public zve(Context context) {
        this.b = context;
        this.c = rou.a(context);
    }

    private final amri b() {
        try {
            return amri.b((ick) acws.a(this.c.g(), 500, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a.c("Failed to get Lockbox signed-in status");
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return ampu.a;
        }
    }

    public final amri a() {
        amri b2 = b();
        if (b2.a()) {
            return amri.c(((ick) b2.b()).f());
        }
        a.c("getSignedInAccountName: Falling back to default value");
        return ampu.a;
    }

    public final boolean a(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            try {
                agqt a2 = zvf.a(this.b).a(new Account(str, "com.google"));
                if (!azej.a.a().c()) {
                    i = 5;
                } else {
                    i = 11;
                }
                return ((Boolean) a2.a(i).get()).booleanValue();
            } catch (InterruptedException | ExecutionException e) {
                zso.a(this.b).a(e, azfa.l());
                if (azfa.g()) {
                    a.a(e, "Failed to query FacsCache.isDataRecordingEnabled on DEVICE_CONTACTS");
                } else {
                    a.e("Failed to query FacsCache.isDataRecordingEnabled on DEVICE_CONTACTS", e);
                }
                return false;
            }
        } else {
            a.c("Empty Udc Account Name");
            return false;
        }
    }

    public final Set b(String str) {
        HashSet hashSet = new HashSet();
        acyp acyp = new acyp();
        acyp.a(str);
        try {
            return new HashSet(((adbu) ((ick) acws.a(acyr.a(this.b, acyp.a()).n(), 500, TimeUnit.MILLISECONDS)).a).b());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zso.a(this.b).a(e, azfa.l());
            if (azfa.g()) {
                a.a(e, "An error has occurred when retrieving UDC opted in accounts.");
                return hashSet;
            }
            a.e("An error has occurred when retrieving UDC opted in accounts.", e);
            return hashSet;
        }
    }
}
