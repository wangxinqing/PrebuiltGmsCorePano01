package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: qfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qfa {
    private static final qfn b = new qfn("RequestContextLoader");
    public final Context a;

    public qfa(Context context) {
        this.a = context;
    }

    public static final void a(Context context, qez qez) {
        iva.a((Object) qez.a);
        new Object[1][0] = qez.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("instantApps.ClientCookie", 0);
        String encodeToString = Base64.encodeToString(qez.a.k(), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("client_cookie", encodeToString);
        Integer num = qez.c;
        if (num == null || qez.d == null) {
            edit.remove("rating_authority");
            edit.remove("rating_value");
        } else {
            edit.putInt("rating_authority", num.intValue());
            edit.putInt("rating_value", qez.d.intValue());
        }
        edit.apply();
    }

    public final void b() {
        bes bes;
        qez qez = new qez();
        qez.a = avwk.b;
        Context context = this.a;
        Intent intent = new Intent("com.android.vending.contentfilters.IContentFiltersService.BIND");
        intent.setPackage("com.android.vending");
        hwz hwz = new hwz();
        jca a2 = jca.a();
        try {
            if (a2.a(context.getApplicationContext(), intent, hwz, 1)) {
                IBinder a3 = hwz.a();
                Bundle bundle = null;
                if (a3 != null) {
                    IInterface queryLocalInterface = a3.queryLocalInterface("com.android.vending.contentfilters.IContentFiltersService");
                    bes = !(queryLocalInterface instanceof bes) ? new bes(a3) : (bes) queryLocalInterface;
                } else {
                    bes = null;
                }
                Parcel aQ = bes.aQ();
                aQ.writeIntArray(new int[]{1});
                Parcel a4 = bes.a(1, aQ);
                Bundle bundle2 = (Bundle) bhx.a(a4, Bundle.CREATOR);
                a4.recycle();
                a2.a(context, (ServiceConnection) hwz);
                if (bundle2 != null) {
                    bundle = bundle2.getBundle("1");
                }
                if (bundle != null) {
                    if (bundle.containsKey("authority")) {
                        qez.c = Integer.valueOf(bundle.getInt("authority"));
                    }
                    if (bundle.containsKey("filter_level")) {
                        qez.d = Integer.valueOf(bundle.getInt("filter_level"));
                    }
                }
                a(this.a, qez);
                return;
            }
            throw new qey("Unable to read Finsky Content Filter settings");
        } catch (RemoteException | InterruptedException e) {
            throw new qey(e);
        } catch (Throwable th) {
            a2.a(context, (ServiceConnection) hwz);
            throw th;
        }
    }

    public final qez a() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("instantApps.ClientCookie", 0);
        qez qez = new qez();
        qez.a = avwk.b;
        if (axuj.a.a().e()) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = this.a.getPackageManager();
            for (String packageInfo : amsk.a(',').a((CharSequence) axuy.a.a().F())) {
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo(packageInfo, 0);
                    String str = packageInfo2.packageName;
                    int i = packageInfo2.versionCode;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                    sb.append(str);
                    sb.append(":");
                    sb.append(i);
                    arrayList.add(sb.toString());
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
            qez.b = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        String string = sharedPreferences.getString("client_cookie", (String) null);
        if (string != null) {
            try {
                qez.a = (avwk) aucj.a((aucj) avwk.b, Base64.decode(string, 0));
            } catch (auda e2) {
                sharedPreferences.edit().clear().apply();
                qfn qfn = b;
                Log.wtf(qfn.a, qfn.c(e2, "Error reading client cookie from shared preferences", new Object[0]));
            }
            if (sharedPreferences.contains("rating_authority")) {
                qez.c = Integer.valueOf(sharedPreferences.getInt("rating_authority", 0));
            }
            if (sharedPreferences.contains("rating_value")) {
                qez.d = Integer.valueOf(sharedPreferences.getInt("rating_value", 0));
            }
        }
        return qez;
    }
}
