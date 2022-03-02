package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.location.settings.GoogleLocationSettingsChimeraActivity;

/* renamed from: ajon  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajon extends qvy {
    final /* synthetic */ GoogleLocationSettingsChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajon(GoogleLocationSettingsChimeraActivity googleLocationSettingsChimeraActivity) {
        super("location");
        this.a = googleLocationSettingsChimeraActivity;
    }

    public final void a(ComponentName componentName) {
        this.a.a = null;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        ajlk ajlk;
        GoogleLocationSettingsChimeraActivity googleLocationSettingsChimeraActivity = this.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.location.reporting.service.IPreferenceService");
            ajlk = queryLocalInterface instanceof ajlk ? (ajlk) queryLocalInterface : new ajli(iBinder);
        } else {
            ajlk = null;
        }
        googleLocationSettingsChimeraActivity.a = ajlk;
    }
}
