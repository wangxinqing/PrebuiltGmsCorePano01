package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.Locale;
import java.util.UUID;

/* renamed from: fyk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fyk {
    public final Context a;
    public final PackageManager b;
    public final jnh c = jni.b(this.a);
    public final String d = this.a.getPackageName();
    public final int e = jlo.b();
    public final int f = this.a.getApplicationInfo().uid;

    public fyk(Context context) {
        iva.a((Object) context, (Object) "Context cannot be null!");
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = applicationContext.getPackageManager();
    }

    public static final String a(PendingIntent pendingIntent) {
        int i = Build.VERSION.SDK_INT;
        return pendingIntent.getCreatorPackage();
    }

    public final String b(String str) {
        try {
            return jhg.e(this.a, str).toLowerCase(Locale.US);
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }

    public final int a(String str) {
        if (str != null) {
            try {
                return this.c.b(str, 128).applicationInfo.uid;
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        return 0;
    }

    public final AppDescription a() {
        String uuid = UUID.randomUUID().toString();
        return new AppDescription(this.d, this.f, uuid, uuid);
    }

    public final boolean a(int i) {
        return hya.a(this.a).a(i);
    }
}
