package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: qdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qdu {
    final SharedPreferences a;
    final Context b;
    private final qdg c;
    private final Map d = new nz();

    public qdu(Context context) {
        qdg qdg = new qdg();
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.c = qdg;
        File file = new File(kf.c(this.b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !this.a.getAll().isEmpty()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    qdd.a(this.b, this);
                }
            } catch (IOException e) {
            }
        }
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + str2.length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private static final String c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private static final String d(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T-timestamp|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final synchronized long b(String str, String str2, String str3) {
        return this.a.getLong(d(str, str2, str3), -1);
    }

    static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final synchronized qde b(String str) {
        qde qde;
        qde qde2 = (qde) this.d.get(str);
        if (qde2 != null) {
            return qde2;
        }
        try {
            qdg qdg = this.c;
            Context context = this.b;
            qde = qdg.b(context, str);
            if (qde == null) {
                qde = qdg.a(context, str);
            }
        } catch (qdf e) {
            Log.w("InstanceID/Store", "Stored data is corrupt, generating new identity");
            qdd.a(this.b, this);
            qde = this.c.a(this.b, str);
        }
        this.d.put(str, qde);
        return qde;
    }

    /* access modifiers changed from: package-private */
    public final synchronized String a(String str) {
        return this.a.getString(str, (String) null);
    }

    public final synchronized String a(String str, String str2, String str3) {
        return this.a.getString(c(str, str2, str3), (String) null);
    }

    public final synchronized void a() {
        this.d.clear();
        for (File file : qdg.a(this.b).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.a.edit().clear().commit();
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String c2 = c(str, str2, str3);
        String d2 = d(str, str2, str3);
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(c2, str4);
        edit.putLong(d2, System.currentTimeMillis());
        edit.putString("appVersion", str5);
        edit.commit();
    }
}
