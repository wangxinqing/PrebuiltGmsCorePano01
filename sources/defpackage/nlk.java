package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.Iterator;

/* renamed from: nlk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nlk extends irg {
    public nlk(Context context) {
        super(context, 1, new int[0]);
    }

    private static int a(Context context) {
        try {
            return jni.b(context).b("com.google.android.play.games", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i, itv itv, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        Bundle bundle2 = bundle != null ? bundle : new Bundle();
        String str5 = str3;
        bundle2.putString("com.google.android.gms.games.key.gamePackageName", str5);
        String str6 = str4;
        bundle2.putString("com.google.android.gms.games.key.desiredLocale", str6);
        IBinder iBinder2 = iBinder;
        bundle2.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(iBinder2));
        super.a(i, itv, i2, str, str2, strArr, bundle2, iBinder2, str5, str6);
    }

    public final void a(isv isv, GetServiceRequest getServiceRequest) {
        int i;
        Bundle bundle;
        String str;
        int i2;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        ClassLoader classLoader = getClass().getClassLoader();
        Context context = this.d;
        int i3 = getServiceRequest2.c;
        StringBuilder sb = new StringBuilder(42);
        sb.append("client connected with version: ");
        sb.append(i3);
        nmf.a("GamesServiceBroker", sb.toString());
        Account account = getServiceRequest2.h;
        Bundle bundle2 = getServiceRequest2.g;
        bundle2.setClassLoader(classLoader);
        String string = bundle2.getString("com.google.android.gms.games.key.gamePackageName");
        if (account == null || string == null) {
            String str2 = account != null ? "not null" : "null";
            StringBuilder sb2 = new StringBuilder(str2.length() + 79 + String.valueOf(string).length());
            sb2.append("Play games failed to connect. Invalid parameters account = ");
            sb2.append(str2);
            sb2.append(", gamePackageName = ");
            sb2.append(string);
            str = sb2.toString();
            i = -1;
            bundle = null;
        } else {
            String a = jhg.a(context, string, "com.google.android.gms.games.APP_ID");
            int i4 = hxj.b;
            int a2 = jim.a(context, "com.google.android.play.games");
            int a3 = a(context);
            try {
                Iterator it = ModuleManager.get(context).getAllModules().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = 0;
                        break;
                    }
                    ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                    if ("com.google.android.gms.games".equals(moduleInfo.moduleId)) {
                        i2 = moduleInfo.moduleVersion;
                        break;
                    }
                }
            } catch (InvalidConfigException e) {
                nmf.b("GamesServiceBroker", "Can't get games stub module version", e);
                i2 = 0;
            }
            nmf.b("GamesServiceBroker", String.format("Client connected with SDK %s, Services %s, Stub module %s, and Games %s", new Object[]{Integer.valueOf(getServiceRequest2.c), Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(a3)}));
            if (a2 <= i4) {
                int i5 = i2;
                if (axix.a.a().c() <= ((long) i4)) {
                    if (axix.a.a().b() || jgu.f(context, "uca").isEmpty()) {
                        if (nmf.a(3)) {
                            nmf.a("GamesServiceBroker", "did not meet criteria to check for unicorn");
                        }
                        if ((axix.a.a().a() && a3 > 0) || "com.google.android.play.games".equals(string)) {
                            try {
                                nmf.b("GamesServiceBroker", "Let's wait some time.");
                                Thread.sleep(axix.a.a().d());
                            } catch (InterruptedException e2) {
                                Thread.currentThread().interrupt();
                            }
                            int a4 = a(context);
                            if (a4 != a3) {
                                nmf.b("GamesServiceBroker", String.format("Games are updated to %s", new Object[]{Integer.valueOf(a4)}));
                                a3 = a4;
                            }
                        }
                        if (a3 <= i5) {
                            int hashCode = string.hashCode();
                            Intent intent = new Intent("com.google.android.gms.games.PLAY_GAMES_UPGRADE");
                            intent.setPackage(context.getPackageName());
                            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", string);
                            intent.putExtra("com.google.android.gms.games.GAME_ID", a);
                            PendingIntent activity = PendingIntent.getActivity(context, hashCode, intent, 134217728);
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", activity);
                            i = 6;
                            str = "Launching Play games upgrade activity";
                        } else {
                            nmf.c("GamesServiceBroker", "Waiting didn't help.");
                            i = 18;
                            str = null;
                            bundle = null;
                        }
                    } else {
                        i = 13;
                        str = "Play games does not support unicorn accounts";
                        bundle = null;
                    }
                }
            }
            str = "Play services is out of date; newer version required";
            bundle = null;
            i = 2;
        }
        if (str != null && nmf.a(5)) {
            nmf.b("GamesServiceBroker", str);
        }
        try {
            isv.a(i, (IBinder) null, bundle);
        } catch (RemoteException e3) {
            nmf.a("GamesServiceBroker", "Remote exception during get service", e3);
        }
    }
}
