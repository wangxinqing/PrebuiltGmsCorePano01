package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import java.security.SecureRandom;

/* renamed from: aceb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aceb implements abpk {
    private static final iwd c = acqa.a("Setup", "Util", "PostSetupHelperImpl");
    public final SharedPreferences a;
    public final acad b;
    private final Context d;

    public aceb(Context context) {
        acad acad = new acad(context);
        this.d = context;
        this.a = context.getSharedPreferences("SmartDevice.d2dSharedSecret", 0);
        this.b = acad;
    }

    public static byte[] b() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public final void a(byte[] bArr, long j) {
        if (bArr != null) {
            this.a.edit().putString("sharedSecret", jhy.b(bArr)).putLong("session", j).apply();
            CleanSharedSecretChimeraService.b(this.d);
            acad acad = this.b;
            acad.a(2);
            acad.a(j);
            acad.a();
            return;
        }
        c.c("Shared secret is null.", new Object[0]);
    }

    public final byte[] a() {
        String string = this.a.getString("sharedSecret", (String) null);
        if (string != null) {
            return jhy.a(string);
        }
        return null;
    }
}
