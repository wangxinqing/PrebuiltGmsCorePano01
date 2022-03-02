package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import com.google.android.gms.security.snet.SafetyNetClientChimeraService;

/* renamed from: aanf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aanf extends allp {
    public final long a;
    public boolean b = false;
    public final aane c = new aane(this);
    private final Context d;
    private final zzw e;

    static {
        aanf.class.getSimpleName();
    }

    public aanf(Context context, zzw zzw, long j) {
        this.d = context;
        this.e = zzw;
        this.a = j;
    }

    /* access modifiers changed from: package-private */
    public final void a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        zzw zzw = this.e;
        if (zzw != null && !this.b) {
            try {
                zzw.a(status, harmfulAppsInfo);
                SafetyNetClientChimeraService.a(harmfulAppsInfo);
            } catch (RemoteException e2) {
            } finally {
                this.b = true;
            }
        }
    }

    public final void a(boolean z, Bundle bundle) {
        if (!z) {
            try {
                a(new Status(12004), (HarmfulAppsInfo) null);
            } finally {
                jca.a().a(this.d, (ServiceConnection) this.c);
            }
        } else if (bundle != null) {
            long j = bundle.getLong("last_scan_time_ms", -1);
            int i = bundle.getInt("harmful_apps_count", 0);
            Parcelable[] parcelableArray = bundle.getParcelableArray("harmful_apps");
            if (i >= 0) {
                HarmfulAppsData[] harmfulAppsDataArr = new HarmfulAppsData[i];
                for (int i2 = 0; i2 < i; i2++) {
                    Bundle bundle2 = (Bundle) parcelableArray[i2];
                    harmfulAppsDataArr[i2] = new HarmfulAppsData(bundle2.getString("package_name"), bundle2.getByteArray("sha256"), aanc.a(bundle2.getString("phas_exist_in_other_profiles")));
                }
                a(new Status(0), new HarmfulAppsInfo(j, harmfulAppsDataArr, bundle.getInt("hours_since_last_autoscan_with_pha"), bundle.getBoolean("phas_exist_in_other_profiles")));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            a(new Status(12004), (HarmfulAppsInfo) null);
        }
    }
}
