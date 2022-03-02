package defpackage;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.R;
import com.google.android.places.ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: alax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alax implements Runnable {
    final /* synthetic */ rhq[] a;
    final /* synthetic */ AliasEditorChimeraActivity b;

    public alax(AliasEditorChimeraActivity aliasEditorChimeraActivity, rhq[] rhqArr) {
        this.b = aliasEditorChimeraActivity;
        this.a = rhqArr;
    }

    public final void run() {
        this.b.k();
        AliasEditorChimeraActivity aliasEditorChimeraActivity = this.b;
        aliasEditorChimeraActivity.g = this.a[0];
        if (aliasEditorChimeraActivity.h != null) {
            int i = !aliasEditorChimeraActivity.d.b.equalsIgnoreCase("Home") ? !this.b.d.b.equalsIgnoreCase("Work") ? R.string.alias_editor_alias_display : R.string.alias_editor_work_display : R.string.alias_editor_home_display;
            AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
            AliasEditorChimeraActivity aliasEditorChimeraActivity2 = this.b;
            obtain.setContentDescription(aliasEditorChimeraActivity2.getString(R.string.alias_editor_address_updated_accessibility_content, new Object[]{aliasEditorChimeraActivity2.getString(i), this.b.g.q()}));
            try {
                ((AccessibilityManager) this.b.getSystemService("accessibility")).sendAccessibilityEvent(obtain);
            } catch (IllegalStateException e) {
            }
            this.b.h = null;
            this.b.l();
        }
    }
}
