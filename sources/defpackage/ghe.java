package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ghe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ghe {
    final Context a;
    ServiceConnection b;
    final Lock c;
    final Condition d;
    ber e;

    public ghe(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = reentrantLock.newCondition();
        this.a = context;
    }

    public static void a(Bundle bundle, Intent intent) {
        if (bundle.containsKey("showOffer")) {
            intent.putExtra("showOffer", bundle.getBoolean("showOffer"));
        }
        if (bundle.containsKey("offerIntent")) {
            intent.putExtra("offerIntent", bundle.getParcelable("offerIntent"));
        }
        if (bundle.containsKey("offerMessageHtml")) {
            intent.putExtra("offerMessageHtml", bundle.getString("offerMessageHtml"));
        }
    }

    public final Bundle a(String str) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("showOffer", false);
        if (a() != null) {
            try {
                ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo("com.android.vending", 0);
                ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(new Intent("com.android.vending.billing.ADD_CREDIT_CARD"), 0);
                if (!(applicationInfo == null || resolveActivity == null)) {
                    try {
                        ber a2 = a();
                        Parcel aQ = a2.aQ();
                        aQ.writeString(str);
                        Parcel a3 = a2.a(2, aQ);
                        bundle = (Bundle) bhx.a(a3, Bundle.CREATOR);
                        a3.recycle();
                    } catch (RemoteException e2) {
                        Log.e("GLSActivity", "Error getting offers", e2);
                        bundle = null;
                    }
                    if (bundle == null) {
                        return bundle2;
                    }
                    int i = bundle.getInt("result_code");
                    StringBuilder sb = new StringBuilder(24);
                    sb.append("Play result: ");
                    sb.append(i);
                    sb.toString();
                    if (i == 1) {
                        bundle2.putBoolean("showOffer", true);
                        bundle2.putParcelable("offerIntent", bundle.getParcelable("available_offer_redemption_intent"));
                    } else if (i != 2) {
                        bundle2.putBoolean("showOffer", false);
                    } else {
                        bundle2.putBoolean("showOffer", false);
                        bundle2.putString("offerMessageHtml", bundle.getString("redeemed_offer_message_html"));
                    }
                    return bundle2;
                }
            } catch (PackageManager.NameNotFoundException e3) {
            }
        }
        Log.e("GLSActivity", "Play is unavailable");
        return bundle2;
    }

    public final ber a() {
        if (Build.VERSION.SDK_INT > 23) {
            return null;
        }
        ber ber = this.e;
        if (ber != null) {
            return ber;
        }
        iva.b("calling this from your main thread can lead to deadlock");
        this.b = new ghd(this, "auth_account");
        if (jca.a().a(this.a, new Intent("com.android.vending.billing.IBillingAccountService.BIND").setPackage("com.android.vending"), this.b, 1)) {
            this.c.lock();
            try {
                if (this.e == null) {
                    this.d.await(5, TimeUnit.SECONDS);
                }
                return this.e;
            } catch (InterruptedException e2) {
            } finally {
                this.c.unlock();
            }
        }
        return null;
    }
}
