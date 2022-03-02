package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Collections;

/* renamed from: wun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wun {
    static wun a;

    private wun() {
    }

    public static final amzy a(Context context) {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        amzt j = amzy.j();
        SharedPreferences sharedPreferences = context.getSharedPreferences("People-DebugUploaderService", 0);
        for (String next : sharedPreferences.getStringSet("available_uploaders", Collections.emptySet())) {
            String string = sharedPreferences.getString(next, (String) null);
            if (string != null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 0));
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    wum wum = (wum) objectInputStream.readObject();
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    j.c(wum);
                } catch (Exception e) {
                    new Object[1][0] = next;
                } catch (Throwable th) {
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    throw th;
                }
            }
        }
        return j.a();
    }

    public static synchronized void b() {
        synchronized (wun.class) {
            if (a == null) {
                a = new wun();
            }
        }
    }

    public static wul a() {
        wul wul = new wul();
        b();
        return wul;
    }
}
