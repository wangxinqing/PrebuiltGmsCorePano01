package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* renamed from: acpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpx {
    public static final int a = ((int) TimeUnit.SECONDS.toMillis(121));
    public final ContentResolver b;
    public int c;
    public boolean d;
    public acpj e;
    private final Context f;

    public acpx(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        this.b = applicationContext.getContentResolver();
    }

    public final void a() {
        acqf.a();
        if (this.d) {
            this.d = false;
            int i = Settings.System.getInt(this.b, "screen_off_timeout", 0);
            int i2 = this.c;
            if (i2 > 0 && i == a) {
                a(i2);
            }
            Thread.setDefaultUncaughtExceptionHandler(this.e.a);
        }
    }

    public final void a(int i) {
        Settings.System.putInt(this.b, "screen_off_timeout", i);
    }
}
