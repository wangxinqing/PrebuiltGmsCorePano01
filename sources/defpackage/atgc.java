package defpackage;

import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Scanner;

/* renamed from: atgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgc {
    public static final atgc a = new atgc();
    private static final String b = atgc.class.getSimpleName();

    private atgc() {
    }

    /* JADX INFO: finally extract failed */
    public final String a(String str, String str2) {
        String property = System.getProperty(str);
        String str3 = null;
        if (property == null) {
            try {
                Process exec = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str});
                StrictMode.ThreadPolicy a2 = atga.a.a();
                try {
                    Scanner useDelimiter = new Scanner(exec.getInputStream(), "UTF-8").useDelimiter("\n");
                    if (useDelimiter.hasNext()) {
                        str3 = useDelimiter.next();
                    }
                    useDelimiter.close();
                    atga.a.a(a2);
                    property = str3;
                } catch (Throwable th) {
                    atga.a.a(a2);
                    throw th;
                }
            } catch (IOException e) {
                if (atfx.a(b, 5)) {
                    Log.w(b, "Unable to retrieve system property.");
                    property = null;
                } else {
                    property = null;
                }
            }
        }
        return property != null ? property : str2;
    }
}
