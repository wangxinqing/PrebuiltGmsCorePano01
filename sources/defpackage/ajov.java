package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import com.google.android.location.settings.LocationHistorySettingsChimeraActivity;

/* renamed from: ajov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajov extends ajok {
    final /* synthetic */ LocationHistorySettingsChimeraActivity b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajov(LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity) {
        super(locationHistorySettingsChimeraActivity);
        this.b = locationHistorySettingsChimeraActivity;
    }

    public final void a(ComponentName componentName, IBinder iBinder) {
        super.a(componentName, iBinder);
        this.b.j();
    }
}
