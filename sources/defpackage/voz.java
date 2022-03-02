package defpackage;

import android.widget.CompoundButton;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: voz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class voz implements CompoundButton.OnCheckedChangeListener {
    private final SettingsChimeraActivity a;

    public voz(SettingsChimeraActivity settingsChimeraActivity) {
        this.a = settingsChimeraActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.a.b(z);
    }
}
