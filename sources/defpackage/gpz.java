package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;

/* renamed from: gpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gpz extends AsyncTask {
    final /* synthetic */ gqa a;
    private final Context b;

    public gpz(gqa gqa, Context context) {
        this.a = gqa;
        this.b = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            return gwc.b(this.b);
        } catch (hxw | hxx | IOException e) {
            gqa.d.d("Could not get device data version info.", e, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str;
        String str2 = (String) obj;
        if (!isCancelled()) {
            iwd iwd = gqa.d;
            String valueOf = String.valueOf(str2);
            iwd.b(valueOf.length() == 0 ? new String("DeviceDataVersionInfo = ") : "DeviceDataVersionInfo = ".concat(valueOf), new Object[0]);
            if (str2 != null) {
                StringBuilder sb = new StringBuilder(str2.length() + 2);
                sb.append('\'');
                sb.append(str2);
                sb.append('\'');
                str = sb.toString();
            } else {
                str = "null";
            }
            this.a.f(String.format("window.setDeviceDataVersionInfo(%s);", new Object[]{str}));
        }
    }
}
