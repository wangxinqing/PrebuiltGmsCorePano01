package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: yfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class yfa {
    protected final yey a;
    protected final String b;
    protected final long c;
    private final ikz d = ikz.a("gms:phenotype:commit:timeout", (Long) 2000L);

    public yfa(yey yey, String str) {
        long j = 2000;
        this.a = yey;
        this.b = str;
        this.c = ikz.b() ? ((Long) this.d.c()).longValue() : j;
    }

    private static void a(SharedPreferences.Editor editor, Configuration configuration) {
        if (configuration != null) {
            for (String remove : configuration.c) {
                editor.remove(remove);
            }
            for (Flag flag : configuration.b) {
                int i = flag.g;
                if (i == 1) {
                    editor.putLong(flag.a, flag.a());
                } else if (i == 2) {
                    editor.putBoolean(flag.a, flag.b());
                } else if (i == 3) {
                    editor.putFloat(flag.a, (float) flag.c());
                } else if (i == 4) {
                    editor.putString(flag.a, flag.d());
                } else if (i == 5) {
                    editor.putString(flag.a, Base64.encodeToString(flag.e(), 3));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public String a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean b(Configurations configurations) {
        a(configurations);
        return true;
    }

    public static void a(SharedPreferences sharedPreferences, Configuration... configurationArr) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (Configuration a2 : configurationArr) {
            a(edit, a2);
        }
        if (!edit.commit()) {
            Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        }
    }

    public static boolean a(SharedPreferences sharedPreferences, Configurations configurations) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (!configurations.f) {
            edit.clear();
        }
        for (Configuration a2 : configurations.d) {
            a(edit, a2);
        }
        edit.putString("__phenotype_server_token", configurations.c);
        edit.putLong("__phenotype_configuration_version", configurations.g);
        edit.putString("__phenotype_snapshot_token", configurations.a);
        if (edit.commit()) {
            return true;
        }
        Log.w("PhenotypeFlagCommitter", "Failed to commit Phenotype configs to SharedPreferences!");
        return false;
    }

    private boolean a(String str, int i) {
        if (i <= 0) {
            String valueOf = String.valueOf(this.b);
            Log.w("PhenotypeFlagCommitter", valueOf.length() == 0 ? new String("No more attempts remaining, giving up for ") : "No more attempts remaining, giving up for ".concat(valueOf));
            return false;
        }
        Configurations a2 = a(this.b, str, a());
        if (a2 == null || !b(a2)) {
            return false;
        }
        String str2 = a2.a;
        if (str2 == null || str2.isEmpty()) {
            return true;
        }
        try {
            acws.a(this.a.a(a2.a), this.c, TimeUnit.MILLISECONDS);
            aguy.a(agvj.a(this.b));
            return true;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String str3 = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 41);
            sb.append("Committing snapshot for ");
            sb.append(str3);
            sb.append(" failed, retrying");
            Log.w("PhenotypeFlagCommitter", sb.toString(), e);
            return a(str, i - 1);
        }
    }

    /* access modifiers changed from: protected */
    public final Configurations a(String str, String str2, String str3) {
        try {
            return (Configurations) acws.a(this.a.a(str, str2, str3), this.c, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
            sb.append("Retrieving snapshot for ");
            sb.append(str);
            sb.append(" failed");
            Log.e("PhenotypeFlagCommitter", sb.toString(), e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void a(Configurations configurations) {
        throw new IllegalStateException("Requires implementation");
    }

    public boolean a(String str) {
        iva.a((Object) str);
        return a(str, 3);
    }
}
