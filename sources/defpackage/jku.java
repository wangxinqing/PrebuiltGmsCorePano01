package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: jku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jku {
    public static final Object a = new Object();
    public final String b;
    public final Context c;
    public FileOutputStream d;

    public jku(Context context, String str) {
        this.c = context;
        this.b = str;
    }

    public final void a() {
        synchronized (a) {
            FileOutputStream fileOutputStream = this.d;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e("ProtoLiteFileLogger", "Failed to close usage file stream.", e);
                }
                this.d = null;
            }
        }
    }
}
