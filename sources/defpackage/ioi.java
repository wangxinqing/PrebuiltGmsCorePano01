package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ioi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ioi extends imt {
    public ioi() {
        super("WrCrashHapFileFix", TimeUnit.MINUTES.toSeconds(5));
    }

    public static File a(Context context) {
        return new File(context.getFilesDir(), "CFN.now");
    }

    public final inb b(inb inb) {
        Log.i("WrCrashHapFileFix", "Writing the crash file!");
        File a = a(inb.b);
        try {
            if (!a.exists()) {
                a.createNewFile();
            }
            ina d = inb.d();
            d.a(this, 3);
            return d.a();
        } catch (IOException | SecurityException e) {
            Log.e("WrCrashHapFileFix", "Unable to record to our file.", e);
            ina d2 = inb.d();
            d2.a(this, 5);
            return d2.a();
        }
    }

    public final boolean a(inb inb) {
        return axbk.d();
    }
}
