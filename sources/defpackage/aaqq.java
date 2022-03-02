package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.CompoundButton;
import com.google.android.gms.R;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;

/* renamed from: aaqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaqq implements Runnable {
    final /* synthetic */ jnd a;
    final /* synthetic */ VerifyAppsSettingsChimeraActivity b;

    public aaqq(VerifyAppsSettingsChimeraActivity verifyAppsSettingsChimeraActivity, jnd jnd) {
        this.b = verifyAppsSettingsChimeraActivity;
        this.a = jnd;
    }

    public final void run() {
        adl findViewHolderForAdapterPosition;
        int indexOf = ((jmz) this.b.f).a.g().indexOf(this.a);
        if (indexOf >= 0 && (findViewHolderForAdapterPosition = ((RecyclerView) this.b.findViewById(16908298)).findViewHolderForAdapterPosition(indexOf)) != null) {
            CompoundButton compoundButton = (CompoundButton) findViewHolderForAdapterPosition.a.findViewById(R.id.toggle);
            compoundButton.setChecked(this.a.i);
            compoundButton.sendAccessibilityEvent(1);
        }
    }
}
