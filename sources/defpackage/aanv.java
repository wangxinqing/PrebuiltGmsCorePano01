package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.R;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;

/* renamed from: aanv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aanv {
    public final long a;
    public final int b;
    public final int c;
    public final aanu[] d;
    public final aanu[] e;

    public aanv(Bundle bundle) {
        this.a = bundle.getLong("last_scan_time_ms", -1);
        this.b = bundle.getInt("harmful_apps_count", 0);
        this.c = bundle.getInt("recently_removed_apps_count", 0);
        Parcelable[] parcelableArray = bundle.getParcelableArray("harmful_apps");
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("recently_removed_apps");
        int i = this.b;
        if (i < 0 || this.c < 0) {
            throw new IllegalArgumentException();
        }
        if (i != 0) {
            this.d = new aanu[i];
            for (int i2 = 0; i2 < this.b; i2++) {
                this.d[i2] = new aanu(false, (Bundle) parcelableArray[i2]);
            }
        } else {
            this.d = null;
        }
        int i3 = this.c;
        if (i3 != 0) {
            this.e = new aanu[i3];
            for (int i4 = 0; i4 < this.c; i4++) {
                this.e[i4] = new aanu(true, (Bundle) parcelableArray2[i4]);
            }
            return;
        }
        this.e = null;
    }

    public final String a(Context context) {
        int i = this.b;
        if (i == 1) {
            return context.getString(R.string.security_status_harmful_app_detected);
        }
        if (i > 1) {
            return context.getString(R.string.security_status_harmful_apps_detected);
        }
        long j = this.a;
        if (j > 0) {
            return aany.a(context, j);
        }
        return null;
    }

    public aanv(HarmfulAppsInfo harmfulAppsInfo) {
        this.a = harmfulAppsInfo.a;
        HarmfulAppsData[] harmfulAppsDataArr = harmfulAppsInfo.b;
        this.b = harmfulAppsDataArr != null ? harmfulAppsDataArr.length : 0;
        this.d = null;
        this.c = 0;
        this.e = null;
    }
}
