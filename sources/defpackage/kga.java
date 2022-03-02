package defpackage;

import android.content.Context;
import com.google.android.gms.drive.internal.FileUploadPreferencesImpl;
import com.google.android.gms.drive.internal.OnDeviceUsagePreferenceResponse;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: kga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kga extends key {
    public kga(kec kec, kwg kwg) {
        super("GetFileUploadPreferencesOperation", kec, kwg, 11);
    }

    public final Set a() {
        return EnumSet.of(jzl.FULL, jzl.FILE, jzl.APPDATA);
    }

    public final void b(Context context) {
        kec kec = this.a;
        jzy a = kec.c.C.a(kec.d);
        this.b.a(new OnDeviceUsagePreferenceResponse(new FileUploadPreferencesImpl(a.a(), a.c(), a.b())));
    }
}
