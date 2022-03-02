package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: hnw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hnw {
    public final pyv a;
    public final int b;
    public final boolean c;
    public final String d;

    public hnw(pyv pyv, int i, boolean z, String str) {
        iva.a((Object) pyv);
        this.a = pyv;
        this.b = i;
        this.c = z;
        this.d = str;
    }

    public static amri a(Context context, Bundle bundle) {
        hnv hnv = new hnv();
        if (!bundle.containsKey("SyncRequest.accountName") || !bundle.containsKey("SyncRequest.accountType")) {
            return ampu.a;
        }
        hnv.a = pyv.a(context, new Account(bundle.getString("SyncRequest.accountName"), bundle.getString("SyncRequest.accountType")));
        if (!bundle.containsKey("SyncRequest.eventType")) {
            return ampu.a;
        }
        hnv.b = bundle.getInt("SyncRequest.eventType");
        if (bundle.containsKey("SyncRequest.waitForInitialization")) {
            hnv.c = bundle.getBoolean("SyncRequest.waitForInitialization");
        }
        if (bundle.containsKey("SyncRequest.zipitVersionInfo")) {
            hnv.d = bundle.getString("SyncRequest.zipitVersionInfo");
        }
        return amri.b(hnv.a());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hnw) {
            hnw hnw = (hnw) obj;
            if (!this.a.equals(hnw.a) || this.b != hnw.b || this.c != hnw.c || !amqx.a(this.d, hnw.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d});
    }

    public final String toString() {
        amrg a2 = amrh.a((Object) this);
        a2.a("account", (Object) "<hide PII>");
        a2.a("eventType", this.b);
        a2.a("waitForInitialization", this.c);
        a2.a("zipitVersionInfo", (Object) this.d);
        return a2.toString();
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("SyncRequest.accountName", this.a.b);
        bundle.putString("SyncRequest.accountType", this.a.c);
        bundle.putInt("SyncRequest.eventType", this.b);
        bundle.putBoolean("SyncRequest.waitForInitialization", this.c);
        bundle.putString("SyncRequest.zipitVersionInfo", this.d);
        return bundle;
    }
}
