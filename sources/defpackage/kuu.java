package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse;
import com.google.android.gms.drive.internal.OnPinnedDownloadPreferencesResponse;

/* renamed from: kuu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kuu extends kwf {
    private final idg a;

    public final void a(Status status) {
        this.a.a((Object) new kuv(status, (jzy) null));
    }

    public kuu(idg idg) {
        this.a = idg;
    }

    public final void a(OnDeviceUsagePreferenceResponse onDeviceUsagePreferenceResponse) {
        this.a.a((Object) new kuv(Status.a, new kaa(onDeviceUsagePreferenceResponse.a).a()));
    }

    public final void a(OnPinnedDownloadPreferencesResponse onPinnedDownloadPreferencesResponse) {
        this.a.a((Object) new kuv(Status.a, onPinnedDownloadPreferencesResponse.a));
    }
}
