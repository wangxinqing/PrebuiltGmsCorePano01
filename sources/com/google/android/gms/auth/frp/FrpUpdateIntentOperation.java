package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FrpUpdateIntentOperation extends IntentOperation {
    public static final iwd a = ehv.a("FRP", "FrpUpdateIntentOperation");
    private static final List b = Arrays.asList(new String[]{"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE", "com.google.android.gms.auth.FRP_CONFIG_CHANGED", "android.app.action.DEVICE_OWNER_CHANGED"});
    private Context c;
    private eli d;
    private gfl e;

    public FrpUpdateIntentOperation() {
    }

    public static synchronized void a(Context context, String str) {
        Intent intent;
        Class<FrpUpdateIntentOperation> cls = FrpUpdateIntentOperation.class;
        synchronized (cls) {
            if ("android.intent.action.BOOT_COMPLETED".equals(str)) {
                str = "com.google.android.gms.auth.FRP_CONFIG_CHANGED";
            }
            if (a(str)) {
                intent = IntentOperation.getStartIntent(context, (Class) cls, str);
            } else {
                intent = null;
            }
            if (intent != null) {
                context.startService(intent);
            }
        }
    }

    public final void onCreate() {
        this.c = this;
        this.d = eli.a((Context) this);
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        String str2;
        if (jkr.a()) {
            if (this.e == null) {
                Context context = this.c;
                this.e = new gfl(new qvr(context.getMainLooper()), context.getContentResolver(), Settings.Global.getUriFor("device_provisioned"), new CountDownLatch(1));
            }
            if (!a(intent.getAction())) {
                iwd iwd = a;
                String valueOf = String.valueOf(intent);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                sb.append("Invalid intent received: ");
                sb.append(valueOf);
                iwd.c(sb.toString(), new Object[0]);
            } else if (this.d.a()) {
                if (Settings.Global.getInt(this.c.getContentResolver(), "device_provisioned", 0) != 1) {
                    gfl gfl = this.e;
                    gfl.a.registerContentObserver(gfl.b, true, gfl);
                    try {
                        iwd iwd2 = a;
                        String valueOf2 = String.valueOf(gfl.b);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                        sb2.append("Blocking wait for ");
                        sb2.append(valueOf2);
                        iwd2.c(sb2.toString(), new Object[0]);
                        gfl.c.await();
                    } catch (InterruptedException e2) {
                        a.e("Error waiting for count down", e2, new Object[0]);
                    }
                    gfl.a.unregisterContentObserver(gfl);
                }
                if ("com.google.android.gms.auth.FRP_CONFIG_CHANGED".equals(intent.getAction()) || "android.app.action.DEVICE_OWNER_CHANGED".equals(intent.getAction())) {
                    eli eli = this.d;
                    fyx fyx = null;
                    if (jkr.f()) {
                        Bundle applicationRestrictions = ((UserManager) eli.b.getSystemService("user")).getApplicationRestrictions(eli.b.getPackageName());
                        ComponentName deviceOwnerComponentOnAnyUser = ((DevicePolicyManager) eli.b.getSystemService(DevicePolicyManager.class)).getDeviceOwnerComponentOnAnyUser();
                        if (deviceOwnerComponentOnAnyUser != null) {
                            str = deviceOwnerComponentOnAnyUser.flattenToShortString();
                        } else {
                            str = null;
                        }
                        if (applicationRestrictions != null) {
                            str2 = applicationRestrictions.getString("persistentDeviceOwnerState");
                        } else {
                            str2 = null;
                        }
                        if (!(str == null || str2 == null)) {
                            aucd o = fyx.d.o();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            fyx fyx2 = (fyx) o.b;
                            str.getClass();
                            int i = fyx2.a | 1;
                            fyx2.a = i;
                            fyx2.b = str;
                            str2.getClass();
                            fyx2.a = i | 2;
                            fyx2.c = str2;
                            fyx fyx3 = (fyx) o.i();
                            int i2 = fyx3.U;
                            if (i2 == -1) {
                                i2 = aueh.a.a((Object) fyx3).b(fyx3);
                                fyx3.U = i2;
                            }
                            if (i2 > 1024) {
                                iwd iwd3 = eli.a;
                                int i3 = fyx3.U;
                                if (i3 == -1) {
                                    i3 = aueh.a.a((Object) fyx3).b(fyx3);
                                    fyx3.U = i3;
                                }
                                StringBuilder sb3 = new StringBuilder(120);
                                sb3.append("Failed storing persistent device owner state - the maximum allowed serialized size of 1024B was exceeded by ");
                                sb3.append(i3 - 1024);
                                sb3.append("B");
                                iwd3.e(sb3.toString(), new Object[0]);
                            } else {
                                fyx = fyx3;
                            }
                        }
                    }
                    eli.a(fyx);
                }
                List e3 = this.d.e();
                if (e3 == null) {
                    a.c("No frp data present in app restriction, using current google accounts.", new Object[0]);
                    Context context2 = this.c;
                    List d2 = jgu.d(context2, context2.getPackageName());
                    eli eli2 = this.d;
                    List arrayList = new ArrayList(d2.size());
                    Iterator it = d2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Account account = (Account) it.next();
                        String b2 = this.d.b(account.name);
                        if (TextUtils.isEmpty(b2)) {
                            a.e(String.format("Critial error: accountId is empty for account %s.", new Object[]{account.name}), new Object[0]);
                            arrayList = Collections.emptyList();
                            break;
                        }
                        arrayList.add(b2);
                    }
                    eli2.a(arrayList, true);
                } else if ("com.google.android.gms.auth.FRP_CONFIG_CHANGED".equals(intent.getAction())) {
                    a.c("Using app restriction data to update frp challenges.", new Object[0]);
                    this.d.a(e3, false);
                } else {
                    a.c("No need to update account challenges.", new Object[0]);
                }
            } else {
                a.c("Frp is not supported for this device / user", new Object[0]);
            }
        }
    }

    FrpUpdateIntentOperation(Context context, eli eli, gfl gfl) {
        this.c = context;
        this.d = eli;
        this.e = gfl;
    }

    private static boolean a(String str) {
        iwd iwd = a;
        String valueOf = String.valueOf(str);
        iwd.b(valueOf.length() == 0 ? new String("Received intent with action: ") : "Received intent with action: ".concat(valueOf), new Object[0]);
        if (b.contains(str)) {
            return true;
        }
        iwd iwd2 = a;
        String valueOf2 = String.valueOf(str);
        iwd2.d(valueOf2.length() == 0 ? new String("Received invalid intent action: ") : "Received invalid intent action: ".concat(valueOf2), new Object[0]);
        return false;
    }
}
