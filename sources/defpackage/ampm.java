package defpackage;

import android.util.Log;

/* renamed from: ampm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ampm {
    static final ampm a = new ampm("BleSocket");
    public static final /* synthetic */ int c = 0;
    public final String b;

    private ampm(String str) {
        this.b = str;
    }

    public final void a(String str) {
        if (Log.isLoggable(this.b, 5)) {
            Log.w(this.b, str);
        }
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable(this.b, 5)) {
            Log.w(this.b, String.format(str, objArr));
        }
    }
}
